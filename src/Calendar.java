
public class Calendar {
    public  static void main(String[] args){
        int i=10;
        Date d1  =new Date();
        d1.setDate(10, "jul", 2000);
        Date d2= d1;
        d1.displayDate();
        d2.displayDate();
        Date d3 = new Date();
        d3.setDay(-1);
        d3.displayDate();
    }
}
