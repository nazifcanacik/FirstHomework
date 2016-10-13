import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example1 {

	public static void main(String[] args) {
		
		int id = 0, credit = 0, age = 0, year = 0;
		String name, surname = " ";
		float gpa = 0;
		char gender;
		Scanner sc = new Scanner(System.in);
		char repeat = 'n';
		
		do {
			System.out.print("Enter your name and surname then your age, your year and your gpa: ");
			name =  sc.next();
			surname = sc.next();
			age = sc.nextInt();
			year = sc.nextInt();
			gpa = sc.nextFloat();
			System.out.print("Enter your gender F(emale) M(ale): ");
			gender = sc.next().charAt(0);
			System.out.print("Enter your id and #credits you have taken this semester: ");
			id = sc.nextInt();
			credit = sc.nextInt();
			
			System.out.println("Name Surname: " + name + " " + surname + "\tGender: " + gender );
			System.out.println("Age: " + age + "\t\t\tID: " + id);
			System.out.println("Year: " + year + "\t\t\tGPA: " + gpa);
			System.out.println("You have taken " + credit + " credits");
			
			System.out.println("Repeat?");
			repeat = sc.next().charAt(0);
		} while(repeat == 'Y' || repeat == 'y');
		System.out.println("Exit!");
	}
}
