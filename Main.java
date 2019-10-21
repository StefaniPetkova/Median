package com.company;

import java.util.*;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;


public class Main {

    static ArrayList<Integer> arr=new ArrayList<>();
    static ArrayList<Integer> median =new ArrayList<>();

    public static void main(String []args){

        addIn(100,arr);
        addIn(20,arr);
        addIn(50,arr);
        addIn(70,arr);
        addIn(45,arr);
        findAndAddMedian(arr);
        System.out.println(arr);
        System.out.println(median);

    }

    public static void findAndAddMedian(List<Integer> arr)
    {
        Collections.sort(arr);

        int middle=arr.size()/2;

        if (arr.size() % 2 == 1)
            median.add(arr.get(middle));
        else
            median.add((arr.get(middle-1) + arr.get(middle)) / 2);

    }

    public static void addIn(double score, List<Integer> arr)
    {
        double a=Math.round(score);
        int value = (int)a;
        arr.add(value);

    }

}
