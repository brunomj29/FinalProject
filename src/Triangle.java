import java.io.PrintWriter;

public class Triangle extends Shapes
{


    public Triangle(int length)
    {
        super(length);
    }


    public void printTriangle()
    {
        int min, max;

        for (min = 0; min <= getLength(); min++) {
            for (max = 0; max < min; max++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (min = getLength() - 1; min >= 0; min--) {
            for (max = min - 1; max >= 0; max--) {
                System.out.print("*");
            }
            System.out.println();
        }

        readShapeIntoArray(copy());
    }





    @Override
    public Shapes copy()
    {
        return new Triangle(this.getLength());


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
        int min, max;

        for (min = 0; min <= getLength(); min++) {
            for (max = 0; max < min; max++) {
                file.print("*");
            }
            file.println();
        }
        for (min = getLength() - 1; min >= 0; min--) {
            for (max = min - 1; max >= 0; max--) {
                file.print("*");
            }
            file.println();
        }
    }
}
