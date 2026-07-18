package abstractClass.interfaces;

	
	abstract class Animal{
		abstract void bark();
	}
	
	class Dog extends Animal{

		@Override
		void bark() {
			// TODO Auto-generated method stub
			System.out.println("bow bow");
			
		}
		
	}
	class Cat extends Animal{

		@Override
		void bark() {
			// TODO Auto-generated method stub
			System.out.println("meow meow");
			
		}
		
	}
	public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = {new Dog(),new Cat()};
		for (Animal ani: animal) {
			ani.bark();
		}
		
		

	}

}
