public class Math {
    private int a;
    private  int b;
    private  int c;
    private int d;
    int sum = 0;

    public Math(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static void add(int a , int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void add(int a , int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }

    public static void add(int a , int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println(sum);
    }
    @Override
    public String toString() {
        return "Math{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
