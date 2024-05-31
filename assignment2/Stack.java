package assignment2;

public class Stack {
	Node top;
    private class Node {
        //creating a node
        int data;
        Node next; 
    }
    // creating Constructor to initialize an empty stack
    Stack(){
        top = null;
    }
 // create method to push an element onto the stack
	public void push(int value) {
		
		
        Node input = new Node();
        input.data = value;
        input.next = top;
        top = input;
    }
// create method to check if the stack is empty
    public boolean isEmpty(){
    	if(top == null) {
        return true;
        		
    	}
		return false;
    }
    //create method to return the top element of the stack without removing it
    public int peek(){
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("the Stack is empty");
            return -1;
        }
    }
    //create method to remove the top element from the stack
    public void pop() 
    {
        if (isEmpty()) {
            System.out.print("the stack is empty");
            
        }
        top = top.next;
    }

    // create method to display the elements of the stack
    public void display()
    {
        if (isEmpty()) {
            System.out.printf("the stack is empty");
            
        }
        else {
            Node current = top;
            while (current != null) {
                System.out.println( current.data+" ");
                current = current.next;
            }
        }
    }

   //create a method test the code
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(40);
        stack.push(20);
        stack.push(38);
        stack.push(48);
        stack.push(55);
       
     
        System.out.println("the element before deleting:");
        stack.display();
        
        stack.pop();
        stack.pop();
        System.out.println("the element after deleting:");
        stack.display();
        
        System.out.println("the top element:"+stack.peek());
        
       
        
        
        
        
    }

}

