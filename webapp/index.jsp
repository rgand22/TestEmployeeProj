<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Bean Information:::</title>
</head>
<body>
<b>Test Bean Information:::</b>
<script type="text/javascript">
function callOnLoad11()
{
alert("hi:::"+"<%=request.getContextPath()%>"+"/EmpAllServlet.do");	
this.location = "<%=request.getContextPath()%>"+"/EmpAllServlet.do";
///testClass11.do
}
</script>
<!-- jsp:useBean id="obj" class="com.test.testClass11" />-->
<form id="form1" name="form1"  action="javascript:callOnLoad11();" >
<input type="text" name="input1" value="welcome to >>>"/>
<a href="#" onclick="javascript:callOnLoad11();">Employee Details</a>
</form>
</body>
</html>