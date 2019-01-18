<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true"%>

<html>
<head>
	<title>Add a Course</title>


</head>
<body>
<%=session.getAttribute("establishmentId") %>
<%=session.getAttribute("establishmentName") %>
<h1>
Add a Course
</h1>
<form:form action="addingcourse" 
	modelAttribute="course" method="POST">
	<c:if test="${!empty course.courseName}"><br/>
		<form:label path="courseId">
				<spring:message text="Crop ID"/>
			</form:label>
		<form:input path="courseId" readonly="true" 
			size="10"  disabled="true" />
			<form:hidden path="courseId" />
			</c:if>
			<form:label path="courseId">
				<spring:message text=" Course ID"/>
			</form:label>
	
		 <form:input path="courseId" />
		 <br/>
	<br/>
	<form:label path="courseName">
				<spring:message text="Course Name"/>
			</form:label>
	
		 <form:input path="courseName" />
		 <br/>
	<br/>
		 <form:label path="courseDescription" >
				<spring:message text="Course Description" />
			</form:label>
		 <form:input path="courseDescription" />	 
		 	  <br/>
	<br/>
	
	 <form:label path="courseDuration" >
				<spring:message text="Course Duration" />
			</form:label>
			<form:input path="courseDuration" type="number"/>	 
			 <br/>
	<br/>
	
	<form:label path="establishmentId" >
				<spring:message text="Establishment Id" />
			</form:label>
			<form:input path="establishmentId" type="number"/>	 
			 <br/>
	<br/>
	
	<input type="submit" class="button"
					value= "Submit"/>
	
	</form:form>
<br>
	</body>
</html>