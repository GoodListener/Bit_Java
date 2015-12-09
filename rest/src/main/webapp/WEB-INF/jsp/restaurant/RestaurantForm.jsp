<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>새 맛집 등록</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
  <jsp:include page="/Header.jsp" />
  
<form action='add.do' method='post' enctype="multipart/form-data">

<table style="margin-left: auto; margin-right: auto; border-style: none">

 <tr>
   <td style="align:left;">
      <p><a class="button" href='list.do'>List</a></p>
   </td>
   <td style="align:left;">
      <p><button type='submit' class="button">Add</button></p>
   </td>
  </tr>
      
</table>
<table style="margin-left: auto; margin-right: auto;">
  <tr>
    <td style="text-align:left;font-size:30px;font-weight:bold;">새 맛집 등록</td>
  </tr>
<tr>
  <th bgcolor="#FAED7D">맛집 이름</th>
  <td><input type='text' name='name' placeholder="제목을 넣으세요."></td>
</tr>
<tr>
  <th bgcolor="#FAED7D">사진</th>
  <td><input type='file' name='file'></td>
</tr>
<tr>
  <th bgcolor="#FAED7D">내용</th>
  <td><textarea rows='10' name='content' cols='60'
       placeholder="내용을 입력하세요."></textarea></td>
</tr>
<tr>
  <th bgcolor="#FAED7D">장소</th>
  <td><input type='text' name='location'></td>
</tr>
</table>


</form>
</body>
</html>



