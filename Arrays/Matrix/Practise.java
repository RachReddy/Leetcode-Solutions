package Stacks;

public class Practise {

	public static void main(String[] args) {
		
		int[][] matrix= { {1,2,3},{4,5,6},{7,8,9}};
		
		int r=matrix.length;
		int c=matrix[0].length;
		
		
		//Transpose matrix: 
		//1.make rows as columns 
		//2.make columns as rows
		for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
       }
		
		
		//print matrix
	       for(int i=0;i<r;i++)
	       {
	           for(int j=0;j<c;j++)
	           {
	               
	                System.out.print( matrix[i][j]+ " ");
	              
	           }
	           System.out.println();
	       }     
		
	       
	       
	       //INPUT	       //OUTPUT
	       /*
	     
			1 2 3	        1 4 7
			4 5 6           2 5 8 
			7 8 9		    3 6 9 

	       */   
	    
	}

}
