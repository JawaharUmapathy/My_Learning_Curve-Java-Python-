public class jumpgame {
    public static void main(String[] args) {
        int[] arr ={3,2,1,0,4};
       int maxReach = 0;
       int g=0;
        for (int i = 0; i < arr.length; i++) {
            if (i > maxReach) {
                g =1;
            }
            maxReach = Math.max(maxReach, i + arr[i]);

        }
        System.out.print(maxReach+" "+g);
    }
}
