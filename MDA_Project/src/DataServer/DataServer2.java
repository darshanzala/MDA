package DataServer;

import OP.AboveMinBal;
import OP.Balance;
import OP.BelowMinBalMsg;
import OP.Deposit;
import OP.Display;
import OP.EjectCard;
import OP.ICPinMsg;
import OP.Lock;
import OP.Penalty;
import OP.Prompt;
import OP.StoreBal;
import OP.StorePin;
import OP.TooManyAttemptMsg;
import OP.Withdraw;

public class DataServer2 implements DataServer{

	private float b = 0; // Balance
	private String p = ""; // Pin
	private float d = 0; // Deposit
	private float w = 0; // Withdraw
	private int maxAttempt = 2; // Maximum number of pin attempt
	private int minBalance = 100; // Minimum bank balance
	private float penalty = 2; 	// Panelty amount on less than minimum balance
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
	//private Unlock UL;
	
	// Get Pin
	public String getPin2()
	{
		return p;
	}
	// Set Pin
	public void setPin2(String pin)
	{
		this.p = pin;
	}
	// Get Balance
	public float getBalance2()
	{
		return b;
	}
	public int getBalance1()
	{
		return 0;
	}
	// Set balance
	public void setBalance(float bal)
	{
		this.b = bal;
	}
	// Get deposit amount
	public float getDeposit()
	{
		return this.d;
	}
	// Set deposit amount
	public void setDeposit(float amt)
	{
		this.d = amt;
	}
	// Get withdraw amount
	public float getWithdraw()
	{
		return this.w;
	}
	// Set withdraw amount
	public void setWithdraw(float amt)
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
	public float getPenalty()
	{
		return this.penalty;
	}
	// Set Penalty amount
	public void setPenalty(float amt)
	{
		this.penalty = amt;
	}
	
	public void setSP(StorePin p)
	{
		this.sp = p;
	}
	
	public StorePin getSP()
	{
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
	public void setExit(EjectCard e)
	{
		this.ej = e;
	}
	public EjectCard getExit()
	{
	return this.ej;	
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
	public void set_lock(Lock L)
	{
		this.LL = L;
	}
	public Lock get_lock()
	{
		return this.LL;
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

	
	public void setBalance(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPin1(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getPin1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
