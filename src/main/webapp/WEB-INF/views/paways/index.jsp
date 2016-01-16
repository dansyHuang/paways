<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页 - 明诚国学教育中心</title>
<link rel="stylesheet" href="${ctx}/static/css/content.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/menu.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/jquery.fancybox-1.3.4.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/static/css/style.css" type="text/css" />

<script type="text/javascript" src="${ctx}/static/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/superfish.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery.tools.min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery.fancybox-1.3.4.pack.js"></script>
<script type="text/javascript" src="${ctx}/static/js/jquery.carouFredSel.js"></script>
<script type="text/javascript" src="${ctx}/static/js/custom.js"></script>
<!--[if IE 6]>
	<script type="text/javascript" src="${ctx}/static/js/ie7.js"></script>
	<script type="text/javascript" src="${ctx}/static/js/DD_belatedPNG.js"></script>	
	<script type="text/javascript">
		DD_belatedPNG.fix('.logo img, .video_player, .scroll_page a, .apply-link li a, .module-help-contact, .sidebar-menu-cont li a, .module-sidebar-contact');
	</script>
<![endif]-->
</head>

<body>
<div id="wrapper">	
    <!-- ==================== S ContentArea ==================== -->
    <div class="ContentArea">    	
    	<div class="container">
            <div class="page-cont">
            	<!-- S module-default -->
                <div class="module-default">
                	<div class="mod-inner">
                    	<div class="mod-content">
		                	<!-- S qhd-module -->
		                    <div class="qhd-module">
		                    	<div class="column">
			                    	<div class="col-3-1">
		                            	<!-- S module -->
		                            	<div class="module module-announcement">
		                                	<div class="mod-inner">
                                            	<div class="mod-tit">
                                                	<h3><img src="${ctx}/static/images/announcement_hd.jpg" alt="最心公告" title="最心公告" /></h3>
                                                </div>
		                                    	<div class="mod-content">
			                                    	<!-- S 公告 -->
						                        	<ul class="article-list-row article-list-row-hasLine">
                                                        <li><a href="news-detail.html">成长日记意见反馈征集活动</a></li>
                                                        <li><a href="news-detail.html">结缘明城国学赠公告</a></li>
                                                        <li><a href="news-detail.html">公司诚征长期供货商</a></li>
                                                        <li><a href="news-detail.html">明城国学招长期义工</a></li>
                                                        <li><a href="news-detail.html">明城国学招网上义工</a></li>
                                                        <li><a href="news-detail.html">成长日记意见反馈征集活动</a></li>
                                                        <li><a href="news-detail.html">成长日记意见反馈征集活动</a></li>
                                                        <li><a href="news-detail.html">结缘明城国学赠公告</a></li>
                                                    </ul>
					                                <!-- E 公告 -->
		                                        </div>
		                                    </div>
		                                </div>
		                                <!-- E module -->
		                                
			                        </div>
			                        
			                        <div class="col-3-2 last">
		                            	<!-- S module -->
		                            	<div class="module">
		                                	<div class="mod-inner">
		                                    	<div class="mod-content">
			                                    	<!-- S banner -->
						                            <div class="banner">
						                            	<!-- Slideshow start -->
									                    <div class="slideshow clearfix">
									                    	<div id="foo1">
						                                        <div class="slide">
										                            <a href="#"><img src="${ctx}/static/images/upload/banner_01.jpg" alt="01" width="644" height="260" /></a>
										                        </div>
			                                                    <div class="slide">
										                            <a href="#"><img src="${ctx}/static/images/upload/banner_02.jpg" alt="02" width="644" height="260" /></a>
										                        </div>
			                                                    <div class="slide">
										                            <a href="#"><img src="${ctx}/static/images/upload/banner_03.jpg" alt="03" width="644" height="260" /></a>
										                        </div>
						                                    </div>		                     
									                    <div class="scroll_page_num" id="pag_01"></div>
									                    <script type="text/javascript">
									                      $(function() {
									                         $("#foo1").carouFredSel({
									                            responsive: true,
									                            //scroll: {fx: "crossfade"},
									                            items: {visible: 1},
									                            pagination	: "#pag_01"
									                        });
									                    });
									                    </script>
									                    </div>	   
									                    <!-- //Slideshow end -->
						                            </div>
						                            <!-- E banner -->
		                                        </div>
		                                    </div>
		                                </div>
		                                <!-- E module -->
		                            	
			                        </div>
		                        </div>
		                    </div>
		                    <!-- E qhd-module -->
                        </div>
                    </div>                    
                    <div class="mod-dividing-line-01"></div>                    
                </div>
                <!-- E module-default -->
                
                
                <!-- S module-3col-hasBg -->
                <div class="module-3col-hasBg">
                	<div class="mod-inner">
                    	<div class="mod-content">
		                	<!-- S qhd-module -->
		                    <div class="qhd-module">
		                    	<div class="column">
			                    	<div class="col-3-1">
		                            	<!-- S module -->
		                            	<div class="module">
		                                	<div class="mod-inner">
		                                    	<div class="mod-tit">
		                                        	<h3><img src="${ctx}/static/images/news_tit_01.png" alt="影音课堂" /></h3>
		                                        	<a title="查看更多" href="#" class="more more-01"><span>更多</span></a>
		                                        </div>
		                                        <div class="mod-content">
			                                    	<!-- S 视频 -->
						                            <div class="vidoe_img">
		                                            	<a href="http://player.youku.com/player.php/sid/XNTExNzgxMjAw/v.swf" class="various4"><img src="${ctx}/static/images/upload/video_img_307.jpg" alt="视频介绍" /></a>
		                                                <a href="http://player.youku.com/player.php/sid/XNTExNzgxMjAw/v.swf" class="various4"><span class="video_player"></span></a>
		                                            </div>
		                                            <script type="text/javascript"> 
													$(document).ready(function() {
														$("a.various4").fancybox({
															'padding'			: 0,
															'autoScale'			: false,
															'transitionIn'		: 'none',
															'transitionOut'		: 'none',
															'hideOnOverlayClick':false
														});
													});
													</script>
						                            <!-- E 视频 -->
		                                        </div>
		                                    </div>
		                                </div>
		                                <!-- E module -->
		                                
			                        </div>
			                        
		                            <div class="col-3-1">
		                            	<!-- S module -->
		                            	<div class="module">
		                                	<div class="mod-inner">
		                                    	<div class="mod-tit">
		                                        	<h3><img src="${ctx}/static/images/news_tit_02.png" alt="德音雅乐" /></h3>
		                                        	<a title="查看更多" href="#" class="more more-01"><span>更多</span></a>
		                                        </div>
		                                        <div class="mod-content">
		                                        	<!-- S article-list-row -->
						                            <ul class="article-list-row">
			                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
			                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
			                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
			                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
			                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
			                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
			                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
			                                        </ul>
						                            <!-- E article-list-row -->
		                                        </div>
		                                    </div>
		                                </div>
		                                <!-- E module -->
		                            </div>
		                            
			                        <div class="col-3-1 last">
		                            	<!-- S module -->
		                            	<div class="module">
		                                	<div class="mod-inner">
		                                    	<div class="mod-tit">
		                                        	<h3><img src="${ctx}/static/images/news_tit_03.png" alt="活动记录" /></h3>
		                                        	<a title="查看更多" href="#" class="more more-01"><span>更多</span></a>
		                                        </div>
		                                        <div class="mod-content">
			                                    	<!-- S article-list-row -->
						                            <ul class="article-list-row">
			                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
			                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
			                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
			                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
			                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
			                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
			                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
			                                        </ul>
						                            <!-- E article-list-row -->
		                                        </div>
		                                    </div>
		                                </div>
		                                <!-- E module -->
		                            	
			                        </div>
		                        </div>
		                    </div>
		                    <!-- E qhd-module -->
                        </div>
                    </div>
                </div>
                <!-- E module-3col-hasBg -->
                
                
                <!-- S module-default -->
                <div class="module-default">
                	<div class="mod-inner">
                    	<div class="mod-content">
	                    	<!-- S module-link 链接模块 -->
	                        <div class="module module-link">
	                        	<div class="mod-inner">
	                            	<div class="mod-tit"><h3><img src="${ctx}/static/images/edu_tit.png" alt="教学为先" /></h3></div>
	                                <div class="mod-content">
	                                	<div class="mod-tit-link">
	                                    	<a href="#">幸福人生讲座</a>
	                                        <a href="#">王凤仪性命哲学思想</a>
	                                        <a href="#">原始点</a>
	                                        <a href="#">研习班</a>
	                                        <a href="#">义工班</a>
	                                        <a href="#">专题讲座</a>
	                                        <a href="#">周末班</a>
	                                    </div>
	                                </div>
	                            </div>
	                        </div>
	                        <!-- E module-link 链接模块 -->
                    	
	                        <!-- S module-default -->
			                <div class="module-default">
			                	<div class="mod-inner">
                                	<div class="mod-content">
		                            	<!-- S qhd-module -->
					                    <div class="qhd-module">
					                    	<div class="column">
						                    	<div class="col-3-1">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                        <div class="mod-content">
						                                    	<!-- S 新闻banner -->
		                                                        <div class="news_banner">
										                            <!-- Slideshow start -->
														            <div class="slideshow clearfix">
														             <div id="foo2">
														                <div class="slide">
														                    <a href="news-detail.html"><img src="${ctx}/static/images/upload/news_img_307x209.jpg" width="307" height="209" alt="carousel 1" /></a>
		                                                                    <div class="info">
														                        <p><a href="#">拿什么奉献给你，妈妈 — 母亲节让我们一起感恩母爱</a></p>
														                    </div>
														                </div>
														                <div class="slide">
														                    <a href="news-detail.html"><img src="${ctx}/static/images/upload/news_img_307x209.jpg" width="307" height="209" alt="carousel 2" /></a>
														                    <div class="info">
														                        <p><a href="#">拿什么奉献给你，妈妈 — 母亲节让我们一起感恩母爱</a></p>
														                    </div>
														                </div>
														             </div>
														             <a class="scroll_prev" id="prev_02" href="#"><span>prev</span></a>
														             <a class="scroll_next" id="next_02" href="#"><span>next</span></a>
														            <script type="text/javascript">
														              $(function() {
														                 $("#foo2").carouFredSel({
														                    responsive: true,
														                    items: {visible: 1},
														                    prev: {button: "#prev_02",key:"left"},
														                    next: {button:"#next_02", key:"right"}
														                });
														            });
														            </script>
														            </div>	   
														            <!-- //Slideshow end -->
		                                                        </div>
									                            <!-- E 新闻banner -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                                
						                        </div>
						                        
					                            <div class="col-3-1">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                    	<div class="mod-tit">
		                                                    	<i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
					                                        	<h3>幸福人生讲座</h3>
					                                        	<a title="查看更多" href="#" class="more"><span>【更多】</span></a>
					                                        </div>
					                                        <div class="mod-content">
					                                        	<!-- S article-list-row -->
									                            <ul class="article-list-row">
						                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
						                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
						                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
						                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
						                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
						                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
						                                        </ul>
									                            <!-- E article-list-row -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                            </div>
					                            
						                        <div class="col-3-1 last">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                    	<div class="mod-tit">
		                                                    	<i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
					                                        	<h3>王凤仪性命哲学思想</h3>
					                                        	<a class="more" href="#" title="查看更多"><span>【更多】</span></a>
					                                        </div>
					                                        <div class="mod-content">
						                                    	<!-- S article-list-row -->
									                            <ul class="article-list-row">
						                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
						                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
						                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
						                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
						                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
						                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
						                                        </ul>
									                            <!-- E article-list-row -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                            	
						                        </div>
					                        </div>
					                    </div>
					                    <!-- E qhd-module -->
                                    </div>
	                            </div>                            
	                            <div class="mod-dividing-line-02"></div>
	                        </div>
	                        <!-- E module-default -->
                        
	                        <!-- S module-default -->
			                <div class="module-default">
			                	<div class="mod-inner">
                                	<div class="mod-content">
		                            	<!-- S qhd-module -->
					                    <div class="qhd-module">
					                    	<div class="column">
						                    	<div class="col-3-1">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                    	<div class="mod-tit">
		                                                    	<i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
					                                        	<h3>原始点</h3>
					                                        	<a title="查看更多" href="#" class="more"><span>【更多】</span></a>
					                                        </div>
					                                        <div class="mod-content">
					                                        	<!-- S article-list-row -->
									                            <ul class="article-list-row">
						                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
						                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
						                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
						                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
						                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
						                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
						                                        </ul>
									                            <!-- E article-list-row -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                                
						                        </div>
						                        
					                            <div class="col-3-1">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                    	<div class="mod-tit">
		                                                    	<i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
					                                        	<h3>研习班</h3>
					                                        	<a title="查看更多" href="#" class="more"><span>【更多】</span></a>
					                                        </div>
					                                        <div class="mod-content">
					                                        	<!-- S article-list-row -->
									                            <ul class="article-list-row">
						                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
						                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
						                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
						                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
						                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
						                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
						                                        </ul>
									                            <!-- E article-list-row -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                            </div>
					                            
						                        <div class="col-3-1 last">
					                            	<!-- S module -->
					                            	<div class="module">
					                                	<div class="mod-inner">
					                                    	<div class="mod-tit">
		                                                    	<i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
					                                        	<h3>专题讲座</h3>
					                                        	<a class="more" href="#" title="查看更多"><span>【更多】</span></a>
					                                        </div>
					                                        <div class="mod-content">
						                                    	<!-- S article-list-row -->
									                            <ul class="article-list-row">
						                                            <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
						                                            <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
						                                            <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
						                                            <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
						                                            <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
						                                            <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
						                                        </ul>
									                            <!-- E article-list-row -->
					                                        </div>
					                                    </div>
					                                </div>
					                                <!-- E module -->
					                            	
						                        </div>
					                        </div>
					                    </div>
					                    <!-- E qhd-module -->
                                    </div>
	                            </div>
	                            <div class="mod-dividing-line-03"></div> 
	                        </div>
	                        <!-- E module-default -->
	                	</div>
                    </div>
                </div>
                <!-- E module-default -->
                
                
                <!-- S module-tit-line 容器 -->
                <div class="module module-tit-line">
                    <div class="mod-inner">
                        <div class="mod-tit">
                        	<h3><img src="${ctx}/static/images/pro_tit.png" alt="义卖展示" /></h3>
                            <a class="more more-01" href="#" title="查看更多"><span>更多</span></a>
                        </div>
                        <div class="mod-content">
                            <!-- start -->
                            <div class="scrollable index_products_scrollable mod_gallery_list mod_gallery_list_index_5">
                                <ul id="products_scrollable" class="clearfix">
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_01_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_02_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_03_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_04_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_05_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_01_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_02_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_03_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_04_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_05_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_01_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_02_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_03_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_04_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                    <li>
                                        <p class="pro_medium_box"><a href="products_detail.html"><img src="${ctx}/static/images/upload/products_05_161x154.jpg" alt="" width="161" height="154" /></a></p>
                                        <h4 class="pro_name_bg"><a href="products_detail.html">弟子规拼图</a></h4>
                                    </li>
                                </ul>
                                <a class="scroll_prev" id="products_prev_01" href="#"><span>prev</span></a>
                                <a class="scroll_next" id="products_next_01" href="#"><span>next</span></a>
                                <div class="scroll_page" id="products_pag"></div>
                            </div>
                            <script type="text/javascript">
                              $(function() {
                                 $("#products_scrollable").carouFredSel({
                                  circular: false,
                                  infinite: false,
                                  prev	: {	
                                      button	: "#products_prev_01",
                                      key		: "left"
                                  },
                                  next	: { 
                                      button	: "#products_next_01",
                                      key		: "right"
                                  },
                                  pagination	: "#products_pag"
                                 });
                            });
                            </script>
                            <!-- end -->
                        </div>
                    </div>
                    <div class="mod-dividing-line-03"></div>
                </div>
                <!-- E module-tit-line 容器 -->
                
                
                <!-- S module-default -->
                <div class="module-default">
                    <div class="mod-inner">
                    	<div class="mod-content">
	                        <!-- S qhd-module -->
	                        <div class="qhd-module">
	                            <div class="column">
	                                <div class="col-3-1">
	                                    <!-- S module -->
	                                    <div class="module">
	                                        <div class="mod-inner">
	                                            <div class="mod-tit">
	                                                <i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
	                                                <h3>义工风采</h3>
	                                                <a title="查看更多" href="#" class="more"><span>【更多】</span></a>
	                                            </div>
	                                            <div class="mod-content">
	                                                <!-- S scroll_2row -->                                                
	                                                <div class="scrollable scroll_2row">
						                                <ul id="scroll_2row" class="clearfix">
						                                    <li class="noMargin">
						                                        <p ><a href="products_detail.html"><img src="${ctx}/static/images/upload/fencai_01_146x126.jpg" alt="" width="146" height="126" /></a></p>
						                                        <h4 ><a href="products_detail.html">义工风采 1</a></h4>
						                                    </li>
						                                    <li>
						                                        <p ><a href="products_detail.html"><img src="${ctx}/static/images/upload/fencai_02_146x126.jpg" alt="" width="146" height="126" /></a></p>
						                                        <h4 ><a href="products_detail.html">义工风采 2</a></h4>
						                                    </li>
						                                    <li class="noMargin">
						                                        <p ><a href="products_detail.html"><img src="${ctx}/static/images/upload/fencai_01_146x126.jpg" alt="" width="146" height="126" /></a></p>
						                                        <h4 ><a href="products_detail.html">义工风采 3</a></h4>
						                                    </li>
						                                    <li>
						                                        <p ><a href="products_detail.html"><img src="${ctx}/static/images/upload/fencai_02_146x126.jpg" alt="" width="146" height="126" /></a></p>
						                                        <h4 ><a href="products_detail.html">义工风采 4</a></h4>
						                                    </li>
						                                </ul>
						                                <div class="scroll_page" id="scroll_2row_pag"></div>
						                            </div>
						                            <script type="text/javascript">
						                              $(function() {
						                                 $("#scroll_2row").carouFredSel({
						                                  circular: false,
						                                  infinite: false,
														  auto 	: false,			                                  
						                                  pagination	: "#scroll_2row_pag"
						                                 });
						                            });
						                            </script>
	                                                <!-- E scroll_2row-->
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <!-- E module -->
	                                    
	                                </div>
	                                
	                                <div class="col-3-1">
	                                    <!-- S module -->
	                                    <div class="module">
	                                        <div class="mod-inner">
	                                            <div class="mod-tit">
	                                                <i class="mod-icon" style="background-image:url(${ctx}/static/images/mc-icon.png);"></i>
	                                                <h3>义工活动</h3>
	                                                <a title="查看更多" href="#" class="more"><span>【更多】</span></a>
	                                            </div>
	                                            <div class="mod-content">
	                                                <!-- S article-list-row -->
	                                                <ul class="article-list-row">
	                                                    <li><a href="news-detail.html">为国教子 以德育人——幼儿师资培训班</a></li>
	                                                    <li><a href="news-detail.html">中华传统文化师资培训基地招募启示</a></li>
	                                                    <li><a href="news-detail.html">《厚德少年夏令营》招生简章</a></li>
	                                                    <li><a href="news-detail.html">重庆三百多学生集体给长辈洗脚 家长热泪盈眶</a></li>
	                                                    <li><a href="news-detail.html">第45期深圳蛇口《幸福人生讲座》剪影</a></li>
	                                                    <li><a href="news-detail.html">复旦校长批教育功利：无德学生越有知识越祸害</a></li>
	                                                </ul>
	                                                <!-- E article-list-row -->
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <!-- E module -->
	                                </div>
	                                
	                                <div class="col-3-1 last">
	                                    <!-- S module -->
	                                    <div class="module module-index-apply">
	                                        <div class="mod-inner">                                            
	                                            <div class="mod-content">
	                                                <!-- S apply-link -->
	                                                <div class="apply-link">
	                                                	<ul>
	                                                    	<li><a href="长期义工报名.html">【 长期义工报名 】</a></li>
	                                                        <li><a href="短期义工报名.html">【 短期义工报名 】</a></li>
	                                                        <li><a href="网上义工报名.html">【 网上义工报名 】</a></li>
	                                                    </ul>
	                                                </div>
	                                                <!-- E apply-link -->
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <!-- E module -->
	                                    
	                                </div>
	                            </div>
	                        </div>
	                        <!-- E qhd-module -->
                        </div>
                    </div>
                </div>
                <!-- E module-default -->
                
                
                
            </div>
        </div>
    </div>
    <!-- ==================== E ContentArea ==================== -->
    
    
   
    
    
</div>
</body>
</html>