<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>회원-상세정보</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>회원</h1>
<form id='form1' action='update.do' method='post'>
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name' value='${client.name}'></td>
</tr>
<tr>
  <th>나이</th>
  <td><input type='text' name='age' value='${client.age}'></td>
</tr>
<tr>
  <th>주소</th>
  <td><input type='text' name='address' value='${client.address}'></td>
</tr>
<tr>
  <th>전화</th>
  <td><input type='text' name='tel' value='${client.tel}'></td>
</tr>
<tr>
  <th>아이디</th>
  <td><input type='text' name='id' value='${client.id}' readonly></td>
</tr>
</table>
<p>
<button name='update' type='submit' class='button1'>변경</button>
<a href='delete.do?id=${client.id}' class='button2'>삭제</a>
</p>
</form>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>
    