import java.util.*;

public class Example2and3 {

	public static void main(String[] args) {
		
		double dollar, euro, yen, sterling;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter $: ");
		dollar = sc.nextDouble();
		System.out.println("Enter €");
		euro = sc.nextDouble();
		System.out.println("$/‎€ = " + dollar + "/" + euro + " = " + dollar/euro);
		System.out.println("$/‎€ = " + euro + "/" + dollar + " = " + euro/dollar);
		
		System.out.println("Enter ¥: ");
		yen = sc.nextDouble();
		System.out.println("Enter £: ");
		sterling = sc.nextDouble();
		
		System.out.println("¥/‎£ = " + yen + "/" + sterling + " = " + yen/sterling);
		System.out.println("£/¥ = " + sterling + "/" + yen + " = " + sterling/yen);
	}

}
