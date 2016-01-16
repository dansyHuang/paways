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
<script src="${ctx}/static/js/jquery-ui-1.11.4.custom/external/jquery/jquery.js"></script>
<link rel="stylesheet" href="${ctx}/static/css/content.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/menu.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/jquery.fancybox-1.3.4.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/style.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/pways.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/dpl.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="${ctx}/static/js/diyUpload/webuploader.css"/>
<script type="text/javascript" src="${ctx}/static/js/diyUpload/webuploader.nolog.min.js"></script>
<link rel="stylesheet" href="${ctx}/static/js/jquery-ui-1.11.4.custom/jquery-ui.css"/>
<script src="${ctx}/static/js/jquery-ui-1.11.4.custom/jquery-ui.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/pways.js"></script>
<script type="text/javascript" src="${ctx}/static/js/select-picker.js"></script>
<!-------------------BUI----------------->
  <script src="${ctx}/static/bui/jquery-1.8.1.min.js"></script>
  <script src="${ctx}/static/bui/sea.js"></script>
  <script src="${ctx}/static/bui/config.js"></script>
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