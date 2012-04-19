package OP;

import DataServer.Global;

public class StoreBal1 implements StoreBal{

	public void storeBal() 
	{
		Global.ds.setBalance(Global.getIPBal1());
		System.out.println(" New Balance = " + Global.ds.getBalance1());	
	}
}
