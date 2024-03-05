package Stacks;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};
		
		
		/*
		int[][]  matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int r=matrix.length;
        int c=matrix[0].length;
        
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                	 //set entire row to 0
                    for(int k=0;k<c;k++)
                        matrix[i][k]=-1;

                    //set entire col to 0   
                    for(int k=0;k<r;k++)
                        matrix[k][j]=-1;
                }
            }
        } 


       for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==-1)
                {
                  matrix[i][j]=0;
                }
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
		
		*/
		
		
		
		
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		
		int s=0;
		int e=n-1;
		
		while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			
			s++;
			e--;
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ,");
			
		}
		
		
		
		
		
		
	}

}
