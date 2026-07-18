package idk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;

	public Task(int  number) {
		this.number = number;
		
	}
	public void run() {
		for(int i = number*100 ; i<= number*100+99;i++)
			System.out.print(i +" ");
		System.out.println("\n task"+ number + "completed");
		
		
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//executorService.execute(new Task1());
		//executorService.execute(new Thread(new Task2()));
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));

	}

}
