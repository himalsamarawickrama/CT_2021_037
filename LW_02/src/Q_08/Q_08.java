package Q_08;
import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of sphere :");
        int R = s.nextInt();

        double V = (4.0/3)*Math.PI*Math.pow(R,3);

        System.out.println("Volume of sphere is: "+V);
        s.close();
    }
}
