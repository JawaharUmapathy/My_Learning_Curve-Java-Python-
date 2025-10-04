class Parameter1 {
    Parameter1() {
        System.out.println("Default Param");
    }

    Parameter1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    Parameter1(String x, int d) {
        System.out.println(x + "Age is : " + d);
    }

    public static void main(String[] args) {
        Parameter1 P = new Parameter1("Helei", 17);
    }
}
