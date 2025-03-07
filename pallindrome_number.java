package numbers_program;
import java.util.Scanner;
public class pallindrome_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==m) {
			System.out.println("number is pallindrome number");
		}else {
			System.out.println("number is not pallindrome number");
		}

	}

}
