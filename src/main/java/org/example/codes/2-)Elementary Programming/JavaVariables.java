package org.example.codes.P02_Var;

public class JavaVariables {
    static int memberVar = 123;

    public static void main(String[] args) {
        int localVar = 456;
        System.out.println("memberVar = " + memberVar);
        System.out.println("localVar = " + localVar);
        int twoLine;
        twoLine = 789;
        int oneLine = 101112;
        oneLine = twoLine;
        int fromExpression = 2 + 3;
        final int finalVar = 10;
        int myInnerVar = memberVar + 10;

        System.out.println(myInnerVar);
    }

    public static int getInt(){
        int methodScope = 22;
        return methodScope;
    }
}
