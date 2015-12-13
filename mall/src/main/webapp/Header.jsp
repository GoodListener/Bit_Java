<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
     

<a href="/mall/item/list.do"><img id='menuLogo' width='160' height='160' style="left:0px" src="../image/LOGO.png"></a>
<div id='cssmenu2' style="left:160px; top:0px; position: absolute; width: 83%;">
<ul>
   <li class='active'><a href='#'>Home</a></li>
   <li><a href='#'>Products</a></li>
   <li><a href='#'>Company</a></li>
   <li><a href='#'>Contact</a></li>
   <ins>
   <c:if test="${empty loginUser}">
   <form action="login.do" method="post">
   <p>ID : <input type="text" name="id"> 
   PassWord : <input type="password" name="password"><button>LOG-IN</button>
   <a href="/mall/client/add.do">회원가입</a></p>
   </form>
   
  </c:if>
  <c:if test="${not empty loginUser}">
  <a href="${pageContext.request.contextPath}/item/logout.do">로그아웃</a>
  </c:if>
   </ins>
</ul>
</div>
