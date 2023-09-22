package week1.day2.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {3,2,11,4,6,7};
		
		Arrays.sort(num);
		
	/*	System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(num[5]); */
		
		int len =num.length;
		System.out.println(num[len-2]);
		
	}

}
