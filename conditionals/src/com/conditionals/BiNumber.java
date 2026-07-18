package com.conditionals;

public class BiNumber {
	private int number1;
	private int number2;
	
	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		}

	public int getNumber1() {
	        return number1;
	        }

	public int getNumber2() {
		return number2;
	    }

	public int calculateLCM() {
	       if(number1 ==0 || number2 ==0)
	    	   return -1;
	       else if(number1 < 0 || number2<0) return 0;
	       else {
	    	   int max = Math.max(number1,number2);
	    	   while(true) {
	    		   if(max % number1 == 0 && max % number2 == 0) {
	    			   return max;
	    		   }
	    		   max++;
	    	   }
	    	   
	       }
	        
	    }
	public static void main(String[] args) {
		BiNumber num = new BiNumber(2,5);
		System.out.println(num.calculateLCM());
	}
	}


