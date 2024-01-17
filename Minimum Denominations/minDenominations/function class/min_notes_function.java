package function;

public class min_notes_function {
	public void minDenominations(int[] arrayDenominations, int no_of_denominations,int pay_value) {
		
		int n = no_of_denominations;
		int[] ordered_array = arrayDenominations;
		quick_sort(ordered_array,0,n-1);
		System.out.println("Your payment approach in order to give min no of notes will be:");
		int flag =0;
		int sum = pay_value;
		for(int i=0;i<n;i++) {
			int div;
			if(ordered_array[i]< sum) {
				div = sum/ordered_array[i];
				sum = sum - (ordered_array[i]*div);
				System.out.println(ordered_array[i]+":"+div);
				flag = 1;
			}
			else if(ordered_array[i]==sum) {
				System.out.println(ordered_array[i]+":"+"1");
				flag =1;
				break;
			}
		}
	
		if(flag == 0) {
			System.out.println("the amount cannot be paid used the given denominations");
		}
		
	}
	
	public void quick_sort(int[] arr,int low,int high) {
		
		if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quick_sort(arr, low, partitionIndex - 1);
            quick_sort(arr, partitionIndex + 1, high);
        }
	}

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
	}

	
}
