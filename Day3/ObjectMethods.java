package Day3;

public class ObjectMethods {
    public static void main(String args[]){
        Cars c1 = new Cars("R8","Audi", "2025-12-23");
        Cars c2 = new Cars("R8","Audi", "2025-12-23");
        if (c1.equals(c2)){
            System.out.println("Equall hai !!");
        }
        else {
            System.out.println("Equal nahi hai");
        }
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
