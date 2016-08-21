<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<h2 align="center">用户信息列表</h2>

	<table border="1" align="center">
		<tbody>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty list}">
				<c:forEach items="${list}" var="user">
					<tr>
						<td>${user.uId}</td>
						<td>${user.uName}</td>
						<td>${user.uAge}</td>
						<td>
							<a href="#" style="text-decoration: none">编辑</a>
							<a href="/delete/${user.uId}" style="text-decoration: none">删除</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>