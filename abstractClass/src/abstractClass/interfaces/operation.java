package abstractClass.interfaces;

public interface operation {
	int perform(int x, int y);

}

class Add implements operation{

	@Override
	public int perform(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}

class Subtract implements operation{

	@Override
	public int perform(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
}

class Multiply implements operation{

	@Override
	public int perform(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}
	
}

class Divide implements operation{

	@Override
	public int perform(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0)
		return 0;
		else
			return x/y;
	}
	
}

class Operations{
	public static void main(String[] args) {
		operation add = new Add();
		operation subtract = new Subtract();
		operation multiply = new Multiply();
		operation divide = new Divide();
		int a = 10;
		int b = 5;
		 System.out.println("Add: " + add.perform(a, b));
	        System.out.println("Subtract: " + subtract.perform(a, b));
	        System.out.println("Multiply: " + multiply.perform(a, b));
	        System.out.println("Divide: " + divide.perform(a, b));
			
	}
}
