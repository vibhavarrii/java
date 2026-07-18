package com.oops;

public class RgbRunner {
	public static void main(String[] args) {
		Rgb color = new Rgb(150,200,100);
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
		color.invert();
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());

}
}
