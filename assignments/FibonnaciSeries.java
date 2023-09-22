package week1.assignments;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		System.out.println(a);


		for (int i = 0; i < 9; i++) {

			int C=a+b;
			a=b;
			b=C;

			System.out.println(a);
		}


	}

}
