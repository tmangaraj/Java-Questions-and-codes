import java.util.Scanner;

public class reverse_string_without_space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); 
        scanner.close();

        String reversed = ""; 

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i); 
            if(ch!=' ') {
            	 reversed += ch; 
            }   
        }

        System.out.println("Reversed string without spaces: " + reversed);
    }
}
