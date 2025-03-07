package java_switch_case;
import java.util.Scanner;
public class simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n=sc.nextInt();
        System.out.println("enter the second number");
        int m=sc.nextInt();
        System.out.println("select operation");
        System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d:");
        char ch=sc.next().charAt(0);
        switch(ch) {
        case 'a':
        	System.out.println("sum of two number "+(n+m));
        	break;
        	
        case 's':
        	System.out.println("substraction of two number"+(n-m));
        	break;
        	
        case 'm':
        	System.out.println("multiplication of two number: "+(n*m));
        	break;
        	
        case 'd':
        	System.out.println("division of two number: "+(n/m));
        	break;
        	
        default:
        	System.out.println("invalid greade");
        }
	}

}
