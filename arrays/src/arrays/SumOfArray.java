package arrays;

public class SumOfArray {
	private int[] array1;
    private int[] array2;
    public SumOfArray(int[] array1 , int[] array2) {
    	this.array1 = array1;
    	this.array2 = array2;
    }
    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        return sum1 == sum2 ;

        // TODO: Write the code to compare the sums of the arrays and return the result.
    }
	private int calculateSum(int[] array) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num : array)
			sum += num ;
		return sum;
		
	}
	public static void main(String[] args) {
		SumOfArray arr = new SumOfArray(new int [] {1,2,3,4}, new int[] {4,3,2,1});
		System.out.println("sum of array 1 :" + arr.calculateSum(new int[] {1,2,3,4}));
		System.out.println("sum of array 2:"+ arr.calculateSum(new int[] {4,3,2,1}));
		System.out.println(arr.areSumsEqual());
		
		
	}

}
