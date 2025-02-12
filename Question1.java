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
