import java.util.Scanner;

class OTPGenerator {

    public int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many OTPs to generate: ");
        int n = sc.nextInt();

        OTPGenerator obj = new OTPGenerator();

        for (int i = 0; i < n; i++)
            System.out.println("OTP " + (i + 1) + ": " + obj.generateOTP());

        sc.close();
    }
}