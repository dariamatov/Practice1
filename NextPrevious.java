package Task2;

import java.util.Scanner;

public class NextPrevious {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Введіть значення: ");
		
		int n1 = in.nextInt();
		
		System.out.println("Ви ввели число " + n1 + ", попереднє даного числа: " + (n1-1));
		System.out.println("Наступне число: " + (n1+1));
	}
}