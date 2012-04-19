package OP;

import DataServer.Global;

public class Withdraw1 implements Withdraw{

	public void makeWithdraw() {
		int bal = Global.ds.getBalance1(); // b
		int amt = Global.getTempWD1();
		
		Global.setTempWD1(bal-amt);		
	}
}
