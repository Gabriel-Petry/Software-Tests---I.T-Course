
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f", product1, price1);
		System.out.println("");
		System.out.printf("%s, which price is $ %.2f", product2, price2);
		System.out.println("");
		System.out.printf("record: %s years old, code %s, and gender: %c%n", age, code, gender );
		System.out.println("");
		System.out.printf("Measue with eight decimal places: %.8f%n", measure );
		System.out.printf("Rouded (theree decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f", measure);
		
		
		
	}

}
