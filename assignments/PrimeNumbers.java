package week1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30};
		
		for (int i = 0; i < num.length-1; i++) {
			
			if(num[i]/2==1 || num[i]%2!=0 && num[i]%3!=0 && num[i]%5!=0 && num[i]%7!=0 && num[i]%9!=0) {
				System.out.println(num[i]);
			}
			
			/*if(num[i]%2!=0 && num[i]%3!=0) {
			System.out.println(num[i]);
			}*/
		}
	}

}
