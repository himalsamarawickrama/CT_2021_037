package Q_05;
import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temparature in Fehranheit :");
        int F = s.nextInt();
        double result = (5.0/9)*(F-32);

        System.out.println("Celsius: "+result);
        s.close();


    }
}
