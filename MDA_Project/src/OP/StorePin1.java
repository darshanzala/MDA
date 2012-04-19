package OP;

import DataServer.Global;

public class StorePin1 implements StorePin{
	
	public void storePin() {
		Global.ds.setPin1(Global.getIPPin1());
	}
}
