package org.example.Test09_Arrays;

public class S6 {
	public static void main( String args[] )  {
		int[][] a ={{4,5,6},{3,2,1}};
		int[][] b ={{1,2,3},{5,6,7}};
		int[][] c ={{0,0,0},{0,0,0}};
		
	topla(a,b);


	
}
	
	public static int topla(int[][] x,int[][] y){
		int k[][] = new k[][];
		k[i][j] = x[i][j]+y[i][j];
		
		for ( int i = 0; i < k.length; i++ ) {                 
			for ( int j = 0; j < k[ i ].length; j++ )
			                 System.out.print( k[ i ][ j ] + "  " );        
			                                                                           
			             System.out.println();                                    
			          }                                                                
			  } 
}


		return k;
	}
}
