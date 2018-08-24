import java.util.Vector;

public class Cities {
	
	public static int numberOfCities = 0;
	public static int codeLength = 0;
	public static Vector<String> City = new Vector(5,5);
	public static Vector<String> cityCodes = new Vector(5,5);
	public static void setCities () {
		
		City.addElement("Tehran");
		City.addElement("Dubai");
		City.addElement("London");
		City.addElement("Paris");
		City.addElement("NewYork");
		City.addElement("Tokyo");
		City.addElement("Sydney");
		City.addElement("Cairo");
		City.addElement("Alaska");
		City.addElement("MexicoCity");
		City.addElement("ElPaso");
		City.addElement("NewCamp");
		City.addElement("Manchester");
		City.addElement("Boston");
		City.addElement("Rome");		
	}
	//set cities works!
	public static Vector getCities () {
		return City;
	}
	//get cities works!
	public static void setNumberOfCities (int n) {
		numberOfCities = n;
		codeLength = (int)( Math.log(numberOfCities) / Math.log(2.0) ) + 1;
	}
	//set number of cities and code length works!
	public static void setCityCodes () {
		int counter = 0;
		while(counter < numberOfCities) {
			cityCodes.addElement(toBinary(counter));
			counter++;
			}

		}
	//set city codes works!
	public static void setCodesLength () {
		for(int i = 0; i < cityCodes.size(); i++) {
			while(cityCodes.elementAt(i).length() < codeLength) {
				String zero = "0";
				zero = zero + (cityCodes.elementAt(i));
				cityCodes.setElementAt(zero, i);
			}
		}
	}
	//set codes length works!
	public static Vector<String> getCityCodes () {
		return cityCodes;
	}
	//get city codes works!
	public static String toBinary (int number) {
		String binary = Integer.toBinaryString(number);
		return binary;
	}
	//to binary works!
}
