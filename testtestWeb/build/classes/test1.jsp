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
    <% if (name != null && age != null) { %>
      </p>パラメータは<%= name %>で、年齢は<%= age %>です</p>
    <% } else { %>
      <p>パラメータがありません</p>
    <% } %>

    <% for (int i = 0; i < 10; i++) { %>
      <p><%= i %></p>
    <% } %>
  </body>
</html>
