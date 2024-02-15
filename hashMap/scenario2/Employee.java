package IQ.collectionss.hashMap.scenario2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if (obj==null)return  false;
        if(getClass()!=obj.getClass()) return false;

        Employee emp= (Employee) obj;
        boolean isEqual=this.name.equals(emp.name) && this.age==emp.age;
        return isEqual;
//        if(age!=emp.age)return false;
//        if(name==null){
//            if (emp.name!=null)
//                return false;
//        }else if (!name.equals(emp.name))
//            return false;
//        return true;

    }

}

class Test2 {
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
        System.out.println(emp1.equals(emp2));
        System.out.println(emp3.equals(emp4));
        Collections.synchronizedMap(emp);

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