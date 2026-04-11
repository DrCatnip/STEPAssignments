import java.util.Scanner;

class WindChillCalculator {

    public double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp +
                (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (F): ");
        double temp = sc.nextDouble();

        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double result = obj.calculateWindChill(temp, windSpeed);

        System.out.println("Wind Chill = " + result);

        sc.close();
    }
}