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
	
	public boolean isThirdCharSimilar() {
		if(city1.substring(2, 3).equalsIgnoreCase(city2.substring(2, 3))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFourthCharSimilar() {
		if(city1.substring(3, 4).equalsIgnoreCase(city2.substring(3, 4))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		int distance = 0;
		int oneWrong = 0;
		int twoWrong = 0;
		int threeWrong = 0;
		int allWrong = 0;
		int oneWrong2 = 0;
		int twoWrong2 = 0;
		int threeWrong2 = 0;
		int allWrong2 = 0;
		
		if (isFirstCharSimilar() == false) {
			distance += 1;
		}
		
		if (isSecondCharSimilar() == false) {
			distance += 1;
		}
		
		if (isThirdCharSimilar() == false) {
			distance += 1;
		}
		
		if (isFourthCharSimilar() == false) {
			distance += 1;
		}
		
		for (int i = 0; i < hammingArray.size(); i++) {
			int count = 0;
			
			if(city1.substring(0, 1).equals(hammingArray.get(i).substring(0, 1))) {
				count = count;
			}
			else {
				count += 1;
			}
			
			if(city1.substring(1, 2).equals(hammingArray.get(i).substring(1, 2))) {
				count = count;
			}
			else {
				count += 1;
			}
			
			
			
		}
		
	}
	
}