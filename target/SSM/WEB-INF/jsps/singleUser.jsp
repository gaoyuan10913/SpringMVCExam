<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果</title>
</head>
<body>
<h2 align="center">查询结果</h2>
	<table border="1" align="center">
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
			<tr>
				<td>${singleUser.uId}</td>
				<td>${singleUser.uName}</td>
				<td>${singleUser.uAge}</td>
				<td>
					<a href="#" style="text-decoration: none">编辑</a>
					<a href="/delete/${user.uId}" style="text-decoration: none">删除</a>
				</td>
			</tr>
	</table>
</body>
</html>