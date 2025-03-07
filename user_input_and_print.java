package pratice_scanner_class;
import java.util.Scanner;
public class user_input_and_print {

	public static void main(String[] args) {
		System.out.println("enter the details here to see the results");
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your first name :");
		String first=sc.nextLine();
		
		
		System.out.print("enter your last name :");
		String last=sc.nextLine();
		
		System.out.print("enter your age :");
		int age=sc.nextInt();
		
		System.out.print("enter your mark (out of 300) :");
		float mark=sc.nextFloat();
		
		float percentage= mark/300*100; 
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		System.out.println("YOUR RESULT SHEET:-");
		System.out.println("Name :"+first+" "+last);
		System.out.println("Age :"+age);
		System.out.println("mark is :"+mark);
		System.out.println("Percentage :"+percentage+"%");
		if(percentage>60) {
			
			System.out.print("division is first Division");
		}else if (percentage<60){
			
			System.out.print("division is second Division");
		}else {
			
			System.out.print("Or there is no Division");
		}
	}

}
