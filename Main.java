import java.util.Vector;

public class Main {
	public static String Answer = "";
	public static void main(String[] args) {
		
		System.out.println("welcome!");
		System.out.println("please enter the number of cities:");
		System.out.println("note that the maximum number of cities is 15! :D");
		int number = 0;
		number = GetInput.GetNumber();
		Cities.setCities();
		Cities.setNumberOfCities(number);
		Cities.setCityCodes();
		Cities.setCodesLength();
		System.out.println("here are the names of the cities with their codes:");
		for(int i = 0; i < number; i++) {
			System.out.println(Cities.City.elementAt(i) + " has the code " + Cities.cityCodes.elementAt(i));
		}
		System.out.println("please choose one of these cities! :)");
		System.out.println("please remember your chosen city's code! :)");
		for(int i = 0; i < Cities.codeLength; i++) {
			System.out.println("does your chosen city have one of the codes listed below?");
			System.out.println(cityGroups0(number, i));
			System.out.println("if yes enter 1");
			System.out.println("if no enter 0");
			int answer = GetInput.GetNumber(); 
			if(answer == 1) {
				String zero = "0";
				zero = zero + Answer;
				Answer = zero;
			}
			else {
				String one = "1";
				one = one + Answer;
				Answer = one;
			}
		}
		System.out.println("the  city you chose has the code " + Answer);
		System.out.println("thank you for playing! :)");
	}
	public static Vector<String> cityGroups0 (int number, int round) {
		Vector<String> binary0 = new Vector<String>(5,5);
		for(int i = 0; i < number; i++) {
			char[] code = Cities.cityCodes.elementAt(i).toCharArray();
			if(code[code.length - round - 1] == '0') {
				binary0.addElement(Cities.cityCodes.elementAt(i));
			}
		}
		return binary0;
	}

}
