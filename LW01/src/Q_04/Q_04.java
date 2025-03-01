package Q_04;

import java.text.SimpleDateFormat;
import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY");
        System.out.println(sdf.format(date));
    }
}
