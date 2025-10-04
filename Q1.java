import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        // INPUT
        String t = d.nextLine();
        String[] t1 = t.split(" ");
        String[] t2 = t1[0].split("/");
        String[] t3 = t1[1].split(":");

        String s = d.nextLine();
        String[] L = s.split(" ");

        int N = Integer.parseInt(L[0]);
        String C = L[1];

        int dd = Integer.parseInt(t2[0]);
        int mm = Integer.parseInt(t2[1]);
        int yy = Integer.parseInt(t2[2]);

        int hr = Integer.parseInt(t3[0]);
        int min = Integer.parseInt(t3[1]);
                
        // Add N minutes or hours
        if (C.equals("M")) {
            min += N;
        } else if (C.equals("H")) {
            hr += N;
        }

        // Adjust minutes to hours
        hr += min / 60;
        min = min % 60;

        // Adjust hours to days
        dd += hr / 24;
        hr = hr % 24;

        // Days in months
        while (true) {
            int daysInMonth = getDaysInMonth(mm, yy);
            if (dd <= daysInMonth) break;
            dd -= daysInMonth;
            mm++;
            if (mm > 12) {
                mm = 1;
                yy++;
            }
        }

        // OUTPUT
        System.out.printf("%02d/%02d/%04d %02d:%02d\n", dd, mm, yy, hr, min);
    }

    static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
