package Day4;

import Day2.Date;


public class DemoCloning {
    public static void main(String [] args) throws CloneNotSupportedException{
        Car c1 = new Car("Honda", "CITY", new Date(1, "JAN", 2022),600000);

        Car c2 = c1;   // shallow copy
        // c2 and c1 point to the EXACT SAME Car object in memory.
        // Any change through c1 is visible through c2 (and vice versa).


        Car c3 = new Car(c1.getMake(), c1.getModel(), c1.getMandate(), c1.getPrice());   //deep copy
        // This creates a NEW Car object, so primitive/immutable fields are separate.

        Car c4 = (Car) c1.clone();   //clone
        // Our Car.clone() uses `super.clone()` (shallow) + deep-copies the Date.
        // So c4 is a NEW Car with a NEW Date object inside.

        System.out.println("original");
        System.out.println(c1);

        // Mutating
        c1.setPrice(700000);
        c1.getMandate().setDay(11);
        System.out.println("after change");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // - c1: price and date changed
        // - c2: same object reference as c1 -> price and date changed
        // - c3: different Car object -> price stays old, BUT date changes (shared Date reference)
        // - c4: different Car object AND different Date (deep-copied) -> price stays old, date stays old
    }
}
