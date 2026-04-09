package Day5;

import java.util.Arrays;

public class Stat <T extends Number>{
    T [] obj;

    public Stat(T [] obj){
        this.obj = obj;
    }

    public double getAverage(){
        double total = 0.0;
        for(T itrm: obj){
            total += itrm.doubleValue();
        }

        return total/obj.length;
    }


    static void main() {
        Integer [] iarr = {1,2,3,4,5,6};
        Double [] darr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};

        Stat<Integer> iobj = new Stat<>(iarr);
        System.out.println(iobj.getAverage());
        Stat<Double> dobj = new Stat<>(darr);
        System.out.println(dobj.getAverage());

    }
}
