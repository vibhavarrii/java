package abstractClass;

public class Recepie extends AbstractRecepie {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("ready");
		System.out.println("getting ready");
		
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("doing");
		
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("cleaning");
		
	}
	public static void main(String[] args) {
		Recepie rec = new Recepie();
		rec.execute();
	}

}
