import java.util.Arrays;


public class RotationTimesofArray
{
    public static void main(String[] args) 
    {
     int a[] = {15,22,23,28,31,38,5,6,8,10,12};
     int count=findRotation(a,11);
     System.out.println("the array is rotated " + count + " times"); //6 times
     
     }
    
    public static int findRotation(int a[],int n)
    {
    	int low=0, high=n-1;
    	while(low<=high)
    	{
    		if(a[low] <=a[high])
    			return low;
    		int mid =(low+high)/2;
    		int next=(mid+1)%n, prev=(mid+n-1)%n;
    		if(a[mid]<=a[next] && a[mid] <=a[prev])
    			return mid;
    		else if(a[mid] <=a[high]) high =mid-1;
    		else if(a[mid] >= a[low]) low =mid+1;
    		
    	}
		return -1;
    }
    }
     
    
