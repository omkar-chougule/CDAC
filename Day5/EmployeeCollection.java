package Day5;

import Day2.SalariedEmployee;

import java.util.*;

public class EmployeeCollection  {
    public static List<Employee> initializeData()
    {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(445, "aaa", 80000, Set.of("java", "C++")));
        employees.add(new Employee(123, "sss", 500000, Set.of("Python", "C++")));
        employees.add(new Employee(145, "bbb", 700000, Set.of("R", "Java")));
        employees.add(new Employee(116, "ttt", 800000, Set.of("Spring", "C++")));
        employees.add(new Employee(144, "eee", 400000, Set.of("CNN","Spring boot", "C++", "Html","ML", "AI", "SQl")));
        return employees;
    }

    public static void printList(List<Employee> emplist){
        for(Employee e: emplist){
            System.out.println(e);
        }
    }

    public static void addEmployee(List<Employee> emplist, Employee emp){
        boolean exists = false;
        for (Employee e : emplist){
            if(e.getEmpid() == emp.getEmpid()){
                exists = true;
                break;
             }
        }
        if(!exists)
            emplist.add(emp);
    }

    public static void removeEmployee(List <Employee> emplist, Employee e){
        Iterator<Employee> it= emplist.iterator();
        while(it.hasNext()){
            Employee emp =it.next();
            if(emp.getEmpid() == e.getEmpid()){
                it.remove();
                break;
            }
        }

    }

    public static List<Employee> filterBySkills(List<Employee> emplist,String skill){
        List<Employee> filtered = new ArrayList<Employee>();
        for (Employee e : emplist){
            if(e.getSkills().contains(skill)){
                filtered.add(e);
            }
        }
        return filtered;
    }

    public static Map<Integer, Double> getSalaryMap(List<Employee> emplist){
        Map<Integer, Double> salmap = new TreeMap<Integer, Double>();
        for(Employee e : emplist){
            salmap.put(e.getEmpid(),e.getSalary());
        }
        return salmap;
    }

    public static void main(String args[]){
        List<Employee> emlist=initializeData();
        printList(emlist);
        System.out.println("-----------After Adding emploee--------");
        removeEmployee(emlist,new Employee(445,"aaa",80000,Set.of("java", "C++")));
        printList(emlist);
        System.out.println("-----------Filter by Skill--------------");
        List<Employee> byskill = filterBySkills(emlist,"java");
        printList(emlist);
        System.out.println("-----------Map by Salary----------------");
        Map<Integer, Double> salmap = getSalaryMap(emlist);
        System.out.println(salmap);
        System.out.println("-----------Sort by name------------------");
        Collections.sort(emlist,new NameComparator());
        printList(emlist);
        int index = Collections.binarySearch(emlist, new Employee(0, "sss", 0,null), new NameComparator());
        System.out.println("Found at : " + index);
        System.out.println("-----------Sort by id--------------------");


        System.out.println("---------------Sort by Salary ---------------------");
        Collections.sort(emlist, new SalaryComparator());
        printList(emlist);
        index = Collections.binarySearch(emlist, new Employee(0, null, 90000, null), new SalaryComparator());
        System.out.println("Found at : "+ index);


        Employee minsal = Collections.min(emlist, new SalaryComparator());
        System.out.println(minsal);
        Employee maxsal = Collections.max(emlist, new SalaryComparator());
        System.out.println(maxsal);

    }
}