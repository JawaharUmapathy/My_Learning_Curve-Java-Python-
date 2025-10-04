import java.util.*;
class merges {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int y = d.nextInt();
        int[] arr1 = new int[x+y];
        int[] arr2 = new int[y];
        for (int i = 0; i < x; i++) {
            arr1[i]=d.nextInt();
        }
        for (int j = 0; j < x; j++) {
            arr2[j]=d.nextInt();
        }
        for (int i = 0; i < x+y; i++) {
            if(i>x){
                arr1[i]=arr2[i-x];
            }
            }
            for (int i = 0; i <x+y; i++) {
                System.out.print(arr1[i]);   
        }
}
}