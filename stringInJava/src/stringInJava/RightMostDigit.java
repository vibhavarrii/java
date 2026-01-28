package stringInJava;

public class RightMostDigit {
	public int getRightmostDigit(String str) {
		if(str.length()==0)
			return -1;
		else {
			for(int i =str.length()-1 ;i >= 0;i--) {
				char ch = str.charAt(i);
				if(Character.isDigit(ch)) {
					return Character.getNumericValue(ch);
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		RightMostDigit str = new RightMostDigit();
		System.out.println(str.getRightmostDigit("8"));
		
		
	}

}
