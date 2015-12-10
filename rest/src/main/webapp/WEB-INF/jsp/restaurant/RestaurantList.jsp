<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>맛집리스트</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
  <jsp:include page="/Header.jsp" />
<form action="search.do" method="POST">
<div style="text-align: right;">
  <table style="margin-left: auto; margin-right: auto" class="type01">
  <a class="button" href='add.do'>New</a>
  <button class="button">Search</button><input type="text" name="word">
  </table>
</div>
</form>
  <table style="margin-left: auto; margin-right: auto; border-style: none">
    <tr>
      <td style="text-align:left;font-size:30px;font-weight:bold;">맛집 리스트</td>
    </tr>
 </table>
<table style="margin-left: auto; margin-right: auto" class="type01">
  <tr>
    <th bgcolor="#FAED7D">순위</th>
    <th bgcolor="#FAED7D">사진</th>
    <th bgcolor="#FAED7D">맛집 이름</th>
    <th bgcolor="#FAED7D">위치</th>
    <th bgcolor="#FAED7D">평가</th>
  </tr>
<c:forEach var="restaurant" items="${restaurants}">

			<tr>
			  
				<td>
				<c:choose>
				  <c:when test="${(restaurant.rank == 1)}">
				    <img width="25" height="40" src="../file/1.png">
				  </c:when>
				  <c:when test="${(restaurant.rank == 2)}">
            <img width="25" height="40" src="../file/2.png">
          </c:when>
          <c:when test="${(restaurant.rank == 3)}">
            <img width="25" height="40" src="../file/3.png">
          </c:when>
				  <c:otherwise>${restaurant.rank }</c:otherwise>
				</c:choose>
				</td>
				<td><img width="60" height="60"
					src='../file/${(empty restaurant.photo)?"default.png":restaurant.photo}'>
			  </td>
				<td><a href="detail.do?no=${restaurant.no}">${restaurant.name}</a></td>
				<td>${restaurant.location}</td>
				<td class="starSize"><c:forEach begin="1"
						end="${restaurant.calcstar}">
						<img src="../file/star.png">
					</c:forEach> 
					<c:choose>
						<c:when test="${(restaurant.floatstar==0)}"></c:when>
						<c:otherwise>
							<fmt:formatNumber value="${restaurant.floatstar}" pattern="0.0" />
						</c:otherwise>
					</c:choose>
					</td>
			</tr>
		</c:forEach>  
</table>
<p>
<c:choose>
<c:when test="${empty param.pageNo}">
<div align="center">
<a class="button2" href='list.do?pageNo=2'>next</a>
</div>
</c:when>
<c:otherwise>
<div align="center">
<a class="button2" href='list.do?pageNo=${(param.pageNo < 2)?"1":param.pageNo - 1}'>before</a>
<a class="button2" href='list.do?pageNo=${(param.pageNo < 1)?"2":param.pageNo + 1}'>next</a>
</div>
</c:otherwise>
</c:choose>
</p>
</body>

</html>

