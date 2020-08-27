
public class Rotation {

	public static void main(String[] args) {

		int a[] = {8,9,10,2,5,6};

		System.out.println("The array is rotated " + findRotationCount(a) + " times");
	}

	//No of rotations=No of elements before minimum element of the array or index of the minimum element
	// Function to find the number of times the array is rotated
	public static int findRotationCount(int[] a) {
		// search space is a[left..right]
		int left = 0;
		int right = a.length - 1;

		// iterate till search space contains at-least one element
		while (left <= right) {
			// if the search space is already sorted, we have
			// found the minimum element (at index left)
			if (a[left] <= a[right]) {
				return left;
			}

			int mid = (left + right) / 2;

			// find next and previous element of the mid element
			// (in circular manner)
			int next = (mid + 1) % a.length;
			int prev = (mid - 1 + a.length) % a.length;

			// if mid element is less than both its next and previous
			// neighbor, then it is the minimum element of the array

			if (a[mid] <= a[next] && a[mid] <= a[prev]) {
				return mid;
			}

			// if a[mid..right] is sorted and mid is not the min element,
			// then pivot element cannot be present in a[mid..right] and
			// we can discard a[mid..right] and search in the left half

			else if (a[mid] <= a[right]) {
				right = mid - 1;
			}

			// if a[left..mid] is sorted then pivot element cannot be
			// present in it and we can discard a[left..mid] and search
			// in the right half

			else if (a[mid] >= a[left]) {
				left = mid + 1;
			}
		}

		// invalid input
		return -1;
	}
}
