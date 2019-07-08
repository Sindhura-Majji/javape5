package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SortingOfSetTest {

    SortingOfSet sortingOfSet;

    @Before
    public void setUp() {
        sortingOfSet = new SortingOfSet();
    }

    @After
    public void tearDown() {
        sortingOfSet = null;
    }
    @Test
    public void givenInputSetReturnSortedArrayList()
    {

        Set<String> set = new HashSet<>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Alice");
        expectedList.add("Bluto");
        expectedList.add("Eugene");
        expectedList.add("Harry");
        expectedList.add("Olive");
        assertEquals(expectedList,sortingOfSet.sortTheSet(set));
    }
    @Test
    public void givenInputNullReturnNull()
    {
        Set<String> set = new HashSet<>();
        List<String> expectedList = new ArrayList<>();
        assertEquals(expectedList,sortingOfSet.sortTheSet(set));
    }

}