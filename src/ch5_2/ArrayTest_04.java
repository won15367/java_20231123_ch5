package ch5_2;

import java.util.Arrays;

public class ArrayTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] scores = new int [2][3];
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(scores[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(scores[0]));
		System.out.println(Arrays.deepToString(scores));	
	}

}
