package factor_number;
import java.util.Scanner;
public class deficient_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum<n) {
			System.out.println("number is a deficient number");
		}else {
			System.out.println("number is not a deficient number");
		}

	}

}
