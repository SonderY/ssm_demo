<%--
  Created by IntelliJ IDEA.
  User: So
  Date: 2018/6/1
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <form action="${pageContext.request.contextPath }/user/login" method="post">
   <input type="text" name="name">
   <input type="text" name="password">
   <input type="submit">
 </form>
  </body>
</html>
