<%@ page import="com.hsd.entity.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<%
    Object clist = request.getAttribute("clist");
    List<User> list = (List<User>) clist;
    for (User user :list) {

    }

%>
</html>
