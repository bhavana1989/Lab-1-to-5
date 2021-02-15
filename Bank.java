package exercise1;
class Person{
	protected String name;
	protected float age;
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
		
	}
	
}

class Account{
	
	private static int count=0;
	
	protected long accNum=1000000000;
	{
		count++;
		accNum+=count;
	}
	
	public Account(){
		
	}
	
	protected double balance;
	protected Person accHolder=new Person();
	
	public Account(double initialBalance, String name, int age) {
		this.balance=initialBalance;
		this.accHolder.setName(name);
		this.accHolder.setAge(age);
		
	}
	
	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		
		return balance;
	}
	
	public void deposit(double cash) {
		if(balance+cash<500) {
			System.out.println("Your Account has balance is less than Rs.500. Please add minimum Rs."+(500-this.balance));
			
		}
		else {
			
			this.balance+=cash;
			System.out.println("Rs."+cash+" has been succesfully credited into your account.");
			
		}
	}
	
	public boolean withdraw(double withdraw) {
		if(this.balance-withdraw<500) {
			System.out.println("Please keep minimum balance of 500 rupees in your account.");
			System.out.println("You can withdraw maximum amount of Rs."+(500-balance));
			return false;
		}
		else {
			balance-=withdraw;
			System.out.println("Rs."+withdraw+" from your account succesfully");
			return true;
			
		}
	}
}


class SavingsAccount extends Account{
	
	final double minimumBalance=500;
	
	public boolean withdraw(double withdraw) {
		if(super.balance-withdraw>minimumBalance) {
			balance-=withdraw;
			return true;
		}
		else
			System.out.println("You cannot withdraw Rs."+withdraw+" from your account");
		return false;
	}
	
}

class CurrentAccount extends Account{
	public double overdraftLimit=500;
	@Override
	public boolean withdraw(double withdraw) {
		if (super.balance-withdraw>overdraftLimit) {
			return true;
		}
		else return false;
	}
}

public class Bank {
	

	public static void main(String[] args) {
		Account smith=new Account(2000,"Smith",32);
		Account kathy=new Account(3000,"Kathy",24);
		smith.deposit(2000);
		kathy.withdraw(2000);
		System.out.println("Balance in Smith's account is Rs."+smith.getBalance());
		System.out.println("Balance in Kathy's account is Rs."+kathy.getBalance());
		System.out.println(smith.getAccNum());
		System.out.println(kathy.getAccNum());
		

	}

}
