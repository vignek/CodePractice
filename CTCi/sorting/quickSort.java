package sorting;

public class quickSort {

	public static void main(String[] args) {

		int arr[] = {5,4,3,2,0,7,9,8,1,6};
		int len = arr.length-1;
		quickSort(arr,0,len) ;

		for(int x : arr){
			System.out.print(arr[x]+" ");
		}

	}

	private static void quickSort(int[] arr, int start, int end) {

		if(start < end) {
			int pIndex = partition(arr,start,end);
			quickSort(arr,start,pIndex-1);
			quickSort(arr,pIndex+1,end);
		}

	}

	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int pIndex = start;

		for(int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				// swap if element lesser than pivot
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		// swap pIndex and pivot
		int temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;

		return pIndex;
	}

}
