package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1={3,2,11,4,6,7};
		int[] num2={1,2,8,4,9,7};
		
		int len1=num1.length;
		int len2=num2.length;
		
		for (int i = 0; i < len1; i++) {
			// System.out.println(arr[i]);

			for (int j = 0; j < len2; j++) {

				if(num1[i]==num2[j]) {
					System.out.println(num1[i]+" "+"is common in both the arrays");
					break;
				}
			}

		}
		
	}

}
