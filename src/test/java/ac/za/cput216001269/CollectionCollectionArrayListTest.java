package ac.za.cput216001269;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CollectionCollectionArrayListTest {
    CollectionArrayList arr;
    List<String> input;

    @Before
    public void setUp() throws Exception
    {
        arr = new CollectionArrayList();
        input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee", "chdgejhj", "joel", "Love", "Abcd");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void arrayListCollection()
    {
        for (List<String> list : arr.ArrayListCollection(input))
        {
            System.out.println(list);
            System.out.println();
        }
    }
}