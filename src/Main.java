
public class Main {

	public static void main(String[] args) {
		
		
		/*A bank's swift code is generally of 11 characters and used in international money transfers. 
		An example of swift code: ICICINBBRT4
		ICIC: First 4 letters for bank code
		IN: Next 2 letters for Country code
		BB: Next 2 letters for Location code
		RT4: Next 3 letters for Branch code

		Which of the following code correctly extracts country code from the swift code referred by String reference variable swiftCode?*/

		
		String swiftCode =  "ICICINBBRT4" ;
		
		System.out.println("Code if country is : " 
				+ swiftCode.substring(4, 6));
		
	}

}
