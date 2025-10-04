import java.util.Scanner;
class Abc{
    public static void main(String[] args){
Scanner d = new Scanner(System.in);
        int a = d.nextInt();
int b = d.nextInt();
int c = d.nextInt();

        if (a>b){
            if (a>c){
                System.out.print("A is greatest number");
            }
            else if (c>a){
                 System.out.print("C is the greatest Number");            
            }
        } 
        else{
                 System.out.print("B is the greatest Number");
}   
    }
}