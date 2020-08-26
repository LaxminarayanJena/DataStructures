import java.util.Arrays;

/*
Quicksort algorithm is one of the most used sorting algorithm, especially to sort large lists/arrays.
 Quicksort is a divide and conquer algorithm, which means original array is divided into two arrays, 
 each of them is sorted individually and then sorted output is merged to produce the sorted array. 
 On the average, it has O(n log n) complexity, making quicksort suitable for sorting big data volumes.

In more standard words, quicksort algorithm repeatedly divides an un-sorted section into a lower order sub-section 
and a higher order sub-section by comparing to a pivot element. At the end of recursion, we get sorted array.
 Please note that the quicksort can be implemented to sort “in-place”. This means that the sorting takes place in 
 the array and that no additional array need to be created.

Quicksort algorithm
The basic idea of Quicksort algorithm can be described as these steps:

If the array contains only one element or zero elements then the array is sorted. If the array contains more
 then one element then:

1)Select an element as a pivot element, generally from middle but not necessary.
2)Data elements are grouped into two parts: one with elements that are in lower order than the pivot element, one with element that are in higher order than the pivot element.
3)Sort the both parts separately by repeating step 1 and 2.
 */
public class QuickSortExample 
{
    public static void main(String[] args) 
    {
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );
 
        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
 
    public static void quickSort(Integer[] arr, int low, int high) 
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }
         
        if (low >= high){
            return;
        }
 
        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) 
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot) 
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) 
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping 
            //After swapping move the iterator on both lists
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}