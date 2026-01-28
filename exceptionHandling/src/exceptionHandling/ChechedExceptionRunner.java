package exceptionHandling;

public class ChechedExceptionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void someOTherMethod2() throws RuntimeException{
		
		
	}

	private static void someOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
	}

}
