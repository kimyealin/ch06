<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글등록</title>
</head>
<body>
	<center>
		<h3>새글 등록</h3>
		<hr>
		<form action="insertBoard" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">작성자</td>
					<td align="left"><input type="text" name="writer" size="10" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">내용</td>
					<td align="left"><textarea rows="10" cols="40" name="content"></textarea>
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="새글등록" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>