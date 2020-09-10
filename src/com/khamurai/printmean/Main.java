package com.khamurai.printmean;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    meanCalc(1, 1, 2, 4);
	    meanCalc(1, 2, 3, 4);
	    meanCalc(1, -2, 3, -4);
	    meanCalc(24, -150, 1000, -235);
	    meanRandomCalc();
    }

    public static void meanCalc(double a, double b, double c, double d) {
        double mean = (a + b + c + d) / 4.0;
        System.out.println("Mean of " + a + ", " + b + ", " + c + ", " + d + ": " + mean);
    }

    public static void meanRandomCalc() {
        Random rand = new Random();
        double a = rand.nextInt(500);
        double b = rand.nextInt(500);
        double c = rand.nextInt(500);
        double d = rand.nextInt(500);
        double mean = (a + b + c + d) / 4.0;
        System.out.println("Mean of " + a + ", " + b + ", " + c + ", " + d + ": " + mean);
    }
}
