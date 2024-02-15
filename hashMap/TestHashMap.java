package IQ.collectionss.hashMap;

        import java.lang.reflect.Field;
        import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) throws Exception {
        HashMap<Employee,String> map= new HashMap<>();
        for(int i=0;i<=13;i++){
            map.put(new Employee(i),"Hello" + i);
        }
        Field tableField= HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table= (Object[]) tableField.get(map);

        System.out.println("hashMap capacity: " );
        System.out.println(table==null?0:table.length);

        System.out.println("=======");
        System.out.println("Hashmap size: " + map.size());
    }
}

