package stringInJava;

public class IdenticalChar {
	public boolean hasConsecutiveDuplicates(String str) {
		if(str.length() <= 1)
			return false;
		else {
			for(int i = 0;i<str.length()-1;i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					return true;
				}
			}
		}
			return false;
		}
			
	
	public static void main(String[] args) {
		IdenticalChar str = new IdenticalChar();
		System.out.println(str.hasConsecutiveDuplicates("hello"));
		
	}

}
