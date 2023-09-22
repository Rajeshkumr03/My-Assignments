package week1.assignments;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1009;
		boolean b=true;

		for (int i = 2; i <1009; i++) {
			int c=a%i;
			System.out.println(c);
			if(c==0) {
				b=false;
			}
		}
		if(b) {
			System.out.println(a+" "+ "is prime number");
		}
		else {
			System.out.println(a+" "+ "is not prime number");
		}

	}
}