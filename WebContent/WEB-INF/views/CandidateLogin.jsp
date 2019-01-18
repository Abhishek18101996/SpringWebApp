<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>

<html>
<head>
	<title>Candidate Login</title>


</head>
<body>
<h1>
Login for candidate.
</h1>
<form:form action="candidateloginprocess" 
	modelAttribute="candidate" method="POST">
	
	<form:label path="EmailId">
				<spring:message text=" Enter Email"/>
			</form:label>
	
		 <form:input path="EmailId" />
		 <br/>
	<br/>
		 <form:label path="newPassword" >
				<spring:message text="Enter Password" />
			</form:label>
		 <form:input path="newPassword" type="password" />
		 
		 	  <br/>
	<br/>
	<input type="submit" class="button"
					value= "Submit"/>
	
	</form:form>
<br>
	</body>
</html>