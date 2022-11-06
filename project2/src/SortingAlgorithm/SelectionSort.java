package SortingAlgorithm;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
public static void selectionsort(int [] arr) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		//Insert element at ith position
		
	 int min=Integer.MAX_VALUE;
	 
	for(int j=i;j<n;j++) {
		if(arr[j]<min)
			min=arr[j];
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,6,4,8,0,3};
      selectionsort(arr);
      printArray(arr);
	}

}
