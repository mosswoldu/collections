package IQ.collectionss.hashMap.scenario4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test4 {
    public static void main(String[] args) {
        Map<Employee,Integer> emp= new ConcurrentHashMap<>();
        Employee emp1= new Employee("Mike",23);
        Employee emp2= new Employee("Mike",23);
        Employee emp3=new Employee("John",45);
        Employee emp4=emp3;
        System.out.println("emp1 hashcode: " + emp1.hashCode());
        System.out.println("emp2 hashcode: " + emp2.hashCode());
        System.out.println("emp3 hashcode: " + emp3.hashCode());
        System.out.println("emp4 hashcode: " + emp4.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(emp3.equals(emp4));
        //Collections.synchronizedMap(emp);

        emp.put(emp1,100);
        emp.put(emp2,200);
        emp.put(emp3,300);
        emp.put(emp4,400);
        System.out.println(emp.get(emp1));
        System.out.println(emp.get(emp2));
        System.out.println(emp.get(emp3));
        System.out.println(emp.get(emp4));
        System.out.println(emp.size());
    }
}
