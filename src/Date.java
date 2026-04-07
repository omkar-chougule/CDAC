
public class Date {
    private int day;
    private String month;
    private int year;

    public Date()
    {
//        day = 1;
//        month = "Jan";
//        year = 1960;
        this(1,"Jan",1960);
    }

    public Date(int dat, String month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int d, String m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day > 1) {
            this.day = day;
        }
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}
