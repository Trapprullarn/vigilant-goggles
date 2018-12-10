package v49;

import java.util.Scanner;

public class arrays {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Hur många tal vill du skriva ut?");
	
	int[] olikaTal = {1, 2, 3, 5, 46, 7, 10, 77, -8, 12};
	int[] olikaTal2 = new int[input.nextInt()];
	int counter = 0;
	
	double[] decimalTal = {1.0, 4.2, 42.42};
	
	String[] namn = {"Patrik", "Patteboi", "BIGMAN"};
	
	
	
	System.out.printf("Skriv %d heltal\n", olikaTal2.length);
	
	for (int i = 0; i < olikaTal2.length; i++) {
		olikaTal2[i] = input.nextInt();
	}
	
	for (int i = olikaTal2.length -1; i >= 0; i--) {
		
//		System.out.print(olikaTal2[i] + ", ");
	}
	
	for (int i = 0; i < olikaTal2.length; i++) {
		
		if(olikaTal2[i] == 4) {
			counter++;
		}
	}
	System.out.println(counter);
	}
}