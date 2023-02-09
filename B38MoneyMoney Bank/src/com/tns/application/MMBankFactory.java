package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		SavingAcc MMSaving = null;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		CurrentAcc MMCurrent = null;
		// TODO Auto-generated method stub
		return null;
	}

}