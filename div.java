import java.util.*;
public class div {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int y = 0;
        int s1= 0 ;
        int s2 = 0 ;
        int[] val = new int[8];
        ArrayList<Integer> bew = new ArrayList<>();
        int[] test = {1,2,3,4,5,6,7,8};
        for (int i = 1111; i < 9999; i++) {
            if(i*x<=9999){
                bew.add(i);
                bew.add(i*x);
            }
        }
        for (int i = 0; i < bew.size(); i += 2) {
            s1=bew.get(i);
            s2=bew.get(i+1);
            for (int j = 0; j < 4; j++) {
                val[j]=s1%10;
                val[j+1]=s2%10;
                s1/=10;
                s2/=10;
            }
            for (int k = 0; k < 8; k++) {
                for (int l = 0; l < 8; l++) {
                    if (val[i]==test[j]){
                        y+=1;
                    }
                }
            }
        }
    }
}
