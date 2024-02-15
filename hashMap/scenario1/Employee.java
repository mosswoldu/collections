package IQ.collectionss.hashMap.scenario1;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //no method overriding
//Object class equals() and hashCode() will be called
  //  equals() method of Object class compares the reference.
// contract between these 2 methods. It says when 2 objects are equal according to equals()
//method, then their hashCode must be same, reverse may not be true

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

 class Test1 {
    public static void main(String[] args) {
        Map<Employee,Integer> emp= new HashMap<>();
        Employee emp1= new Employee("Mike",23);
        Employee emp2= new Employee("Mike",23);
        Employee emp3=new Employee("John",45);
        Employee emp4=emp3;
        System.out.println("emp1 hashcode: " + emp1.hashCode());
        System.out.println("emp2 hashcode: " + emp2.hashCode());
        System.out.println("emp3 hashcode: " + emp3.hashCode());
        System.out.println("emp4 hashcode: " + emp4.hashCode());
        System.out.println("emp1 equals emp2" +  emp1.equals(emp2));
        System.out.println("emp3 equals emp4" + emp3.equals(emp4));

        emp.put(emp1,100);
        emp.put(emp2,200);
        emp.put(emp3,300);
        emp.put(emp4,400);
        System.out.println("==============");
        for (Employee employee : emp.keySet()) {
            System.out.println(employee);
        }
        System.out.println(emp.get(emp1));
        System.out.println(emp.get(emp2));
        System.out.println(emp.get(emp3));
        System.out.println(emp.get(emp4));
        System.out.println(emp.size());
        System.out.println("================");
        System.out.println(emp.isEmpty());
        System.out.println(emp.remove(emp4));
        System.out.println("==============");

        for (Employee employee : emp.keySet()) {
            System.out.println(employee);
        }

    }
}
