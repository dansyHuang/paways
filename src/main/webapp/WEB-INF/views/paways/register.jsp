<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页 - 明诚国学教育中心</title>
<%-- <script type="text/javascript" src="${ctx}/static/ckeditor/ckeditor.js"></script> --%>
<script src="${ctx}/static/bui/uploader-min.js"></script>
<script src="${ctx}/static/bui/form-min.js"></script>
<script type="text/javascript" src="${ctx}/static/js/pways.js"></script>
</head>

<body>
<div id="wrapper">	
    <!-- ==================== S ContentArea ==================== -->
    <div class="ContentArea">    	
    	<div class="container">
            <div class="page-cont">
            	<div class="column">
                    
                    <div class="col-4-3 last">
                    	<!-- S Main -->
                    	<div class="Main">
                        	<!-- S page-title -->
                            
                            <!-- S main-cont -->
                            <div class="main-cont">
                            	<!-- S module -->
                            	<div class="module">
                                	<div class="mod-inner">
                                    	<div class="mod-content">
                                        	<!-- S apply_form -->
                                            <div >
                                            	<div class="page-title clearfix">
													<h2>长期义工报名</h2>
												    <!-- S breadcrumbs  -->
												    <div class="breadcrumbs">
												        您现在的位置：<a href="/" class="breadcrumbs-home">首页</a><i>&gt;</i>
												    	<strong>会员注册</strong>
												    </div>
													<!-- E breadcrumbs -->
												</div>
	                                            <div style="padding:0px 0px;">
	                                            	<div id="left" class="panel-div panel-div-left" >很高兴您已找到属于您的组织</div>
<!-- 	                                            	<div id="right" onclick="$(this).css('background-color','#fff').css('border-bottom','0px');$('#left').css('background-color','#F5F5F5');$('#teacher').css('display','none');$('#jiazhang').css('display','block');" class="panel-div panel-div-right">找老师</div>
 -->	                                            </div>
                                            	<div class="panel-body">
											        <form id="registryForm" name="registryForm" class="form-horizontal teacher" action="" method="post" enctype="multipart/form-data">
											        	<div class="control-group">
													          <div class="controls">
													            <label class="control-label">登录帐号：&nbsp;&nbsp;</label><input  class="input-large bui-form-field" data-rules="{required : true}"  type="text" name="loginId" placeholder="请输入您的登录帐号" >
													          </div>
												          </div>
												          <div class="control-group">
													          <div class="controls">
													            <label class="control-label">真实姓名：&nbsp;&nbsp;</label><input  class="input-large bui-form-field required"   type="text" name="name" placeholder="请输入您的真实姓名" >
													          </div>
												          </div>
												          <div class="control-group">
													          <div class="controls">
													             <label class="control-label">手机号码：&nbsp;&nbsp;</label><input class="input-large bui-form-field required number" type="text" name="mobileNum" id="mobileNum" placeholder="您的真实手机号"  >
													          </div>
												          </div>
												          <div class="control-group">
													          <div class="controls">
													            <label class="control-label">身份证号：&nbsp;&nbsp;</label><input class="input-large bui-form-field required" type="text" name="idCard" placeholder="您的真实身份号码" >
													          </div>
												          </div>
												          <div class="control-group">
													          <div class="controls">
													            <label class="control-label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;</label>
													            <input class="input-normal bui-form-field" type="password" id="userPassword" name="userPassword" placeholder="您的密码" >
													            <input class="input-normall bui-form-field" type="password" name="password_again" id="password_again" placeholder="密码确认" >
													          </div>
												          </div>
												          <div class="control-group">
													        <label class="control-label">&nbsp;&nbsp;&nbsp;城&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市：</label>
													        <div class="controls bui-form-group-select" data-type="city">
													          <input type="text" id="schoolName" class="schoolName" readonly />
													           <input type="hidden" id="homeTown"   name="homeTown"  />
														    <div id="proSchool" class="provinceSchool">
														      <div class="title">
														        <span>已选择:</span>
														      </div>
														      <div class="proSelect">
																<select onchange="selectOrg(this.value);">
																	<c:forEach items="${provinces}" var="province">
																		<option value="${province.id}">${province.name}</option>
																	</c:forEach>
																</select>
																<span>如没找到选择项，请选择其他手动填写</span>
																<input type="text" >
															  </div>
														      <div class="schoolList">
														        <ul>
														        </ul>
														      </div>
														    </div>
													        </div>
													      </div>
													      <div class="control-group">
													        <label class="control-label">&nbsp;&nbsp;&nbsp;帐号类型：</label>
													        <div class="controls bui-form-group-select" data-type="city">
													          <select id="selecOrg" class="input-small required" value="山东省">
													          	<option>求学(学生)</option>
													          	<option>授学(老师)</option>	
													          </select>
													          <input id="supply"  style="display:none" class="input-normal bui-form-field" type="text" name="homeTow" placeholder="你所属于组" >
													        </div>
													      </div>
												           <div class="control-group">
													          <div class="controls">
													            <label class="control-label">照&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;片：</label>
																    <div class="span8">
																      <div id="J_Uploader">
																      </div>
																    </div>
													          </div>
												          </div>
												          <input type="hidden" id="filePath" name="imgPath"/>
												         <div class="control-group">
													        <label class="control-label">&nbsp;&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
													        <div class="controls">
													          <label class="radio" for=""><input  value="0" onclick="$('#te_gender').val($(this).val());" name="sex" type="radio">男</label>&nbsp;&nbsp;&nbsp;
													          <label class="radio" for=""><input   value="1" onclick="$('#te_gender').val($(this).val());" name="sex" type="radio">女</label>
													          <input type="hidden" name="gender" class="required" id="te_gender" />
													        </div>
													      </div>
												          
												           <div class="control-group submit-button">
												            <input type="submit" class="submit" id="registry" value="立即注册">
												            <input type="reset" class="registry" id="reset" value="重置">
												           </div>
												       </form>
											      </div>     
                                            </div>
                                            <!-- E apply_form -->
                                        </div>
                                    </div>
                                </div>
                                <!-- E module -->
                            </div>
                            <!-- E main-cont -->
                        </div>
                        <!-- E Main -->                  	
                    </div>
                    
                </div>
            </div>
        </div>
    </div>
    <div id="dialog" class="dialog"></div>
    <!-- ==================== E ContentArea ==================== -->
		<!--  <script>
		 CKEDITOR.config.width=560;
		CKEDITOR.config.height=200;
		CKEDITOR.replace('editor1',{
			// Define the toolbar groups as it is a more accessible solution.
			toolbarGroups: [
				{"name":"basicstyles","groups":["basicstyles"]},
				{"name":"links","groups":["links"]},
				{"name":"insert","groups":["insert"]},
				{"name":"styles","groups":["styles"]}
			],
			removeButtons: 'Underline,Strike,Subscript,Superscript,Anchor,Styles,Specialchar'
		} );
		CKEDITOR.replace('editor2',{
			// Define the toolbar groups as it is a more accessible solution.
			toolbarGroups: [
				{"name":"basicstyles","groups":["basicstyles"]},
				{"name":"links","groups":["links"]},
				{"name":"insert","groups":["insert"]},
				{"name":"styles","groups":["styles"]}
			],
			removeButtons: 'Underline,Strike,Subscript,Superscript,Anchor,Styles,Specialchar'
		} );
		 
		</script> -->
	</div>
</body>
</html>