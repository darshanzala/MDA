package OP;

import DataServer.Global;

public class StorePin2 implements StorePin{

	public void storePin() {
		Global.ds.setPin2(Global.getIPPin2());		
	}

}
