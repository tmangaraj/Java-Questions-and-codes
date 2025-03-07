package factor_number;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("number is a prime number");
			}else {
				System.out.println("number is not a prime number");
			}
		

	}

}
