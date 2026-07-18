package arrays;

public class FindSecondLargestNumber {
	public int findSecondLargestElement(int[] array) {
		if(array == null || array.length < 2)
			return -1;
		int max = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num:array) {
			if(num > max) {
				secondLargest = max;
				max= num;
			}else if(num <max && num > max && num != max)
				secondLargest = num;
			else {
				if(secondLargest == Integer.MIN_VALUE)
					return -1;
			}
		}
		return secondLargest;

}
public static void main(String[] args) {
	FindSecondLargestNumber num = new FindSecondLargestNumber();
	System.out.println("second laargest number is : " + num.findSecondLargestElement(new int[] { 1,5,9,3}));
	
}
}