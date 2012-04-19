package DataServer;

public class Global {
    public static DataServer ds = null;
    
    private static int tempPin1;
    private static int tempBal1;
    private static String tempPin2;
    private static float tempBal2;
    private static int tempD1;
    private static float tempD2;
    private static int tempW1;
    private static float tempW2;
    
    public static int k;
    public static int pin;
    public static String k1;
    // ATM 1
    public static void setIPPin1(int p){	tempPin1 = p;}
	
	public static int getIPPin1() {return tempPin1;}

	public static void setIPBal1(int b){	tempBal1 = b;}
	
	public static int getIPBal1(){return tempBal1;}
	
	public static void setTempDP1(int d){tempD1 = d;}
	
	public static int getTempDP1(){return tempD1;}
	
	public static void setTempWD1(int w){tempW1 = w;}
	
	public static int getTempWD1(){return tempW1;}
	
	// ATM 2
    public static void setIPPin2(String p){	tempPin2 = p;}
	
	public static String getIPPin2() {return tempPin2;}

	public static void setIPBal2(float b){	tempBal2 = b;}
	
	public static float getIPBal2(){return tempBal2;}
	
	public static void setTempDeposit2(float d){tempD2 = d;}
	
	public static float getTempDeposit2(){return tempD2;}
	
	public static void setTempWithdraw2(float w){tempW2 = w;}
	
	public static float getTempWithdraw2(){return tempW2;}	

}

