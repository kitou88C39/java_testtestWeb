<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="java.util.List" %>
<%@ page import="yurufuwa.prog.sample.Todofuken" %>

<%
ArrayList<String> kenCodeList =
    (ArrayList<String>)request.getAttribute("Todofuken_list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>都道府県検索</h2>

<table>
<tr>
<th>都道府県コード</th>
<th>都道府県名</th>
<th>読み仮名</th>
</tr>

<% for(int i=0; i<kenCodeList.size(); i++>) { %>
 <tr>
  <td><%= kenCodeList.get(i) %></td>
  <td><%= kenNameList.get(i) %></td>
  <td><%= yomiganaList.get(i) %></td>
</tr>

<% } %>
</table>
</body>
</html>
