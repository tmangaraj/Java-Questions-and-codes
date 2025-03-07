import java.util.Scanner;
public class find_maximum_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter " + n + " element");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.println("maximum value :"+max);
	}

}
