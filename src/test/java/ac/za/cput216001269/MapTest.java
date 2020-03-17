package ac.za.cput216001269;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapTest {
    Map map;
    List<String> input;

    @Before
    public void setUp() throws Exception
    {
        map = new Map();
        input = Arrays.asList("abc", "bdc", "abc", "bcd", "bcd", "bcd");

    }

    @Test
    public void compWordFrequency()
    {
        map.compWordFrequency(input); //Must be solved
    }
}