package Stacks;

public class Practise {

	public static void main(String[] args) {
		
		int[][] matrix= { {1,2,3},{4,5,6},{7,8,9}};
		
		int r=matrix.length;
		int c=matrix[0].length;
		
		for(int j=0;j<c;j++) //we want to reverse colums
		{
			int s=0;
			int e=matrix.length-1;  //or r-1
			
			while(s<e)
			{
				//here treat each colum like an array, with s and e point, therefore for each iteration j will be the column no
				int temp=matrix[s][j];
				matrix[s][j]=matrix[e][j];
				matrix[e][j]=temp;
				
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
	     
			1 2 3	        7 8 9 
			4 5 6           4 5 6 
			7 8 9		    1 2 3 

	       */   
	    
	}

}
