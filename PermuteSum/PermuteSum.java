// PermuteSum.java
import java.util.*;

public class PermuteSum {
    public static void main(String[] args){
	Set<String> values = new HashSet<String>();
	int targetSum = 5;
	int permuteLength = 3;
	int[] permuteSet = {0, 1, 2, 3};

	generatePermuteSum(permuteSet, permuteLength, targetSum, values, "", permuteLength);
	System.out.println(values);
    }

    public static boolean generatePermuteSum(int[] set, int length, int sum, Set<String> values, String x, int originalLength){
    	if (x.length() == originalLength && sum(x) == sum){ values.add(x); }
	for (int i = 0; i < set.length && length > 0; i++){
	    generatePermuteSum(set, length - 1, sum, values, x + Integer.toString(set[i]), originalLength);
	}

	return values.isEmpty();

    }

    public static int sum(String s){
	int sumValue = 0;
	for (int i = 0; i < s.length(); i++){
	    sumValue += s.charAt(i) - '0';
	}

	return sumValue;
    }
}




