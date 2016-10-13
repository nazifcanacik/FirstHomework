import java.util.*;
public class Example5 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int input;
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter number " + (i+1) +": ");
			input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.println("Number  Zero  Positive  Negative");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println(" " + arr[i] + " \t  - \t + \t -" );
			}else if(arr[i] == 0) {
				System.out.println(" " + arr[i] + " \t  +  \t - \t -" );
			} else {
				System.out.println(arr[i] + " \t  - \t - \t +" );
			}
		}
	}
}
