import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        Calendar cal1 = new GregorianCalendar(y1, m1 - 1, d1);
        Calendar cal2 = new GregorianCalendar(y2, m2 - 1, d2);

        
        if ( cal1.get(Calendar.YEAR) > cal2.get(Calendar.YEAR))  {
            return 10000;
        } else if ( cal1.get(Calendar.YEAR) < cal2.get(Calendar.YEAR)){
            return 0;
        }

        if (cal1.get(Calendar.MONTH) > cal2.get(Calendar.MONTH)) {
            return  (cal1.get(Calendar.MONTH) - cal2.get(Calendar.MONTH)) * 500;
        } else if (cal1.get(Calendar.MONTH) < cal2.get(Calendar.MONTH)) {
            return 0;
        }

        if (cal1.get(Calendar.DAY_OF_MONTH) > cal2.get(Calendar.DAY_OF_MONTH)) {
            return  (cal1.get(Calendar.DAY_OF_MONTH) - cal2.get(Calendar.DAY_OF_MONTH)) * 15;
        }
        
        return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
