import java.util.*;
class arr  {
    public static void main(String[] args) {
        Random s = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt(25000);
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
