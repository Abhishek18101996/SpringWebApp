<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>

<html>
<head>
	<title>Establishment Login</title>


</head>
<body>
<h1>
Login for Establishment.
</h1>
<form:form action="establishmentloginprocess" 
	modelAttribute="establishment" method="POST">
	
	<form:label path="userIdEst">
				<spring:message text=" Enter Email"/>
			</form:label>
	
		 <form:input path="userIdEst" />
		 <br/>
	<br/>
		 <form:label path="estPassword" >
				<spring:message text="Enter Password" />
			</form:label>
		 <form:input path="estPassword" type="password" />
		 
		 	  <br/>
	<br/>
	<input type="submit" class="button"
					value= "Submit"/>
	
	</form:form>
<br>
	</body>
</html>