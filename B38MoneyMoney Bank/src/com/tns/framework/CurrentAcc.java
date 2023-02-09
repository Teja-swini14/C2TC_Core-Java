package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	public abstract float getwithdraw();
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit  = creditLimit;
		
		// TODO Auto-generated constructor stub
		
	}
	 public float getCreditLimit() {
		 return creditLimit;
		 
	 }
	 public void withdraw(float accBal) {
		 System.out.println("your amount is withdrawn, the account balance is"+accBal);
		 
	 }

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getwithdraw()=" + getwithdraw() + ", getCreditLimit()="
				+ getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	 
	 

}
