package examples;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class CoffeeMenu {

	private Map<String, Double> menuMap = new HashMap<String,Double>();
	private Properties menuProperties = new Properties();
	
	public CoffeeMenu(String pathToFile) {
		//processMenu(pathToFile);
	}
	public void processMenu(String pathToFile) {
		List<String> menuLines = new FileExamples().readDataFromFile(pathToFile);
	}
}
