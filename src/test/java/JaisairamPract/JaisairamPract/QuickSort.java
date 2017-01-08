package JaisairamPract.JaisairamPract;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args){
		
		int[] data = {2,5,1,4,6,8,11,3};
		new QuickSort().sort(data);
		System.out.println(Arrays.toString(data));
	}

	public void sort(int[] data) {
		quicksort(data, 0, data.length-1);
	}
	
	public void quicksort(int[] data, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(data, start, end);
			quicksort(data, start, pivotIndex-1);
			quicksort(data, pivotIndex+1, end);
		}
	}
	
	private int partition(int[] data, int start, int end) {
		int pivot = data[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) {
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		return i;
	}
	
}
