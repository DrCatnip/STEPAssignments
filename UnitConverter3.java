import java.util.Scanner;

class UnitConverter3 {

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double k) {
        return k * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + fToC(f));

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + cToF(c));

        System.out.print("Enter weight in pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms = " + poundsToKg(p));

        System.out.print("Enter weight in kilograms: ");
        double k = sc.nextDouble();
        System.out.println("Pounds = " + kgToPounds(k));

        System.out.print("Enter gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters = " + gallonsToLiters(g));

        System.out.print("Enter liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons = " + litersToGallons(l));

        sc.close();
    }
}