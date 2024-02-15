package IQ.collectionss.TreeMap.comporator;

import java.util.Comparator;
import java.util.TreeMap;

public class Employee {
    private String name;
     int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Main {
    public static void main(String[] args) {

        TreeMap<Employee,Integer> map=new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(Employee e1, Employee e2) {
//               if(e1.age< e2.age){
//                   return -1;
//               }
//               if(e1.age>e2.age){
//                   return 1;
//               }
//                    return 0;
//
                return e1.getName().compareTo(e2.getName());
            }
        });


        map.put(new Employee("Mike",23),100);
        map.put(new Employee("Alice",53),200);
        map.put(new Employee("Yood",43),700);
        map.put(new Employee("Ryan",18),700);
        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k + ": " + v));
    }
}
