<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

         <h1 Style="text-align:center;">Display Current Date & Time</h1>
      
<%
String scheme = request.getScheme();
String check =request.getContextPath();
out.print(check);
out.print(request.getRequestURI());
out.print(scheme);
String servername = request.getServerName();
out.print(servername);

%>
      
      <%
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      %>
</body>
</html>