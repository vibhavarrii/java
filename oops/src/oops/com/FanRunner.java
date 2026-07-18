package oops.com;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("jhon and jhon", 45.6,"white");
		//System.out.println(fan);
		fan.switchOn();
		//System.out.println(fan);
		fan.setSpeed((byte)1);
		System.out.println(fan);
		

	}

}
