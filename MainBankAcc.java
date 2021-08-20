package com.Exam_aug20;

public class MainBankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc ss = new SavingsAcc();
		CurrentAcc cc = new CurrentAcc();
		ss.checkBankBalance();
		ss.validUser();
		cc.checkBankBalance();
		cc.validUser();
	}

}
