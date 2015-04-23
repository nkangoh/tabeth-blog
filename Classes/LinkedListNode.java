// LinkedListNode.java
public class LinkedListNode {
    int data; /* Data in this case is just a number, your data could also be a String, or
		 a more sophisticated object. */
    LinkedListNode next; /* A pointer to the next LinkedListNode, notice that this is
			    a singly Linked List as there is no previous LinkedListNode
			    pointer */

    public LinkedListNode(int data){
	this.data = data;
	this.next = null;
    }

    public void add(int data){
	// Create a LinkedList Node with the data
	LinkedListNode add = new LinkedListNode(data);
	LinkedListNode beginning = this;
	while (beginning.next != null){
	    beginning = beginning.next;
	}
	// If you're here then you're at the end, because the next is null
	// Go ahead and add your new LinkedListNode to the end then.
	beginning.next = add;
    }

    public void delete(){
	// This will delete the node that calls this node
	LinkedListNode toDelete = next; /* Copy pointer to the next node */
	if (this.next != null){
	    this.data = this.next.data;
	    this.next = this.next.next; /* 'Jump' over the next node */
	}
	toDelete = null; /* Effectively delete the node */
    }

    /* There are other interesting things that you might want in your class, such as search, 
       print, deleting a specific node, etc. For this problem, these two methods are enough
       */
}
