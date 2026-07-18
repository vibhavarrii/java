package concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		counter.increment();
		System.out.println(counter.getI());

	}

}
