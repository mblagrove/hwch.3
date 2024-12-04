/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 *
 * This class calculates converts 100 degrees in Fahrenheit, indicated by the variable f as an integer value, to degrees in Celsius, indicated by variable c as an integer value.
 */
public class FahrenheitToCelsius{
    public static void main(String [] args){
        int f = 100;
        int c = (f - 32) * 5/9;
        System.out.println (c);


    }
}
