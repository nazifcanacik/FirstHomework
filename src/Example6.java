import java.util.*;

public class Example6 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int counterP = 0;
		int counterNe = 0;
		int counterNr = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + ". value: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				counterP++;
			} else if (arr[i] < 0) {
				counterNe++;
			} else {
				counterNr++;
			}
		}

		if (counterP != 0 && counterP == 1) {
			System.out.println("There is " + counterP + " positive value.");
		} else {
			System.out.println("There are " + counterP + " positive values.");
		}
		if (counterNe != 0 && counterNe == 1) {
			System.out.println("There is " + counterNe + " negative value.");
		} else {
			System.out.println("There are " + counterNe + " negative values.");
		}
		if (counterNr != 0 && counterNr == 1) {
			System.out.println("There is " + counterNr + " zero value.");
		} else {
			System.out.println("There are " + counterNr + " zero values.");
		}
	}
}
