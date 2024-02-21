package Stacks;

public class Nearest_smallest_on_right {

	public static void main(String[] args) {

	/*	
		int[] nums= {4,3,1,2,7,8};
		//			 3,1,0,0,0,0
		int n=nums.length;
		int[] res=new int[n];
		
		//B.F  O(n2)
		res[n-1]=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(nums[j]<nums[i])
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
       */

	    //OPTIMIZED	
		int[] nums= {4,3,1,2,7,8};
		//	     3,1,0,0,0,0
		int n=nums.length;
		int[] res=new int[n];		
		Stack stack=new Stack();
		
		//res[n-1]=0; this line not required
		for(int i=n-1;i>=0;i--)
		{
			int cur_elem= nums[i];
			
			//STEP1
			while( !stack.isEmpty() && (int)stack.peek()>=cur_elem)
			{
				stack.pop();
			}
			
			//STEP2
			if(stack.isEmpty()) 
				res[i]=0;
			else
				res[i]= (int)stack.peek();
			
			//STEP3
			stack.push(cur_elem);
			
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+", ");
		}	
	}
}
