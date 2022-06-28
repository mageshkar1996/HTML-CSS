<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table Format </title>
</head>
<body>

<% 
String Name=request.getParameter("name");
String College=request.getParameter("college");
String Company=request.getParameter("company");
%>
<table>

<tr>
<th>Name</th>
<th>College</th>
<th>Company</th>
</tr>

<tr>
<td><%=Name%></td>
<td><%=College %></td>
<td><%=Company%></td>
</tr>

</table>


</body>
</html>