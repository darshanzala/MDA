package OP;
import DataServer.*;
public class OutputProcessor {

	public void store_pin()
	{
		Global.ds.getSP().storePin();
	}
	
	public void store_balance()
	{
		Global.ds.getStoreBal().storeBal();
	}
	
	public void prompt_for_pin()
	{
		Global.ds.getPrompt().prompt_for_pin();
	}
	
	public void display_menu() 
	{
		Global.ds.getDisplayMenu().displayMenu();
	}
	
	public void incorrect_pin_msg()
	{
		Global.ds.getICPinMsg().incorrect_pin_msg();
	}
	
	public void too_many_attempts_msg()
	{
		Global.ds.getAttemptMsg().tooManyAttemptMsg();
	}
	public void MakeDeposit()
	{
		Global.ds.get_Deposit().makeDeposit();		
	}
	
	public void MakeWithdraw()
	{
		Global.ds.get_Withdraw().makeWithdraw();
	}
	
	public void belowMinBalMsg()
	{
		Global.ds.getBelowMinBalMsg().belowMinBalMsg();
	}
	public void penalty()
	{
		Global.ds.get_Penalty().penalty();
	}
	
	public void eject_card()
	{
		Global.ds.getEjectCard().ejectCard();
	}
	
	public void incorrectLockMsg()
	{
		Global.ds.getICPinMsg().incorrect_pin_msg();
	}
	
	public void lock()
	{
		Global.ds.get_lock().lock();
	}

	public void unlock()
	{}
	
	public void displayBalance()
	{
		Global.ds.get_balance().displayBal();
	}
	
	public void aboveMinBal()
	{
		Global.ds.getAboveMinBal().aboveMinBal();
	}
}
