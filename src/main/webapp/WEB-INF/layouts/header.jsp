<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<script type="text/javascript">
<!--
$(document).ready(function(){
	  $('#login-trigger').click(function(){
			$('#login-content').slideToggle();
		    $(this).toggleClass('active');          
		    
		    if ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;');
		      else $(this).find('span').html('&#x25BC;');
		})
	});
//-->
</script>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
 <!-- ==================== S Top ==================== -->
    <div class="Top"></div>
    <!-- ==================== E Top ==================== -->
    
    
    <!-- ==================== S Header ==================== -->
    <div class="Header">
    	<div class="header-bg" style="height:230px; background:url(${ctx}/static/images/header.jpg) no-repeat top center;">
	    	<div class="container clearfix">  
		    	<!-- S logo -->
	            <div class="logo">
	                <a href="home.html"><img src="${ctx}/static/images/logo.png" alt="深圳明诚国学教育中心" /></a>
	            </div>
	            <div class="logo">
	                <a href="home.html"><img src="${ctx}/static/images/logo.png" alt="深圳明诚国学教育中心" /></a>
	            </div>
	            <!-- E logo -->
	            
	            <!-- S top-widget-area -->
	            <div class="top-widget-area"></div>
	            <!-- E top-widget-area -->           
	        </div>
        </div>
        
        <div class="nav-area">
        	<div class="container clearfix">
            	<!-- S main_nav -->
                <div class="main-nav">
                    <ul class="sf-menu">
                        <li class="current"><a href="index.html">首页</a></li>
                        <li class=""><a href="about.html">中心简介</a>
                            <ul>
                                <li><a href="#.html">宗旨</a></li>
                                <li><a href="#.html">校训</a></li>
                                <li><a href="#.html">校规</a></li>
                                <li><a href="#.html">教学形式</a></li>
                                <li><a href="#.html">交通路线</a></li>
                                <li><a href="contact.html">联系我们</a></li>
                            </ul>
                        </li>
                        <li class=""><a href="news.html">影音艺苑</a>
                        	<ul>
                                <li><a href="news.html">德音雅乐</a></li>
                                <li><a href="video.html">影音课堂</a></li>
                                <li><a href="news.html">活动记录</a></li>
                            </ul>
                        </li>
                        <li class=""><a href="教学为先.html">教学为先</a>
                            <ul>
                                <li><a href="news.html">幸福人生讲座</a></li>
                                <li><a href="news.html">王凤仪性命哲学思想</a></li>
                                <li><a href="news.html">原始点</a></li>
                                <li><a href="news.html">研习班</a></li>
                                <li><a href="news.html">义工班</a></li>
                                <li><a href="news.html">原始点</a></li>
                                <li><a href="news.html">专题讲座</a></li>
                                <li><a href="news.html">周末班</a></li>
                            </ul>
                        </li>
                        <li class=""><a href="素食养生.html">素食养生</a></li>
                        <li class=""><a href="products.html">义卖展示</a></li>
                        <li class=""><a href="#.html">爱心传递</a>
                            <ul>
                                <li><a href="义工风采.html">义工风采</a></li>
                                <li><a href="义工活动.html">义工活动</a></li>                                
                            </ul>
                        </li>                        
                        <li class=""><a href="#.html">网上报名</a>
                        	<ul>
                                <li><a href="${ctx }/login.html">长期义工报名</a></li>
                                <li><a href="短期义工报名.html">短期义工报名</a></li>
                                <li><a href="网上义工报名.html">网上义工报名</a></li>
                            </ul>
                        </li>
                        <li  class="" style="height:auto;">
                        <shiro:guest>
					      <a id="login-trigger"  href="#">
					       	 登录 <span>▼</span>
					      </a>
					      <div id="login-content">
					        <form id="loginForm" method="post" action="${ctx}/login">
					          <fieldset id="inputs">
					            <input id=""username"" type="text" name="username" placeholder="您的注册帐号" required>   
					            <input id="password" type="password" name="password" placeholder="您的密码" required>
					          </fieldset>
					          <fieldset id="remember_me">
					             <label class="remember_me"><input onclick="if($(this).attr('checked')=='checked')$('#remeberMe').val(true);else $('#remeberMe').val(false);" type="checkbox" checked="checked">记住我</label>
					             <input type="hidden" id="rememberMe" name="rememberMe" value="true"/>
					          </fieldset> 
					          <fieldset id="actions">
					            <input type="submit" class="submit" id="submit" value="登录">
					            <input type="button" class="registry" id="registry" value="注册">
					          </fieldset>
					        </form>
					      </div>  
					      </shiro:guest>    
					    </li>
					   
					   
                     </ul>
                </div>
                <!-- E main_nav -->
            </div>
        </div>
    </div>
