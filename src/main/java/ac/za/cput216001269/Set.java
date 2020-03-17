package ac.za.cput216001269;

import java.util.List;
import java.util.TreeSet;

public class Set
{
    public void setCollection(List<String> input)
    {
        TreeSet<String> freSet = new TreeSet<>();
        for (String i : input)
        {
            freSet.add(i);
        }
        TreeSet<String> sort = new TreeSet<String>(input);
        System.out.println(sort);

    }
    public void sortList(List<String> input)
    {
        TreeSet<String> sort = new TreeSet<String>(input);
        System.out.println(sort);
    }
}
