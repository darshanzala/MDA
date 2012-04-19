package EFSM;

import OP.OutputProcessor;

public class S1 extends State{
	OutputProcessor op = new OutputProcessor();
	public S1(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	public int get_id()
	{
		return 3;
	}
	
	public void belowMinBalance()
	{
		op.belowMinBalMsg();
		op.penalty();
	}
	public void aboveMinBalance()
	{
		op.aboveMinBal();		
	}	
}
