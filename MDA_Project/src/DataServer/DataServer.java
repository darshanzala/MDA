
/*
 * INTERFACE	: DataServer
 * OPERATION	: Provide interface for the DataServers of ATM1 and ATM2
 * AUTHOR		: Darshankumar Zala
 */

package DataServer;

import OP.*;

public interface DataServer {

	public int amt = 0;
	
//	Abstract Factory Implementations 
	
//	Get and Set methods for Store Pin
	public void setSP(StorePin pn);
	public StorePin getSP();
	
//	Get and Set methods for Store Pin
	public void setStoreBal(StoreBal bal);
	public StoreBal getStoreBal();
	
//	Get and Set methods for Display Menu
	public void setDisplayMenu(Display d);
	public Display getDisplayMenu();
	
//	Get and Set methods for Prompt
	public void setPrompt(Prompt p);
	public Prompt getPrompt();
	
//	Get and Set methods for Exit
	public void setExit(EjectCard e);
	public EjectCard getExit();
	
//	Get and Set methods for Incorrect Pin Message
	public void setICPinMsg(ICPinMsg IPM);
	public ICPinMsg getICPinMsg();
	
//	Get and Set methods for Too Many Attempts Message
	public void setAttemptMsg (TooManyAttemptMsg TMAM);
	public TooManyAttemptMsg getAttemptMsg();
	
//	Get and Set methods for Below Minimum Balance Message
	public void setBelowMinBalMsg (BelowMinBalMsg BMBM);
	public BelowMinBalMsg getBelowMinBalMsg();
	
//	Get and Set methods for Deposit 
	public void set_Deposit (Deposit D);
	public Deposit get_Deposit();
	
//	Get and Set methods for Withdraw 
	public void set_Withdraw (Withdraw W);
	public Withdraw get_Withdraw();
	
//	Get and Set methods for Penalty
	public void set_Penalty(Penalty P);
	public Penalty get_Penalty();
	
//	Get and Set methods for Balance
	public void set_balance(Balance B);
	public Balance get_balance();
	
//	Get and Set methods for Lock
	public void set_lock(Lock L);
	public Lock get_lock();
	
//	Get and Set methods for Above Minimum Balance
	public void setAboveMinBal(AboveMinBal AMB);
	public AboveMinBal getAboveMinBal();
	
//	Get and Set methods for Eject Card
	public void setEjectCard(EjectCard EC);
	public EjectCard getEjectCard();
		
//	Get and Set methods for storing Pin and Balance
	public void setBalance(int y);
	public void setBalance(float y);
	public int getBalance1();
	public float getBalance2();
	public void setPin1(int x);
	public int getPin1();
	public void setPin2(String x);
	public String getPin2();
	
}
