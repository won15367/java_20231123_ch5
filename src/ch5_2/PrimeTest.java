package ch5_2;

import java.util.Arrays;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 0;
		boolean flag = false;
		int[] prime = new int[100000];
		
		for (int i=3;i<200000;i++) {
			flag = false;
			for (int j=2;j<i;j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				prime[b++] = i;
			}
		}
		
		System.out.println(Arrays.toString(prime));
		
	}

}
