class NullPointerDemo {

    // Method to generate exception
    public void generateException() {
        String text = null;
        System.out.println(text.length()); // will crash
    }

    // Method to handle exception
    public void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException!");
        }
    }

    public static void main(String[] args) {

        NullPointerDemo obj = new NullPointerDemo();

        System.out.println("Generating Exception:");
        try {
            obj.generateException();
        } catch (Exception e) {
            System.out.println("Program crashed (expected)");
        }

        System.out.println("Handling Exception:");
        obj.handleException();
    }
}