class Solution {
    public int maxProfit(int[] prices) {
        
     //B.F t.c= O(n2)  s.c=O(1)   
     /*
        int max_val=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>prices[i])
                max_val= Math.max( max_val, prices[j]-prices[i] );
            }
        }
        return max_val;
      */


    //B.F2 t.c= O(n2)  s.c=O(1)
    /*    
      int n=prices.length;  
      int[] greater_arr=new int[n];
      greater_arr[n-1]=0;
      int max_val=0;
      
      for(int i=0;i<n;i++)
      {
          int max_so_far=0;
          for(int j=i+1;j<n;j++)
          {
              if(prices[j]>prices[i]){                  
               // greater_arr[i]=prices[j];

                max_so_far= Math.max( max_so_far, prices[j] );  
	            greater_arr[i]=max_so_far;

                }
          }
      }
      
      //greater[]={0,6,6,6,0,0}
      for(int i=0;i<n;i++)
      {
          max_val=Math.max(max_val, greater_arr[i]-prices[i] );
      }  
      return max_val;

    */



    //OPTIMIZED: t.c O(n)   s.c 0(1)
    //maintain min from starting of array & compare it w every elem,
    //if greater,then take diff and maintain in to max
    //else, update the min for next comparision
    int max_val=0;
    
    int min_val=prices[0];
    for(int i=1;i<prices.length;i++)
    {
        int cur=prices[i];
        if(cur>min_val)
        {
            //take the diff
            max_val= Math.max( max_val, cur-min_val);
        }
        else
        {
            min_val=cur;
        }

    }
    return max_val;

      




    }
}
