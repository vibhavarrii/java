package com.in28minutes.api.f;

public class SwitchRecordsRunner {
	interface CustomerMessage{}
	record Message(String text)implements CustomerMessage{}
	record Feedback(int rating , String description) implements CustomerMessage{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerMessage CustomerMessage = new Message("hello");
		CustomerMessage CustomerMessage = new Feedback(5,"good");
		
		String response =switch(CustomerMessage) {
		case Message message ->message.text();
		case Feedback feedback -> feedback.description();
		default->"default value";//default because we might add more implementations later
		};
		System.out.println(response);

	}

}
