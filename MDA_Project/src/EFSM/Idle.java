package EFSM;
import OP.*;

public class Idle extends State{
	OutputProcessor op = new OutputProcessor();
	public Idle(EFSM m, OutputProcessor opp, int id) 
	{
		super(m, opp, id);
	}

	public int get_id()
	{
		return 0;
	}

	public void card() 
	{ 
		System.out.println("Performing Card Operation... ");
		op.store_pin();
		op.store_balance();
	}
}
