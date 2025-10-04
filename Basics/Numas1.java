import java.util.*;
class Numas1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int y = 0;
        int z = 1;
        while (x > 0) {
            y = x % 10;
            if (y != 0) {
                z = z * y;
            }
            x = x / 10;
        }
        System.out.println(z);
    }
}
