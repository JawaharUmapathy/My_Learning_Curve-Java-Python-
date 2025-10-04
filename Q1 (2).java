import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        int n = d.nextInt();
        int l = (n/2)+1;
        
        for(int i = 0 ; i<n;i++){
            System.out.print(i+1);
            int c = n-1;
            if (i<l){
                int b = (i+1+c);
                for (int j = 1; j <= i; j++) {
                    
                if(j==1){
                    System.out.print(" "+b);
                }
                else{
                    c-=2;
                    b=b+c;
                    System.out.print(" "+b);

                }
                }
            }
            else if(i>=l){
                int b = (i+1+c);
                for (int j = n-i; j >1; j--){
                    if(j==n-i){
                      System.out.print(" " +b);
                    }
                    else{
                      c-=2;
                      b=b+c;
                      System.out.print(" "+b);

                    }
                }
            }
            System.out.println("");
        }
    }
}
