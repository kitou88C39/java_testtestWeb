<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">

<%@ page import=""yurufuwa.prog.sample.Clac" %>

<%
//パラメータの取得
String sX = request.getParameter("x");
String sY = request.getParameter("y");

int x = Integer.parseInt(sX);
int y = Integer.parseInt(sY);

//計算機クラスにパラメータをセット
Calc calc = new Calc();
calc.setX(x);
calc.setY(y);

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

//パラメータの計算
<%= sX %> + <%= sY %> = <%= calc.getAnswer() %>
</body>
</html>
