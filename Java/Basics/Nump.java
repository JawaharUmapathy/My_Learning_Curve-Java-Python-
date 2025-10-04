import java.util.*;
public class Nump {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int b=1;
        int y=0;
        int x = d.nextInt();
        System.out.println("The sequence is : ");
        for (int i = 1; i <=x; i++) {
            b=b*4;
            System.out.println(i*b);
            y=i*b;
        }
        System.out.println("The output of the following nth variable is : "+ y);
    }
}
    