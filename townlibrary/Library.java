package townlibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
		
		public static String openinghours;
		public static String firstaddress;
		public static String secondaddress;
		
	
		public Library(String string) {
			openinghours = "Libraries are open daily from 9am to 5pm.";
			firstaddress = "10 Main Street";
			secondaddress = "228 Liberty Street";
	}

		public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);
			Library firstLibrary = new Library("10 Main Street");
			Library secondLibrary = new Library("228 Liberty Street");
			
			ArrayList<String> firstlibrary = new ArrayList<>();
			firstlibrary.add("The Da Vinci Code");
			firstlibrary.add("Le Petit Prince");
			firstlibrary.add("A Tale of Two Cities");
			firstlibrary.add("The Lord of the Rings");
			
			ArrayList<String> secondlibrary = new ArrayList<>();
			secondlibrary.add("Their Eyes Were Watching God");
			secondlibrary.add("One Hundred Years of Solitude");
			secondlibrary.add("The Picture of Dorian Gray");
			secondlibrary.add("The Wheel of Time");
			
			String one = "The Da Vinci Code";
			String two = "Le Petit Prince";
			String three = "A Tale of Two Cities";
			String four = "The Lord of the Rings";
			
			System.out.println("Library hours: ");
			System.out.println(openinghours);
			System.out.println();
			
			System.out.println("Library addresses: ");
			System.out.println(firstaddress);
			System.out.println(secondaddress);
			System.out.println();
			
			System.out.println("Books available in the Main Street library: ");
			System.out.println(firstlibrary);
			System.out.println();
			System.out.println("Books available in the Liberty Street library: ");
			System.out.println(secondlibrary);
	        System.out.println();
	        
	        System.out.println("Enter 'four' to borrow The Lord of the Rings");
	        String entry = userInput.next();
	        	do  {
	        		System.out.println("You have successfully borrowed: " + (firstlibrary.get(3)));
	        	} while (entry == four); 
		}
}
