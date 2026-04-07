import static java.lang.Integer.parseInt;

class Main{//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

  public static void main(String [] arg){
    System.out.println("This is my second main Method");
    int empno = parseInt(arg[0]) ;
    System.out.println(empno);
    System.out.println(arg[1]);
  }

}

