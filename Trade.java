import java.util.*;
public class Trade {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int[] y = new int[x];
        int t = 0;
        int v = 0;
        for (int i = 0; i < x; i++) {
            y[i]=d.nextInt(); 
        }
        for (int i = 1; i <= x; i++) {
            for (int j = i-1; j <x ; j++) {
                if(t<j-i){
                    t=j-i;
                    v=j;
                }
            }
        }
        System.out.println(v);
    }
}