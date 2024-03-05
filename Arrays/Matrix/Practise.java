package Stacks;

public class Practise {

	public static void main(String[] args) {
		
		int[][] matrix= { {1,2,3},{4,5,6},{7,8,9}};
		
		int r=matrix.length;
		int c=matrix[0].length;
		
		for(int i=0;i<r;i++) //we want to reverse rows 
		{
			int s=0;
			int e=matrix[0].length-1;  //or c-1
			
			while(s<e)
			{
				//here treat each row like an array, with s and e point, therefore for each iteration i will be the row no
				int temp=matrix[i][s];
				matrix[i][s]=matrix[i][e];
				matrix[i][e]=temp;
				
				s++;
				e--;
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
	     
			1 2 3	        3 2 1 
			4 5 6           6 5 4 
			7 8 9		    9 8 7 

	       */   
	    
	}

}
