import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		
		int first = 0, second = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		first = sc.nextInt();
		System.out.println("Enter second number: ");
		second = sc.nextInt();
		if(first % second == 0) {
			System.out.println(first + " is divisible by " + second);
		} else {
			System.out.println(first + " is not divisible by " + second);
		}
	}
}
