package driver_class;

import java.util.Scanner;

import function.min_notes_function;

public class minDenominations {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		min_notes_function a = new min_notes_function();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int no_of_denominations = in.nextInt();
		int arrayDenominations[] = new int[no_of_denominations];
		System.out.println("Enter the curency denomination values:");
		for(int i = 0;i<no_of_denominations;i++) {
			arrayDenominations[i] = in.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int pay_value = in.nextInt();
		a.minDenominations(arrayDenominations,no_of_denominations,pay_value);
	}
}
