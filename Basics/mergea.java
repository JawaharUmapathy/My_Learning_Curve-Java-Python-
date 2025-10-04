import java.util.*;
class mergea {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        int m = d.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = d.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = d.nextInt();
        }
        
        int[] arr3 = new int[n + m];
        
        for (int i = 0; i < n + m; i++) {
    if (i < n) {
        arr3[i] = arr1[i];
    } else {
        arr3[i] = arr2[i - n]; 
    }
}

        
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
