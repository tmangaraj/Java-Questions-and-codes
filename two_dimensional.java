import java.util.Scanner;
public class two_dimensional {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        int[][] array2D = new int[rows][columns];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Element at [" + i + "][" + j + "]: ");
	                array2D[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("The 2D array is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(array2D[i][j] + " ");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	
	}
