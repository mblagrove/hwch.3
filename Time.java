/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 * This class converts given time: 5:15pm into a 24-hour clock and displays the number of seconds since midnight. The integer value for hour: 17, minute: 15, and seconds: 30
 * This is calculated by multiplying the hour value by seconds per hour, 3600 and multiplying the minute value by seconds per minute, 60. This added together along with the seconds value, this is then given the new variable elapsed second.
 * The remaining seconds is then calculated by multiplying 24 hours by 3600, indicated by the variable total seconds and then subtracting that from elapsed seconds.
 * To calculate the percent of the day that has passed is total seconds divided by elapsed seconds multiplied by 100.
 *
 */
public class Time{
    public static void main (String []arg){
        int hour = 17;
        int minute = 15;
        int second = 30;
        hour = hour * 3600;
        minute = minute * 60;
        
        int elapsed_sec = hour + minute + second;
        System.out.println(elapsed_sec);
        float total_sec = 86400;
        float remaining_sec = total_sec - elapsed_sec;
        System.out.println(remaining_sec);
        float percent_of_day_elapsed = (elapsed_sec / total_sec) * 100;
        System.out.println(percent_of_day_elapsed);
    }
}

