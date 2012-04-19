package OP;

import DataServer.Global;

public class AboveMinBal2 implements AboveMinBal {
	public void aboveMinBal() {
		Global.ds.setBalance(Global.getTempWithdraw2());
	}
}