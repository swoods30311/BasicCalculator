import java.util.Scanner;
import java.lang.Math;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.next();
        System.out.println("Welcome " + name);
        int choice = 0;
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square");
            System.out.println("6.Square Root");
            System.out.println("7.Factorial");
            System.out.println("10. Exit");
            System.out.println("Please Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    subtract(sc);
                    break;
                case 3:
                    multiplication(sc);
                    break;
                case 4:
                    division(sc);
                    break;
                case 5:
                    square(sc);
                    break;
                case 6:
                    squareRoot(sc);
                    break;
                case 7:
                    factorial(sc);
                    break;

            }
        }
        while(choice != 10);
    }


    public static void add(Scanner sc){
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("The addition is: " + c);
        }

        public static void subtract(Scanner sc){
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int c = a - b;
            System.out.println("The subtraction is: " + c);
        }
        public static void multiplication(Scanner sc){
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int c = a * b;
            System.out.println("The multiplication is: " + c);
        }
        public static void division(Scanner sc){
            System.out.println("Enter first number");
            double a = sc.nextDouble();
            System.out.println("Enter second number");
            double b = sc.nextDouble();
            double c = a/b;
            System.out.println("The division is: " + c);
        }
        private static void square(Scanner sc) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println(a*a);
        }
        private static void squareRoot(Scanner sc) {
            System.out.println("Enter a number");
            double a = sc.nextDouble();
            System.out.println(Math.sqrt(a));;
        }

        private static void factorial(Scanner sc){
            System.out.print("Give a number:");
            int userInput = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= userInput ; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
}
