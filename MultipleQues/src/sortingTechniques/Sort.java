package sortingTechniques;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,34,32,78,90,25,65,12,56};
		int arr1[]= {1,34,32,78,90,25,65,12,56};
		
		
//		Inbuild method
//		Arrays.sort(arr);
		//Bubble Sort
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(arr));
//		arr.sort((a,b) => a-b);
		
		
		//Selection sort
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
