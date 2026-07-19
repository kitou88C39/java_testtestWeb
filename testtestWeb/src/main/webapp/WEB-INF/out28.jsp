<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%
String kenCode =(String)request.getAttribute("ken_code");
String kenName =(String)request.getAttribute("ken_name");
int updateRows =(String)request.getAttribute("update_rows");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県データ更新</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>データの更新結果</h2>

<h3>入力内容</h3>
<table>
<tr><td>都道府県コード</td><td><%= kenCode %></td></tr>
<tr><td>都道府県名</td><td><%= kenName %></td></tr>
</table>

<h3>更新の件数</h3>
<%= updateRows %>件

</body>
</html>
