package EFSM;

import OP.*;
import Param.*;

public class EFSM {

	private State LS[] = null;
	private State S = null;
	private OutputProcessor op;
	ME v = new ME();
	public EFSM() 
	{
		LS = new State[10];
		LS[0] = new Idle(this, op, IConstants.IDLE_STATE_ID);
		LS[1] = new CheckPin(this, op, IConstants.CHECK_PIN_STATE_ID);
		LS[2] = new Ready(this, op, IConstants.READY_STATE_ID);
		LS[3] = new S1(this, op, IConstants.S1_STATE_ID);
		LS[4] = new Lock(this, op, IConstants.LOCK_STATE_ID);
		LS[5] = new S3(this, op, IConstants.S3_STATE_ID);
		LS[6] = new Overdrawn(this, op, IConstants.OVERDRAWN_STATE_ID);
		LS[7] = new S2(this, op, IConstants.S2_STATE_ID);
		S = LS[ME.id];
	}

	
	public void initialize()
	{}
	
	public void card()
	{
		if(S.get_id()==0)
		{			
			ME.attempts = 0;
			S.card();
			ME.id = 1;
			S = LS[ME.id];			
		}	
	}
	
	public void exit()
	{
		System.out.println("State: " + S.get_id());
		if(S.get_id()==1||S.get_id()==2 || S.get_id()==6)
		{
			S.exit();
			ME.attempts=0;
			ME.id = 0;
			S = LS[ME.id];
		}		
	}
	
	public void incorrectPin(int max)
	{
		if(S.get_id()==1)
		{
				S.incorrectPin(max);	
				S = LS[ME.id = 1];
		}
	}
	
	public void correctPinBelowMin()
	{
		if(S.get_id()==1)
		{
			S.correctPinBelowMin();
			ME.id = 6;
			S = LS[ME.id];
		}		
	}
	
	public void correctPinAboveMin()
	{
		if(S.get_id()==1)
		{
			S.correctPinAboveMin();
			ME.id = 2;
			S = LS[ME.id];
		}
	}	
		
	public void deposit()
	{		
		if(S.get_id()== 2)
		{
			S.deposit();
			ME.id=2;
			S = LS[ME.id];
		}
		if (S.get_id()==6)
		{
			S.deposit();
			ME.id=7;
			S = LS[ME.id];
		 }	
	}
	
	public void withdraw()
	{
	    if(S.get_id()== 2)
	      {	    	
	    	S.withdraw();
	    	ME.id = 3;
			S = LS[ME.id];
	    }
	    if(S.get_id()==6)
	    	S.withdraw();
    }
	
		
	public void belowMinBalance()
	{
		if(S.get_id() == 3 || S.get_id() == 7 || S.get_id()==5)
		{
			S.belowMinBalance();
			ME.id = 6;
			S = LS[ME.id];
		}
	}
	
	public void aboveMinBalance()
	{
		if(S.get_id() == 3 || S.get_id()==7 || S.get_id() == 5)
		{
			S.aboveMinBalance();
			ME.id = 2;
			S = LS[ME.id];
		}
	}
	public void balance()
	{
		if(S.get_id() == 2)
		{
		      S.balance();
		      ME.id = 2;
			  S = LS[ME.id];
		}
		if(S.get_id() == 6)
		{
		      S.balance();
		      ME.id = 6;
			  S = LS[ME.id];
		}
	}
	
	public void correctLock()
	{
		if(S.get_id() == 2)
		{
		      S.correctLock();
		      ME.id = 4;
			  S = LS[ME.id];
		}
		if(S.get_id() == 6)
		{
		      S.correctLock();
		      ME.id = 4;
			  S = LS[ME.id];
		}
	}
	
	public void incorrectLock()
	{
		if(S.get_id() == 2)
		{
		  S.incorrectLock();
	      ME.id = 2;
		  S = LS[ME.id];
		}
		
		if(S.get_id() == 6)
		{
		  S.incorrectLock();
	      ME.id = 6;
		  S = LS[ME.id];
		}	
	}
	
	public void correctUnlock()
	{
		if(S.get_id() == 4)
		{
		  S.correctUnLock();
	      ME.id = 5;
		  S = LS[ME.id];
		}
	}
	
	public void incorrectUnlock()
	{
		if(S.get_id() == 4)
		{
	      ME.id = 4;
		  S = LS[ME.id];
		}
	}
}
