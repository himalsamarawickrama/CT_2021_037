package Q_11;

import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName; // store first name
        String mName; // store middle name
        String lName; // store last name
        System.out.print("Enter your first name: ");
        fName = scanner.next();
        System.out.print("Enter your middle name: ");
        mName = scanner.next();
        System.out.print("Enter your last name: ");
        lName = scanner.next();
        System.out.println(lName +", "+ fName +" "+mName.charAt(0)+".");
    }
}

