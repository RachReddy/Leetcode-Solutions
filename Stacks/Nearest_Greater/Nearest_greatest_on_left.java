package Stacks;
import java.util.Stack;

public class Nearest_greatest_on_left {

	public static void main(String[] args) {

	/*	
		int[] nums= {4,3,1,2,7,8};
		//	     0,4,3,3,0,0
		int n=nums.length;
		int[] res=new int[n];
		
		//B.F  O(n2)
		res[0]=0;
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
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
     */

      //OPTIMIZED: t.c O(2N) => O(N)   s.c= O(N)
                int[] nums= {4,3,1,2,7,8};
		//	     0,4,3,3,0,0
		int n=nums.length;
		int[] res=new int[n];		
		Stack stack=new Stack();
		
		//res[0]=0; this line not required
		for(int i=0;i<n;i++)
		{
			int cur_elem= nums[i];
			
			//STEP1                             top <= cur elem
			while( !stack.isEmpty() && (int)stack.peek() <= cur_elem)
			{
				stack.pop();
			}
			
			//STEP2
			if(stack.isEmpty()) 
				res[i]=0;
			else
				res[i]= (int)stack.peek();      //res[i] = top
			
			//STEP3
			stack.push(cur_elem);
			
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+", ");
		}		
		
	}
}
//T.C= O(N) = here we are pushing each elem in stack & poping each elem in stack only once.
//  	    - we have 2 iterations for each elem
//	    - O(2N) => O(N)	
