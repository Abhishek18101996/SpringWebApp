<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>

<html>
<head>
	<title>Establishment Registration</title>


</head>
<body>
<h1>
Registration for establishment
</h1>
<form:form action="adde" 
	modelAttribute="establishment" method="POST">
<c:if test="${!empty establishment.estName}"><br/>
		<form:label path="estId">
				<spring:message text="estId"/>
			</form:label>
		<form:input path="estId" readonly="true" 
			size="10"  disabled="true" />
			<form:hidden path="estId" />
	 </c:if>  
	<br/>
	<br/>
			<form:label path="estName">
				<spring:message text="Establishment Name"/>
			</form:label>
	
		 <form:input path="estName" />
		 <br/>
<br/>
			<form:label path="estType">
				<spring:message text="Establishment Type"/>
			</form:label>
	
		 <form:input path="estType" />
		 <br/>
	<br/>

 <br/>
<br/>
			<form:label path="regNo">
				<spring:message text="Registration No."/>
			</form:label>
	
		 <form:input path="regNo" type="number"/>
		 <br/>
	<br/>
		 <form:label path="estContact">
				<spring:message text="Establishment Contact Number" />
			</form:label>
		 <form:input path="estContact" />
		 
		 	  <br/>
	<br/>
		 
<br/>
<br/>
<br/>
	<br/>
			<form:label path="userIdEst">
				<spring:message text="EmailId"/>
			</form:label>
	
		 <form:input path="userIdEst" />

		<form:label path="estPassword">
				<spring:message text="Password"/>
			</form:label>
		
		 <form:input path="estPassword" type="password" /> 
		 <br/>
<br/>
<form:label path="confirmPwd">
				<spring:message text="Confirm Password"/>
			</form:label>
		
		 <form:input path="confirmPwd" type="password" /> 
		 <br/>
<br/>
<form:label path="workingDays">
				<spring:message text="Working days in a week"/>
			</form:label>
		
		 <form:input path="workingDays" type="number" /> 
		 <br/>
<br/>
<form:label path="domain">
				<spring:message text="Domain"/>
			</form:label>
		
		 <form:input path="domain" type="text" /> 
		 <br/>
<br/>
		 <br/>
			
			<form:label path="estBankDetails.bankName">
				<spring:message text="bankName"/>
			</form:label>
	
		 <form:input path="estBankDetails.bankName" />
		
		 	  <br/>
<br/>
			
			<form:label path="estBankDetails.bankBranch">
				<spring:message text="bankBranch"/>
			</form:label>
	
		 <form:input path="estBankDetails.bankBranch" />
		
		 	  <br/>
	<br/>
			
			<form:label path="estBankDetails.bankIFSC">
				<spring:message text="bankIFSC"/>
			</form:label>
	
		 <form:input path="estBankDetails.bankIFSC" />
		
		 	  <br/>
	<br/>
			<form:label path="estBankDetails.accountNumber" type="number">
				<spring:message text="Account number"/>
			</form:label>
	
		 <form:input path="estBankDetails.accountNumber"  />
			 		 	  <br/>
	<br/>
			<form:label path="estAddress.localAddress">
				<spring:message text="Local Adress"/>
			</form:label>
	
		 <form:input path="estAddress.localAddress"  />
		 
			 	  <br/>
	<br/>
			<form:label path="estAddress.city">
				<spring:message text="City"/>
			</form:label>
	
		 <form:input path="estAddress.city"  />
		 	 	  <br/>
	<br/>
			<form:label path="estAddress.state">
				<spring:message text="State"/>
			</form:label>
	
		 <form:input path="estAddress.state"  />
		 
		 	 	 
		 	 	 	  <br/>
	
	<br/>
			
		 
		 <input type="submit" class="button"
					value= "Submit"/>
					</form:form>
<br>
</body>
</html>