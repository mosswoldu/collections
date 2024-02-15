package IQ.collectionss.treset;

import java.util.*;
class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

    @Override
    public int compareTo(Employee other) {
        // Compare based on names
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        // If names are equal, compare based on age
        return Integer.compare(this.age, other.age);
       }
  }

class Main {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<>();

        treeSet.add(new Employee("Mike", 23));
        treeSet.add(new Employee("Alice", 53));
        treeSet.add(new Employee("Yood", 43));
        treeSet.add(new Employee("Ryan", 18));
        treeSet.add(new Employee("Alice", 53));
        treeSet.add(new Employee("Alice", 73));

        for (Employee employee : treeSet) {
            System.out.println(employee);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MainDemo{
        public static void main(String[] args) {
        Comparator<Student> studentComparator = Comparator
                .comparing(Student::getName)
                .thenComparingInt(Student::getAge);
        TreeSet<Student> treeSet = new TreeSet<>(studentComparator);

        treeSet.add(new Student("Mike", 23));
        treeSet.add(new Student("Alice", 53));
        treeSet.add(new Student("Yonas", 43));
        treeSet.add(new Student("Ryan", 18));
            treeSet.add(new Student("Alice", 73));

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }

}
