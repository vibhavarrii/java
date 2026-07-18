package exceptionHandling;
class Amount{
	private int amount;
	private String currency;
	public Amount(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}
	public void add(Amount other)throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(other.currency)) {
			// throw new Exception("currencies dont match:" + " " + this.currency + " and " + other.currency);
			throw new CurrenciesDoNotMatchException("currencies dont match:" + " " + this.currency + " and " + other.currency);
			}
		this.amount= this.amount + other.amount ;
		}
	public String toString() {
		return amount + " " + currency;
	}
	
}
 class CurrenciesDoNotMatchException extends Exception{
	 CurrenciesDoNotMatchException(String msg){
		 super(msg);
	 }
	 

	
}

public class ThrowingExceptionError {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		// TODO Auto-generated method stub
		Amount amount1  = new Amount(20,"USD");
		Amount amount2  = new Amount(30,"EUR");
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
