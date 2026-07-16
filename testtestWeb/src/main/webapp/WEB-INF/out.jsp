<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="charset=UTF-8">
<%@ page import="java.util.List" %>
<%
//キーワード、検索結果を取得
String kw = (String)request.getAttribute("keyword");
List<String> result = (List<String>)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
