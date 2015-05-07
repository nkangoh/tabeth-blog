import java.util.*;

public class ParitionValue {
    public static void main(String[] args){
	int[] values = {3, 2, 1, 0};
	parition(values, 2);
	System.out.println(Arrays.toString(values));
    }

    public static void parition(int[] values, int target){
    	int equal = 0;
    	int small = 0;
    	int great = values.length - 1;

    	// Move on to our cases
    	while ( equal <= great ){
    	    if (values[equal] < target){
    	    	swap(values, equal, small);
    	    	equal++;
    	    	small++;
	    }

	    else if (values[equal] == target){
	    	equal++;
	    }

	    else if (values[equal] > target){
	    	swap(values, equal, great);
	    	great--;
	    	equal++;
	    	small++;
	    }
	}
    }

    public static void swap(int[] values, int one, int two){
    	int temp = values[one];
    	values[one] = values[two];
    	values[two] = temp;
    }
}

	
