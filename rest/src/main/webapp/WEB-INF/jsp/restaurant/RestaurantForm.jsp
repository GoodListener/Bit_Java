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
<h1>새 맛집 등록</h1>
<form action='add.do' method='post' enctype="multipart/form-data">
<a href='list.do'>목록</a>
<table class="type01">
<tr>
  <th>맛집 이름</th>
  <td><input type='text' name='name' placeholder="제목을 넣으세요."></td>
</tr>
<tr>
  <th>사진</th>
  <td><input type='file' name='file'></td>
</tr>
<tr>
  <th>내용</th>
  <td><textarea rows='10' name='content' cols='60'
       placeholder="내용을 입력하세요."></textarea></td>
</tr>
<tr>
  <th>장소</th>
  <td><input type='text' name='location'></td>
</tr>
</table>

<p><button type='submit'>등록</button></p>

</form>
</body>
</html>



