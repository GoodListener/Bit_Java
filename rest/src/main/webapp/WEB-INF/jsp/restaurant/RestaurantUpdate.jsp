<%-- 게시물 상세정보 및 변경 폼 --%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>맛집-수정하기</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
<div class="align-center vi">
<h1>맛집 게시물 수정하기</h1>
</div>
<div style="margin-left: 530px;" >
<a href='list.do'>목록</a>
</div>
<div align="center">
<c:if test="${not empty restaurant}">
<form id='form1' action='update.do' method='post' enctype="multipart/form-data">
<table class="type01">
<tr>
  <th>번호</th>
  <td><input type='text' name='no' value='${restaurant.no}' readonly></td>
</tr>
<tr>
  <th>상호명</th>
  <td><input type='text' name='name' value='${restaurant.name}'></td>
</tr>
<tr>
  <th>장소</th>
  <td><input type='text' name='location' value='${restaurant.location}'></td>
</tr>
<tr>
  <th>순위</th>
  <td>${restaurant.rank}</td>
</tr> 
<tr>
  <th>별점</th>
  <td><input type="number" name='star' value='${restaurant.star }' max="5" min="0"></td>
</tr> 
<tr>
  <th>내용</th>
  <td><textarea rows='10' name='content' 
      cols='60'>${restaurant.content}</textarea></td>
</tr>
<tr>
  <th>사진</th>
  <td>
  <c:choose>
  <c:when test="${empty restaurant.photo }">
  </c:when>
  <c:otherwise>
  <%-- <a href='../file/${restaurant.photo}'>다운로드</a><br> --%>
  </c:otherwise>
  </c:choose>
  <img width='250' height='300' 
      src='../file/${restaurant.photo}'><br>
      <input type='file' name='file'>
      <input type='hidden' name='photo' value='${restaurant.photo}'>
  </td>
</tr>
</table>
<p>
<button name='update.do' type='submit' class='button1'>변경</button>
<a href='delete.do?no=${restaurant.no}'><button type="button">삭제</button></a>
</p>
</form>
</c:if>
</div>
<c:if test="${empty restaurant}">
<p>해당 번호의 게시물을 찾을 수 없습니다.</p>
</c:if>
</body>
</html>
    