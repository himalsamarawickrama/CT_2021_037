package Q_01;
import java.util.*;

public class Q_01c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value for X:");
        int X = s.nextInt();

        System.out.println("Enter value for Y:");
        int Y = s.nextInt();

        double result = Math.cbrt(X*Y);

        System.out.println("The result is :" +result);
        s.close();
    }

}
