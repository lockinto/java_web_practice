<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" align="center" width="60%">

	<tr>
		<td>姓名<td>
		<td>年龄<td>
	</tr>
	
<%
	for (int i = 0; i < 10; i++)
	{
%>
	<tr>
		<td>张三<td>
		<td>20<td>
	</tr>
<%
	}
%>
</table>

</body>
</html>