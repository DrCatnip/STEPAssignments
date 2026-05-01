import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {

    public void generate(String[] arr) {
        System.out.println(arr[10]); // invalid index
    }

    public void handle(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            arr[i] = sc.next();
        }

        ArrayIndexOutOfBoundsDemo obj = new ArrayIndexOutOfBoundsDemo();

        try {
            obj.generate(arr);
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }

        obj.handle(arr);

        sc.close();
    }
}