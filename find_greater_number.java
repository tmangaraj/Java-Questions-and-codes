package pratice_scanner_class;
import java.util.Scanner;
public class find_greater_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int n=sc.nextInt();
		System.out.println("enter the second number: ");
		int m=sc.nextInt();
		if(n<=m) {
			System.out.println("second number is greater;");
		}else {
			System.out.println("first number is  greater;");
		}

	}

}
