<%@page import="java.util.Arrays"%>
<%@page import="org.apache.tomcat.util.codec.binary.Base64"%>
<%@page import="org.jsp.employee.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> employee = (List<Employee>) request.getAttribute("list");
	%>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Picture</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Gender</th>
			<th>Date of Birth</th>
			<th>Language</th>
			<th>Role</th>
			<th>CTC</th>
			<th>Country</th>
			<th>Delete</th>
		</tr>
		<%
		for (Employee emp : employee) {
		%>
		<tr>
			<th><%=emp.getId()%></th>
			<th><%=emp.getName()%></th>
			<th>
				<%
				String base64 = Base64.encodeBase64String(emp.getPicture());
				%>
				<img height="100px" width="100px" alt="unknown"
				src="data:image/jpeg;base64,<%=base64%>">
			</th>
			<th><%=emp.getEmail()%></th>
			<th><%=emp.getMobile()%></th>
			<th><%=emp.getGender()%></th>
			<th><%=emp.getDob()%></th>
			<th><%=Arrays.toString(emp.getLanguage())%></th>
			<th><%=emp.getRole()%></th>
			<th><%=emp.getCtc()%></th>
			<th><%=emp.getCountry()%></th>
			<th><a href=""><button>Delete</button></a></th>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<a href="/"><button>Back</button></a>
</body>
</html>