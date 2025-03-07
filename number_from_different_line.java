package numbers_program;
import java.util.Scanner;
public class number_from_different_line {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int m=n;
		while(n!=0) {
			int d= n%10;
			System.out.println(d);
			n=n/10;
		}

	}

}
