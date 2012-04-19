package OP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import DataServer.Global;

public class Prompt2 implements Prompt{

	int a;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s= new String();
		
	public void prompt_for_pin()
	    {
		    System.out.println("Enter Pin");      
	        try{s=in.readLine();}
	        catch(Exception e){}
	        try{Global.k1 = s; }
	        catch(Exception e){}
        }
}
