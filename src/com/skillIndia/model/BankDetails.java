package com.skillIndia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//The class is used to store the bank details of different user
@Entity
public class BankDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	//declaration
	@Id
	@Column(name="Bank_Name",unique=false)
	private String bankName;//Bank-Name
	private String bankBranch;//Bank-Branch
	private String bankIFSC;//IFSC code of the bank
	private String accountNumber;//Account Number of the user
	
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", bankBranch=" + bankBranch + ", bankIFSC=" + bankIFSC
				+ ", accountNumber=" + accountNumber + "]";
	}

	//parameterized constructor
	public BankDetails(String bankName, String bankBranch, String bankIFSC, String accountNumber) {
		super();
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.bankIFSC = bankIFSC;
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}	
	
}
