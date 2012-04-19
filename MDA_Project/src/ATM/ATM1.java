
/**
 * CLASS		: ATM 1
 * OPERATION	: Input model for MDA - EFSM, holds set of input methods for ATM 1
 * AUTHOR		: Darshankumar Zala
 */

package ATM;
import java.io.IOException;

import DataServer.*;
import EFSM.*;
import Param.*;
import Driver.driver;

public class ATM1{
	
	EFSM m = new EFSM();
	
	AbstractFactory AF = new FactoryATM1();
	DataServer1 ds1 = new DataServer1();

	/**
	 * Function : initialize()
	 * 			: Initialize global data structure and Abstract Factory methods.
	 */
	
	public void initialize()
	{
		Global.ds = ds1;	
		Global.ds.setSP(AF.createStorePin());
		Global.ds.setStoreBal(AF.createStoreBal());
		Global.ds.setDisplayMenu(AF.createDisplay());
		Global.ds.setExit(AF.createEjectCard());
		Global.ds.setICPinMsg(AF.createICPinMsg());
		Global.ds.setPrompt(AF.createPrompt());
		Global.ds.setAttemptMsg(AF.createTooManyAttemptMsg());
		Global.ds.setBelowMinBalMsg(AF.createBelowMinBalMsg());
		Global.ds.set_Deposit(AF.createDeposit());
		Global.ds.set_Withdraw(AF.createWithdraw());
		Global.ds.set_Penalty(AF.createPenalty());
		Global.ds.set_balance(AF.createBalance());
		Global.ds.set_lock(AF.createLock());
		Global.ds.setAboveMinBal(AF.createAboveMinBal());	
		Global.ds.setEjectCard(AF.createEjectCard());
	}
	
	/**
	 * Function	: Card(int x, int y)
	 * 			: Set input values for balance and pin
	 */
	public void card(int x, int y)	
	{
		Global.setIPPin1(y);
		Global.setIPBal1(x);		
		
		m.card();
	}
	
	/**
	 * Function	: pin(int x)
	 * 			: Validate pin entered by user.
	 */
	int j = 0;
	public void pin(int x)
	{		
		int p = Global.ds.getPin1();
		if(p == x)
		{
			System.out.println("Pin Accepted");
			if(Global.ds.getBalance1() < 100)
			   m.correctPinBelowMin();
			else
				m.correctPinAboveMin();
		}
		else
		{
			m.incorrectPin(2);
			if(j<2)
			{ 
			 j++;
			 pin(Global.k);
			}
			else
				m.exit();
		}
	}

	/**
	 * Function	: deposit(int d)
	 * 			: Perform deposit operation and set the state after deposit according to balance.
	 */
	public void deposit(int d)
	{
		Global.setTempDP1(d);
		m.deposit();
		
		if(Global.ds.getBalance1() < 100)
		{
			System.out.println("Balance below minimum");
				m.belowMinBalance();
		}
		else
		{
			m.aboveMinBalance();
		}
		
	}
	
	/**
	 * Function	: withdraw(int w)
	 * 			: Perform withdraw operation and apply penalty if applicable.
	 */
	public void withdraw(int w)
	{
		
		Global.setTempWD1(w);
		m.withdraw();
		if(Global.getTempWD1() < 100)
		{
			m.belowMinBalance();			
		}
		else
		{
			m.aboveMinBalance();			
		}
	}
	
	/**
	 * Function	: balance()
	 * 			: Display current balance
	 */
	public void balance()
	{
		m.balance();
	}
	
	/* 
	 * Function	: lock(int x)
	 * 			: Lock the account when user enters valid pin
	 */
	public void lock(int x)
	{
		if(x == Global.ds.getPin1())
	        {
	    	System.out.println("Pin Accepted");
	    		m.correctLock();
	        }
	    else
	    {
	    	System.out.println("Incorrect Pin");
	        m.incorrectLock();
	    }
	}
	
	/**
	 * Function	: unlock(int x)
	 * 			: Unlock the locked account for normal operations when user enters valid pin
	 */
	public void unlock(int x)
	{	
		if(x == Global.ds.getPin1())
		{
			System.out.println("Pin Accepted");
			m.correctUnlock();
			if(Global.ds.getBalance1() < 100)
			{
				m.belowMinBalance();
			}
			else
			{
				m.aboveMinBalance();				
			}
		}
		else 
			{
			System.out.println("Incorrect Pin");
			m.incorrectUnlock();
			}
	}
	
	/**
	 * Function	: exit()
	 * 			: Eject card and reset the ATM to initial stage.
	 */
	public void exit()
	{
		m.exit();
	}

	/**
	 * Function	: quit()
	 * 			: Finish the operation of the ATM 1 and go back to main menu.
	 */
	public void quit() throws IOException
	{
		System.out.println("Thank you for using ATM 1");
		driver.mainMenu();		
	}
} 
