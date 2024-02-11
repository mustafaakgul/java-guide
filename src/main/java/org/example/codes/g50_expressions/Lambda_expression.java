package org.example.Test50_Expressions;

public class Lambda_expression {
    interface lambda{
        int calistir(int x);
    }
    interface lambda2{
        int calistir(int x,int y);
    }

    public static void main(String[] args){
        lambda l = ((int x) -> (x * x));
        lambda2 l2 = ((x,y) -> (x * y));
        System.out.println(l.calistir(5));
    }
}
