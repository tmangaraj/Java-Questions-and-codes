package numbers_program;
import java.util.Scanner;
public class duck_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int m=n;
		int count=0;
		while(n!=0) {
			int d =n%10;
			if(d==0) count++;
			n=n/10;
		}
		if(count>0) {
			System.out.println("number is a duck number");
		}else {
			System.out.println("number is not a duck number");
		}

	}

}
