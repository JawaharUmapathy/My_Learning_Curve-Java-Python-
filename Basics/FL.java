import java.util.*;
class FL {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        char x = d.next().charAt(0);
        if (x>=65 && x<=90){
        char y = (char)(x+32);
        System.out.print(y);
        }
        else if (x>=97 && x<=122){
            char y = (char)(x-32);
            System.out.print(y);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
