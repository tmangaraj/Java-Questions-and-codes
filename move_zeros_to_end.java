import java.util.Scanner;
public class move_zeros_to_end {
	public static void movezerosToEnd(int arr[]) {
		int nonIndexzero=0;
		for(int num:arr) {
			if(num!=0) {
				arr[nonIndexzero ++]=num;
			}
		}
		while(nonIndexzero<arr.length) {
			arr[nonIndexzero++]=0;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter " + n + " element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		movezerosToEnd(arr);
		System.out.println("after move all zeros to end: ");
		for(int num:arr) {
			System.out.print(num+"");
		}

	}

}
