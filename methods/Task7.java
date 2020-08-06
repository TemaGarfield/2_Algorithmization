package methods;

public class Task7 {

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int oddFactSum () {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += factorial(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(oddFactSum() );
    }

}
