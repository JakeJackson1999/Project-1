import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HammingDist{
	private String city1;
	private String city2;
	private ArrayList<String> hammingArray = new ArrayList<String>();
	
	public HammingDist(String city1, String city2) throws IOException{
		this.city1 = city1;
		this.city2 = city2;
		File file = new File("Mesonet.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		str = br.readLine();
		str = br.readLine();
		str = br.readLine();
		str = br.readLine();
		while(str != null) {
			hammingArray.add(str.substring(1,  5));
			str = br.readLine();
		}
		br.close();
	}
	
	public boolean isFirstCharSimilar() {
		if(city1.substring(0, 1).equalsIgnoreCase(city2.substring(0, 1))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSecondCharSimilar() {
		if(city1.substring(1, 2).equalsIgnoreCase(city2.substring(1, 2))) {
			return true;
		}
		else {
			return false;
		}
	}
	
}