package InterviewQuestions;

import java.util.HashMap;

public class WordCountUsingHashMap {

	public static void main(String[] args) {
		 String str = "Hello world! This is a a test string. Counting words a in a string using HashMap in Java.";
		 String[] words = str.split("\\s+");
		 
//		creating HashMap to store and count 
		 HashMap<String, Integer> wordCountmap = new HashMap<>();
		 
//		 Counting the occurence of each word 
		 for(String word: words) {
			 if(wordCountmap.containsKey(word))
			 {
				 wordCountmap.put(word, wordCountmap.get(word)+1);
			 }
			 else {
				 wordCountmap.put(word, 1);
			 }
		 }
		 System.out.println("wordCount");
		 for(String word :wordCountmap.keySet())
		 {
			 System.out.println(word +":"+wordCountmap.get(word));
		 }

	}

}
