
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(1,89);
        mp.put(2,91);
        mp.put(3,73);
        mp.put(4,24);
        mp.put(5,52);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> a.getValue().compareTo(b.getValue()));
       LinkedHashMap<Integer, Integer> sortedmap= new LinkedHashMap<>();
       for(Map.Entry<Integer,Integer> entry: list){
           sortedmap.put(entry.getKey(),entry.getValue());
       }
 System.out.println("sorted Hashmap by value: ");
       sortedmap.forEach((key,value) -> System.out.println(key + "->" + value));
    }
}
