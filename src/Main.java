public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); // true

        System.out.println(hasSharedDigit(9, 99));  // false

        System.out.println(hasSharedDigit(12, 34)); // false

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        // Check if both numbers are within the range of 10-99

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {

            return false;

        }



        // Get the digits of num1

        int num1FirstDigit = num1 / 10;

        int num1SecondDigit = num1 % 10;



        // Get the digits of num2

        int num2FirstDigit = num2 / 10;

        int num2SecondDigit = num2 % 10;



        // Check if any digit is shared between the two numbers

        return (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2SecondDigit ||
                num1SecondDigit == num2FirstDigit || num1SecondDigit == num2SecondDigit);

    }

}

