<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head></head>
<body>
    <c:forEach var="list" items="${list}">
        <li>${list.hno}</li>
    </c:forEach>
</body>
</html>