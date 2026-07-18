package exceptionHandling;

public class ExceptionHnadlingRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length();//null pointer exception // whatever we get in terminal is called stack trace 
		System.out.println("length1 executed");

	}

	private static void length() {
		length2();
		System.out.println("length2 executed");
	}

	private static void length2() {
		try {
			//String str = null;
			//str.length();
			int[] arr = {1,2};
			int number = arr[3];
			System.out.println("executed");//none of the print statements will be executed // null pointer exception is a subclass of Exception
			}catch (NullPointerException ex ){
				ex.printStackTrace();
				System.out.println("NullPointerException");//exception is a class and it is in java.lang
				}catch(ArrayIndexOutOfBoundsException ex) {
					System.out.println("ArrayIndexOutOfBoundsException");
				}
		}

}
