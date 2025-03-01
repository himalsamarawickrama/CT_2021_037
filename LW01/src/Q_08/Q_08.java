package Q_08;

import java.util.*;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int exclam;
        String firstText; // the text before the exclamation mark
        String secoundText; // the text after the exclamation mark
        System.out.print("Enter a string: ");
            text = scanner.nextLine();
            exclam = text.indexOf("!");
            firstText = text.substring(0,exclam);
            secoundText = text.substring(exclam+2); // skip the space after the exclamation mark using +2
        System.out.println(firstText+"\n"+secoundText);

    }
}
