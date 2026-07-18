package com.oops;

public class Rgb {
	private int red;
    private int green;
    private int blue;
    
    public Rgb(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getRed() {
        // write your code here
        return this.red;
    }
    public int getGreen() {
        // write your code here
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }
    public void invert() {
        // write your code here
        this.red = 255 - this.red;
        this.green = 255 - this.green;
        this.blue =  255 - this.blue;
        
    }
}
