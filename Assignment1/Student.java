package Assignment1;

public class Student {
    private String name;
    private int rollno;
    private int [] total_marks;
    private static int student_count = 0;

    public Student(){
        rollno=1;
        name = null;
        total_marks = new int[3];
        total_marks[0]=80;
        total_marks[1]=70;
        total_marks[2]=90;
    }

    public Student(String name, int[] total_marks){
        student_count++;
        rollno = student_count;

        this.name = name;
        this.total_marks = total_marks;
    }

    public int [] getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int [] total_marks) {
        this.total_marks = total_marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", total_marks=" + total_marks +
                '}';
    }

    public static void count_student(){
        System.out.println(student_count);
    }

    public double calAverage(){
        double sum = 0.0,count=0.0;

        for(int mark :total_marks){
            sum= sum+ mark;
            count++;
        }
        return sum*100/300;
    }
}
