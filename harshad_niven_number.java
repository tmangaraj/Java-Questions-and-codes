package numbers_program;
import java.util.Scanner;
public class harshad_niven_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(m%sum==0) {
			System.out.println("number is a harshad number and niven number ");
		}else {
			System.out.println("number is not harshad number and niven number");
		}

	}

}
