package OP;

import DataServer.Global;

public class AboveMinBal1 implements AboveMinBal {
	public void aboveMinBal() {
		Global.ds.setBalance(Global.getTempWD1());
	}
}
