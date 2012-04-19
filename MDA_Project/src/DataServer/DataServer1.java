package DataServer;

import OP.*;

public class DataServer1 implements DataServer{

	private int b = 0; 				// Balance
	private int p = 0; 				// Pin
	private int d = 0; 				// Deposit
	private int w = 0; 				// Withdraw
	private int maxAttempt = 2; 	// Maximum number of pin attempt
	private int minBalance = 100; 	// Minimum bank balance
	private int penalty = 10; 		// Penalty amount on less than minimum balance
	private StorePin sp;			
	private Display dm;
	private Prompt pm;
	private StoreBal sb;
	private EjectCard ej;
	private ICPinMsg ipm;
	private TooManyAttemptMsg tmam;
	private BelowMinBalMsg bmbm;
	private Withdraw wt;
	private Deposit dp;
	private Penalty pp;
	private Balance BB;
	private Lock LL;
	private AboveMinBal abm;
	private EjectCard ec;
	
	public void setPin1(int x) {
		this.p = x;
	}

	public int getPin1() {
		return this.p;
	}
	
	public void setBalance(int y) {
		this.b = y;
	}
	
	public void setBalance(float y) {}
	
	public int getBalance1() {
		return b;
	}

	public float getBalance2() {
		return 0;
	}
	
	public void setSP(StorePin p){
		this.sp = p;
	}
	
	public StorePin getSP(){
		return this.sp;
	}
	
	public void setStoreBal(StoreBal b)
	{
		this.sb = b;
	}
	
	public StoreBal getStoreBal()
	{
		return this.sb;
	}
	
	public void setPrompt(Prompt p) {
		this.pm = p;
	}
	
	public Prompt getPrompt() {
		return this.pm;
	}
	
	public void setDisplayMenu(Display d)
	{
		this.dm = d;
	}
	
	public Display getDisplayMenu()
	{		
		return this.dm;
	}

	public void setICPinMsg(ICPinMsg IPM) {
		this.ipm = IPM;
	}

	public ICPinMsg getICPinMsg() {
		return this.ipm;
	}
	
	public void setAttemptMsg(TooManyAttemptMsg TMAM) {
		this.tmam = TMAM;
	}

	public TooManyAttemptMsg getAttemptMsg() {
		return this.tmam;
	}
	
	public void setBelowMinBalMsg(BelowMinBalMsg BMBM) {
		this.bmbm = BMBM;		
	}

	public BelowMinBalMsg getBelowMinBalMsg() {
		return this.bmbm;
	}
	
	public void set_Deposit(Deposit D) {
		this.dp = D;
	}

	public Deposit get_Deposit() {
		return this.dp;
	}
	
	public void set_Withdraw(Withdraw W) {
		this.wt = W;
	}
	
	public Withdraw get_Withdraw() {
		return this.wt;
	}

	public void set_Penalty(Penalty P)
	{
		this.pp = P;
	}
	public Penalty get_Penalty()
	{
		return this.pp;
	}
	
	public void set_balance(Balance B)
	{
		this.BB = B;
	}
	public Balance get_balance()
	{
		return this.BB;
	}
	

	// Get deposit amount
	public int getDeposit()
	{
		return this.d;
	}
	// Set deposit amount
	public void setDeposit(int amt)
	{
		this.d = amt;
	}
	// Get withdraw amount
	public int getWithdraw()
	{
		return this.w;
	}
	// Set withdraw amount
	public void setWithdraw(int amt)
	{
		this.w = amt;
	}
	
	// Get Maximum attempt
	public int getMaxAttempt()
	{
		return this.maxAttempt;
	}
	// Set withdraw amount
	public void setMaxAttempt(int a)
	{
		this.maxAttempt = a;
	}
	// Get Minimum balance amount
	public int getMinBalance()
	{
		return this.minBalance;
	}
	// Set Minimum balance amount
	public void setMinBalance(int amt)
	{
		this.minBalance = amt;
	}
	// Get Penalty amount
	public int getPenalty()
	{
		return this.penalty;
	}
	// Set Penalty amount
	public void setPenalty(int amt)
	{
		this.penalty = amt;
	}
	
	public void setExit(EjectCard e)
	{
		this.ej = e;
	}
	public EjectCard getExit()
	{
	return this.ej;	
	}
	
	public void set_lock(Lock L)
	{
		this.LL = L;
	}
	public Lock get_lock()
	{
		return this.LL;
	}
	
	@Override
	public String getPin2() {
		return null;
	}

	@Override
	public void setPin2(String x) {
		
	}

	@Override
	public void setAboveMinBal(AboveMinBal AMB) {
		this.abm = AMB;
	}

	@Override
	public AboveMinBal getAboveMinBal() {
		return this.abm;
	}

	public void setEjectCard(EjectCard EC) {
		this.ec = EC;
	}

	public EjectCard getEjectCard() {
		return this.ec;
	}
}
