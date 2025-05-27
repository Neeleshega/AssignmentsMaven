package assignments;

public class Assignment12_PowerOf_n {

	public static void main(String[] args) {

		int n = 10;
		double x = 2.0;
		double result = 1.0;
		double result2 = 1.0;

		if (n == 0) {
			System.out.println("x to the pwer of n is: " + n);
		}
		
		if (n < 0) {
			
			for (int j = -1; j >= n; j--) {

				result = result * x;
				result2 = 1/result;
			}

			System.out.println("x(" + x + ") power of n(" + n + ") is: " + result2);
		}

		else {

			for (int i = 1; i <= n; i++) {

				result = result * x;

			}
			System.out.println("x(" + x + ") power of n(" + n + ") is: " + result);
		}
	}
}
