package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

    //Program to find whether the strings are repeating for more than two times
    public class CountOfCharacters {

        public Map<String, Boolean> checkStringRepeat(String[] input) {

            Map<String, Boolean> resultMap = new HashMap<>();
            // if the input is null should return null
            if (input == null) {
                return null;
            }
            // set boolean value is the string repeat more than once
            else {

                for (int i = 0; i < input.length; i++) {

                    String word = input[i];
                    if (resultMap.containsKey(word))
                        resultMap.put(word, true);
                    else
                        resultMap.put(word, false);
                }
                return resultMap;
            }
        }
    }
