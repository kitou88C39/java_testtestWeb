<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="yurufuwa.prog.sample.Concat" %>

<%
//モデルをリクエストから取得
Concat c=(Concat)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

//パラメータの計算
<%= c.getAnswer() %>
</body>
</html>
