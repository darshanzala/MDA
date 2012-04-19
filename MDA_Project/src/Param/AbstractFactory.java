package Param;
import OP.*;

public interface AbstractFactory
{
   public Prompt createPrompt();
	
   public ICPinMsg createICPinMsg();
	
   public Display createDisplay();
	
   public TooManyAttemptMsg createTooManyAttemptMsg();
	    
   public Deposit createDeposit();
	    
   public Withdraw createWithdraw();
	    
   public Penalty createPenalty();
	    
   public BelowMinBalMsg createBelowMinBalMsg();

   public StoreBal createStoreBal();
	
   public EjectCard createEjectCard();
	
   public StorePin createStorePin();	 
   
   public Balance createBalance();

   public Lock createLock();
   
   public AboveMinBal createAboveMinBal();
}
