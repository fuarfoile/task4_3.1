/*
 * Main.java 04/08/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List randomList = Random.getRandomList(5, 0, 10);
        Set randomSet = Random.getRandomSet(3, 10, 20);

        System.out.println(randomList);
        System.out.println(randomSet);
    }
}

class Random {
    static List getRandomList(int size, float minValue, float maxValue) {
        List list = new ArrayList();

        for (int i = 0; i < size; i++){
            list.add(Math.random() * (maxValue - minValue) + minValue);
        }
        return list;
    }

    static Set getRandomSet(int size, float minValue, float maxValue) {
        Set set = new HashSet();

        for (int i = 0; i < size; i++){
            set.add(Math.random() * (maxValue - minValue) + minValue);
        }

        return set;
    }
}