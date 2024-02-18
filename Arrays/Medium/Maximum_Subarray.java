
public class Maximum_Subarray {

	/*
	 public static int maxSubArray(int[] nums)
	 {	        
	        int max_value=Integer.MIN_VALUE;
	        for(int s=0;s<nums.length;s++)
	        {
	            for(int e=s;e<nums.length;e++)
	            {
	                int sum=0;
	                for(int k=s;k<=e;k++) //calculate sum of all elements between s and e
	                {
	                    sum=sum+nums[k];
	                }
	                max_value=Math.max(max_value,sum);
	            }
	        }
	        return max_value;
	  }
	*/

	public static int maxSubArray(int[] nums)   //Kadane's Algorithm
	{	
            
            int max_value=Integer.MIN_VALUE;
	    int sum=0;
	    for(int s=0;s<nums.length;s++)
	    {
	        sum=sum+nums[s];   //keep adding elements to sum	        
                max_value=Math.max(max_value,sum); 

	        if(sum<0)             //if sum<0 or -ve, then drop it (means, re-initialize sum to 0)
                {                     //else sum>0, do nothing, keep it     
	          sum=0;
	        }
             }
	    return max_value;
	 }
	

	
	public static void main(String[] args)
	{
		int[] nums={5,4,-1,7,8};
		int ans= maxSubArray(nums);
		System.out.println(ans); 

	}

}
