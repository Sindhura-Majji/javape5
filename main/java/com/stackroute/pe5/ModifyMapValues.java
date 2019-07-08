package com.stackroute.pe5;

import java.util.Map;

// Swapping of values in the map
public class ModifyMapValues {

    public Map<String,String> MappingStrings(Map<String,String> map) {
        String value;

        //Swapping the values for key1 and key2 i.e. val1 and val2. then make val 1 empty

        value = map.get("val1");

        map.put("val1"," ");
        map.put("val2",value);

        return map;
    }

}
