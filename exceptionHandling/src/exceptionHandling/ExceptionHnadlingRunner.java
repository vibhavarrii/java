package exceptionHandling;

public class ExceptionHnadlingRunner {

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
		String str = null;
		str.length();
		System.out.println("executed");//none of the print statements will be executed
	}

}
