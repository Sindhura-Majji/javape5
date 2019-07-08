package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapValuesTest {

    ModifyMapValues modifyMapValues;

    @Before
    public void setUp()  {
        modifyMapValues = new ModifyMapValues();
    }

    @After
    public void tearDown() {
        modifyMapValues = null;
    }
    @Test
    public void givenMapShouldReturnReplacedValuesInPair() {

        Map<String,String> expected = new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","java");

        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map result = modifyMapValues.MappingStrings(map);

        assertEquals(expected,result);

    }
    @Test
    public void givenMapContainsStringShouldReturnReplacedValue() {

        Map<String,String> expected = new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","sindhu");

        Map<String, String> map=new HashMap<>();
        map.put("val1","sindhu");
        map.put("val2"," ");

        Map result = modifyMapValues.MappingStrings(map);

        assertEquals(expected,result);

    }

}