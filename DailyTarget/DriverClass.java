package Driver;

import java.util.Scanner;

public class DriverClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size_of_array = in.nextInt();
		int array[] = new int[size_of_array];
		System.out.println("Enter the Elements of array:");
		for(int i=0;i<size_of_array;i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enter the total no.of tagets:");
		int no_of_targets = in.nextInt();
		for(int i=0;i<no_of_targets;i++) {
			System.out.println("");
			System.out.println("Enter the taget value:");
			int target_value = in.nextInt();
			targetFunction(target_value,array);
		}
		
	}

	private static void targetFunction(int target_value, int[] array) {
		int array_size = array.length;
		int sum = 0;
		int flag = 0;
		for(int i=0;i<array_size;i++) {
			sum = sum+array[i];
			if(sum >= target_value) {
				System.out.println("Target achieved after "+(i+1)+" Transactions");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Given Target is not achieved");
		}
	}
}
