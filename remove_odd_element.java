import java.util.ArrayList;
import java.util.Scanner;
public class remove_odd_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter " + n + " element :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> evenList=new ArrayList<>();
		for(int num:arr) {
			if(num%2==0) {
				evenList.add(num);
			}
		}
		System.out.println("after removing the odd element :");
		for(int num:evenList) {
			System.out.println(num+ " ");
		}

	}

}
