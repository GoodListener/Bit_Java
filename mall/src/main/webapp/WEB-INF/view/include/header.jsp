<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<header>
<script type="text/javascript">
function open_login(){
	window.open("/team/memberLogin.do", "login","left=380, top=300, width=500, height=300, scrollbars=no,resizable=no");
}
</script>
<c:set var="sname" value="${sessionScope.userName}"/>
<c:set var="admin" value="${sessionScope.admin}"/>
	<p>
	<c:choose>
		<c:when test="${!empty sname}">
			${sname} is Login | 	
			<a href="cart.do">Cart</a> |
			<a href="myPage.do">My Page</a> |
			<c:if test="${admin==1}">
			<a href="adminPage.do" style="color:black;">admin</a> |
			</c:if>
			<a href="logout.do" style="color:black;">Logout</a> |
		</c:when>
		<c:when test="${empty sname}">
			<a href="javascript:open_login()" style="color:black;">Login</a> |
			<a href="/team/memberJoin.do" style="color:black;">Register</a>			
		</c:when>
	</c:choose>
	</p><a href='siteMap.do'>
		<img alt="로고이미지" src="img/main/32.png" style="width:100ox;height:100px;"
		onmouseover='this.src="img/main/32 (1).png"' onmouseout='this.src="img/main/32.png"'></a>
		<a href='index.html'>
		<img alt="로고" src='img/main/logo.png' id="indexImgLogo"></a>
		<NAV>		
			<a href='/team/introMain.do'>
			<img alt="intro" src='img/main/intro.png' id="indexImgIntro"></a>
			<a href='menuMain.do'>
			<img alt="menu" src='img/main/menu.png' id="indexImgMenu"></a>
			<a href="shopMain.do">
			<img alt="shop" src='img/main/shop.png' id="indexImgShop"></a>
			<a href='qnaList.do'>
			<img alt="qna" src='img/main/qna.png' id="indexImgQna"></a>
		</NAV>
		<div id="remote" style="background-image: url('img/main/remoteback1.jpg');">
			<p><a href="index.html"><img alt="main" src='img/main/main.png' id="indexImgMenu"></a></p>
			<p><a href="cart.do"><img alt="cart" src='img/main/cart.png' id="indexImgMenu"></a></p>
			<p><a href="wishList.do"><img alt="wish" src='img/main/wish.png' id="indexImgMenu"></a></p>
		</div>
		<hr>
</header>