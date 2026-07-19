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
<title>都道府県の削除</title>
<style>table, th, td { border-col: collapse; border: 1px black solid;}
</head>
<body>

<h2>削除するデータを入力してください</h2>

<form action="/sv27" method="post">
<table>
    <tr>
    <td>
    都道府県コード<input type="text" name="txtKenCode"/>
    </td>
    </tr>
</table>
    <input type="submit" value="削除"/>
</form>

</body>
</html>
