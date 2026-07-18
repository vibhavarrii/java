package arrays;

public class GreaterElement {
	public boolean doesHaveElementGreaterThan(int[] array, int number) {
		for(int num : array) {
			if (num  > number )
				return true;
				
		}
		return false;

}
	public static void main(String[] args) {
		GreaterElement oo = new GreaterElement();
		System.out.println(oo.doesHaveElementGreaterThan(new int[] {1,2,5,4}, 4));
		
	}
}
