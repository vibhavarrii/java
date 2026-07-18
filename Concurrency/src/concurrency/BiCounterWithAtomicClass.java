package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicClass {
	 private AtomicInteger i = new AtomicInteger();
	 private AtomicInteger j =new AtomicInteger();
	 
	 synchronized public void incrementI() {
		 i.incrementAndGet();
		 
	 }
	 public int getI() {
		return i.get();
	 }
	 synchronized public void incrementJ() {
		 j.incrementAndGet();
		
		 
	 }
	 public int getJ() {
		 return j.get();
	 }
	 
	
	 

}
