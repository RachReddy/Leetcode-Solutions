
public class PrintAllSubarrays_Solution {

	public static void main(String[] argi) {
		
		int[] arr= {1,2,3,4};
		
		//s-starting point and e-ending point of subarray
		for(int s=0;s<arr.length;s++)
		{
			for(int e=s;e<arr.length;e++)
			{
				for(int k=s;k<=e;k++)  //print elem between s and e                        
				{
					System.out.print(arr[k]+" ,");
				}
				System.out.println();
			}
		}

	}

}


//OUTPUT
/*

1 ,
1 ,2 ,
1 ,2 ,3 ,
1 ,2 ,3 ,4 ,
2 ,
2 ,3 ,
2 ,3 ,4 ,
3 ,
3 ,4 ,
4 ,

*/


//Iterating the above example
/*
Iteration 1:
s = 0 (starting index of the outer loop)
e = 0 (initially equal to s)
The innermost loop will iterate from k = 0 to k = 0
It prints the subarray {1}

Iteration 2:
s = 0
e = 1
The innermost loop will iterate from k = 0 to k = 1
It prints the subarray {1, 2}

Iteration 3:
s = 0
e = 2
The innermost loop will iterate from k = 0 to k = 2
It prints the subarray {1, 2, 3}

Iteration 4:
s = 0
e = 3
The innermost loop will iterate from k = 0 to k = 3
It prints the subarray {1, 2, 3, 4}

Iteration 5:
s = 1
e = 1
The innermost loop will iterate from k = 1 to k = 1
It prints the subarray {2}

Iteration 6:
s = 1
e = 2
The innermost loop will iterate from k = 1 to k = 2
It prints the subarray {2, 3}

Iteration 7:
s = 1
e = 3
The innermost loop will iterate from k = 1 to k = 3
It prints the subarray {2, 3, 4}

Iteration 8:
s = 2
e = 2
The innermost loop will iterate from k = 2 to k = 2
It prints the subarray {3}

Iteration 9:
s = 2
e = 3
The innermost loop will iterate from k = 2 to k = 3
It prints the subarray {3, 4}

Iteration 10:
s = 3
e = 3
The innermost loop will iterate with k = 3
It prints the subarray {4}
*/
