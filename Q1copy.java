import java.util.*;
public class Q1copy {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String S = d.nextLine();
        Set<String> RSet = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {
                String sub = S.substring(i,j);
                String Rev = new StringBuilder(sub).reverse().toString();
                RSet.add(Rev);
            }
        }
    List<String> L = new ArrayList<>(RSet);
    Collections.sort(L);
    String Irev = new StringBuilder(S).reverse().toString();
    int ind = L.indexOf(Irev);
    System.out.println(ind+1);
    }
}
