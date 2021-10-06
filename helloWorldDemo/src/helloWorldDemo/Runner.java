package helloWorldDemo;

// (ctrl) + (/) makes a comment
// all of our code should be in the { } for our class

public class Runner {

	// Make a method that prints out "Hello World"
	//This is our main method
	//EVERYTHING that is in here will run when the code executes
	
	public static void main(String[] args) {
		
		//this will printout "hello world"
		System.out.println("Hello World!");
		System.out.println("Happy birthday Reece!!!!!");
		
		helloWorld();
		hbd();
		color();
	}
	
	// Make other methods that are called by our main
	
	
	public static void helloWorld() {
		System.out.println("Hello World from a function");
	}
	
	
	// create method that says happy birthday
	
	public static void hbd() {
		// Syso + ctrl + space will give System.out.println();
		System.out.println("Happy Birthday");
	}
	
	
	public static void color() {
	System.out.println("yellow");
	
	
	}
	
}
