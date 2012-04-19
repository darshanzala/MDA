package OP;

import java.io.IOException;

import Driver.driver;

public class Display2 implements Display{

	public void displayMenu(){		
		try {
			driver.menu2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
