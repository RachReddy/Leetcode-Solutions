package Stacks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practise {

	
	//B.f
	//T.C=   O(n log n + m log m)
	//S.C=   O(n)
	
	/*
	public static List<Integer> getUnion(int[] arr1, int[] arr2)
	{
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<arr1.length;i++)  //t.c= O(n)
		{
			set.add(arr1[i]);			//set's add() t.c= O(logn)
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		
		//System.out.println(set);
		
		//OUTPUT
		// Use TREESET - [1, 2, 3, 5, 6, 7, 8, 20]
		// Use HASHSET - [1, 2, 3, 20, 5, 6, 7, 8]
		// Use LinkedHashSet - [7, 1, 5, 2, 3, 6, 8, 20]
		
	   List<Integer> arrayList =new ArrayList<Integer>(set);
	   return arrayList;
	
	}
	*/
	
	
	//OPTIMIZED t.c= O(n1 +n2) O(n1 + n2)  //n1 & n2 are length of arr1 and arr2
	public static List<Integer> getUnion(int[] arr1, int[] arr2)
	{
		List<Integer> al =new ArrayList<Integer>();
		
		
		int i=0,j=0;
		int n1=arr1.length;
		int n2=arr2.length;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				al.add(arr1[i]);
				i++;
			}
			
			else if(arr1[i]>arr2[j])
			{
				al.add(arr2[j]);
				j++;
			}
			else if( arr1[i]==arr2[j])
			{
				al.add(arr1[i]); //add either arr1[i] or arr2[j]
				i++;j++;
			}
			
		}
		
		while(i<n1)
		{
			al.add(arr1[i]);
			i++;
		}
		
		while(j<n2)
		{
			al.add(arr2[j]);
			j++;
		}
		
		
		return al;
	}

	
	public static void main(String[] args) {
		
		int[] arr1 = {7, 1, 5, 2, 3, 6} ;
		int[] arr2 = {3, 8, 6, 20, 7};
		
		//int[] arr1= {1, 2, 4, 5, 6};
		//int[] arr2= {2, 3, 5, 7};
		//OUTPUT: 1 ,2 ,3 ,4 ,5 ,6 ,7
		
		List<Integer> res= getUnion(arr1,arr2);
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i)+" ,");  //[3 ,7 ,1 ,5 ,2 ,3 ,6 ,8 ,6 ,20 ,7 ]
		}
	}

}

//NOTE: since input array are not sorted the 2 pointer approach will simply include all elements and not union of both without duplicates.