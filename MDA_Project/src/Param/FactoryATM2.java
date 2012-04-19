package Param;

import OP.*;

public class FactoryATM2 implements AbstractFactory{

	public Prompt createPrompt(){
        return new Prompt2();
    }
	
	public ICPinMsg createICPinMsg(){
        return new ICPinMsg();
    }
	
	public Lock createLock(){
		return null;
	}
	
	public Display createDisplay() {
		return new Display2();
	}
	
	public TooManyAttemptMsg createTooManyAttemptMsg() {
		return new TooManyAttemptMsg();
	}
	
	public Deposit createDeposit() {
		return new Deposit2();
	}
	
	public Withdraw createWithdraw() {
		return new Withdraw2();
	}
	
	public Penalty createPenalty() {
		return new Penalty2();
	}
	
	public BelowMinBalMsg createBelowMinBalMsg() {
		return new BelowMinBalMsg();
	}
	
	public StoreBal createStoreBal() {
		return new StoreBal2();
	}
	
	public EjectCard createEjectCard() {
		return new EjectCard2();
	}
	
	public StorePin createStorePin() {
		return new StorePin2();
	}

	public Balance createBalance() {		
		return new Balance2();
	}
	
	public AboveMinBal createAboveMinBal() {
		return new AboveMinBal2();
	}
}
