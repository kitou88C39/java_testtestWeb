<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="java.util.List" %>
<%@ page import="yurufuwa.prog.sample.Todofuken" %>
<%
ArrayList<String> kenCodeList =
    (ArrayList<String>)request.getAttribute("todofuken_list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>検索条件</h2>

<form action="/sv27" method="post">
検索条件:
    <input type="text" name="txtKenName"/>
    <input type="submit" value="検索"/>
</form>

</body>
</html>
