package ch5_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[4];
		
		arr1[0] = 10;
		arr1[1] = 12;
		
		for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		// 배열->리스트로 바꿔서 값을 추가->다시 배열로 변경
		List list1 = new ArrayList(Arrays.asList(arr1));
		list1.add(99);
		
	}

}
