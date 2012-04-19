package EFSM;

import OP.OutputProcessor;

public class Overdrawn extends State{

	OutputProcessor op = new OutputProcessor();
	public Overdrawn(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	
	public int get_id()
	{
		return 6;
	}
	
	public void balance()
    {
		System.out.println("Getting Balance... ");
		op.displayBalance();
    }
	
	public void deposit()
	{
		System.out.println("Making Deposit... ");
		op.MakeDeposit();		
	}
	
	public void withdraw()
	{
		System.out.println("Balance is below minimum, you cannot perform withdraw... ");
	}
	public void correctLock()
	{
		System.out.println("Locking your account... ");
		op.lock();
	}
	
	public void incorrectLock()
	{
		op.incorrectLockMsg();
	}
		
	public void exit()
	{
		System.out.println("Exit from your account... ");
		op.eject_card();
	}
}
