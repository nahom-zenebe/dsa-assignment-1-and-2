package assignment1;
  
public class Node {
     //create a node
     public Task task;
     public Node next;
     // creating Constructor to initialize an empty node
     public Node(Task task) {
    	 this.task=task;
    	 next=null;
     }
}
