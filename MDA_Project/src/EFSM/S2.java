package EFSM;

import OP.*;

public class S2 extends State{
	
	OutputProcessor op = new OutputProcessor();
	
	public S2(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	public int get_id()
	{
		return 7;
	}

	public void belowMinBalance()
	{
		op.belowMinBalMsg();
	}
	public void aboveMinBalance()
	{
	}
}
