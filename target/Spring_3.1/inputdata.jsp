<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 29.01.2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Input your car data!</title>
</head>
<body>
<h2>Your car data:</h2>
<form:form method = "POST" action = "/Spring_3_1_war_exploded/addCar">
    <table>
        <tr>
            <td><form:label path = "mark">mark</form:label></td>
            <td><form:input path = "mark" /></td>
        </tr>
        <tr>
            <td><form:label path = "maxSpeed">maxSpeed</form:label></td>
            <td><form:input path = "maxSpeed" /></td>
        </tr>
        <tr>
            <td><form:label path = "year">year</form:label></td>
            <td><form:input path = "year" /></td>
        </tr>
        <tr>
            <td>
                <input type = "submit" value = "OK!"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
