package oops.com;

public class Review {
	private String rev;

	public Review(String rev) {
		super();
		this.rev = rev;
	}
	public String toString() {
		return String.format(rev);
	}

}
