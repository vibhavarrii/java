package idk;
class Task1 extends Thread{
	public void run() {
		System.out.println("task 1 started");
		for(int i = 101 ; i<= 199;i++)
			System.out.print(i +" ");//task 1
		System.out.println("\n task 1 completed");
		
	}
}

class Task2 implements Runnable{
	public void run() {
		System.out.println("task 2 started");
		for(int i = 201 ; i<= 299;i++)
			System.out.print(i +" ");//task 2
		System.out.println("\n task 2 completed");
		
	}
}

public class ThreadsBasicsRunner {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 task1 = new Task1();
		task1.start();
		task1.setPriority(10);
		task1.yield();
		
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		// wait for task 1 to complete and then execute task 3
		task1.join();
		thread.join();
		
		for(int i = 301 ; i<= 399;i++)
			System.out.print(i + " ");//task 3
		System.out.println("\n task 3 completed");
		

	}

}
