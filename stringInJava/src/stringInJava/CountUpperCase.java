package stringInJava;

public class CountUpperCase {
	public int countUppercaseLetters(String str) {
		if(str.length()==0)
			return 0;
		else  {
			int count = 0;
			for(int i =0 ;i < str.length();i++){
				char ch = str.charAt(i);
				if(Character.isUpperCase(ch))
					count++;
			if(count==0)
				return 0;
			}
			return count;
			
		}
		
	}
	public static void main(String[] args) {
		CountUpperCase str = new CountUpperCase();
		System.out.println(str.countUppercaseLetters("hii"));
	}
	

}
