<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!doctype html>
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="./css/styles.css">
   <link rel="stylesheet" href="./css/styles2.css">
   <link rel="stylesheet" href="./css/common.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="./js/script.js"></script>
   <title>CSS MenuMaker</title>
   
<style type="text/css">
.menu {
  position:absolute;
  top: 150px;
  left: 280px;
  width:1200px;
  height:auto;
  background-color: #f5f3fd;
}

.contents {
  width:auto;
  height:auto;
}

.col-2 {
    border: 1px solid black;
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
width:250px; height:12px; background:url('./images/product_box_top.gif') no-repeat center bottom;
float:left; padding:0px; margin:0px;
}
.center_prod_box{
width:250px; height:auto; background:url('./images/product_box_center.gif') repeat-y center;float:left; 
text-align:center;padding:0px; margin:0px;
}
.bottom_prod_box{
width:250px;height:10px;background:url('./images/product_box_bottom.gif') no-repeat center top;
float:left;padding:0px; margin:0px;
}

a.prod_details{
width:25px;
display:block;
float:left;
background:url('./images/square-blue-add.gif') no-repeat left;
padding:0 0 0 20px;
margin:7px 0 0 38px;
_margin:6px 0 0 35px;
text-decoration:none;
color:#0fa0dd;
}

#prod_img {
width: 200px;
heigth: 200px;
padding:5px 0 5px 0;
}

</style>
</head>
<body>
<jsp:include page="Header.html"></jsp:include>
<jsp:include page="menu.html"></jsp:include>
	<div class="menu">
		<section class="contents">

	  <div class="col-2">
	    
	    <div class="prod_box">
	    <div class="top_prod_box"></div>
	    <div class="center_prod_box">
        <img src='./images/camera.png' id="prod_img">
      </div>
      <div class="bottom_prod_box"></div>
      </div>
      
      <div class="prod_details_tab"> 
      
      <a href="#">
      <img src="./images/cart.gif" alt="" border="0" class="left_bt" />
      </a> 
      
      <a href="#">
      <img src="./images/favs.gif" alt="" border="0" class="left_bt" />
      </a> 
      
      <a href="#">
      <img src="./images/favorites.gif" alt="" border="0" class="left_bt" />
      </a> 
      
      <a href="#" class="prod_details">details</a> 
      </div>
      
      
    </div> <!-- 이게 한개의 박스 구성 -->
    
    

		</section>


	</div>


</body>
</html>