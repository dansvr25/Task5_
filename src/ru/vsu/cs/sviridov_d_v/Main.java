package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double height = readHeight("Enter the height of the figure: ");

        printFigure(height);
    }

    static double readHeight(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value < 3) {
            do {
                System.out.println("The value can not be less than 3");
                System.out.print(text);
                scn = new Scanner(System.in);
                value = scn.nextDouble();
            }   while (value < 3);
        }
        return value;
    }

    static void printFigure(double h) {

        System.out.println("*");
        System.out.print("|");
        System.out.println("\\");

        for (int i = 3; i < h; i++) {
            System.out.print("|");

            for (int n = 1; n <= i - 2; n++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        System.out.print("*");

        for (int i = 2; i < h; i++) {
            System.out.print("-");
        }

        System.out.print("*");
    }
}