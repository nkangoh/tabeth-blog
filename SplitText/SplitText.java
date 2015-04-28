import java.util.*;

public class SplitText {

    public static void main(String[] args){
	   Set<String> dict = new HashSet<String>();
	   dict.add("he");
	   dict.add("hello");
	   dict.add("hell");
	   dict.add("other");
	   dict.add("there");
	   String word = "hellother";
	   String wordList = create(word, dict, word.length());
	   System.out.println(wordList);

    }

    public static String create(String leftWord, Set<String> dictionary, int oLength){
    	if (dictionary.contains(leftWord))
    	    return leftWord + " ";

	for (int i = 1; i < leftWord.length(); i++){
	    String answer = create(leftWord.substring(0, i), dictionary, oLength) + create(leftWord.substring(i, leftWord.length()), dictionary, oLength);
	    if (valueSum(answer) == oLength)
	    	return answer;
	}
	
	return new String();

    }

    public static int valueSum(String word){
    	int sum = 0;
    	for (int i = 0; i < word.length(); i++){
	    if (word.charAt(i) != ' ')
	    	sum++;
	}

	return sum;
    }

}


