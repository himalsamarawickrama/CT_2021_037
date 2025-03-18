package Q_02;
import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter cm value :");
        int X = s.nextInt();

        double inches = X / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println(X + " cm is approximately " + feet + " feet " + remainingInches + " inches.");
        s.close();

    }
}
