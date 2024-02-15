package IQ.collectionss.hashMap.scenario4;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if (obj==null)return  false;
        if(getClass()!=obj.getClass()) return false;
        Employee emp= (Employee) obj;
        boolean isEqual=this.name.equals(emp.name) && this.age==emp.age;
        return isEqual;
    }
}
