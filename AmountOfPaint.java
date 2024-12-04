/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 * This class converts the users input of length, width, height, number of windows, and doors.
 * The area of the ceiling's area is calculated by multiplying width times length
 * The area of the walls is calculated by multiplying width times height times 4
 * These two areas are added together this gives you the area of the room
 * The number of windows is multiplied by its area
 * The number of doors is multiplied by its area and then and then added together
 * Gallons of paint is calculated by subtracting doors and windows area from total area of the room divided by the constant SQRFTPERGALLON
 * To calculate how many quarts are needed we divide by 4
 *
 * The constants provided were the square feet of the window and door as well as how much square foot is covered per gallon.
 */
import java.util.Scanner;
public class AmountOfPaint {
    public static void main (String [] arg){
    Scanner input = new Scanner(System.in);
    final int SQRFTPERGALLON = 350;
    final int WINDOW = 15;
    final int DOOR = 21;
    int length = input.nextInt();
    System.out.println ("Enter length of wall in feet:");
    int width = input.nextInt();
    System.out.println ("Enter width of wall in feet:");
    int height = input.nextInt();
    System.out.println("Enter height of wall in feet:");
    int num_of_doors = input.nextInt();
    System.out.println("Enter number of doors in room:");
    int num_of_windows = input.nextInt();
    int area_of_room = ((width * height)*4) +(width * length);
    int area_of_doors_and_windows = (num_of_windows*WINDOW) + (num_of_doors*DOOR);
    int gallons_of_paint = (area_of_room - area_of_doors_and_windows)/SQRFTPERGALLON;
    float quarts_of_paint = gallons_of_paint/4F;
    System.out.println(gallons_of_paint);
    System.out.println(quarts_of_paint);

    }
}
