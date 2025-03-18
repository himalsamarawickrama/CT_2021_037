package Q_04;
import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input weight of person :");
        int W = s.nextInt();

        int result = W*19;

        System.out.println("Calories :"+result);
        s.close();

    }
}
