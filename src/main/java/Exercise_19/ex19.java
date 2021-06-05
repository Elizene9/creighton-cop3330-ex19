/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a program to calculate the body mass index (BMI) for a person
using the person’s height in inches and weight in pounds.
The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:
bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight.
 If they are out of that range, tell them if they are underweight or overweight
 and tell them to consult their doctor.

Example Output
Your BMI is 19.5.
You are within the ideal weight range.
or
Your BMI is 32.5.
You are overweight. You should see your doctor.
Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
 */

package Exercise_19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ex19 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("What is your weight in pounds? ");
        double weight = ex_19();

        System.out.print("What is your height in inches? ");
        double height = ex_19();

        double BMI = (weight / (height * height)) * 703;

        if (BMI < 18.5)
            System.out.printf("\nYour BMI is %.2f\nYou are underweight. You should see your doctor.", BMI);

        else if (BMI > 25)
            System.out.printf("\nYour BMI is %.2f\nYou are overweight. You should see your doctor.", BMI);

        else
            System.out.printf("\nYour BMI is %.2f\nYou are at a normal weight.",BMI);
    }
    public static double ex_19() {

        while (true) {

            try {
                return input.nextDouble();
            }
            catch (InputMismatchException e) {
                input.next();
                System.out.println("\nInvalid input, enter a numeric value");
            }
        }
    }
}
