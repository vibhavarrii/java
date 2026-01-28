package abstractClass.interfaces;

interface Flyable{
	void fly();
	
}

class Bird implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("with wings");
		
	}
	
}
class Aeroplane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("with fuel");
		
	}
	
}

public class InterfaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flying  = {new Bird(),new Aeroplane()};
		for(Flyable object : flying ) {
			object.fly();
		}
		

	}

}
