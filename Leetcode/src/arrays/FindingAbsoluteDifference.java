package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class FindingAbsoluteDifference {
	public static List<List<Integer>> minimumAbsoluteDifference(int[] arr){
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		for(int i = 1 ; i<arr.length;i++) {
			minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
		}
		List<List<Integer>>result = new ArrayList<>();
		for(int i =1;i<arr.length;i++) {
			if(arr[i]-arr[i-1]==minDiff) {
				result.add(Arrays.asList(arr[i-1],arr[i]));
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		System.out.println(FindingAbsoluteDifference.minimumAbsoluteDifference(arr));

	}

}
