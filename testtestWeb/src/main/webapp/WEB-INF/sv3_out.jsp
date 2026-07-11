<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body style="mergin:24px;">

<h2>都道府県</h2>
<a href="http://apsv/testWeb/sv3">戻る</a?

<h3>『<%= kw %>』の検索結果</h3>
<% for (String s : result) {%>
    <%= s %>
<% } %>

</body>
</html>
