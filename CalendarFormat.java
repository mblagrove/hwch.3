/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 *
 * This class formats the given date into American Format and European Format. The variable day holds the string value for Thursday, the integer value for date
 * the string value for month, July, and the integer value for year. It is then printed as day + date + month + year. the plus prints strings and integer values together
 */
public class CalendarFormat{
    public static void main (String [] args) {
        String day = "Thursday";
        int date = 16;
        String month = "July";
        int year = 2015;
        System.out.println("American Format:");
        System.out.println(day +"," + " " + date + " "+ month + "," + " " + year);
        System.out.println("European Format:");
        System.out.println(day  + " " + date + " " + month + " " + year);

    }

}
