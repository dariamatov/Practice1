package Task3;

import java.util.Scanner;

public class Division1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Введіть кількість школярів: ");
		int n = in.nextInt();
		System.out.print("Введіть кількість яблук: ");
		int k = in.nextInt();
		
		int a = k/n;
		System.out.println(a);
	}
}