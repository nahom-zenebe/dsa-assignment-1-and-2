package assignment1;



public class ToDoList {
	Node head;
	//create a method to add task to toDolist
	public void addtask(Task task) {
		Node newnode = new Node(task);
        newnode.task = task;

        if (head == null) {
            head = newnode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }
	//create a method to do task as completed
	public void markToDoAsCompleted(String title) {
		
		Node current=head;
		while(current!=null) {
			if(current.task.gettitle().equals(title)) { 
				current.task.markcompleted(); 
				return; 
				} 
				current = current.next; 
				} 
				System.out.println("Task is not found"); 
				} 

          //create a method to add a new task to the toDolist
		public void addToDo(Task data) {
			Node newnode = new Node(data);
	        newnode.task = data;
	        newnode.next = null;

	        if (head == null) {
	            head = newnode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newnode;
	        }
		}
		
       //create a method to view the toDolist
	public void viewToDoList() {
		 Node current=head;
		 System.out.println("The List of Task:");
		  while(current!=null) {
			  System.out.println(current.task+" ");
			  
			  current=current.next;
			  
	}
	}
	//main method to test the toDolist
	public static void main(String[]args) {
		ToDoList todolist=new ToDoList();
		
		todolist.addtask(new Task("home work","write some code"));
		todolist.addtask(new Task("go to gym","making exercise"));
		todolist.addtask(new Task("Reading","read some book"));
		todolist.addtask(new Task("project","doing some research"));
		
		
		
		todolist.addToDo(new Task("take a meal","prepare a meal to eat"));
		todolist.addToDo(new Task("sleeping","laying on the bed to get rest"));
		
		
		todolist.markToDoAsCompleted("home work");
		todolist.markToDoAsCompleted("go to gym");
		todolist.viewToDoList();
		
		
	}
	

}
