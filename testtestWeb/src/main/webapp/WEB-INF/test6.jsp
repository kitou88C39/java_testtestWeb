<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="charset=UTF-8">

<%@ page import="java.util.ArraList" %>
<%@ page import="yurufuwa.prog.sample.Todoufuken" %>

<%
//都道府県のリストを取得
    Todoufuken td = new Todoufuken();
    ArraList<String> todoufukenList = td.getList();
%>
