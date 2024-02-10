package org.example.Test50_Expressions;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {

    int k = 100;
    public static void main(String[] args){
        Lambda2 l2 = new Lambda2();
        List<Integer> intSeq = Arrays.asList(1,2,3);
        int z = 10;
        intSeq.forEach((Integer x) -> {
            x += 2+z+l2.k;
                    System.out.println(x);
                    int y = x+2;
                    System.out.println(y);
                }
                );
    }
}
