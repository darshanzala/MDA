package Param;

import OP.*;

public class FactoryATM1 implements AbstractFactory{
	public Prompt createPrompt(){
        return new Prompt1();
    }
	public ICPinMsg createICPinMsg(){
        return new ICPinMsg();
    }
	
	public Display createDisplay() {
		return new Display1();
	}
	
	public TooManyAttemptMsg createTooManyAttemptMsg() {
		return new TooManyAttemptMsg();
	}
	
	public Deposit createDeposit() {
		return new Deposit1();
	}
	
	public Withdraw createWithdraw() {
		return new Withdraw1();
	}
	
	public Penalty createPenalty() {
		return new Penalty1();
	}
	
	 public BelowMinBalMsg createBelowMinBalMsg() {
		return new BelowMinBalMsg();
	}
	
	public StoreBal createStoreBal() {
		return new StoreBal1();
	}

	public EjectCard createEjectCard() {
		return new EjectCard1();
	}
	
	public StorePin createStorePin() {
		return new StorePin1();
	}
	
	public Lock createLock(){
		return new Lock1();
	}
	
	public Unlock createUnlock(){
		return new Unlock();
	}
	
	public Balance createBalance() {	
		return new Balance1();
	}
	
	public AboveMinBal createAboveMinBal() {
		return new AboveMinBal1();
	}
}
