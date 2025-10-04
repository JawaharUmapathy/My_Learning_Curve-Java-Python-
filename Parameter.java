class Parameter{
    Parameter(){
        System.out.println("Default Param");
    }
    Parameter(int a , int b){
        int c= a+b;
        System.out.println(c);
    }
    Parameter(String x,int d){
        System.out.println(x+"Age is : "+ d);
    }
    public static void main(String[] args) {
        Parameter P = new Parameter("Helei",17);
    }
}
