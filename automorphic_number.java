package numbers_program;
import java.util.Scanner;

public class automorphic_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int m = n; 
        int square = n * n; 
        int divisor = 1;
        while (n > 0) {
            divisor =divisor* 10;
            n /= 10;
        }
        if (square % divisor == m) {
            System.out.println("Yes, it's an automorphic number.");
        } else {
            System.out.println("No, it's not an automorphic number.");
        }

        sc.close();
    }
}
