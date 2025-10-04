import java.util.Scanner;
class fullP {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i=0;i<(2*n);i++){
            if(i<n+1){
                for (int j=n-i;j>=0;j--) {
                    System.out.print(" ");
                }
                for (int k=0;k<i;k++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=0;k<(i/2);k++){
            System.out.print(" ");
        }
                for (int l=(2*n)-i;l>=1;l--){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}