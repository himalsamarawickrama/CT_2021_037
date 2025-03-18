package Q_09;
import java.util.*;
public class Q_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Dollar Amount :");
        double P = s.nextInt();

        System.out.println("Enter Percent Interest Rate :");
        double R = s.nextInt();

        System.out.println("Enter Number of Years :");
        int N = s.nextInt();

        double result = P* Math.pow(1+(R/100.0),N);
        System.out.println("Your investment is :"+result);

        s.close();
    }
}
