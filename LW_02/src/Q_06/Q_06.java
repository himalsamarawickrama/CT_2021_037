package Q_06;
import java.util.*;
import java.text.SimpleDateFormat;

public class Q_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your born year: ");
        int Y = s.nextInt();

        Calendar C;
        C = Calendar.getInstance();
        int CY = C.get(Calendar.YEAR);

        int age = CY - Y;
        System.out.println("You were born in "+Y+ " and your age is "+age);
        s.close();
    }
}
