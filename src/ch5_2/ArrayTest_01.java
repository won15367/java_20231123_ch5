package ch5_2;

public class ArrayTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {90, 85, 75, 80};
		
		for (int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}

		int[] arr1 = new int[10]; //0으로 채워진 배열이 만들어진다.	
		
		for (int i=0;i<10;i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[5]; //String은 null값으로 채워진다.
		
		for (int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
