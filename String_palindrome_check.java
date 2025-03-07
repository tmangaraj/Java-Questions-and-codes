import java.util.Scanner;
public class String_palindrome_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String name=sc.nextLine();
		System.out.println("your name:"+ name);
		
		boolean ispallindrome=true;
		int left=0;
		int rigth=name.length()-1;
		while(left<rigth) {
			if(name.charAt(left)!=name.charAt(rigth)) {
				ispallindrome=false;
				break;
			}
			left++;
			rigth--;
		}
		if(ispallindrome) {
			System.out.println("your name is a palindrome");
		}
		else {
			System.out.println("your name is not pallindrome");
		}
		

	}

}
