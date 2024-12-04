/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 *This class converts the users input in Celsius to Fahrenheit. The Celsius is inputted as a double or as a decimal. This data type was chosen since the
 * value is multiplied by the fraction 9/5 and then added by 32
 */
import java.util.Scanner;
public class CelsiusToFahrenheit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        System.out.println("Enter degrees in Celsius:");
        double fahrenheit = (celsius*9/5) + 32;
        System.out.println (fahrenheit);

    }
}
