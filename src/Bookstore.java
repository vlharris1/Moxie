package bookpackage;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Bookstore {
	
	public String name;
	public String address;
	public int squarefeet;
	public String daysofweek;
	public String hours;
	public boolean usedbooks;
	private ArrayList<String> titles;
	
		public Bookstore() {
			name = "The Book Nook";
			address = "100 Biblio Blvd.";
			squarefeet = 1000;
			daysofweek = "Tuesday - Sunday";
			hours = "10:00am - 9:00pm";
			usedbooks = true;
			titles = new ArrayList<String>();
		}
		
		
		public void loadTitles() {
			
			try {
				Utils.loadStringsToArray(titles);
				System.out.println("Buy some American Great Reads: " + titles);
			} catch (IOException e) {
				System.out.println("Could not initialize the titles");
				this.titles = new ArrayList<String>();
		}
	}	
}

