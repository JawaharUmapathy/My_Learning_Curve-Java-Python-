import java.util.*;
public class hays {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String x = d.nextLine();
        String y = d.nextLine();
        int c = 0;
        int t = 0;
        int ind = 0 ;
        String b = "";
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)==y.charAt(0)){
                ind=i+1;
                for (int j = 0; j < y.length(); j++) {
                    if(x.charAt(i+j)==y.charAt(j)){
                        c+=1;
                    }
                }
            }


        } 
        if(c==y.length()){
            System.out.println(ind);
        }
        else{
            System.out.println(-1);
        }
    }
}
