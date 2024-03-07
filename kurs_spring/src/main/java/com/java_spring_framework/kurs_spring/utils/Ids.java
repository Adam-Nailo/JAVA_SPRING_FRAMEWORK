package com.java_spring_framework.kurs_spring.utils;

import java.util.Comparator;
import java.util.Set;

public class Ids {
    static public int getNewId(Set<Integer> keysSoFar) {
        if (keysSoFar.isEmpty()) {
            return 0;
        } else {
            Integer integer = keysSoFar.stream().max(Comparator.naturalOrder()).get();
            return integer+1;
        }
    }
}
