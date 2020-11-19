import java.util.Scanner;
import java.util.Random;

public class ASCIIChars {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String newQuest = "yes";
		System.out.println("Please enter your name.");
		String name = userInput.nextLine();
		
		System.out.println("Hello " + name + "." + " Do you wish to continue to the interactice portion?");
		String answer = userInput.next();
		do {
			if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
			System.out.println("Please return later to complete the survey.");
			System.exit(0);
			} 
			
		System.out.println("Do you have a red car?");
		String car = userInput.next();
			
		System.out.println("What is the name of your favorite pet?");
		String petName = userInput.next();
			
		System.out.println("How old is your favorite pet?");
		int petAge = userInput.nextInt();
		
		System.out.println("What is your lucky number?");
		int luckyNum = userInput.nextInt();
		
		System.out.println("Do you have a favorite quarterback?");
		String entry = userInput.next();
		
				if (entry.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
					System.out.println("What is the two-digit model year of your car?");
					int modelYear = userInput.nextInt();
				} else if (entry.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
					System.out.println("What is the jersey number of your favorite quarterback?");
					int jerseyNum = userInput.nextInt();
				}
		System.out.println("What is the first name of your favorite actor or actress?");
		String actor = userInput.next();
		
		System.out.println("Enter a random number between 1 and 50.");
		int randomNum = userInput.nextInt();
		
		Random random = new Random();
		int upperbound = 65;
		int rando = petAge + luckyNum;
		int int_random = random.nextInt(rando);
		int int_random0 = random.nextInt(upperbound);
		int int_random1 = random.nextInt(upperbound);
		int int_random2 = random.nextInt(upperbound);
		int int_random3 = random.nextInt(upperbound);
		int upper = 75;
		int magic = luckyNum * int_random;
		
		System.out.print("Lottery numbers: " + int_random + "," + int_random0 + "," + int_random1 + "," + int_random2 + "," + int_random3 + "  ");
		System.out.println("Magic Ball: " + magic);
		System.out.println();
		System.out.println("Would you like to answer questions to generate a new set of numbers?");
		newQuest = userInput.next();
	} while (newQuest.equalsIgnoreCase("yes"));
		System.out.println("Thank you for playing.");	

	}
	public static void printNumbers() {
		ASCIIChars.printNumbers();
		int i;
		for(i = 0; i >= 47 && i <= 57; i++); {
		System.out.println("The ASCII value of" + (char)i + " = " + i);
		}
		
	}
	
	public static void printLowerCase() {
		ASCIIChars.printLowerCase();
		int a;
		for(a = 0; a >= 97 && a <= 122; a++); {
			System.out.println("The ASCII value of" + (char)a + " = " + a);
		}
	}
	
	public static void printUpperCase() {
		ASCIIChars.printUpperCase();
		int b;
		for(b = 0; b >= 65 && b <= 90; b++); {
			System.out.println("The ASCII value of" + (char)b + " = " + b);
		}
	}
	
	
}

