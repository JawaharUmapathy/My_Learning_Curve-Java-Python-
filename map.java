import java.util.*;
public class map {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String s = d.nextLine();
        String p = d.nextLine();
        String cpy = "";
        int l = 0;
        HashMap<Character , Integer> ph = new HashMap<>();
        HashMap<String , Integer> sh = new HashMap<>();
        String[] x = new String[p.length()];
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!=' '){
                cpy=cpy+s.charAt(i);
            }
            else if (s.charAt(i)==' ' || i==s.length()-1){
                x[l]=cpy;
                cpy="";
                l+=1;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if(!ph.containsKey(p.charAt(i))){
                ph.put(p.charAt(i),i);
            }
            if(!sh.containsKey(x[i])){
                sh.put(x[i],i);
            }
            if(!ph.get(p.charAt(i)).equals(sh.get(x[i]))){
                System.out.print("False");
                return;
            }
        }
        System.out.println("True"); 
    }
}
