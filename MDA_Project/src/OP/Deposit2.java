package OP;

import DataServer.Global;

public class Deposit2 implements Deposit {

	public void makeDeposit() {
		
			float bal = Global.ds.getBalance2(); 
			float amt = Global.getTempDeposit2();
			bal = bal + amt;
			Global.ds.setBalance(bal);			
	}
}
