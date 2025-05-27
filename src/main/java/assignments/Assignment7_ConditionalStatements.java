package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		int creditScore = 720;
		String custName = "John Doe";
		double income = 55000.0;
		boolean isEmployeed = true;
		double debtToRatio = 35.0;

		System.out.println("Customer Loan Eligibitlity Check : " + custName);

		if (creditScore > 750) {
			System.out.println("Excellent Credit Score, Hence Loan Approved");
		} else {
			if (creditScore > 650) {
				System.out.println("Additional Checks need to Perform: ");
				System.out.println("Customer Credit Score is: " + creditScore);
			}
			if (income > 50000) {
				if (isEmployeed) {
					if (debtToRatio < 40.0) {
						System.out.println(
								"Customer Debit Ratio is too high which is " + debtToRatio + "%, Hence Loan Rejected");
					} else {
						System.out.println("Customer is Not Employeed, Hence Loan Rejected");
					}
				} else {
					System.out.println(
							"Custome Income is less than 50000/- which is " + income + ", Hence Loan Rejected");
				}
			} else {
				System.out
						.println("Customer Credit Score is too Low which is " + creditScore + ", Hence Loan Rejected");
			}
		}

	}

}
