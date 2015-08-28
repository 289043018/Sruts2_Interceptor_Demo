<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
 <a href="<%=path %>/Users_add!add.action">添加</a><br>
    <a href="<%=path %>/Users_show!show.action">查看</a><br>
    <a href="<%=path %>/Users_update!update.action">修改</a><br>
    <a href="<%=path %>/Users_delete!delete.action">删除</a><br>
    <hr>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</hr>
    <a href="<%=path %>/News_add!add.action">添加</a><br>
    <a href="<%=path %>/News_show!show.action">查看</a><br>
    <a href="<%=path %>/News_update!update.action">修改</a><br>
    <a href="<%=path %>/News_delete!delete.action">删除</a><br>
    <a href="<%=path %>/loginAction.action">删除</a>
	<form action="<%=path %>/login.action" method="post">
		<input type="submit" value="进入拦截器">
	</form>
</body>
</html>
