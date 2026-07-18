package collections;

public class ReverseWord {
	public String reverseWordInSentence(String sentence) {
		if (sentence==null) {
			return " " ;
			
		}
		if(sentence.length()==0) {
			return "INVALID";
		}
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word : words) {
			StringBuilder sb = new StringBuilder(word);
			result.append(sb.reverse());
			result.append(" ");
		}
		return result.toString().trim();
		
	}
	public static void main(String[] args) {

	    ReverseWord sm = new ReverseWord();

	    System.out.println(sm.reverseWordInSentence("I am irOnMAn"));
	    

	    System.out.println(sm.reverseWordInSentence(""));
	    

	    System.out.println(sm.reverseWordInSentence(null));
	   

	    System.out.println(sm.reverseWordInSentence("Java Programming is fun"));
	    
	}

}
