package com.primitive;

public class BS3 {
	public static int linearSearch(int arr[],int target) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==target)
			  return i;
		}
		return -1;
	}
public static void reverseArray(int[] arr) {
	int right= arr.length-1;
	int left = 0;
	while(left<right) {
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	right--;
	left++;
	}
}

	public static int test(int[] a , int k) {
		int low = 0,high = a.length-1;
		int cost = 0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]>=k)cost+=mid;
			else
				cost-=mid;
			if(a[mid]==k)return cost;
			if(a[mid]<k)low=mid+1;
			else high = mid-1;
			//System.out.println(cost);
			//System.out.println(mid);
		}
		return cost;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8};
		//System.out.println(test(arr,6));
		//System.out.println(linearSearch(arr,6));
		reverseArray(arr);
		for(int x:arr)
			System.out.println(x);

	}

}
