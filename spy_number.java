package numbers_program;
import java.util.Scanner;
public class spy_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int m=n;
		int sum=0,prod=1;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("number is a spy number");
		}else {
			System.out.println("number is not a spy number");
		}

	}

}
