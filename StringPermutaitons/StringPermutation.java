import java.util.*;

// StringPermutation.java
public class StringPermutation {
    public static void main(String[] args){
	String one = "Hello";
	String two = "Mellow";
	System.out.println(one + " is a permutation of " +  two + "?: " + isPermutation(one, two));
    }

    public static boolean isPermutation(String one, String two){
	/* Create our dictionary using a HashMap. The keys represent
	   our alphabet (1) and the values represent the amount of
	   each character we have seen (3)
	   */

	HashMap<Character, Integer> seen = new HashMap<Character,Integer>();
	if (one.length() != two.length())
	    return false; //Base case 1

	// Goes through the string and creates dictionary and frequency of characters
	for (int i = 0; i < one.length(); i++){
	    if(seen.containsKey(one.charAt(i)))
		seen.put(one.charAt(i), seen.get(one.charAt(i)) + 1);
	    else
		seen.put(one.charAt(i), 1);
	}

	for (int i = 0; i < two.length(); i++){
	    if(seen.containsKey(two.charAt(i))){
		seen.put(two.charAt(i), seen.get(two.charAt(i)) - 1);
		if (seen.get(two.charAt(i)) < 0)
		    return false; // More of a character in the second string 
	    }

	    else 
		return false; // New character, they do not have the same alphabet
	}

	return true; 
    }
}

