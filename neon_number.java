package numbers_program;
import java.util.Scanner;
public class neon_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int m=n;
		int sum=0;n=n*n;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(sum==m) {
			System.out.println("number is a neon number");
		}else {
			System.out.println("number is not a neon number");
		}
	}

}
