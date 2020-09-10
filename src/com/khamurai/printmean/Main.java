package com.khamurai.printmean;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1, 3, 3));
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1, 3, 3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));
        //System.out.println("Mean of -1, -11, 24, 2, 2000: " + meanCalc(-1, -11, 24, 2, 2000));
    }

    public static String meanCalc(double a, double b, double c, double d) {
        double mean = (a + b + c + d) / 4.0;
        String meanString = String.valueOf(mean);
        return meanString;
    }

    public static String meanCalc(double a, double b, double c, double d, double e) {
        double mean = (a + b + c + d + e) / 5.0;
        String meanString = String.valueOf(mean);
        return meanString;
    }
}
