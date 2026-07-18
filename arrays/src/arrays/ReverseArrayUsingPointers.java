package arrays;

import java.util.Arrays;

public class ReverseArrayUsingPointers {
	public int[] reverseArray(int[] array) {
		if(array==null||array.length == 0)
			return new int [0];
		if(array.length == 1 )
			return array;
		int[] reversedArray = new int [array.length];
		int start = 0;
		int end = array.length - 1;
		while(start <= end) {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];
			start++;
			end--;
		}
		return reversedArray;
	}
	public static void main(String[] args) {
		ReverseArrayUsingPointers pointer = new ReverseArrayUsingPointers();
		int[] result = pointer.reverseArray(new int[] {2,3,4,5});
		System.out.println(Arrays.toString(result));
		

}
}
