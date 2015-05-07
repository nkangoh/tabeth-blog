import java.util.*;
public class Increment {
    public static void main(String[] args){
    	int[] test = {8, 9};
    	increment(test);
    	System.out.println(Arrays.toString(test));
    }

    public static void increment(int[] array){
    	int carry = 0;
    	boolean first = true;
    	for (int i = array.length - 1; i >= 0; i--){
    	    if (first){
    	    	carry = (array[i] + 1)/10;
    	    	array[i] = (array[i] + 1)%10;
    	    	first = false;
    	    }

	    else{
	    	int tempCarry = carry;
	    	carry = (array[i] + carry)/10;
	    	array[i] = (array[i] + tempCarry) % 10;
	    }
	}

	if (carry == 1){
	    int[] newArray = new int[array.length + 1];
	    newArray[0] = carry;
	    array = newArray;
	}
    }
}



