package idk;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorservice = Executors.newFixedThreadPool(5);
		List<CallableTask>list =List.of(new CallableTask("hello"),new CallableTask("hii"),new CallableTask("bye"));
		List<Future<String>> result = executorservice.invokeAll(list);
		for(Future<String>task:result) {
			System.out.println(task.get());
		}
		executorservice.shutdown();


	}

}
