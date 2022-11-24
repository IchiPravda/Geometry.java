import java.util.Scanner;

/**
   This program demonstrates static methods
   Created by Kadek Narayana
   60092
   Finished at 18.00
   Thursday, November 10, 2022

*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               circleArea(radius);
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               rectangleArea(length, width);
               value = rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               triangleArea(height, base);
               value = triangleArea(height, base);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               circleCircumference(radius);
               value = circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               rectanglePerimeter(length,width);
               value = rectanglePerimeter(length,width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               trianglePerimeter(side1,side2,side3);
               value = trianglePerimeter(side1,side2,side3);
               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here

   /**
    * this method is for showing menu for user
    */
   public static void printMenu()
   {
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the circumference of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("Enter the number of your choice :");
   }
   // TASK #2 Create the value-returning methods here

   /**
    * This method is Calculating circle area by multiply math PI with the radius
    * @param radius square and the return will be
    * @return
    */
   public static double circleArea(double radius)
   {
      double result = Math.PI * Math.pow(radius, 2);
      return result;
   }

   /**
    * the function of this method is to calculate rectangle area by multiply
    * length and width and get result for rectangle area
    * @param length
    * @param width
    * @return
    */
   public static double rectangleArea(double length, double width)
   {
      double result = length * width;
      return result;
   }

   /**
    * this method is for calculate the area of triangle by multiply base and height
    * and divided by 2, and we get the triangle area
    * @param height
    * @param base
    * @return
    */
   public static double triangleArea(double height, double base){
      double result = (base * height)/2;
      return result;
   }

   /**
    * this method is for calculate circle circumference by multiply 2 with PI and radius then
    * you get the  circle circumference
    * @param radius
    * @return
    */
   public static double circleCircumference(double radius){
      double result = 2 * Math.PI * radius;
      return  result;
   }

   /**
    * this method is for calculate rectangle perimeter by multiply length and width by 2, and then
    * you get the result (2*length) + (2 * width);
    * @param length
    * @param width
    * @return
    */
   public static double rectanglePerimeter(double length, double width){
      double result = (2 * length) + (2 * width);
      return result;
   }

   /**
    * this method is for calculate triangle perimeter by add all sides, side1+side2+side3,
    * and we get the final result
    * @param side1
    * @param side2
    * @param side3
    * @return
    */
   public static double trianglePerimeter( double side1,double side2, double side3){
      double result = side1+side2+side3;
      return result;
   }

   // TASK #4 Write javadoc comments for each method
}