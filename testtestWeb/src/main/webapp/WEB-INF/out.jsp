<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="java.util.List" %>
<%

ArrayList<String> kenCodeList =
    (ArrayList<String>)request.getAttribute("ken_code_list");
ArrayList<String> kenNameList =
    (ArrayList<String>)request.getAttribute("ken_name_list");
ArrayList<String> yomiganaList =
    (ArrayList<String>)request.getAttribute("yomigana_list");

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
</head>
<body style="mergin:24px;">

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
