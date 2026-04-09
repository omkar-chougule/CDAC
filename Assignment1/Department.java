package Assignment1;

public class Department {

    static void main() {
        Student [] stud = new Student[4];
        int [] marks1 ={88,99,77};
        int [] marks2 ={68,79,87};
        int [] marks3 ={87,98,79};
        int [] marks4 ={80,80,80};
        stud[0] = new Student("Mangesh",  marks1);
        stud[1] = new Student("Aman",  marks2);
        stud[2] = new Student("Yash",  marks3);
        stud[3] = new Student("Aftaab",  marks4);

        //s.count_student();
       // System.out.println(s);
        for(Student s : stud) {
            System.out.println(s);
        }
        double ans1 = stud[0].calAverage();
        double ans2 = stud[1].calAverage();
        double ans3 = stud[2].calAverage();
        double ans4 = stud[3].calAverage();
        System.out.printf("Average of Student {stud[0].name}  marks is :" + ans1);
        System.out.println("Average of Student 2 marks is :" + ans2);
        System.out.println("Average of Student 3 marks is :" + ans3);
        System.out.println("Average of Student 4 marks is :" + ans4);
        Student.count_student();
    }
}
