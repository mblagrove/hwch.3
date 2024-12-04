/**
 * class: BMI
 * constants given poundsperkilograms and metersperinch
 * User is prompted to input weight, feet and inches
 * feet is converted into inches
 * weight divided  poundsperkilogram
 * feettoinches plus inches times metersper inch
 * weightinkilograms divided height in meters times height in meters
 * BMI calculated
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final float POUNDS_PER_KILOGRAMS = 2.2F;
        final float METERS_PER_INCH = 0.0254F;
        System.out.println("Enter weight in pounds:");
        float weight = input.nextFloat();
        System.out.println("Enter height in feet:");
        int feet = input.nextInt();
        System.out.println("Enter height in inches:");
        int inches = input.nextInt();
        int feet_to_inches = feet * 12;//
        float weight_in_kg = weight / POUNDS_PER_KILOGRAMS;
        float height_in_meters = (feet_to_inches + inches) * METERS_PER_INCH;
        float BMI = weight_in_kg / (height_in_meters * height_in_meters);
        System.out.printf("Your BMI is:" + BMI);
    }
}
