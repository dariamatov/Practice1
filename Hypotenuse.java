package Task1;

import java.util.Scanner;

public class Hypotenuse {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Введіть два значення: ");
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		int hyp = (n1*n1) + (n2*n2);
		System.out.println(Math.sqrt(hyp));
	}
}