package Stacks;

public class Nearest_greatest_on_right {

	public static void main(String[] args) {
		
		int[] nums= {4,3,1,2,7,8};
		//			 7,7,2,7,8,0
		int n=nums.length;
		int[] res=new int[n];
		
		//B.F  O(n2)
		res[n-1]=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(nums[j]>nums[i])
				{
					res[i]=nums[j];
					break;
				}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+", ");
		}


	}

}
