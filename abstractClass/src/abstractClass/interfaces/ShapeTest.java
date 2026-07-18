package abstractClass.interfaces;

//Abstract base class
abstract class Shape {
 protected String name;

 // Constructor
 public Shape(String name) {
     this.name = name;
 }

 // Abstract method to calculate area
 public abstract double calculateArea();

 // Method to display shape details
 public void displayInfo() {
     System.out.println("Shape: " + name);
     System.out.println("Area: " + calculateArea());
 }
}

class Circle extends Shape{
	private double radius;

	public Circle(String name , double radius) {
		super(name);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}

class Rectangle extends Shape{
	private double length;
	private double width;

	public Rectangle(String name , double length , double width) {
		super(name);
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
