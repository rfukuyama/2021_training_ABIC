<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Random"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おみくじ</title>
</head>
<body>

<h1>STEP1</h1>
スクリプトレットを使用しておみくじ<br><br>
	<%
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1; // サイコロを振る
		String ans = null;

		if (dice == 1) {
			ans = "大吉";
		} else if (dice == 2) {
			ans = "小吉";
		} else if (dice == 3) {
			ans = "凶";
		} else {
			ans = "吉";
		}
	%>
	今日の運勢は、、、「<%=ans%>」です。<br>

</body>
</html>