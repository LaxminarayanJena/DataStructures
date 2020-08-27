package inmobi;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] ar1 ={2,5,9,11} ;
		int[] ar2 ={3,7, 9,16};
		int lenar1 =ar1.length;
		int lenar2=ar2.length;
		 int[] len= new int[lenar1 + lenar2];
	int i=0,j=0,k=0;
	 // Traverse both array 
	while(i<lenar1 && j<lenar2)
	{
	   /* Check if current element of first array is smaller than current element of second array. If yes, store first 
             array element and increment first array index. Otherwise do same with second array 
		*/
		if(ar1[i]<ar2[j])
		{
			len[k]=ar1[i];
			i++;
		}
		
		else
		{
			len[k]=ar2[j];
			j++;
		}
		k++;
	}
		// Store remaining elements of first array 
	while(i<ar1.length)
	{
		len[k]=ar1[i];
		i++;
		k++;
	}
	// Store remaining elements of second array 
	while(j<ar2.length)
	{
		len[k]=ar2[j];
		j++;
		k++;
	}
	
	for(i=0; i<=len.length-1;i++)
	{
		System.out.print(len[i] + ",");	
	}

	}

}
