package org.example;

import java.util.Scanner;
import java.io.InputStream;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius:");

        Scanner input = new Scanner(System.in);
        float celsiusInput = input.nextFloat();
//        System.out.print(celsiusInput);
//        float celsiusInput = Float.pa
        float FahrenheitOutput = (float) ((celsiusInput * (9.0/5.0) ) + 32);

        System.out.print("Temperature in Fahrenheit: ");
        System.out.printf("%.2f",FahrenheitOutput);


    }
}