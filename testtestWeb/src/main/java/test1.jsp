<% page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8"%> <% String name = request.getParameter("name"); String age
= request.getParameter("age"); %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
  </head>
  <body>
    <h1>Hello World</h1>
    パラメータは<%= name %>で、年齢は<%= age %>です
  </body>
</html>
