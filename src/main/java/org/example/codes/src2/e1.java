package org.guide.src;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=5,j=7;
	        int k = max(i,j);
	        System.out.println(k);
	    }
	    public static int max(int a,int b){
	        int result;
	        if(a<b)
	            result=b;
	                    else
	            result=a;
	        return result;
	    }
	
	}


