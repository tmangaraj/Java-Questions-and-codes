import java.util.Scanner;
public class find_second_smallest_array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		System.out.println("enter " + n + " element");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE,secondmin=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num<min) {
				secondmin=min;
				min=num;
			}else if(num<secondmin && num!=min) {
				secondmin=num;
			}
		}
		System.out.println("second minmum: "+ secondmin);

	}

}
