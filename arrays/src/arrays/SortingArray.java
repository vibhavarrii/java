package arrays;

public class SortingArray {
	public Boolean isSorted(int[] array) {
		if(array == null || array.length<1)
			return true;
		else {
			for(int i = 0 ; i < array.length - 1 ; i++)
			{
				if(array[i+1] < array[i] )
					return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		SortingArray arr = new SortingArray();
		System.out.println(arr.isSorted(new int[] {2,2,2,2}));
	}

}
