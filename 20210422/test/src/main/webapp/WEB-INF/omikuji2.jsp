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

<h1>STEP2</h1>
スクリプトレットで繰り返し処理を利用しておみくじ<br><br>
	<%
		Random rand2 = new Random();
		String ans2 = null;

		for (int i = 1; i <= 12; i++) {
			// サイコロの振り直し
			int dice2 = rand2.nextInt(6) + 1;
			if (dice2 == 1) {
				ans2 = "大吉";
			} else if (dice2 == 2) {
				ans2 = "小吉";
			} else if (dice2 == 3) {
				ans2 = "凶";
			} else {
				ans2 = "吉";
			}
	%>
	<%=i%>月の運勢は、、、「<%=ans2%>」です。<br>
	<%
		}

	%>

</body>
</html>