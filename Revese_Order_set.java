import java.util.*;

public class Revese_Order_set {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String s = d.nextLine();

        Set<Character> b = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            b.add(s.charAt(i));
        }

        // Convert Set to List
        List<Character> dp = new ArrayList<>(b);

        // Sort in reverse order
        Collections.sort(dp, Collections.reverseOrder());

        // Print the sorted characters
        for (int i = 0; i < dp.size(); i++) {
            System.out.print(dp.get(i));
        }

        d.close();
    }
}
