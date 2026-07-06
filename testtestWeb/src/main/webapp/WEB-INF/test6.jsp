<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="charset=UTF-8">

<%@ page import="java.util.ArraList" %>
<%@ page import="yurufuwa.prog.sample.Todoufuken" %>

<%
//都道府県のリストを取得
    Todoufuken td = new Todoufuken();
    ArraList<String> todoufukenList = td.getList();
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
  </head>
  <body>

  //都道府県リスト
  <% for(int i=0; i<todoufukenList.size(); i++){%>
    <%= todoufukenList.get(i) %>
<% } %>
  </body>
</html>
