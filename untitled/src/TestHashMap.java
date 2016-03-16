import java.util.*;
public class TestHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("one", "1");
        map.put("two", "2");
        map.put(null, "3");
        map.put("four", null);

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            }
        }
}