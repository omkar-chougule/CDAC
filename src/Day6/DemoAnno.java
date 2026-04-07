package Day6;

//import java.util.function.IntPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoAnno {
    public static boolean operateOnNumber(IPredicate p, int n){
        return p.test(n);
    }

    public static List<Integer> operateOnNumber(IPredicate p, List<Integer> lst){
        List<Integer> filtered = new ArrayList<>();
        for(Integer item : lst){
            if(p.test(item)){
                filtered.add(item);
            }
        }
        return filtered;
    }
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        List<Integer> lst = new ArrayList<>(Arrays.asList(10, 12, 13, 11, 14, 15));
        IPredicate iseven = (n) -> n%2 == 0;



        boolean result = iseven.test(10);
        System.out.println(result);

        IPredicate isprime = (n) ->
        {
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        };

        boolean res = isprime.test(10);
        System.out.println(res);

        result = operateOnNumber((n) -> n>10, 12);
        System.out.println(result);

        result = operateOnNumber((n) ->
        {
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        },12);

        System.out.println(result);

        result = operateOnNumber(DemoAnno::isPrime, 12);
        System.out.println(result);

        List<Integer> filtred = operateOnNumber((n) -> n%2==1, lst);
        System.out.println(filtred);

        filtred = operateOnNumber(DemoAnno::isPrime, lst);
        System.out.println(filtred);
    }

}
