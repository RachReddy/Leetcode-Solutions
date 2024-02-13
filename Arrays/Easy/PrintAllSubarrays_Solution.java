
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