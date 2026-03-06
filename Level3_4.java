import java.util.Scanner;

class Level3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traveler name: ");
        String name = sc.next();

        System.out.print("Enter from city: ");
        String fromCity = sc.next();

        System.out.print("Enter via city: ");
        String viaCity = sc.next();

        System.out.print("Enter destination city: ");
        String toCity = sc.next();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println(
            "The Total Distance travelled by " + name +
            " from " + fromCity +
            " to " + toCity +
            " via " + viaCity +
            " is " + totalDistance +
            " km and the Total Time taken is " + totalTime + " minutes"
        );

        sc.close();
    }
}