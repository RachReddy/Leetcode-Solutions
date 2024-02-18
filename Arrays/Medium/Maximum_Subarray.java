
public class Maximum_Subarray {
	
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

	public static void main(String[] args)
	{
		int[] nums={5,4,-1,7,8};
		int ans= maxSubArray(nums);
		System.out.println(ans); 

	}

}
