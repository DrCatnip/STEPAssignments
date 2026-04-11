import java.util.Scanner;

class DistanceAndLine {

    public double findDistance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates:");
        int x1=sc.nextInt(), y1=sc.nextInt();
        int x2=sc.nextInt(), y2=sc.nextInt();

        DistanceAndLine obj = new DistanceAndLine();

        System.out.println("Distance = " + obj.findDistance(x1,y1,x2,y2));

        sc.close();
    }
}