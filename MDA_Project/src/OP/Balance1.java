package OP;

import DataServer.Global;

public class Balance1 implements Balance{
	public void displayBal()
	{
		System.out.println("Your balance is "+Global.ds.getBalance1());
	}

}
