package OP;

import java.io.IOException;

import Driver.driver;

public class Display1 implements Display{

	public void displayMenu(){		
		try {
			driver.menu1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
