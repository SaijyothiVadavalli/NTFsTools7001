package com.nt.nb;

public class NetBankingService {
public String transforMoney(long srcAccount,long destAccount,String ifscCode,double amount) {
	return amount+"is transfering from "+srcAccount+"to"+destAccount;
	
}
}
