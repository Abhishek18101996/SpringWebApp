package com.skillIndia.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Candidate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	private String candidateName;//Name of the Candidate
	private String FatherName;//Candidate father name
	//private String address;//XCandidate's Address
	private String Gender;//gender of the user
	private String EmailId;//Candidate's EmailId
	@Column
	@NotEmpty(message = "Phone Number cannot be empty!")
	@Size(max=10, min=10, message="Phone Number Should be 10 number long" )
	private String phoneNumber;
	private String aadhaarNumber;//Aadhaar reference of the candidate
	private String EducationalDetails;//Qualification of the candidate
	private String newPassword;
	private String confirmPassword;
	private Date dob;//Candidate's DOB
	private String requestStatus;//Status of Candidate
	
	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private BankDetails bankDetails;
	
	@ManyToOne
	@JoinColumn(name="estId")
	private Establishment establishment;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Course course;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	
	public BankDetails getBankDetails() {
		return bankDetails;
	}


	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}


	public int getUserId() {
		return UserId;
	}


	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	//SuperClass Constructor
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	
	
	
	
	
	
	
	
	
	
	
	

	
	//To String
	
	
	
	
	
	

	

	

	public String getFatherName() {
		return FatherName;
	}


	


	

	@Override
	public String toString() {
		return "Candidate [UserId=" + UserId + ", candidateName=" + candidateName + ", FatherName=" + FatherName
				+ ", Gender=" + Gender + ", EmailId=" + EmailId + ", phoneNumber=" + phoneNumber + ", aadhaarNumber="
				+ aadhaarNumber + ", EducationalDetails=" + EducationalDetails + ", newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + ", dob=" + dob + ", requestStatus=" + requestStatus
				+ ", bankDetails=" + bankDetails + ", establishment=" + establishment + ", address=" + address
				+ ", course=" + course + "]";
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	//Getters and Setters
	public String getCandidateName() {
		return candidateName;
	}
	

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getEducationalDetails() {
		return EducationalDetails;
	}
	public void setEducationalDetails(String educationalDetails) {
		EducationalDetails = educationalDetails;
	}
	
}
