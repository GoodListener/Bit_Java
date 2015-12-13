<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="/css/mainLayout.css">
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
<body style="background: url('/img/menu_bg.gif');">
<c:set var="dProc" value="${detailProc}"></c:set>
<section>
	<article>
	<form name="productDetail" action="orderForm.do" method="post">
	<input type="hidden" name="shop_idx" value="${dProc.shop_idx}">
	<input type="hidden" name="shop_code" value="${dProc.shop_code}">
	<input type="hidden" name="shop_price" value="${dProc.shop_price}">
	<table summary="상품detail">
		<tr>
			<td rowspan="2">제품이미지<br>
			<img src="procImg/${dProc.shop_imagename}"></td>
			<td>상품명 : ${dProc.shop_name}<br>
			상품코드 : ${dProc.shop_code}<br>
			가격 : ${dProc.shop_price}<br> 
			원산지 : ${dProc.shop_company}<br>
			수량 선택 : <input type="number" min="1" name="shop_sales" required="required"
			autocomplete="off">EA</td>
		</tr>
		<tr>
			<td>
			<input type="submit" value="바로주문">
			<input type="button" value="찜하기" onclick="wish()">
			<input type="button" value="장바구니담기" onclick="cart()">
			<input type="button" value="뒤로가기"	onclick="history.back()">
			</td>
		</tr>
		<tr>
			<td colspan="2"><hr></td>
		</tr>
		<tr>
			<td colspan="2">-상품정보-</td>
		</tr>
		<tr>
			<td colspan="2">${dProc.shop_info}</td>
		</tr>
	</table>
	</form>
	</article>
</section>
</body>
</html>