import java.io.PrintWriter;

public class Diamond extends Shapes
{




    public Diamond(int length)
    {
        super(length);
    }




   public void printDiamond()
   {

       int size = getLength(),odd = 1, nos = size/2;
       for (int i = 1; i <= size; i++)
       {
           for (int k = nos; k >= 1; k--) {

               System.out.print(" ");
           }
           for (int j = 1; j <= odd; j++) {

               System.out.print("*");
           }
           System.out.println();
           if (i < size/2+1) {
               odd += 2;
               nos -= 1;
           } else {
               odd -= 2;
               nos += 1;

           }

           readShapeIntoArray(copy());
       }



   }

   @Override
   public Shapes copy()
   {
       return new Diamond(this.getLength());
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
        int size = getLength(),odd = 1, nos = size/2;
        for (int i = 1; i <= size; i++)
        {
            for (int k = nos; k >= 1; k--) {

                file.print(" ");
            }
            for (int j = 1; j <= odd; j++) {

                file.print("*");
            }
            file.println();
            if (i < size / 2 + 1) {
                odd += 2;
                nos -= 1;
            } else {
                odd -= 2;
                nos += 1;

            }
        }
    }


}
