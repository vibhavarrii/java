package arrays;

public class FindingLongestWord {
	public String findLongestWord(String sentence) {

        // TODO: Write your code here
		if(sentence == null || sentence.isEmpty())
			return " ";
		else {
			String[] words = sentence.split(" ");
			String longestWord = "";
			for(String word : words) {
				if(word.length() > longestWord.length())
					longestWord = word;
					
			}
			return longestWord;
		}
        
    }
	public static void main(String[] args) {
		FindingLongestWord era = new FindingLongestWord();
		System.out.println(era.findLongestWord("hello i want to have a good future"));
	}

}
