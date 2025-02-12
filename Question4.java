//Q4)Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
import java.util.*;
public class Question4 {
    public static void main(String[] args){
        int[] arr={6,5,4,5,4,3,1,4,5,6,5,6,7,4,5,6};
        LinkedHashMap<Integer,Integer>mp=new LinkedHashMap<>();
        for(int num: arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Elements sorted by decreasing frequency:");
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
