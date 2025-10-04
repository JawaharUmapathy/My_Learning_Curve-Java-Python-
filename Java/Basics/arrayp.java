import java.util.*;
class arrayp {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        int[] arr = new int[n];
        int[] x = new int[n/2];
        int b=0;
        for (int i = 0; i < n; i++) {
            arr[i]=d.nextInt();
        }
         System.out.print("The duplicate elements are : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++) {
                if(arr[j]==arr[i]){
                    for(int k=0;k<b;k++){
                        if (arr[j]==x[k]){
                            x[b]=arr[j];
                            System.out.print(x[b]);
                            b=b+1;
                            
                        }
                    }
                    }
                }
            }
        }
    }
