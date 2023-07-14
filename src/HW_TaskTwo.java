public class HW_TaskTwo {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        intArray[8] = 20;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}