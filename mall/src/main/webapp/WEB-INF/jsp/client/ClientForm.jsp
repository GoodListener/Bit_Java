<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!doctype html>
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="../css/styles.css">
   <link rel="stylesheet" href="../css/styles2.css">
   <link rel="stylesheet" href="../css/common.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="../js/script.js"></script>
  <title>회원-등록</title>
</head>
<body>
 <jsp:include page="/Header.jsp"></jsp:include>
<jsp:include page="/menu.html"></jsp:include>  
<%-- <jsp:include page="/Header.jsp"></jsp:include> --%>

<form id='form1' action='add.do' method='post'>

<div class="menu">
    <section class="contents">
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name' size='30'></td>
</tr>
<tr>
  <th>나이</th>
  <td><input type='text' name='age' size='30'></td>
</tr>
<tr>
  <th>전화번호</th>
  <td><input type='text' name='tel' size='20'></td>
</tr>
<tr>
  <th>아이디</th>
  <td><input type='text' name='id' size='20'></td>
</tr>
<tr>
  <th>암호</th>
  <td><input type='password' name='password'></td>
</tr>
<tr>
  <th>주소</th>
  <td><textarea rows='10' name='address' cols='60'
       placeholder="주소를 입력하세요."></textarea></td>
</tr>
</table>

<p><button type='submit'>등록</button></p>

</section>
</div>
</form>

</body>
</html>