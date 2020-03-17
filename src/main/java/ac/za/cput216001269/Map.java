package ac.za.cput216001269;

import java.util.List;
import java.util.TreeMap;

public class Map
{
    public void compWordFrequency(List<String> input)
    {
        TreeMap<String, Integer> freqMap = new TreeMap<>();

        for (String str : input)
        {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        for (String word : freqMap.keySet())
        {
            System.out.println(word + "|" + freqMap.get(word));
        }
    }
}
