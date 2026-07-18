package oops.com;

public class Address {
	private String line1;
	private String pin;
	private String city;
	public Address(String line1, String pin, String city) {
		super();
		this.line1 = line1;
		this.pin = pin;
		this.city = city;
	}
	public String toString() {
		return String.format("city-%s, line1-%s , pin-%s ,",city,line1,pin );
	}
	

}
