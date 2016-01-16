<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<title>Slick Login</title>
<meta name="description" content="slick Login">
<meta name="author" content="Webdesigntuts+">
<link rel="stylesheet" href="${ctx}/static/css/login.css" type="text/css" />
<script src="${ctx}/static/js/jquery-ui-1.11.4.custom/external/jquery/jquery.js"></script>
<script type="text/javascript" src="${ctx}/static/js/placeholder.js"></script>
</head>
<body>
 <form id="loginForm" method="post" action="${ctx}/login">
<div class="login">
<label for="username">username</label><input type="text" name="username" class="placeholder" placeholder="me@tutsplus.com">
<label for="password">password</label><input type="password" name="password" class="placeholder" placeholder="password">
<fieldset id="remember_me" class="remember_me">
<input style="float:right" onclick="if($(this).attr('checked')=='checked')$('#remeberMe').val(true);else $('#remeberMe').val(false);" type="checkbox" checked="checked"><label style="display:block;float:right;">&nbsp;记住我</label>
 <input type="hidden" id="rememberMe" name="rememberMe" value="true"/>
 </fieldset>
   <fieldset id="actions">
	<input type="submit" class="submit" id="submit" value="登录">
	<input type="button" class="registry" id="registry" value="注册">
   </fieldset>
   </div>
</form>
</body>
</html>