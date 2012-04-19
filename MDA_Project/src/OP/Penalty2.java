package OP;

import DataServer.Global;

public class Penalty2 implements Penalty{
	public void penalty()
	{
		float penalty = 100;
		Global.ds.setBalance(Global.ds.getBalance2() - penalty);
		System.out.println("Penalty deducted from your balance");
	}
}
