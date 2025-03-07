import java.util.Scanner;
public class reversed_string_with_space {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name :");
		String name =sc.nextLine();
		System.out.println("your name is:"+ name);
		
		String reversed="";
		for(int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			reversed=reversed+ch;
		}
        System.out.println("your reversed string is :"+reversed);
	}

}
