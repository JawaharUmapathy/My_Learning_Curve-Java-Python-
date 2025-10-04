import java.util.Map;
import java.util.Scanner;
public class Roman {
    public static void main(String[] args) {
        Scanner d  = new Scanner(System.in);
        String x = d.nextLine();
        int sum=0,value=0;
        Map<Character,Integer> R = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',100);
        for(int i =0;i<x.length();i++){
            value  = R.get(x.charAt(i));
            sum+=value;
        }
        System.out.print(sum);
    }
}