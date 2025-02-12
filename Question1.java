//Q1)Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
import java.util.*;
public class Question1 {
    public static void main(String[] args)
    {
       List<Float> floatlist= new ArrayList<>();
       floatlist.add(19.5f);
       floatlist.add(89.56f);
       floatlist.add(13.78f);
       floatlist.add(45.12f);
       floatlist.add(78.31f);
    Iterator<Float> it = floatlist.iterator();
    float sum=0;
    while(it.hasNext())
    {
        sum += it.next();
    }
        System.out.println("Sum of number in the list:"+ sum);
    }
}
