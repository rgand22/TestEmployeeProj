<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.test.bean.EmpAll"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.ListIterator"%>

<%
ArrayList<EmpAll> arrEmpAll = null;
if (null != request.getAttribute("arrEmpAll")) {
	arrEmpAll = (ArrayList) request.getAttribute("arrEmpAll");
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

function getEmpDetails(empId){
	var url = '<%=request.getContextPath()%>'+'/EmpDetailsServlet.do?empId='+empId;
	alert(url);
	//this.location = url;
	window.open(url);
}

</script>

<form name="idEmpAll">
	<table>
		<tr>
			<th>EmpId</th>
			<th>DeptId:</th>
			<th>EmpQual:</th>
			<th>Status:</th>
		</tr>
		<%
		if (null != arrEmpAll) {
			for (EmpAll e : arrEmpAll) {
		%>
		<tr>
			<td><a href="#" onclick="javascript:getEmpDetails('<%=e.getEmpId()%>')"><%=e.getEmpId()%></a></td>
			<td><%=e.getDeptId()%></td>
			<td><%=e.getEmpQual()%></td>
			<td><%=e.getStatus()%></td>
		</tr>
		<%}
	}%>

	</table>
	</form>
</body>
</html>