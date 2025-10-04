import java.util.*;
public class merger {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int y = d.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        for(int i = 0 ; i < x ; i++){
            a[i]=d.nextInt();
        }
        for(int i = 0 ; i < y ; i++){
            b[i]=d.nextInt();
        }
        int z = x+y;
        int[] c = new int[z];
        for(int i = 0 ; i < x ; i++){
            c[i]=a[i];
        }
        for(int i = 0 ; i < y ; i++){
            c[i+x]=b[i];
        }
        for (int i = 0; i < z; i++) {
            int cur = c[i];
            for(int j = i ; j < z ; j++){
                if(cur>c[j]){
                    cur=c[j];
                }
            }
            c[i]=cur;
        }
        for (int i = 0; i < z; i++){
            System.out.print(c[i]);
        }
     }
}

