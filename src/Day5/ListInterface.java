package Day5;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    static void main() {
        List lst = new ArrayList();
        lst.add(10);
        lst.add(20);
        lst.add("test");
        lst.add(12.5f);
        lst.add(123);
        lst.add(124);
        System.out.println(lst);
        lst.remove(4);
        lst.remove(true);
        System.out.println(lst);
        System.out.println(lst.get(2));

        for(int i=0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }

        System.out.println("----------------------");
        for(Object o : lst){
            System.out.println(o);
        }


    }
}
