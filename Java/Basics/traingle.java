import java.util.Scanner;
class traingle {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        for(int i = 0;i<=n;i++){
            for (int j=0;j<i;j++){
            System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
