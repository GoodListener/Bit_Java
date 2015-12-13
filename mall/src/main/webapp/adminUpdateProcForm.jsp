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
<link rel="stylesheet" type="text/css" href="css/mainLayout.css">
<script type="text/javascript" src="js/previewmodule.js">
</script>
<script type="text/javascript" src="js/XHR.js"></script>
<script>
function show(e) {
	previewImage(e,"procImageView","100","100");
}
function change() { //이미지 바꾸기 호출
	//alert("접근");
	sendRequest("adminImageUpdate.do",null,changed,"GET");	
}
function changed(){ //이미지 바꾸기 응답
//	alert("접근2");
	if(XHR.readyState==4){ // 응답단계 검사
//		alert("접근4");
		if(XHR.status==200){ // 응답결과 검사
//			alert("접근200");
			var imageStr = document.getElementById("imageChange"); //id값으로 변수선언
			imageStr.innerHTML = XHR.responseText; //해당변수 innerHTML 삽입
//			alert("결과");
		}
	}
}
</script>
<link rel="stylesheet" type="text/css" href="css/mainLayout.css">
</head>
<body>
<%@include file="/WEB-INF/view/include/header.jsp" %>
<c:set var="uList" value="${updateProcList}"></c:set>
<section>
<article>
<form name="adminUpdateProcForm" action="updateProduct.do" method="post" enctype="multipart/form-data">
<div>
		<ul>
			<li id="adminUl">
				<ul id="adminUl2">
					<li><a href="adminProc.do?group=ALL">상품관리</a></li>
					<hr>
					<li><a href="adminNoticeList.do">공지사항</a></li>
					<hr>
					<li><a href="adminMember.do">회원관리</a></li>
					<hr>
					<li><a href="adminOrderUpdate.do">주문확인</a></li>
					<hr>
					<li><a href="menuMain.do">메뉴관리</a></li>
					<hr>
					<li><a href="adminQna.do">QnA관리</a></li>
					<br>
				</ul>
			</li>			
			<li id="adminUl">				
				<input type="hidden" name="shop_idx" value="${uList.shop_idx}">
				<h2>상품 수정</h2>
				<ul>					
					<li id="indexul">
						<ul id="adminUl3">
							<li>
							<label id="boxfloat">상품명:</label><input type="text" name="shop_name" value="${uList.shop_name}">
							</li>			
							<li>		
							<label id="boxfloat">단가:</label><input type="text" name="shop_price" value="${uList.shop_price}">
							</li>
							<li>
							<label id="boxfloat">입고량:</label><input type="text" name="shop_total" value="${uList.shop_total}">
							</li>								
							<li>
							<label id="boxfloat">상품코드:</label><input type="text" name="shop_code" value="${uList.shop_code}">
							</li>
							<li>
							<label id="boxfloat">제조회사:</label><input type="text" name="shop_company" value="${uList.shop_company}">
							</li>
							<li>							
							<label id="boxfloat">상품종류:</label>
							<select name="shop_group">						
								<option value="TEA" selected="selected">TEA</option>						
								<option value="SYRUP/SOURCE"
									<c:if test="${uList.shop_group=='SYRUP/SOURCE'}"> 
									${selectStr}
									</c:if>
									>SYRUP/SOURCE</option>						
								<option value="CUP/TUMBLER"
									<c:if test="${uList.shop_group=='CUP/TUMBLER'}"> 
									${selectStr}
									</c:if>
									>CUP/TUMBLER</option>						
								<option value="COFFEE BEANS"
									<c:if test="${uList.shop_group=='COFFEE BEANS'}"> 
									${selectStr}
									</c:if>
									>COFFEE BEANS</option>						
							</select>					
							</li>
							<br>												
							<li>
								<fieldset>
								<legend>상품정보</legend>
								<textarea name="shop_info" required="required" style="height:100px;" id="procInfo">${uList.shop_info}</textarea>
								</fieldset>
								<br>
								<label id="procButton">
								<input type="submit" value="상품수정">						
								<input type="button" value="취소" onclick="history.back()">
								</label>
								<br>
							</li>
						</ul>
					</li>
					<li id="indexul">
						<ul id="adminUl">
							<li>									
								<div id="imageChange">
								상품이미지<br>
								<div id="procImageView" style="width:100px;height:100px;
									border:1px solid silver;">
								<img src="procImg/${uList.shop_imagename}"
								style="width:100px;height:100px;" >
								<input type="hidden" name="shop_imagename" value="${uList.shop_imagename}">					
								</div>
								<input type="button" name="goChange" value="이미지수정" onclick="change()">
								</div>
							</li>					
						</ul>
					</li>
				</ul>
			</li>
		</ul>
		</div>		
		</form>		
</article>
</section>
<%@include file="/WEB-INF/view/include/footer.jsp" %>
</body>
</html>