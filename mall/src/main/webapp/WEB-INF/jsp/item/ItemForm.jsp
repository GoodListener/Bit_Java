<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/styles.css">  <!-- 왼쪽메뉴 -->
<link rel="stylesheet" href="../css/styles2.css"> <!-- 상위메뉴 -->
<link rel="stylesheet" href="../css/common.css">
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="../js/script.js"></script>
<script type="text/javascript" src="../js/previewmodule.js">
	
</script>
<script>
	function show(e) {
		previewImage(e, "procImageView", "100", "100");
	}
</script>
<link rel="stylesheet" type="text/css" href="../css/mainLayout.css">
<meta charset='UTF-8'>

<title>상품-등록</title>
</head>
<body>
	<jsp:include page="/Header.jsp"></jsp:include>
	<jsp:include page="/menu.html"></jsp:include>
	
	<div class="menu">
		<section class="contents">
			<article>
				<form name="adminAddProcForm" action="add.do" method="post"
					enctype="multipart/form-data">
					<div>
						<ul>
							<li id="adminUl">
								<h2>상품 등록</h2>
								<ul>
									<li id="indexul">
										<ul id="adminUl3">
											<li><label id="boxfloat">상품명:</label><input type="text"
												name="product"></li>
											<li><label id="boxfloat">가격:</label><input type="text"
												name="price"></li>
											<li><label id="boxfloat">수량:</label><input type="number"
												name="amount" min="0"></li>
											<li><label id="boxfloat">브랜드:</label><input type="text"
												name="brand"></li>
											<li><label id="boxfloat">상품종류:</label> <select
												name="sort">
													<option value="TEA">TEA</option>
													<option value="SYRUP/SOURCE">SYRUP/SOURCE</option>
													<option value="CUP/TUMBLER">CUP/TUMBLER</option>
													<option value="COFFEE BEANS">COFFEE BEANS</option>
											</select></li>
											<li>
												<fieldset>
													<legend>상품정보</legend>
													<textarea name="content" required="required" id="procInfo"
														placeholder="설명을 입력하세요."></textarea>
												</fieldset> <br> <label id="procButton"> <input
													type="submit" value="상품등록"> <input type="reset"
													value="다시작성"> <input type="button" value="취소"
													onclick="history.back()">
											</label> <br>
											</li>
										</ul>
									</li>
									<li id="indexul">
										<ul id="adminUl">
											<li>상품이미지 선택<br>
												<div id="procImageView"
													style="width: 100px; height: 100px; border: 1px solid silver;">
												</div> <input type="file" name="photofile" onchange="show(this)">
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
	</div>
</body>
</html>