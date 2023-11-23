package ch5_2;

import java.util.Arrays;

public class ArrayCopy_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		for (int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		int[] arr3 = {4,5,6};
		int[] arr4 = new int[5];
		
		System.arraycopy(arr3, 0, arr4, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr4));
	}

}
