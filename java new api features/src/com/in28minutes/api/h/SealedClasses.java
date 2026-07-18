package com.in28minutes.api.h;

public class SealedClasses {
	sealed class Vehicle permits Car,Truck,Bike{}
	final class Car extends Vehicle  {}
	sealed class Truck extends Vehicle permits MiniTruck {}
	final class MiniTruck extends Truck{}
	non-sealed class Bike extends Vehicle{}//easily extends without any restrictions
	
	
	sealed interface Flyable permits Bird,Aeroplane,Helicopter{}
	final class Bird implements Flyable{}
	sealed class Aeroplane implements Flyable permits Boeing{}
	final class Boeing extends Aeroplane{}
	non-sealed class Helicopter implements Flyable{}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
