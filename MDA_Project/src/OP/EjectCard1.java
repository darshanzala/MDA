package OP;

import DataServer.Global;

public class EjectCard1 implements EjectCard{

	public void ejectCard() {
		Global.ds.setBalance(0);
		Global.ds.setPin1(0);
	}
}
