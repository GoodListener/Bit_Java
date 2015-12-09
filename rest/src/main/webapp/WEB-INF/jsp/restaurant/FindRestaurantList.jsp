<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>맛집리스트</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<h1>맛집 리스트</h1>
<a href='add.do'>새 글</a><br>
<form action="search.do" method="POST">
<div style="text-align: right;"><input type="text" name="word">
<button>검색</button>
</div>
</form>
<table class="type01">
  <tr>
    <th>번호</th>
    <th>사진</th>
    <th>맛집 이름</th>
    <th>순위</th>
    <th>위치</th>
    <th>별점</th>
  </tr>
<c:forEach var="restaurant" items="${findRestaurants}">
  <tr>
    <td>${restaurant.no}</td>
    <td>${restaurant.photo}</td>
    <td><a href="detail.do?no=${restaurant.no}">${restaurant.name}</a></td>
    <td>${restaurant.rank}</td>
    <td>${restaurant.location}</td>
    <td>${restaurant.star}</td>
  </tr>
</c:forEach>  

</table>

<p>
<c:choose>
<c:when test="${empty param.pageNo}">
<a href='list.do?pageNo=2'><button type="button">다음 페이지 이동</button></a>
</c:when>
<c:otherwise>
<a href='list.do?pageNo=${(param.pageNo < 2)?"1":param.pageNo - 1}'><button type="button">이전 페이지 이동</button></a>
<a href='list.do?pageNo=${(param.pageNo < 1)?"2":param.pageNo + 1}'><button type="button">다음 페이지 이동</button></a>
</c:otherwise>
</c:choose>
</p>
</body>

</html>





    