package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;
public class CountOfCharactersTest {
    CountOfCharacters countOfCharacters;
    @Before
    public void setUp() {
        countOfCharacters = new CountOfCharacters();
    }
    @After
    public void tearDown() {
        countOfCharacters = null;
    }
    @Test
    public void givenInputAsArrayOfStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> result;
        result = countOfCharacters.checkStringRepeat(new String[] {"a","b","c","d","a","c","c"});
        Map<String,Boolean> expected = new TreeMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        assertEquals(expected,result);
    }
    @Test
    public void givenInputAsArrayOfNonRepeatingStringsReturnBooleanValueIfRepeatingMoreThanTwoTimes()
    {
        Map<String,Boolean> result;
        result = countOfCharacters.checkStringRepeat(new String[] {"a","b","c","d"});
        Map<String,Boolean> expected = new TreeMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);
        expected.put("d",false);
        assertEquals(expected,result);
    }
    @Test
    public void givenInputAsEmptyReturnEmptyMap()
    {
        Map<String,Boolean> result;
        result = countOfCharacters.checkStringRepeat(new String[] {});
        Map<String,Boolean> expected = new TreeMap<>();
        assertEquals(expected,result);
    }
    @Test
    public void givenInputAsNullReturnNull()
    {
        Map<String,Boolean> result;
        result = countOfCharacters.checkStringRepeat(null);
        assertNull(result);
    }
}