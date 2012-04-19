package OP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import DataServer.*;

public class Prompt1 implements Prompt {

	int a;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s= new String();
		
		public void prompt_for_pin()
		    {
		        System.out.println("Enter Pin :");  
		        
		        try{s=in.readLine();}
		        catch(Exception e){}
		        
		        try{Global.k = Integer.parseInt(s); }
		        catch(Exception e){}   
	        }
}
