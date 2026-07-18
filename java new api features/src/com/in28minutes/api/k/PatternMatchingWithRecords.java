package com.in28minutes.api.k;

public class PatternMatchingWithRecords {
	record Transaction(String sender,String receiver,int amount) {}
	private static void printTransaction(Object objTransaction) {
		if(objTransaction instanceof Transaction transaction) {
			String sender = transaction.sender();
			String receiver = transaction.receiver();
			int amount = transaction.amount();
			System.out.println(sender + "-"+ receiver + "-"+amount);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTransaction(new Transaction("you","me",500));

	}

}
