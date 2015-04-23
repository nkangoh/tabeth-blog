import java.util.*;

// LinkedListDuplicateRemoval.java
public class LinkedListDuplicateRemoval {
    public static void main(String[] args){
	LinkedListNode test = new LinkedListNode(0);
	test.add(0);
	test.add(1);
	test.add(2);
	test.print();
	
	/* test  = {0 - > 0 - > 1 -> 2 - > null}
	   test' = {0 -> 1 -> 2 -> null}
	   */

	removeDuplicates(test);
    }

    public static void removeDuplicates(LinkedListNode node){
	HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
	LinkedListNode start = node;
	LinkedListNode print = node;

	while (start.next != null){
	    if(!seen.containsKey(start.data)){
		seen.put(start.data, true);
	    }

	    else {
		start.delete();
	    }

	    start = start.next;
	}

	// Print out 
	print.print();
	System.out.print("null");
    }
}
