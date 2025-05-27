package assignments;

public class Assignment17_Triangle {

	public static void main(String[] args) {
		int n = 5;

		// collect numbers upto 5
		for (int i = 1; i <= n; i++) {

			// print spaces
			for (int j = n; j > i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
