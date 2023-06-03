package edu.sdmesa.cisc191;

/**
 * @author Allan Schougaard
 * @otherContributors: None
 * @version 1
 * @see Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *      Problem Solving.
 *      https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * @see Bechtold, S., Brannen, S., Link, J., Merdes, M., Philipp, M., Rancourt,
 *      J. D., & Stein, C. (n.d.). JUnit 5 user guide. JUnit 5.
 *      https://junit.org/junit5/docs/current/user-guide/
 */

//TODO: comment the code

public class BankWithdrawer extends Thread
{
	private BankAccount account;
	private double totalAmountToWithdraw;

	public BankWithdrawer(BankAccount givenAccount, double givenAmountToWithdraw)
	{
		account = givenAccount;
		totalAmountToWithdraw = givenAmountToWithdraw;
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " running...");
		
		for (int counter = 0; counter < totalAmountToWithdraw; counter++)
		{
			// Withdraw $1 at a time
			account.withdraw(1);
		}
		
		System.out.println(Thread.currentThread().getName() + " end.");
	}
}
