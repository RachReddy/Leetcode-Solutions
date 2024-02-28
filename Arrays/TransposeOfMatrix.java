package Stacks;

public class TransposeOfMatrix {

	public static void main(String[] args) {

		int[][] matrix= { 
				          {1,2,3},
						  {4,5,6},
						  {7,8,9}
			
		                };
		
		int r=matrix.length;
		int c=matrix[0].length;
		
		//Tranpose means, swap the rows to column and column to rows
		for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
		
		// Print the transposed matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) { // Corrected: Print entire transposed matrix
                System.out.print(matrix[i][j] + " ,"); // Corrected: Print all elements
            }
            System.out.println();
        }
		
		
	  	


	}

}
