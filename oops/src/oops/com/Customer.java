package oops.com;

public class Customer {
	private String name;
	private Address homeaddress;
	private Address workaddress;
	
	public Customer(String name , Address homeaddress) {
		this.name = name;
		this.homeaddress = homeaddress;
		
		
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}
	public String toString() {
		return String.format("name - %s , homeaddress - [%s] , workaddress - [%s]", name,homeaddress,workaddress);
	}
	public static void main(String[] args) {
		Address homeaddress = new Address("bang","56","jolly");
		Customer customer1 = new Customer("joe",homeaddress);
		Address workaddress = new Address("han","67","hiodd");
		customer1.setWorkaddress(workaddress);
		System.out.println(customer1);
		
		
	}

}
