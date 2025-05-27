package assignments;

public class Assignment8_ConditionalStementsLoops {

	public static void main(String[] args) {
		int[] transactions = {50000,-2000,3000,-15000,-200,-300,-4000,-3000};
		
		int totalCreditTrans = 0;
		int totalDebitTrans = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspeciousTrans = 0;
		
		for(int amount : transactions)
		{
			if(amount>0) {
				totalCreditTrans++;
				totalCreditAmount += amount;
			
				if(amount>10000) {
					System.out.println("Suspecious Credit transactions with high amount :" + amount);
					suspeciousTrans++;
				}
			}else{
				totalDebitTrans++;
				totalDebitAmount += amount;
				
				if(amount<-10000) {
					System.out.println("Suspecious Debit transactions with high amount :" + amount);
					suspeciousTrans++;
				}
			}
		}
		
		int finalBalanceAmount =  totalCreditAmount - (-totalDebitAmount);
		
		System.out.println("Transaction Summary is: ");
		
		System.out.println("Total number of credit transactions: " + totalCreditTrans);
		System.out.println("Total number of debit transactions: " + totalDebitTrans);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final Balance amount in the Bank Account: " + finalBalanceAmount);
		System.out.println("Total number of suspicious transactions: " + suspeciousTrans);
		
		

	}

}
