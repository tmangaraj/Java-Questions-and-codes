package factor_number;
import java.util.Scanner;
public class ugly_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println(n+"is not an ugly number");
			return;
		}
		while(n%2==0) n=n/2;
		while(n%3==0) n=n/3;
		while(n%5==0) n=n/5;
		
		if(n==1) {
			System.out.println("yes ,number is an ugly number");
			}else {
				System.out.println("no,number is not an ugly number");
		}

	}

}
