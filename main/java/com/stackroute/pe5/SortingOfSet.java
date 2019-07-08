package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//Program to sort the list of values

public class SortingOfSet {

    public ArrayList<String> sortTheSet(Set<String> input) {

        //Passing the input ArrayList to TreeSet to sort the values

        TreeSet<String> treeSet = new TreeSet<>(input);

        ArrayList<String> sortedList = new ArrayList<>(treeSet);

        return sortedList;

    }
}

