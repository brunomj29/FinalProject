import java.io.PrintWriter;

public class Square extends Shapes
{
    protected int width;

    public Square(int length , int width)
    {
        super(length);

        this.width = width;
    }


    public int getWidth() {
        return width;
    }


    public void printSquare()
    {
        for (int r = 0; r < getLength(); r++)
        {
            for (int c = 0; c < getWidth(); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    @Override
    public Shapes copy()
    {
        return new Square(this.getLength(),this.getWidth());

    }


    @Override
    public void readShapeIntoArray(Shapes shape)
    {
        shapesArray[indexShape] = shape;
        indexShape++;

    }

    @Override
    public void writeOnFile(PrintWriter file)
    {
        for (int r = 0; r < getLength(); r++)
        {
            for (int c = 0; c < getWidth(); c++)
            {
                file.print("*");
            }
            file.println();
        }

        file.println("\n");
    }
}
