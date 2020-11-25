import java.io.IOException;
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
			
			
//			ArrayList<String> titles = new ArrayList<>();
//			System.out.println(titles);
//			
//			titles.add("Their Eyes Were Watching God");
//			titles.add("One Hundred Years of Solitude");
//			titles.add("The Picture of Dorian Gray");
//			titles.add("The Wheel of Time");
//			titles.add("Tales of the City");
			
			titles = new ArrayList<String>();
			loadTitles();
		}
		
		
		
		public void loadTitles() {
			
			try {
				Utils.loadStringsToArray(titles);
			} catch (IOException e) {
				System.out.println("Could not initialize the titles");
				this.titles = new ArrayList<String>();
			}
		}
		
}

