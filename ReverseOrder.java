/**Class: Time
 * @author Myea Blagrove
 * @version 1.0
 * Course: ITEC 2140 Fall 2024
 * Written: September 7, 2024
 * This class prompts the user to input a number and the following class converts the following number into the number in reverse.
 * Assign the first digit as digit 1 divided by 100
 * Assign the second digit as digit 2 remainder division 100 divided by 10
 * Assign the third digit as digit 3 remainder division 100 remainder division 10
 * print digit 3, digit 2, digit 1
 */
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Enter a number between 111 and 999:" + number);
        String digit_1 = String.valueOf(number / 100);
        String digit_2 = String.valueOf((number % 100) / 10);
        String digit_3 = String.valueOf((number % 100) % 10);
        String new_number = digit_3 + digit_2 + digit_1;
        System.out.print("Your number in reverse is:" + new_number);

    }
}