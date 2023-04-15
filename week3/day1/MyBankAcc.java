package week3.day1;

import week2.day2.ParentClass;

public class MyBankAcc {
public static void main(String[] args) {
//	RBI rbi = new RBI();
//	User can not create an obj for an Interface
//	Creating obj for the implementation class
//	Scope restriction of an object
	RBI bank = new HDFCBank();
	bank.submitKYC();
//	bank.buyCreditCard();
	ChildClass obj = new ChildClass();
	obj.car();
	ParentClass obj1 = new ParentClass();
//	obj1.house();
	
}
}
