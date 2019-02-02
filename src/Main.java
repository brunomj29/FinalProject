
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {

        int choice; //holds user choice
        char again = ' '; //holds user character choice to re-draw a shape again when asked
        int length , width;






       PrintWriter outputFile = new PrintWriter("userShapes.txt"); //creating an Printwirter object named outputfile that references the .txt file




        showIntro(); //calls the show intro method

        //loop that iterates as long as user wants to keep drawing more shapes
        do {


            ShowMenu(); //calls the showmenu method


            choice = validateMenu(); //choice is given the value returned by the validateMenu() method call that checks for user input for the menu

            switch (choice)
            {
                case 1:
                {
                  length =  getUserLength();
                   width = getUserWidth();
                   Square square = new Square(length,width);
                   square.printSquare();
                    square.readShapeIntoArray(square.copy());
                    square.writeOnFile(outputFile);
                    again = goAgain();
                   break;

                }
                case 2:
                {
                    length =  getUserLength();
                    Triangle triangle = new Triangle(length);
                    triangle.printTriangle();
                    triangle.readShapeIntoArray(triangle.copy());
                    triangle.writeOnFile(outputFile);
                    again = goAgain();

                    break;

                }
                case 3:
                {
                    length =  getUserLength();
                    Diamond diamond = new Diamond(length);
                    diamond.printDiamond();
                    diamond.readShapeIntoArray(diamond.copy());
                    diamond.writeOnFile(outputFile);
                    again = goAgain();

                    break;

                }
                case 4:
                {
                    System.out.println("Goodbye!!! ");
                    System.exit(0);
                }
            }



        } while (again == 'y' || again == 'Y');

    }



    private static void showIntro()
    {
        System.out.println("This program will prompt the user to select a shape to be drawn" +
                " on the screen.\n The shapes drawn will be saved on a file named \"userShapes.txt\".");
    }


    private static void ShowMenu()
    {


        System.out.print("\n1) Draw Square \n" +
                "2) Draw Triangle\n" +
                "3) Draw Diamond\n" +
                "4) Exit Program\n" +
                "Enter: ");

    }
    private static int validateMenu()

    {

        Scanner keyboard = new Scanner(System.in);
        boolean valid;
        int choice = 0;

        do
        {

            if (keyboard.hasNextInt())
            {

                choice = keyboard.nextInt();

                if (choice >=1 && choice <=4)
                {
                    valid = true;
                }

                else
                {
                    System.out.print("Enter menu choice only: ");
                    valid = false;

                }
            }

            else
            {
                System.out.print("Enter menu choice only: ");


                keyboard.next();
                valid = false;

            }




        } while (!valid);

        return choice;
    }

    private static char goAgain()
    {
        boolean valid = false;
        char again = ' ';
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Would you like to draw another shape? (Y or N) : ");

        do {
            if (keyboard.hasNextLine())
            {
                again = keyboard.nextLine().charAt(0);

                if (again == 'y' || again == 'Y')
                {
                    valid = true;

                }

                else if (again == 'n' || again == 'N')
                {
                    System.exit(0);
                }

                else
                {
                    System.out.print("Enter Y or N only: ");
                    valid =false;
                }



            }
            else
            {
                System.out.print("Enter Y or N only: ");
                keyboard.next();
                valid = false;
            }


        }while (!valid);

        return again;

    }

    private static int getUserLength()
    {
        int length = 0;
        boolean valid;

        System.out.println("Enter length: ");
        Scanner keyboard = new Scanner(System.in);

        do
            {
                if (keyboard.hasNextInt())
                {
                    length = keyboard.nextInt();
                    valid = true;
                }
                else
                {
                    System.out.print("Enter integers only: ");
                    keyboard.next();
                    valid = false;
                }



            } while (!valid);

        return length;

    }

    private static int getUserWidth()
    {
        int width = 0;
        boolean valid;

        System.out.println("Enter width: ");
        Scanner keyboard = new Scanner(System.in);

        do
        {
            if (keyboard.hasNextInt())
            {
                width = keyboard.nextInt();
                valid = true;
            }
            else
            {
                System.out.print("Enter integers only: ");
                keyboard.next();
                valid = false;
            }



        } while (!valid);

        return width;
    }



}
