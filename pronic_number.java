package factor_number;
import java.util.Scanner;
public class pronic_number {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	int fact=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			if(i*(i+1)==n) fact=i;
		}
	}
	if(fact!=0) {
		System.out.println("number is a pronic number");
	}else {
		System.out.println("number is not a pronic number");
	}

	}

}
