<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>おみくじ</title>
    </head>
    <body>
        <h1>おみくじを引きやがれ</h1>
        <form method="POST" action="/test/OmikujiServlet">
            <label for="username">名前</label><br />
            <input type="text" name="username" />
            <br /><br />

            <button type="submit">おみくじを引く</button>
        </form>
    </body>
</html>