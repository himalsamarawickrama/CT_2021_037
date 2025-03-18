package Q_01;
import java.util.Scanner;

public class Q_01a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value for A:");
        int A = s.nextInt();

        System.out.println("Enter value for B:");
        int B = s.nextInt();

        System.out.println("Enter value for C:");
        int C = s.nextInt();

        double result = Math.sqrt(B * B + 4 * A * C);

        System.out.println("The result is: " + result);

        s.close();
    }
}
