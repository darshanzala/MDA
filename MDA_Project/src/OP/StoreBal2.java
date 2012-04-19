package OP;

import DataServer.Global;

public class StoreBal2 implements StoreBal{

	public void storeBal() 
	{
		Global.ds.setBalance(Global.getIPBal2());
		System.out.println(" New Balance = " + Global.ds.getBalance2());	
	}
}
