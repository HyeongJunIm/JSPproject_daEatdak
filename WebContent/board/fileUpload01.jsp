<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="fileForm" method="post" enctype="multipart/form-data" action="fileupLoad_result01.jsp">

	<p>이름 : <input type="text" name="name1"/></p>
	<p>제목 : <input type="text" name="subject1"/></p>
	<p>파일1 : <input type="file" name="filename1"/></p>

	<p>이름 : <input type="text" name="name2"/></p>
	<p>제목 : <input type="text" name="subject2"/></p>
	<p>파일1 : <input type="file" name="filename2"/></p>

	<p>이름 : <input type="text" name="name3"/></p>
	<p>제목 : <input type="text" name="subject3"/></p>
	<p>파일1 : <input type="file" name="filename3"/></p>
	
	<p> <input type="submit" value="파일올리기"/></p>
</form>

</body>
</html>