<%@ page import="la.bean.PlusBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	PlusBean bean = (PlusBean) request.getAttribute("plus");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plus</title>
</head>
<body>

<%= bean.getValue1() %> + <%= bean.getValue2() %> = <%= bean.getAnswer() %>

</body>
</html>