<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.test.bean.EmpDetails"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.ListIterator"%>

<%
ArrayList<EmpDetails> arrEmpDetails = null;
if (null != request.getAttribute("arrEmpDetails")) {
	arrEmpDetails = (ArrayList<EmpDetails>) request.getAttribute("arrEmpDetails");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp details:</title>
</head>
<body>
	<b>Employee Details::</b>

<script type="text/javascript">

function getEmpAllDetails(empId){
	alert(empId);
}

</script>

<form name="idEmpDetails">
	<table>
		<tr>
			<th>EmpId</th>
			<th>EmpName</th>
			<th>DeptName:</th>
			<th>EmpQual:</th>
			<th>Status:</th>
			<th>Salary:</th>
		</tr>
		<%
		if (null != arrEmpDetails) {
			for (EmpDetails e : arrEmpDetails) {
		%>
		<tr>
			<td><%=e.getEmpId()%></td>
			<td><%=e.getEmpPersonalDetails().getFirstName()%> <%=e.getEmpPersonalDetails().getLastName()%></td>
			<td><a href="#" onclick=""><%=e.getEmpDeptDetails().getDeptName()%></a></td>
			<td><%=e.getEmpDetails().getEmpQual()%></td>
			<td><%=e.getEmpDetails().getStatus()%></td>
			<td><a href="#" onclick=""><%=e.getEmpSalaryDetails().getTotal()%></a></td>
		</tr>
		<%}
	}%>

	</table>
	</form>
</body>
</html>