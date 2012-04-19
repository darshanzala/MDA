package EFSM;

import OP.OutputProcessor;

public class S3 extends State{
	
	OutputProcessor op = new OutputProcessor();
	
	public S3(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);
	}
	
	public int get_id()
	{
		return 5;
	}

	public void aboveMinBalance()
	{
	}
     
	public void belowMinBalance()
	{
		op.belowMinBalMsg();
	}
}
