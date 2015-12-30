<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!doctype html>
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="../css/styles.css">
   <link rel="stylesheet" href="../css/styles2.css">
   <link rel="stylesheet" href="../css/common.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="../js/script.js"></script>
   <title>CSS MenuMaker</title>
   
<style type="text/css">

.col-2 {
    border: 1px solid lightgray;
    float: left;
    width: 24%;
    height: 300px;
    margin: 5px;
    /* padding-left: 100px; */
    /* padding-top: 100px; */
    /* padding-right: 100px; */
    background-color: #ffffff;
}

.prod_box{
width:auto;
height:auto;
float:left;
padding:10px 10px 10px 11px;

}
.top_prod_box{
width:250px; height:12px; background:url('../images/product_box_top.gif') no-repeat center bottom;
float:left; padding:0px; margin:0px;
}
.center_prod_box{
width:250px; height:auto; background:url('../images/product_box_center.gif') repeat-y center;float:left; 
text-align:center;padding:0px; margin:0px;
}
.bottom_prod_box{
width:250px;height:10px;background:url('../images/product_box_bottom.gif') no-repeat center top;
float:left;padding:0px; margin:0px;
}

#prod_img {
width: 265px;
heigth: 300px;

padding:0 2px 5px 2px;
}

.prod_explain {
  padding: 0px 10px 0px 10px;
  font-size: small;
  text-align: right;
  position: relative;
}
.prod_price{
  padding: 0px 10px 10px 10px;
  font-size: small;
  text-align: right;
  position: relative;
}
img.left_bt{
float:left;
padding:6px 0 0 6px;
}

a.prod_details{
width:25px;
display:block;
float:left;
background:url('../images/square-blue-add.gif') no-repeat left;
padding:0 0 0 20px;
margin:7px 0 0 38px;
_margin:6px 0 0 35px;
text-decoration:none;
color:#0fa0dd;
}


.prod_details_tab{

}
#price_option {
 position:absolute;
 right:0;

}

</style>
</head>
<body>
 <jsp:include page="/Header.jsp"></jsp:include>
<jsp:include page="/menu.html"></jsp:include>  
<%-- <jsp:include page="/Header.jsp"></jsp:include> --%>


	<div class="menu">
		<form action="searchPrice.do" method="POST">
		<div id="price_option">
			가격 분류<select name="priceOption">
				<option value="">가격 설정</option>
				<option value="price0">10000원 미만</option>
				<option value="price10000">10000원 ~ 49999원</option>
				<option value="price50000">50000원 ~ 99999원</option>
				<option value="price100000">100000원 ~ 199999원</option>
				<option value="price200000">20만원 이상</option>
			</select>
			<button>선택</button>
		</div>
			</form>

		<section class="contents">
			<c:if test="${not empty loginUser}">
				<c:if test="${loginUser.id eq 'admin'}">
					<a href='add.do'>새 상품 등록</a>
					<br>
				</c:if>
			</c:if>

			<c:forEach var="item" items="${items}">
				<div class="col-2">

					<div class="prod_box">
						<!--  <div class="top_prod_box"></div>
      <div class="center_prod_box"> -->
						<img src='../file/${item.photo }' width="130" height="200"
							id="prod_img">
					</div>
					<div class="prod_explain">${item.product }</div>
					<div class="prod_price">${item.price }</div>


					<div class="prod_details_tab">

						<a href="#"> <img src="../images/cart.gif" alt="" border="0"
							class="left_bt" />
						</a> <a href="#"> <img src="../images/favs.gif" alt="" border="0"
							class="left_bt" />
						</a> <a href="#"> <img src="../images/favorites.gif" alt=""
							border="0" class="left_bt" />
						</a> <a href="detail.do?no=${item.no}" class="prod_details">details</a>
					</div>

				</div>
			</c:forEach>
		</section>


	</div>
	<%-- <jsp:include page="/Copyright.jsp"/> --%>

</body>
</html>    