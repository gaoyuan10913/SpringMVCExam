<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>登录</title>
<link rel="stylesheet" href="css/style.css">

<script type="text/javascript">
	function check(form) {
		if (document.forms.checkForm.userName.value == "") {
			alert("请输入用户名");
			document.forms.checkForm.userName.focus();
			return false;
		}
		if (document.forms.checkForm.password.value == "") {
			alert("请输入密码");
			document.forms.checkForm.password.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<div style="color: aqua;margin-top: 10px;margin-left: 10px;font-size: 20px">10913高远</div>
	<section class="container">
	<div class="login">
		<h1>电影租赁管理系统</h1>
		<form action="login" method="post" name="checkForm">
			<p>
				<input type="text" name="userName" value="" placeholder="用户名">
			</p>
			<p>
				<input type="password" name="password" value="" placeholder="密码">
			</p>
			<p class="submit">
				<input type="submit" name="commit" value="登录" onclick="return check(this);">
			</p>
		</form>
	</div>

	</section>
	<div style="text-align: center;"></div>
</body>
</html>
