package org.example.codes.g24_lists;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {


        ArrayList<Double> list = new ArrayList<Double>();
        list.add(5.5);
        list.add(3.0);

        Double doubleObject = list.get(0);   //Icerigi nesneye kaydetme
        double d = list.get(1);
    }
}