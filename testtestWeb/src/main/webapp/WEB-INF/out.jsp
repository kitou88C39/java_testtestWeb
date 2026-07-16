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

<%
//フォームのキーワード欄にセットする値(null以外の時にセット)
String inputValue = "";
if(kw != null){
    inputValue = kw;
}
%>
<form action="http://apsv/testWeb/sv4" method="get"/>
キーワード
    <input type="text" name="kw" value="<% inputValue %>" />
    <input type="submit" value="検索" />
</form>

</body>
</html>
