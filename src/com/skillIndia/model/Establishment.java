package com.skillIndia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estId;
	
	@Column(unique=true)
	private String userIdEst;
	
	private String estPassword;
	
	private String confirmPwd;
	
	private String estName;
	
	@Column
	@NotEmpty(message = "Phone Number cannot be empty!")
	@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
	private String estContact;
	
	private String estType;
	
	private String regNo;
	
	private int workingDays;
	
	private String domain;
	
	private String appStatus;
	
	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	@Transient
	private List<Candidate> candidateList;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address estAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BankDetails estBankDetails;
	
	
	//private List< Course> courseList;

	//SuperClass Constructor
	public Establishment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	public String getEstContact() {
		return estContact;
	}





	public void setEstContact(String estContact) {
		this.estContact = estContact;
	}





	public List<Candidate> getCandidateList() {
		return candidateList;
	}





	public void setCandidateList(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}





	//getters and setters
	public int getEstId() {
		return estId;
	}

	@Override
	public String toString() {
		return "Establishment [establishmentId=" + estId + ", userIdEst=" + userIdEst
				+ ", establishmentPassword=" + estPassword + ", establishmentName=" + estName
				+ ", estContact=" + estContact + ", estType=" + estType
				+ ", regNo=" + regNo + ", workingDays=" + workingDays + ", domain=" + domain + ", establishmentAddress="
				+ estAddress + ", estBankDetails=" + estBankDetails + ", courseList="
				 + "]";
	}

	//Parameterized Constructor
	
	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getEstPassword() {
		return estPassword;
	}

	public void setEstPassword(String estPassword) {
		this.estPassword = estPassword;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	public String getUserIdEst() {
		return userIdEst;
	}

	public void setUserIdEst(String userIdEst) {
		this.userIdEst= userIdEst;
	}

	public String getEstName() {
		return estName;
	}

	public void setEstName(String estName) {
		this.estName = estName;
	}

	

	public String getEstType() {
		return estType;
	}

	public void setEstType(String estType) {
		this.estType = estType;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Address getEstAddress() {
		return estAddress;
	}

	public void setEstAddress(Address estAddress) {
		this.estAddress = estAddress;
	}

	public BankDetails getEstBankDetails() {
		return estBankDetails;
	}

	public void setEstBankDetails(BankDetails estBankDetails) {
		this.estBankDetails = estBankDetails;
	}

//	public List<Course> getCourseList() {
//		return courseList;
//	}
//
//	public void setCourseList(List<Course> courseList) {
//		this.courseList = courseList;
//	}
//	
}
