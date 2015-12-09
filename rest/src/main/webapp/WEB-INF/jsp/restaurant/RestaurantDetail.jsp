<%-- 게시물 상세정보 및 변경 폼 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
  <title>맛집리스트-상세보기</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
  <jsp:include page="/Header.jsp" />

  <div style="width: 100%; height: 700px; overflow: auto">

    <table
      style="margin-left: auto; margin-right: auto; border-style: none">
      <tr>
       <th style="align:left;">
         <p>
           <a class="button" href='update.do?no=${restaurant.no}'>Update</a>
           <a class="button" href="list.do">List</a>
         </p>
       </th>
      </tr>
      <tr>
        <td style="font-size:30px;font-weight:bold;">맛집 상세 정보</td>
      </tr>
      
      <tr style="border-bottom: 3px solid red">
        <th width="370" rowspan="6"><img width='350' height='370'
          src='../file/${restaurant.photo}'><br>
        </th>
        <td bgcolor="#FAED7D">상호명</td>
        <td> ${restaurant.name}  </td>
      </tr>
       <tr>
        <td bgcolor="#FAED7D">순위</td>
        <td>${restaurant.rank} 위</td>
      </tr>

      <tr>
        <td bgcolor="#FAED7D">장소</td>
        <td>${restaurant.location}</td>
      </tr>
     
      <tr>
        <td bgcolor="#FAED7D">별점</td>
        <td><c:forEach begin="1" end="${restaurant.calcstar}">
            <img src="../file/star.png">
          </c:forEach>
          <form action="plusStar.do" method="POST">
           <div style="font-size: 12px"> ${restaurant.countstar} 명의 평가 </div>
           <input type="hidden" name='no' value='${restaurant.no}'> 
           <input type="hidden" name='countstar' value='${restaurant.countstar}'> 
           <input type="number" name='star' value='${restaurant.calcstar}' max="5" min="0">
            <button>별점주기</button>
          </form></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
      </tr>
      <tr style="border-bottom: 3px solid red">
        <td bgcolor="#FAED7D" width="180">맛집 소개</td>
        <td>${restaurant.content}</td>
      </tr>

      <tr>
        <th colspan="3" height="70"></th>
      </tr>
      
    </table>

    <table
      style="width: 1000; margin-left: auto; margin-right: auto; border-top: 3px solid black; border-width: medium;">
      <tr>
        <td width="1000" colspan="3"
          style="font-size: 30px; font-weight: bold; height: 70px;">메뉴판</td>
      </tr>

      <tr>
        <td rowspan="5" colspan="1">메인 메뉴</td>
        <td>피자</td>
        <td>15000</td>
      </tr>
      <tr>
      </tr>
      <tr>
        <td>치킨</td>
        <td>17000</td>
      </tr>
      <tr>
        <td>족발</td>
        <td>19000</td>
      </tr>
      <tr>
    </table>
  </div>
</body>
</html>