package Q_01;
import java.util.*;

public class Q_01b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for X:");
        int X = s.nextInt();

        System.out.println("Enter value for Y:");
        int Y = s.nextInt();

        double result = Math.sqrt(X + 4*Math.pow(Y,3));
        System.out.println("The result is : "+ result);

        s.close();



    }
}
