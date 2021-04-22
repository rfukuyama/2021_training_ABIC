<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占い</title>
</head>
<body>

<h1>占いたい月を入力してね</h1>

<form action="/kadai3/FortuneServlet" method=get>
<select name="month">
	<c:forEach var="i" begin="1" end="12" step="1">
		<option value="${i}">${i}</option>
	</c:forEach>
</select>
<label>月</label>
<input type="submit" value="占ってみる">
</form>

<c:if test="${!empty fortune.lcolor}">
	<p>${fortune.month}月の運勢は、、、</p>
	<ul>
		<li>ラッキーカラー：${fortune.lcolor}</li>
		<li>ラッキーアイテム：${fortune.litem}</li>
		<li>順位は：${fortune.rank}位</li>
	</ul>
</c:if>
</body>
</html>