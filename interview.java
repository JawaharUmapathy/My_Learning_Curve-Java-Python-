public class interview {
    public static void main(String[] args) {
        int a=15,b=15,c=15;
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println(a+" "+b+" "+c);
        a=a^b^c;
        b=a^b^c;//a
        c=a^b^c;//b
        a=a^b^c;//c
        System.out.println(a+" "+b+" "+c);
    }
}