package bookpackage;

import java.io.FileReader;
import java.io.FileWriter;

public class mainbook {
	
	public static void main (String[] args) {
		
		Bookstore bookNook = new Bookstore();
			
		System.out.println("Welcome to The Book Nook.");
		System.out.println("A cozy " + bookNook.squarefeet + " square feet of space.");
		System.out.println("Our address is " + bookNook.address);
		System.out.println("We are open " + bookNook.daysofweek + " from " + bookNook.hours + ".");
		System.out.println("Do we have USED books? The answer is: " + bookNook.usedbooks + "!");
		bookNook.loadTitles();
		
	}
}

