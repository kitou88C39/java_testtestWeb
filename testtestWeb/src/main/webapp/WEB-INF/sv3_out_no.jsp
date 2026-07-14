<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="java.util.List" %>
<%
//キーワード、検索結果を取得
String kw = (String)request.getAttribute("keyword");
List<String> result = (List<String>)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body style="mergin:24px;">

<h2>都道府県</h2>
<a href="http://apsv/testWeb/sv3">戻る</a>

<% if(kw.equales("")) { %>

<h3>キーワードが未入力です</h3>

<% } else if(result.size()== 0) { %>

</body>
</html>
