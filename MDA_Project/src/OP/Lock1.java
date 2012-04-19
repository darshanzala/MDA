package OP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import DataServer.Global;

public class Lock1 implements Lock {
	int a;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s= new String();
	
	public void disp_menu()
	{
		System.out.println("Enter Pin to unlock:");
		System.out.println("Enter Pin");      
	    try{s=in.readLine();}
	       catch(Exception e){}
	    try{Global.pin = Integer.parseInt(s); }
	        catch(Exception e){}
	}
	
	public void lock()
	{
		System.out.println(" You are in locked state");
	}
}
