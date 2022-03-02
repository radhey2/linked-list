
public class LinkedlistUc3 {
	
	   // Node head; // head of list
	 
	    /* Linked list Node.  This inner class is made static so that
	       main() can access it */
	    static class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	           this.data = d;
	           this.next = null;
	        } // Constructor
	    }
	    //Represent the head and tail of the singly linked list    
	    public Node head = null;    
	    public Node tail = null;    
	    public void addNode(int data) {    
	        //Create a new node    
	        Node newNode = new Node(data);    
	            
	        //Checks if the list is empty    
	        if(head == null) {    
	            //If list is empty, both head and tail will point to new node    
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else {    
	            //newNode will be added after tail such that tail's next will point to newNode    
	            tail.next = newNode;    
	            //newNode will become new tail of the list    
	            tail = newNode;    
	        }    
	    }    
	    public void display() {
	    	Node current = head;
	    	while(current!=null) {
	    		System.out.println(current.data + " - >");
	    		current = current.next;
	    	}
	    }
	   
    /* method to create a simple linked list with 3 nodes*/
	    public static void main(String[] args)
	    {
	        /* Start with the empty list. */
	        LinkedlistUc3 llist = new LinkedlistUc3();
	 
	        llist.head = new Node(1);
	        Node second = new Node(2);
	        Node third = new Node(3);
	
	        /* Three nodes have been allocated dynamically.
	          We have references to these three blocks as head, 
	          second and third
	 
	          llist.head        second              third
	             |                |                  |
	             |                |                  |
	         +----+------+     +----+------+     +----+------+
	         | 1  | null |     | 2  | null |     |  3 | null |
	         +----+------+     +----+------+     +----+------+ */
	 
	        llist.head.next = second; // Link first node with the second node
	 
	        /*  Now next of the first Node refers to the second.  So they
	            both are linked.
	 
	         llist.head        second              third
	            |                |                  |
	            |                |                  |
	        +----+------+     +----+------+     +----+------+
	        | 1  |  o-------->| 2  | null |     |  3 | null |
	        +----+------+     +----+------+     +----+------+ */
	 
	        second.next = third; // Link second node with the third node
	 
	        /*  Now next of the second Node refers to third.  So all three
	            nodes are linked.
	 
	         llist.head        second              third
	            |                |                  |
	            |                |                  |
	        +----+------+     +----+------+     +----+------+
	        | 1  |  o-------->| 2  |  o-------->|  3 | null |
	        +----+------+     +----+------+     +----+------+ */
	        llist.display();
	    }
	}
	


