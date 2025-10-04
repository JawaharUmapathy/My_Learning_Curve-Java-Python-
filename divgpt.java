import java.util.*;

public class divgpt {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int x = d.nextInt();
        int s1, s2;
        int t = 0;
        int[] val = new int[8];
        ArrayList<Integer> bew = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 1111; i < 9999; i++) {
            if (i * x <= 9999) {
                bew.add(i);
                bew.add(i * x);
            }
        }

        for (int i = 0; i < bew.size(); i += 2) {
            s1 = bew.get(i);
            s2 = bew.get(i + 1);

            // Extract digits into val[]
            for (int j = 0; j < 4; j++) {
                val[j] = s1 % 10;
                s1 /= 10;
            }
            for (int j = 4; j < 8; j++) {
                val[j] = s2 % 10;
                s2 /= 10;
            }

            int count = 0;
            boolean[] matched = new boolean[8];

            for (int k = 0; k < 8; k++) {
                for (int l = 0; l < 8; l++) {
                    if (val[k] == test[l] && !matched[l]) {
                        matched[l] = true;
                        count++;
                        break;
                    }
                }
            }

            if (count == 8) {
                t++;
                res.add(bew.get(i));
                res.add(bew.get(i + 1));
            }
        }

        System.out.println(t);
        for (int i = 0; i < res.size(); i += 2) {
            System.out.println(res.get(i + 1) + " " + res.get(i)); // product multiplicand
        }
    }
}
