package idk;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorservice = Executors.newFixedThreadPool(5);
		List<CallableTask>list =List.of(new CallableTask("hello"),new CallableTask("hii"),new CallableTask("bye"));
		String result = executorservice.invokeAny(list);
		System.out.println(result);
		
		executorservice.shutdown();

	}

}
