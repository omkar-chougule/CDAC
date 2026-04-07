public class ArrayDemo {
    static void main() {
        int [] arr = {1,2,3,4,5,6};
        for (int a : arr){
            System.out.println(a);
        }

        int [] num = new int[3];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;

        for(int b : num){
            System.out.println(b);
        }
    }
}
