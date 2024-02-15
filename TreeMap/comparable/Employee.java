package IQ.collectionss.TreeMap.comparable;

import java.util.Map;
import java.util.TreeMap;

public class Employee  implements Comparable<Employee>{

    private String name;
    private int age;
    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
       return this.name.compareTo(emp.name);
        //return Integer.compare(this.age, emp.age);
    }
}

class Main{
    public static void main(String[] args) {
        Map<Employee,Integer> map= new TreeMap<>();
        map.put(new Employee("Mike",23),4566);
        map.put(new Employee("Alloni",34),444);
        map.put(new Employee("Mike",77),444);

        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k + ": " + v));
    }
}
