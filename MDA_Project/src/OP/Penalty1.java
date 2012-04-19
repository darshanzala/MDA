package OP;
import DataServer.Global;

public class Penalty1 implements Penalty
{
	public void penalty()
	{
		int penalty = 10;
		Global.ds.setBalance(Global.ds.getBalance1() - penalty);
		System.out.println("Penalty deducted from your balance");
	}
}

