import java.util.Scanner;

public class Calculator {
    public static float add(float a, float b) {
        return a + b;
    }

    public static float substract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static void ask() {
        Scanner in = new Scanner(System.in);

        // ask user to input the 2 numbers
        System.out.print("Enter n1: ");
        float n1 = in.nextFloat();
        System.out.print("Enter n2: ");
        float n2 = in.nextFloat();

        // ask the user to choose the operation he wants
        System.out.println("Choose operation: ");
        int n;
        do {
            System.out.println("1:Add\n2:Substract\n3:Multiply\n4:Divide");
            n = in.nextInt();
        } while (n > 4 || n < 1);

        switch (n) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, add(n1, n2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, substract(n1, n2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, multiply(n1, n2));
                break;
            case 4:
                if (n2 == 0)
                    System.out.println("You cannot divide by 0!");
                else
                    System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, divide(n1, n2));
                break;
            default:
                break;
        }

        // ask the user if he wants to repeat the process
        System.out.print("Do you want to make another operation? (y/n) ");
        char x = in.next().charAt(0);
        if(x=='y'||x=='Y')
            ask(); // repeat it
        else
            System.out.println("Thanks for using this app");
    }

    public static void main(String[] args) {
        ask();
    }
}
