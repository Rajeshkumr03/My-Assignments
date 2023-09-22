package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,11,13,15,17,12,10};

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			if(arr[i]!=i+1) {
				i=i+1;

				System.out.println(i);
				break;
			}
		}
	}

}
