package EFSM;

import OP.*;

public class State {

	
	EFSM m = null;
	OutputProcessor op = null;
	int id;
	public State(EFSM m, OutputProcessor op, int id)
	{
		this.m = m;
		this.op = op;
		this.id = id;		
	}
	public int get_id()
	{
		return id;
	}
	
	public void set_id(int id)
	{
		this.id= id;
	}
	
	public void initialize()
	{
		
	}
	
	public void card()
	{};
	
	public void exit()
	{
		
	}
	public void incorrectPin(int max)
	{
		
	}
	
	public void correctPinBelowMin()
	{
		
	}
	
	public void correctPinAboveMin()
	{
		
	}
	
	public void deposit()
	{
		
	}
	public void withdraw()
	{
		
	}
	
	public void belowMinBalance()
	{
		
	}
	public void aboveMinBalance()
	{
		
	}
	public void balance()
	{
		
	}
	public void correctLock()
	{
		
	}
	public void incorrectLock()
	{
		
	}
	public void correctUnlock()
	{
		
	}
	public void incorrectUnlock()
	{
		
	}
	public void correctUnLock() {
		
		
	}
	public void incorrectUnLock() {
		
		
	}
}
