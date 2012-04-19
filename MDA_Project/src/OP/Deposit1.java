package OP;

import DataServer.Global;

public class Deposit1 implements Deposit{

	public void makeDeposit() {
		int bal = Global.ds.getBalance1(); 
		int amt = Global.getTempDP1();
		
		bal = bal + amt;
		Global.ds.setBalance(bal);	
	}
}
