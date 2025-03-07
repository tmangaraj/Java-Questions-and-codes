package factor_number;
import java.util.Scanner;

public class fibonnaci_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        int a = 0, b = 1; 

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.println(a);     

            int c = a + b;            
            a = b;                    
            b = c;                   
        }

        sc.close(); 
    }
}

