<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>QuickStart示例:<sitemesh:title/></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<link rel="stylesheet" href="${ctx}/static/css/content.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/menu.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/style.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/pways.css" type="text/css" />
<script src="${ctx}/static/bui/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/select-picker.js"></script>
<!-------------------BUI----------------->
  <link rel="stylesheet" href="${ctx}/static/bui/css/bs3/bui-min.css" type="text/css" />
  <link rel="stylesheet" href="${ctx}/static/bui/css/bs3/dpl-min.css" type="text/css" />
  <script src="${ctx}/static/bui/bui-min.js"></script>
<sitemesh:head/>
</head>

<body>
	<div class="container1">
		<%@ include file="/WEB-INF/layouts/header.jsp"%>
		<div id="content">
			<sitemesh:body/>
		</div>
		<%@ include file="/WEB-INF/layouts/footer.jsp"%>
	</div>
</body>
</html>