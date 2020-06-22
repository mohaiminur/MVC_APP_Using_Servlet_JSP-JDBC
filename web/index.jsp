<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>MVC Servlet JSP</title>
  </head>
  <body>
<h2>Student Table</h2>
  <hr>
  <br/>
  <table border="1">
    <tr>
      <th>First name</th>
      <th>Last name</th>
      <th>Email</th>
    </tr>

    <c:forEach var="tempStudent" items="${student_list}">
      <tr>
        <td>${tempStudent.firstName}</td>
        <td>${tempStudent.lastName}</td>
        <td>${tempStudent.email}</td>
      </tr>
    </c:forEach>

  </table>
  </body>
</html>