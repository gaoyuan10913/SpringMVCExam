执行步骤：
(1)在工程目录下运行 mvn jetty:run
(2)在浏览器中输入 http://localhost:8080/login.jsp 访问登录页面
(3)登录成功后跳转到 index页面,点击查询按钮得到customer列表，没有分页，点击退出会退到登录页面
(注：拦截器没有成功，也可以通过http://localhost:8080/index 访问index.jsp ,点击查询按钮一样会出现customer列表；
	数据库配置文件在src\main\resources里面的jdbc.properties)