<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">

<%
String kenCode =(String)request.getAttribute("ken_code");
String kenName =(String)request.getAttribute("ken_name");
String yomigana =(String)request.getAttribute("yomigana");
int updateRows =(String)request.getAttribute("update_rows");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県データ追加</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>データの追加結果</h2>

<form action="/sv25" method="post">
検索条件:
    <input type="text" name="txtKenName"/>
    <input type="submit" value="検索"/>
</form>

</body>
</html>
