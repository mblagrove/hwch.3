/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 * The constants listed are FEET_PER_MILE, INCHES_PER_FEET, INCHES_PER_MILE
 * User inputs stride length, steps, minutes
 * Stride length multiplied steps walked = inches walked *  divided inches per mile
 * inches walked remainder division of inches per mile divided inches per feet
 * inches walked divide feets per mile times inches per feet
 */
import java.util.Scanner;
public class Walking {
    public static void main(String []args){
    final int FEET_PER_MILE = 5280;
    final int INCHES_PER_FEET = 12;
    final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FEET;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter stride length:");
    int stride_length = input.nextInt();
    System.out.println("Enter minutes walked:");
    int minutes_walked = input.nextInt();
    System.out.println("Enter steps walked:");
    int steps_walked   = input.nextInt();
    int inches_walked = (stride_length * steps_walked);
    System.out.println("miles walked per day");
    int miles_walked = (inches_walked/INCHES_PER_MILE);
    System.out.println("feet walked per day");
    int feet_walked = ((inches_walked%INCHES_PER_MILE)/INCHES_PER_FEET);
    System.out.println("remaining inches walked");
    int remaining_inches =(inches_walked/FEET_PER_MILE * INCHES_PER_FEET);
    }
}
