<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
<c:if test="${!empty CandidateList}">
	<table class="tg" border="1">
	<tr>
		<th width="50">Candidate ID</th>
		<th width="50">Candidate Name</th>
		<th width="50">Candidate Status</th>
		<th width="50">Status Reply</th>
	</tr>
	<c:forEach items="${CandidateList}" var="candidate">
		<tr>
			<td>${candidate.userId}</td>
			<td>${candidate.candidateName}</td>
			<td>${candidate.requestStatus}</td>
			<td><a href="
			<c:url value='/accept/${candidate.userId}' />" >Accept</a></td>
			<td><a href="
			<c:url value='/reject/${candidate.userId}'/>" >Reject</a>
			</td>									
		</tr>
		</c:forEach>
	</table>
</c:if>
<br>
<br>
<c:if test="${!empty candidateList}">
	<table class="tg" border="1">
	<tr>
		<th width="50">Course ID</th>
		<th width="50">Course ID</th>
		<th width="50">Course Name</th>
		<th width="50">Course Type</th>
		<th width="50">Fertilizer Type</th>
		<th width="50">Quantity</th>
		<th width="50">Base Amount</th>
		<th width="50">Ph Certificate</th>
		<th width="50">Request Status</th>
	</tr>
	<c:forEach items="${Croplist}" var="crop">
		<tr>
			<td>${crop.cropId}</td>
			<td>${crop.farmerId}</td>
			<td>${crop.cropName}</td>
			<td>${crop.cropType}</td>
			<td>${crop.fertilizerType}</td>
			<td>${crop.quantity}</td>
			<td>${crop.baseAmount}</td>
			<td>${crop.phCertificate}</td>
			<td>${crop.requestStatus}</td>	
			<td><a href="
			<c:url value='/accept/${crop.cropId}' />" >Accept</a></td>
			<td><a href="
			<c:url value='/reject/${crop.cropId}'/>" >Reject</a>
			</td>									
		</tr>
		</c:forEach>
	</table>
</c:if>
<br>
<br>
<a href="adminsignout">Signout</a>
</body>
</html>