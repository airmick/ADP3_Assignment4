package ac.za.cput216001269;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SetTest {
    Set myset;
    List<String> input;

    @Before
    public void setUp() throws Exception
    {
        myset = new Set();
        input = Arrays.asList("abc", "bdc", "abc", "bcd", "bcd", "bcd");
    }

    @Test
    public void setCollection()
    {
        myset.setCollection(input);
    }
}