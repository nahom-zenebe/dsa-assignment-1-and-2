package assignment2;

public class Linkedlist {
	Node head;
	class Node{
		//creating a node
		int data;
		Node next;
		// creating Constructor to initialize an empty node
		Node(int data){
			this.data=data;
			next=null;
		}
		
		
	}
	//  create method to insert data into linked list
	public void insert(int data) {
		  Node newnode=new Node(data);
		  newnode.data=data;
		  if(head==null) {
			  head=newnode;
		  }
		  else {
			  Node num=head;
			  while(num.next!=null) {
				  num=num.next;
				  
			  }
			  num.next=newnode;
			  newnode.next=null;
		  }}
		  
	  
	  //create a method to display the elements of linked list
		  public void display() {
			  Node current=head;
			  while(current!=null) {
				  System.out.println(current.data+" ");
				  
				  current=current.next;
				  
				  
			  }
		
	}
		
		  
		//  create method to insert data at specific position linked list
	public void insertAtPos(int data, int pos) {
		
		 Node newnode=new Node(data);
		Node current=head;
		
		 while(current!=null) {
			 if(current.data==pos) {
				
		   newnode.next=current.next;
			current.next=newnode;
				
			 }
			 current=current.next;
			
		 }
		
	}
	
//  create method to delete data at specific position in linked list
	public void deleteAtPosition (int pos) {
		Node current=head;
		Node previous=null;
		if(head==null) {
			System.out.println("cannot delete element,It is empty");
			return;
		}
		while (current!= null && current.data != pos) {
		    previous = current;
		    current = current.next;
		  }
		previous.next = current.next;
		}
	
	
	////  create method to delete data after a node in linked list
	public void deleteAfterNode(int pos) {

	    if(head == null) {
             System.out.println("cannot delete element, It is empty");
                  return;

	    }

	    Node current = head;
         Node previous = null;

	    while(current != null) {
	    	if(current .data == pos) {

	    		previous = current ;

	        } else if(previous!= null) {
	        	previous.next = current .next;
                  return;

	        }

	    	current = current .next;

	    }
	    

	    System.out.println("Position not found in the list");

	}
		
		
	
//  create method to search data in the  linked list
	 Node searchNode(int value) {
		Node current=head;
		while(current!=null) {
			if(current.data==value) {
				return current;
			}
			current=current.next;
			}
		return null;
		
	}
	
	
	
	
  public  void dispaly() {
	 Node linkedlist=head;
	 while(linkedlist!=null) {
		System.out.print(linkedlist.data+" ->"+" ");
		linkedlist=linkedlist.next;
	 }
	 System.out.println("NULL");
	 
 }
  //Create a main method to test the code
  public static void main(String[]args) {
	 Linkedlist linkedlist=new Linkedlist();
	 
	 linkedlist.insert(10);
	 linkedlist.insert(24);
	 linkedlist.insert(33);
	 linkedlist.insert(30);
	 linkedlist.insert(40);
	 linkedlist.insert(60);
	 linkedlist.insert(20);
	 
	 System.out.println("the element in linkedlist before operation");
	 linkedlist.dispaly();
	 System.out.println("the element in linkedlist before operation");
	 linkedlist.insertAtPos(50, 33);
	 linkedlist.insertAtPos(80, 60);
	 
	 linkedlist.deleteAtPosition(40);
	 
	 linkedlist.deleteAfterNode(30);
	 
	 
	 linkedlist.dispaly();
	 
	Node num=linkedlist.searchNode(33);
	if(num==null) {
		System.out.println("the elements is not found ");
	}
	else {
		System.out.println("the elements is  found ");
	}
	
	
 }
}
