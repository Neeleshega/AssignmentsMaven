package assignments;

public class Assignment14_Diamond {

	public static void main(String[] args) {
		int n = 5;

		// collect numbers upto 5
		for (int i = 1; i <= n; i++) {

			// print spaces
			for (int j = n; j > i; j--) {

				System.out.print(" ");
			}

			// print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}

		for (int i = n-1; i >=1; i--) {

			// print spaces
			for (int j = n; j > i; j--) {

				System.out.print(" ");
			}

			// print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}

	}

}
