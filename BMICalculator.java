import java.util.Scanner;

class BMICalculator {

    public void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightM = data[i][1] / 100;

            data[i][2] = weight / (heightM * heightM);
        }
    }

    public String[] getStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        BMICalculator obj = new BMICalculator();

        obj.calculateBMI(data);

        String[] status = obj.getStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println("BMI = " + data[i][2] + " Status = " + status[i]);
        }

        sc.close();
    }
}