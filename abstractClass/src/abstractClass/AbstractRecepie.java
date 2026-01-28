package abstractClass;

public abstract class AbstractRecepie {
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();

}
