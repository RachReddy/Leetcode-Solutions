import java.util.HashMap;
import java.util.Map;

public class Solution
{

	public static int[] twoSum(int[] nums, int target)
	{
           //Brute force => T.C= O(n2)  S.C= O(1)
	       /* 
	        int[] res= new int[2];
	        for(int i=0;i<nums.length-1;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if((nums[i]+nums[j])==target)
	                {
	                    res[0]=i;//Common mistake: res[0]=nums[i];
	                    res[1]=j;
	                    break;  //if u miss this break, then if further in array if we have 2 indicies sum equal to target, those latest indicies will be returned instead.
	                }
	            }
	        }
	        return res;
	       */

	       //optimized => T.C= O(n)  S.C= O(n)
	       int[] res= new int[2];
	       Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		       for(int i=0;i<nums.length;i++)
		       {
	                int num = target - nums[i];
		            if(hm.containsKey(num))
	                {
		                res[0] = hm.get(num);
		                res[1] = i;  
		                break;
	                    // OR return new int[] {hm.get(target - nums[i]), i};
		                
		            }
	                else
	                {
		                hm.put(nums[i], i); //add elem as key and their index as value
		            }	           
		       }
	       return res;
	}
	
	public static void main(String[] args)
	{
		
		int[] nums = {3, 2, 4};
		int target = 6;
		
		int[] ans=twoSum(nums,target);
	    System.out.println(ans[0] + ", " + ans[1]);

	}

}
