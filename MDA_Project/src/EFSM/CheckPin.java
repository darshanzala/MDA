package EFSM;
import OP.*;
public class CheckPin extends State{
	OutputProcessor op = new OutputProcessor();
	ME v = new ME();
	public CheckPin(EFSM m, OutputProcessor op, int id) 
	{
		super(m, op, id);		
	}

	public void correctPinBelowMin()
	{		
		op.belowMinBalMsg();
	}
	
	public void correctPinAboveMin()
	{					
	}
	
	public void incorrectPin(int max)
	{
		if(ME.attempts<max){
	        op.incorrect_pin_msg();
	        ME.attempts++;
	        op.prompt_for_pin();
	    }
	    else{
	        op.incorrect_pin_msg();
	        op.too_many_attempts_msg();
	        op.eject_card();
	    }
	}
	
	public void exit()
	{
		op.eject_card();
	}
	
	public int get_id()
	{
		return 1;
	}

}
