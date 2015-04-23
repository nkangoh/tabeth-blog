// Unique.java
import java.util.*; /* This is necessary to use the HashMap */

public class Unique {
    public static void main (String[] args) {
    	String message = "Do I have repeat characters?";
        System.out.println("Is it unique? " + isUnique(message));
    }

    public static boolean isUnique(String message){
    	// Keeps track if certain characters have been seen or not.
    	HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        for (int i = 0; i < message.length(); i++){
	    if (seen.containsKey(message.charAt(i)))
		return false; // We know we have seen it before, which is why it's in the HashMap
            else
            	seen.put(message.charAt(i), 0);
        }  
        return true; // If we can get to this point, that means every character was unique.
    }
}
