<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->
<script type="text/javascript" src="js/previewmodule.js">
</script>
<script>
function show(e) {
	previewImage(e,"procImageView","100","100");
}
</script>
<link rel="stylesheet" type="text/css" href="css/mainLayout.css">
</head>
<body>
<section>
<article>
<form name="adminAddProcForm" action="addProduct.do" method="post" enctype="multipart/form-data">
<div>
		<ul>		
			<li id="adminUl">
				<h2>상품 등록</h2>
				<ul>
					<li id="indexul">
						<ul id="adminUl3">
							<li>
							<label id="boxfloat">상품명:</label><input type="text" name="shop_name">
							</li>
							<li>
							<label id="boxfloat">단가:</label><input type="text" name="shop_price">
							</li>
							<li>
							<label id="boxfloat">입고량:</label><input type="text" name="shop_total">
							</li>
							<li>							
							<label id="boxfloat">상품코드:</label><input type="text" name="shop_code">
							</li>
							<li>							
							<label id="boxfloat">제조회사:</label><input type="text" name="shop_company">	
							</li>
							<li>							
							<label id="boxfloat">상품종류:</label>
							<select name="shop_group">						
								<option value="TEA">TEA</option>
								<option value="SYRUP/SOURCE">SYRUP/SOURCE</option>						
								<option value="CUP/TUMBLER">CUP/TUMBLER</option>						
								<option value="COFFEE BEANS">COFFEE BEANS</option>						
							</select>
							</li>
							<br>
							<li>
								<fieldset>
								<legend>상품정보</legend>
								<textarea name="shop_info" required="required" id="procInfo"></textarea>
								</fieldset>
								<br>
								<label id="procButton">						
								<input type="submit" value="상품등록">
								<input type="reset" value="다시작성">
								<input type="button" value="취소" onclick="history.back()">
								</label>
								<br>								
							</li>														
						</ul>
					</li>
					<li id="indexul">
						<ul id="adminUl">
							<li>
								상품이미지 선택<br>
								<div id="procImageView" style="width:100px;height:100px;
									border:1px solid silver;">
								</div>
								<input type="file" name="shop_truename" onchange="show(this)">
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
</body>
</html>