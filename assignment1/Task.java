package assignment1;

public class Task {
	private String title;
	private String description;
	private boolean completed;
	 // creating Constructor to initialize Task object with title and description
	public Task( String title,String description) {
		this.title=title;
		this.description=description;
		completed=false;
		
	}
	//using getter method to access the title
	public String gettitle() {
		return title;
	}
	//using getter method to access the description 
	public String getdecription() {
		return description;
	}
	//method to check the task is completed
	public boolean iscompleted() {
		return completed;
		
	}
	//create a  method to mark completed
	public boolean markcompleted() {
	       return completed=true;
	}
	//create amethod toString to provide a string representation of the task
	public String toString() { 
		return "Title: " + title + ", Description: " +  description + ", Complted: " + completed; 
		}}




