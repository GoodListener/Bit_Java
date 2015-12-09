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
  <title>맛집-상세정보</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<h1>맛집 상세 정보</h1>
<a href='list.do'>목록</a>
<table class="type01">
<tr>
  <th>번호</th>
  <td><input type='text' name='no' value='${restaurant.no}' readonly></td>
</tr>
<tr>
  <th>상호명</th>
  <td><input type='text' name='name' value='${restaurant.name}' readonly></td>
</tr>
<tr>
  <th>장소</th>
  <td><input type='text' name='location' value='${restaurant.location}' readonly></td>
</tr>
<tr>
  <th>순위</th>
  <td>${restaurant.rank}</td>
</tr> 
<tr>
  <th>별점</th>
  <td>
<c:forEach begin="1" end="${restaurant.star}"> 
  <img src="../file/star.png">
</c:forEach>
  </td>
</tr> 
<tr>
  <th>내용</th>
  <td><textarea rows='10' name='content' 
      cols='60' readonly="readonly">${restaurant.content}</textarea></td>
</tr>
<tr>
  <th>사진</th>
  <td>
  <img width='250' height='300' 
      src='../file/${restaurant.photo}'><br>
  </td>
</tr>

</table>
<p>
<a href='update.do?no=${restaurant.no}'><button type="button">수정</button></a>
</p>
</body>
</html>
    