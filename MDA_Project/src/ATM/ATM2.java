
/*
 * CLASS		: ATM 2
 * OPERATION	: Input model for MDA - EFSM, holds set of input methods for ATM 2
 * AUTHOR		: Darshankumar Zala
 */


package ATM;
import java.io.IOException;

import DataServer.*;
import Driver.driver;
import EFSM.EFSM;
import Param.AbstractFactory;
import Param.FactoryATM2;

public class ATM2{
	
	EFSM m = new EFSM();
	
	DataServer2 ds2 = new DataServer2();
	AbstractFactory AF = new FactoryATM2();
	int j = 0;
	
	/**
	 * Function : initialize()
	 * 			: Initialize global data structure and Abstract Factory methods.
	 */
	public void initialize()
	{
		Global.ds =ds2;
		
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
		Global.ds.setAboveMinBal(AF.createAboveMinBal());
		Global.ds.setEjectCard(AF.createEjectCard());
	}
	
	/**
	 * Function	: CARD(float x, String y)
	 * 			: Set input values for balance and pin
	 */
	public void CARD(float x, String y)
	{
		Global.setIPBal2(x);
		Global.setIPPin2(y);		
		Global.ds.setPrompt(AF.createPrompt());
		
		m.card();			
	}
	
	/**
	 * Function	: PIN(String x)
	 * 			: Validate pin entered by user.
	 */
	public void PIN(String x)
	{
		String p = Global.ds.getPin2();
		
		if(p.equals(x))
		{
			System.out.println("Pin Accepted");
			if(Global.ds.getBalance2() < 1000.00)
			{				
			   m.correctPinBelowMin();
			}
			else
				m.correctPinAboveMin();
		}
		else
		{
			m.incorrectPin(3);
			if(j<3)
			{ 
			 j++;
			 PIN(Global.k1);
			}
			else
				m.exit();
		}
	}
	
	/**
	 * Function	: DEPOSIT(float d)
	 * 			: Perform deposit operation and set the state after deposit according to balance.
	 */
	public void DEPOSIT(float d)
	{
		Global.setTempDeposit2(d);
		m.deposit();
				
		if(Global.ds.getBalance2() < 1000)
		{
			System.out.println("Balance below Minimum");
			m.belowMinBalance();
		}
		else
		{
			m.aboveMinBalance();
		}
	}
	
	/**
	 * Function	: WITHDRAW(float w)
	 * 			: Perform withdraw operation and apply penalty if applicable.
	 */
	public void WITHDRAW(float w)
	{
		Global.setTempWithdraw2(w);
		m.withdraw();
		if(Global.getTempWithdraw2() < 1000)
		{
			m.belowMinBalance();
		}
		else
		{
			m.aboveMinBalance();			
		}
	}
	
	/**
	 * Function	: BALANCE()
	 * 			: Display current balance
	 */
	public void BALANCE()
	{
		m.balance();
	}
	
	/**
	 * Function	: EXIT()
	 * 			: Eject card and reset the ATM to initial stage.
	 */
	public void EXIT()
	{
		m.exit();
	}
	
	/**
	 * Function	: QUIT()
	 * 			: Finish the operation of the ATM 1 and go back to main menu.
	 */
	public void QUIT() throws IOException
	{
		System.out.println("Thank you for using ATM 2");
		driver.mainMenu();
	}

}
