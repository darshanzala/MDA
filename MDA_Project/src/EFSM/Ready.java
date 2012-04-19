package EFSM;

import OP.OutputProcessor;

public class Ready extends State{

	OutputProcessor op = new OutputProcessor();
	public Ready(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	
	public int get_id()
	{
		return 2;
	}

	public void deposit()
	{
		System.out.println("Performing Deposit... ");
		op.MakeDeposit();		
	}
	public void withdraw()
	{
		System.out.println("Performing Withdraw... ");
		op.MakeWithdraw();
	}
	public void balance()
    {
		System.out.println("Getting Balance... ");
		op.displayBalance();
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
		System.out.println("Exit from Account... ");
		op.eject_card();
	}
}
