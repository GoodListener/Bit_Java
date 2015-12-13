<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>상품-상세정보</title>
  <link rel="stylesheet" href="../css/styles.css">
   <link rel="stylesheet" href="../css/styles2.css">
  <link rel="stylesheet" type="text/css" href="../css/common.css">
  
  <link rel="stylesheet" type="text/css" href="css/mainLayout.css">
<script type="text/javascript">
function cart() { 
  document.productDetail.action="addCart.do";
  document.productDetail.submit();
}
function wish(){
  document.productDetail.action="addWish.do";
  document.productDetail.submit();
}
</script>
</head>
<body>

<jsp:include page="/Header.jsp"></jsp:include>
<jsp:include page="/menu.html"></jsp:include>  
<div class="menu">
<section class="contents">
  <article>
  <form action="order.do" method="post">
  <table summary="상품detail">
    <tr>
      <td rowspan="2">제품이미지<br>
      <img src="../file/${item.photo}" width="300px" height="300px"></td>
      <td>상품명 : ${item.product}<br>
      상품번호 : ${item.no}<br>
      가격 : ${item.price}<br> 
      수량 선택 : <input type="number" min="1" name="amount" required="required"
      autocomplete="off">EA</td>
    </tr>
    <tr>
      <td>
      <input type="submit" value="바로주문">
      <input type="button" value="찜하기" onclick="wish()">
      <input type="button" value="장바구니담기" onclick="cart()">
      <input type="button" value="뒤로가기" onclick="history.back()">
      </td>
    </tr>
    <tr>
      <td colspan="2"><hr></td>
    </tr>
    <tr>
      <td colspan="2">-상품정보-</td>
    </tr>
    <tr>
      <td colspan="2">${item.content}</td>
    </tr>
  </table>
  </form>
  </article>
</section>
</div>

</body>
</html>
    