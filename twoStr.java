import java.util.*;
public class twoStr {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in); 
        String S1 = d.nextLine();
        String S2 = d.nextLine();
        String B1 = "";
        String B2 = "";
        char b = ' ';
        int t = 0;
        int x = S1.length()-1;
        int g = 1;
        int h = S1.length();
        if (S2.charAt(0)==S1.charAt(x)){
            B1=S1;
            B2=S2;
            b=S2.charAt(0);
        }
        else if(S2.charAt(x)==S1.charAt(0)){
            B1=S2;
            B2=S1;
            b=S1.charAt(0);
        }
        for (int i = 0; i <S1.length(); i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
                if(i==0&&t==0&&j==2){
                    System.out.print(b);
                    t=1;
                }
                else if(t==0){
                    System.out.print(B1.charAt(h-i+1));
                    for (int k = 0; k < g; k++) {
                        g+=2;
                        System.out.print("*");
                    }
                    System.out.print(B2.charAt(i));
                }
                System.out.print("*");
            }
            x-=1;
            t=0;
            System.out.println("");
        }

    }
}
