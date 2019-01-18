<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>

<html>
<head>
	<title>Candidate Registration</title>


</head>
<body>
<h1>
Registration for candidate
</h1>
<form:form action="add" 
	modelAttribute="candidate" method="POST">
<c:if test="${!empty candidate.candidateName}"><br/>
		<form:label path="UserId">
				<spring:message text="UserId"/>
			</form:label>
		<form:input path="UserId" readonly="true" 
			size="10"  disabled="true" />
			<form:hidden path="UserId" />
	 </c:if>  
	<br/>
	<br/>
			<form:label path="candidateName">
				<spring:message text=" candidateName"/>
			</form:label>
	
		 <form:input path="candidateName" />
		 <br/>
<br/>
			<form:label path="FatherName">
				<spring:message text="Father Name"/>
			</form:label>
	
		 <form:input path="FatherName" />
		 <br/>
	<br/>

 <br/>
<br/>
			<form:label path="Gender">
				<spring:message text="Gender"/>
			</form:label>
	
		 <form:input path="Gender" />
		 <br/>
	<br/>
		 <form:label path="phoneNumber">
				<spring:message text="Phone Number" />
			</form:label>
		 <form:input path="phoneNumber" />
		 
		 	  <br/>
	<br/>
		 
<br/>
<br/>
<br/>
	<br/>
			<form:label path="EmailId">
				<spring:message text="candidate email"/>
			</form:label>
	
		 <form:input path="EmailId" />

		<form:label path="newPassword">
				<spring:message text="Password"/>
			</form:label>
		
		 <form:input path="newPassword" type="password" /> 
		 <br/>
<br/>
<form:label path="confirmPassword">
				<spring:message text="Confirm Password"/>
			</form:label>
		
		 <form:input path="confirmPassword" type="password" /> 
		 <br/>
<br/>
<form:label path="aadhaarNumber">
				<spring:message text="Aadhaar Number"/>
			</form:label>
		
		 <form:input path="EducationalDetails" type="number" /> 
		 <br/>
<br/>
<form:label path="confirmPassword">
				<spring:message text="Educational Details"/>
			</form:label>
		
		 <form:input path="EducationalDetails" type="text" /> 
		 <br/>
<br/>
<form:label path="dob">
				<spring:message text="Date of Birth"/>
			</form:label>
		
		 <form:input path="dob" type="date" /> 
		 <br/>
			
			<form:label path="bankDetails.bankName">
				<spring:message text="bankName"/>
			</form:label>
	
		 <form:input path="bankDetails.bankName" />
		
		 	  <br/>
<br/>
			
			<form:label path="bankDetails.bankBranch">
				<spring:message text="bankBranch"/>
			</form:label>
	
		 <form:input path="bankDetails.bankBranch" />
		
		 	  <br/>
	<br/>
			
			<form:label path="bankDetails.bankIFSC">
				<spring:message text="bankIFSC"/>
			</form:label>
	
		 <form:input path="bankDetails.bankIFSC" />
		
		 	  <br/>
	<br/>
			<form:label path="bankDetails.accountNumber" type="number">
				<spring:message text="Account number"/>
			</form:label>
	
		 <form:input path="bankDetails.accountNumber"  />
			 		 	  <br/>
	<br/>
			<form:label path="address.localAddress">
				<spring:message text="Local Adress"/>
			</form:label>
	
		 <form:input path="address.localAddress"  />
		 
			 	  <br/>
	<br/>
			<form:label path="address.city">
				<spring:message text="City"/>
			</form:label>
	
		 <form:input path="address.city"  />
		 	 	  <br/>
	<br/>
			<form:label path="address.state">
				<spring:message text="State"/>
			</form:label>
	
		 <form:input path="address.state"  />
		 
		 	 	 
		 	 	 	  <br/>
	
	<br/>
			
		 
		 <input type="submit" class="button"
					value= "Submit"/>
					</form:form>
<br>
</body>
</html>