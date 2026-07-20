<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<% page import="java.util.ArrayList" %>
<% page import="yurufuwa.prog.sample.Todofuken" %>

<%
ArrayList<Todofuken> todofukenList =
    (ArrayList<Todofuken>)request.getAttribute("todofuken_list");
String kenName =(String)request.getAttribute("ken_name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>都道府県一覧</h2>

<h3>『<%= kenName %>』の検索結果</h3>

<% if(todofukenList != null && todofukenList.size()> 0){ %>
<table>
<tr><td>都道府県コード</td><td><%= kenCode %></td></tr>
<tr><td>都道府県名</td><td><%= kenName %></td></tr>
</table>

</body>
</html>
