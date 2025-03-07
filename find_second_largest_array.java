import java.util.Scanner;
public class find_second_largest_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter " + n + " element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max) {
				secondmax=max;
				max=num;
			}else if(num>secondmax && num!=max) {
				secondmax=max;
			}
		}
		System.out.println("second maximum :" + secondmax);

	}

}
