/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 *
 * This class converts the users input of seconds into hours, minutes and remaining seconds.
 * The variable seconds is divided by 3600 (seconds per hour)
 * The variable hours is calculated by remainder division, seconds divided by 3600
 * The variable minutes is calculated by seconds remainder division by 3600 and the next divided by remainder division of 60
 */
import java.util.Scanner;
public class SecondConversion {
    public static void main(String []args){
    Scanner input =new Scanner(System.in);

     int seconds = input.nextInt();
     int hours = (seconds/3600);
     int minute = (seconds%3600);
     seconds = (seconds%3600)%60;
     System.out.println(hours);
     System.out.println(minute);
     System.out.println(seconds);
    }
}
