package oops.com;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> review = new ArrayList<>();
	private int rating;
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


	public void addReview(Review review) {
		this.review.add(review);
	}
	public String toString() {
		return String.format("id - %d , name - %s ,author - %s , review - [%s]", id,name,author , review);
	}
	public static void main(String[] args) {
		Book book = new Book(1,"harry potter","jk rowling");
		book.setRating(10);
		book.addReview(new	Review ("beautiful book"));
		book.addReview(new Review("awesome"));
		System.out.println(book);
		
	
	}

}
