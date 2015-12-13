<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>회원-목록</title>
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>회원</h1>
<a href='add.do'>새 회원</a><br>
<table border='1'>
  <tr>
    <th>아이디</th>
    <th>이름</th>
    <th>나이</th>
  </tr>
<c:forEach var="client" items="${clients}">    
  <tr>
    <td>${client.id}</td>
    <td><a href='detail.do?id=${client.id}'>${client.name}</a></td>
    <td>${client.age}</td>
  </tr>
</c:forEach> 
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>    