package EFSM;

import OP.OutputProcessor;

public class Lock extends State {
	OutputProcessor op = new OutputProcessor();
	
	public Lock(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	
	public int get_id()
	{
		return 4;
	}

	public void correctUnLock()
	{	
		System.out.println("Unlocking your account... ");
	}
	
	public void incorrectUnLock()
	{
		op.prompt_for_pin();
	}
			
}

