package Driver;
import java.io.*;

import ATM.*;
public class driver {

	// Display menu for ATM - 1
	public static void menu1() throws IOException
	{
		ATM1 atm1 = new ATM1();
		char menuChoice;
		System.out.println("\n\n WELCOME TO ATM-1");
		do
		{
		System.out.println("\nPlease select the operation: " +
				"\n\t 1. card(int, int)" +
				"\n\t 2. pin(int)" +
				"\n\t 3. deposit(int)" +
				"\n\t 4. withdraw(int)" +
				"\n\t 5. balance()" +
				"\n\t 6. exit()" +
				"\n\t 7. lock(int)" +
				"\n\t 8. unlock(int)" +
				"\n\t q. Quit the program");
		
		BufferedReader buffStr = new BufferedReader (new InputStreamReader (System.in));
		menuChoice = buffStr.readLine().charAt(0);
		int x, y, p, d, w;
		switch(menuChoice)
		{
		case '1': System.out.println("Operation: card(int, int)");
				System.out.print("\t Balance:");
				x = Integer.parseInt(buffStr.readLine());
				System.out.print("\t Pin:");
				y = Integer.parseInt(buffStr.readLine());
				atm1.card(x, y);
				break;
		case '2': System.out.println("Operation: pin(int)");
				System.out.print("\t Pin:");
				p = Integer.parseInt(buffStr.readLine());
				atm1.pin(p);
				break;
		case '3':System.out.println("Operation: deposit(int)");
				System.out.print("\t Amount:"); 
				d = Integer.parseInt(buffStr.readLine());
				atm1.deposit(d);
				break;
		case '4':System.out.println("Operation: Withdraw(int)");
				System.out.print("\t Amount:"); 
				w = Integer.parseInt(buffStr.readLine());
				atm1.withdraw(w);
				break;		
		case '5':System.out.println("Operation: balance()");
				atm1.balance();
				break;
		case '6':System.out.println("Operation: exit()");
				atm1.exit();
				break;
		case '7':System.out.println("Operation: lock(int)");
				System.out.print("\t Pin:"); 
				p = Integer.parseInt(buffStr.readLine());
				atm1.lock(p);
				break;
		case '8':System.out.println("Operation: unlock(int)");
				System.out.print("\t Pin:"); 
				p = Integer.parseInt(buffStr.readLine());
				atm1.unlock(p);
				break;
		case 'q':System.out.println("Operation: Quit the program");
				atm1.quit();
				break;
		default: System.out.println("INVALID CHOICE");
		}
		}while(menuChoice != 'q');		
	}
	
	// Display menu for ATM - 2
	public static void menu2() throws IOException
	{
		ATM2 atm2 = new ATM2();
		char menuChoice;
		System.out.println("\n\n WELCOME TO ATM-2");
		do
		{
		System.out.println("\nPlease select the operation: " +
				"\n\t 1. CARD(float, String)" +
				"\n\t 2. PIN(String)" +
				"\n\t 3. DEPOSIT(float)" +
				"\n\t 4. WITHDRAW(float)" +
				"\n\t 5. BALANCE()" +
				"\n\t 6. EXIT()" +
				"\n\t q. Quit the program");
		BufferedReader buffStr = new BufferedReader (new InputStreamReader (System.in));
		menuChoice = buffStr.readLine().charAt(0);
		float x, d, w;
		String y, p;
		switch(menuChoice)
		{
		case '1': System.out.println("Operation: card(int, int)");
				System.out.print("\t Balance:");
				x = Float.parseFloat(buffStr.readLine());
				System.out.print("\t Pin:");
				y = buffStr.readLine();
				atm2.CARD(x, y);
				break;
		case '2': System.out.println("Operation: pin(int)");
				System.out.print("\t Pin:");
				p = buffStr.readLine();
				atm2.PIN(p);
				break;
		case '3':System.out.println("Operation: deposit(int)");
				System.out.print("\t Amount:"); 
				d = Float.parseFloat(buffStr.readLine());
				atm2.DEPOSIT(d);
				break;
		case '4':System.out.println("Operation: WITHDRAW(int)");
				System.out.print("\t Amount:"); 
				w = Float.parseFloat(buffStr.readLine());
				atm2.WITHDRAW(w);
				break;		
		case '5':System.out.println("Operation: balance()");
				atm2.BALANCE();
				break;
		case '6':System.out.println("Operation: exit()");
				atm2.EXIT();
				break;
		case 'q':System.out.println("Operation: Quit the program");
				atm2.QUIT();
				break;
		default:System.out.println("INVALID CHOICE");
		}		
		
		}
		while(menuChoice != 'q');
	}
	
	public static void mainMenu() throws IOException
	{
		char accChoice;
		ATM1 atm1 = new ATM1();
		ATM2 atm2 = new ATM2();
		
		System.out.println("\n");
		System.out.println("Please select the choice : "+
				"\n\t 1. ATM-1, "+
				"\n\t 2. ATM-2, "+
				"\n\t 3. Exit"+
				"\n\t Enter Choice:");	
		
		BufferedReader buffStr = new BufferedReader (new InputStreamReader (System.in));
		accChoice = buffStr.readLine().charAt(0);
		
		switch(accChoice)
		{
		case '1': 
				atm1.initialize();
				menu1();
				break;
		case '2': 
				atm2.initialize();
				menu2();
				break;
		case '3':
			default:
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		mainMenu();
		
	}

}
