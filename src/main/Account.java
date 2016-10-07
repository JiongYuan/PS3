package main;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualinterestRate;
	private Date detaCreated;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualinterestRate = 0;
		this.dateCreated = new Date();
		}
	
	public Account(int newid, double newbalance){
		this.id = newid;
		this.balance = newbalance;
		this.annualinterestRate = 0;
		this.dateCreated = new Date();
		}
	
	public int getId(){
		return id;
		}
	
	public void setId(int id){
		this.id = id;
		}
	
	public double getBalance(){
		return balance;
		}
	
	public void setBalance(double balance) {
		this.balance = balance;
		}
	
	public double getAnnualinterestRate() {
		return annualinterestRate;
		}
	
	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
		}
	
	public Date getDateCreated(){
		return detaCreated;
		}
	
	public double getMonthlyInterestRate(){
		return annualinterestRate/12;
		}
	
	public double withdraw(double total) throws Exception {
	    if (total > this.balance) {
	    	 throw new Exception("Insufficient Funds");
	    	 }
	      return balance -= total;
	      }
	
	public double deposit(double total){
		return balance +=total;
		}
}