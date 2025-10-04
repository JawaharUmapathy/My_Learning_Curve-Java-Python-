import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int[] x = new int[]{1,2,3,4,5,6,7};
        int[] dup = new int[x.length];
        int y  = d.nextInt();
        while (y>x.length){
            y=y-x.length;
        }
        for (int i = 0; i < x.length; i++) {
            if(i<y-1){
                dup[i]=x[i+y];
            }
            else{
                dup[i]=x[i-y];
            }
        }
        for (int i = 0; i < dup.length; i++) {
            System.out.print(dup+" ");
        }
    }
}
