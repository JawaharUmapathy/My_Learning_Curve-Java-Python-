import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String S = d.nextLine();
        Set<String> B = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {
                String sub = S.substring(i,j);
                String R = new StringBuilder(sub).reverse().toString();
                B.add(R);
            }
        }
        List<String> RL= new ArrayList<>(B);
        Collections.sort(RL);
        String Rs= new StringBuilder(S).reverse().toString();
        int Ra= RL.indexOf(Rs);
        System.out.println(Ra+1);
    }
}
