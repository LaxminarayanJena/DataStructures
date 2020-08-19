package inmobi;

import java.util.Arrays;

public class MergeAndSort{

	public static void main(String[] args) {
		
		int[] ar1 ={2,5,9,11} ;
		int[] ar2 ={3,7, 9,16};
		int lenar1 =ar1.length;
		int lenar2=ar2.length;
		
		int[] lenres= new int[lenar1+ lenar2];
			System.arraycopy(ar1, 0, lenres, 0, lenar1);
			System.arraycopy(ar2, 0, lenres, lenar1, lenar2);
			System.out.println(Arrays.toString(lenres));
			
			System.out.println(lenres.length);
			System.out.println(lenres[3]);
			for(int i=0;i<lenres.length;i++)
			{
				for(int j=i+1;j<lenres.length;j++)
				{
					if(lenres[i]>lenres[j])
					{
						int temp=lenres[i];
						lenres[i]=lenres[j];
						lenres[j]=temp;
					}
				}
			}
			for(int i=0 ;i<lenres.length-1;i++)
			{
				System.out.print(lenres[i] + ",");
			}
			System.out.println(lenres[lenres.length-1]);
			

	}

}
