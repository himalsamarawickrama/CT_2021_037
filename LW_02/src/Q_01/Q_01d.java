package Q_01;

import java.util.Scanner;

public class Q_01d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value for Radius :");
        int r = s.nextInt();

        double result = Math.PI *Math.pow(r,2);
        System.out.println("The Area is :"+result);
    }
}
