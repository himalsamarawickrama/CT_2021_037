package Q_07;
import java.util.*;

public class Q_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight(kg) :");
        int W = s.nextInt();

        System.out.println("Enter your height(cm) :");
        int H = s.nextInt();

        double BMI = W/Math.pow(H/100.0,2);
        if (BMI >=20 && BMI <=25){
            System.out.println("BMI = "+BMI+"\nNormal");

        }else{
            System.out.println("BMI ="+BMI+"\nNot Normal");
        }
        s.close();
    }
}
