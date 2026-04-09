package LambdaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambda {
    public static List<Integer> operateOnNumbers(IPredicate1 ip, List<Integer> numbers){
        List<Integer> result = new ArrayList<Integer>();
        for(Integer item : numbers){
            result.add(ip.apply(item));  // apply the lambda/function
        }
        return result;
    }
    public static List<Integer> cubeNum(List<Integer> data)
    {
        List<Integer> cube = new ArrayList<Integer>();
        for(Integer i : data)
        {
            int res=i*i*i;
            cube.add(res);
        }
        return cube;
    }
    public static boolean evencheck(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(11,15,20,23,26));
        IPredicate1 square = (int n) -> n*n;
        int sqr=square.apply(22);
        System.out.println("Square : "+sqr);


        IPredicate1 fact=(int n) ->
        {
            int f=1;
            for(int i=1; i<=n; i++){
                f*=i;
            }
            return f;
        };

        int factorial=fact.apply(10);
        System.out.println("Factorial :" + factorial);

        IPredicate1 evenOddAdjust = (int n) -> (n % 2 == 0) ? n : n - 1;
        List<Integer> result = operateOnNumbers(evenOddAdjust, lst1);
        System.out.println("Adjusted list: " + result);

        List<Integer> cubes = cubeNum(lst1);
        System.out.println("Cubes: " + cubes);
    }


}
