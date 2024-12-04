/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 *
 * This class prompts the user to input the radius and length, the program has PI as a fixed constant, a constant is indicated by the capitalized letter pi.
 * The radius is squared by multiplying radius by itself, multiplied by length, and by the constant PI. This formula makes up the variable for area.
 * It is printed by the string area plus the calculated area
 */
import java.util.Scanner;
public class Cylinder{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.1416;
        float radius = input.nextFloat();
        float length = input.nextFloat();
        double area = (radius*radius)*PI*length;
        System.out.println("Area" + area);


    }
}
