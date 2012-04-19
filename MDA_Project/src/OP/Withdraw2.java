package OP;

import DataServer.Global;

public class Withdraw2 implements Withdraw{

	public void makeWithdraw() {
		
				float bal = Global.ds.getBalance2(); // b
				float amt = Global.getTempWithdraw2();
			
				Global.setTempWithdraw2(bal-amt);
			}
		}
