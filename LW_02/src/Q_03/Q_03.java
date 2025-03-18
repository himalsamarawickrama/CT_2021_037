package Q_03;
import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        System.out.println("Input temperature in celsius:");
        Scanner s = new Scanner(System.in);

        int C = s.nextInt();
        double result = (1.8*C)+32;
        System.out.println("Fahrenheit :"+result);
        s.close();
    }
}
