package org.apache.jsp.WEB_002dINF.views.paways;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>首页 - 明诚国学教育中心</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\t\n");
      out.write("    <!-- ==================== S ContentArea ==================== -->\n");
      out.write("    <div class=\"ContentArea\">    \t\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("            <div class=\"page-cont\">\n");
      out.write("            \t<div class=\"column\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-4-3 last\">\n");
      out.write("                    \t<!-- S Main -->\n");
      out.write("                    \t<div class=\"Main\">\n");
      out.write("                        \t<!-- S page-title -->\n");
      out.write("                            \n");
      out.write("                            <!-- S main-cont -->\n");
      out.write("                            <div class=\"main-cont\">\n");
      out.write("                            \t<!-- S module -->\n");
      out.write("                            \t<div class=\"module\">\n");
      out.write("                                \t<div class=\"mod-inner\">\n");
      out.write("                                    \t<div class=\"mod-content\">\n");
      out.write("                                        \t<!-- S apply_form -->\n");
      out.write("                                            <div >\n");
      out.write("                                            \t<div class=\"page-title clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>长期义工报名</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <!-- S breadcrumbs  -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <div class=\"breadcrumbs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t        您现在的位置：<a href=\"/\" class=\"breadcrumbs-home\">首页</a><i>&gt;</i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    \t<strong>会员注册</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- E breadcrumbs -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t                                            <div style=\"padding:0px 0px;\">\n");
      out.write("\t                                            \t<div id=\"left\" class=\"panel-div panel-div-left\" >很高兴您已找到属于您的组织</div>\n");
      out.write("<!-- \t                                            \t<div id=\"right\" onclick=\"$(this).css('background-color','#fff').css('border-bottom','0px');$('#left').css('background-color','#F5F5F5');$('#teacher').css('display','none');$('#jiazhang').css('display','block');\" class=\"panel-div panel-div-right\">找老师</div>\n");
      out.write(" -->\t                                            </div>\n");
      out.write("                                            \t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        <form id=\"registryForm\" name=\"registryForm\" class=\"form-horizontal teacher\" action=\"\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        \t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <label class=\"control-label\">登录帐号：&nbsp;&nbsp;</label><input  class=\"input-large bui-form-field required\"   type=\"text\" name=\"loginId\" placeholder=\"请输入您的登录帐号\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <label class=\"control-label\">真实姓名：&nbsp;&nbsp;</label><input  class=\"input-large bui-form-field required\"   type=\"text\" name=\"name\" placeholder=\"请输入您的真实姓名\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t             <label >手机号码：&nbsp;&nbsp;</label><input class=\"input-large bui-form-field required number\" type=\"text\" name=\"mobileNum\" id=\"mobileNum\" placeholder=\"您的真实手机号\"  >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <label class=\"control-label\">身份证号：&nbsp;&nbsp;</label><input class=\"input-large bui-form-field required\" type=\"text\" name=\"idCard\" placeholder=\"您的真实身份号码\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <label class=\"control-label\">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <input class=\"input-normal bui-form-field\" type=\"password\" id=\"userPassword\" name=\"userPassword\" placeholder=\"您的密码\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <input class=\"input-normall bui-form-field\" type=\"password\" name=\"password_again\" id=\"password_again\" placeholder=\"密码确认\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <label class=\"control-label\">&nbsp;&nbsp;&nbsp;城&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市：</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <div class=\"controls bui-form-group-select\" data-type=\"city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <input type=\"text\" id=\"schoolName\" class=\"schoolName\" readonly />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t           <input type=\"hidden\" id=\"homeTown\"   name=\"homeTown\"  />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <div id=\"proSchool\" class=\"provinceSchool\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <span>已选择:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"proSelect\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select onchange=\"selectOrg(this.value);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>如没找到选择项，请选择其他手动填写</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"schoolList\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <label class=\"control-label\">&nbsp;&nbsp;&nbsp;帐号类型：</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <div class=\"controls bui-form-group-select\" data-type=\"city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <select id=\"selecOrg\" class=\"input-small required\" value=\"山东省\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          \t<option>求学(学生)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          \t<option>授学(老师)</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <input id=\"supply\"  style=\"display:none\" class=\"input-normal bui-form-field\" type=\"text\" name=\"homeTow\" placeholder=\"你所属于组\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t           <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <label class=\"control-label\">照&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;片：</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t            <input id=\"uploadPhoto\" type=\"button\" value=\"上传照片\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          <input type=\"hidden\" id=\"filePath\" name=\"imgPath\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t         <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <label class=\"control-label\">&nbsp;&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        <div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <label class=\"radio\" for=\"\"><input  value=\"0\" onclick=\"$('#te_gender').val($(this).val());\" name=\"sex\" type=\"radio\">男</label>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <label class=\"radio\" for=\"\"><input   value=\"1\" onclick=\"$('#te_gender').val($(this).val());\" name=\"sex\" type=\"radio\">女</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t          <input type=\"hidden\" name=\"gender\" class=\"required\" id=\"te_gender\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t          \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t           <div class=\"control-group submit-button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t            <input type=\"submit\" class=\"submit\" id=\"registry\" value=\"立即注册\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t            <input type=\"reset\" class=\"registry\" id=\"reset\" value=\"重置\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t           </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t           <div id=\"dialog-form\" title=\"Create new user\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <div id=\"uploader\" class=\"wu-example\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <!--用来存放文件信息-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <div id=\"thelist\" class=\"uploader-list\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <div class=\"btns\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <div id=\"picker\">选择文件</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t       </form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      </div>     \n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- E apply_form -->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- E module -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- E main-cont -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- E Main -->                  \t\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"dialog\" class=\"dialog\"></div>\n");
      out.write("    <!-- ==================== E ContentArea ==================== -->\n");
      out.write("\t\t<!--  <script>\n");
      out.write("\t\t CKEDITOR.config.width=560;\n");
      out.write("\t\tCKEDITOR.config.height=200;\n");
      out.write("\t\tCKEDITOR.replace('editor1',{\n");
      out.write("\t\t\t// Define the toolbar groups as it is a more accessible solution.\n");
      out.write("\t\t\ttoolbarGroups: [\n");
      out.write("\t\t\t\t{\"name\":\"basicstyles\",\"groups\":[\"basicstyles\"]},\n");
      out.write("\t\t\t\t{\"name\":\"links\",\"groups\":[\"links\"]},\n");
      out.write("\t\t\t\t{\"name\":\"insert\",\"groups\":[\"insert\"]},\n");
      out.write("\t\t\t\t{\"name\":\"styles\",\"groups\":[\"styles\"]}\n");
      out.write("\t\t\t],\n");
      out.write("\t\t\tremoveButtons: 'Underline,Strike,Subscript,Superscript,Anchor,Styles,Specialchar'\n");
      out.write("\t\t} );\n");
      out.write("\t\tCKEDITOR.replace('editor2',{\n");
      out.write("\t\t\t// Define the toolbar groups as it is a more accessible solution.\n");
      out.write("\t\t\ttoolbarGroups: [\n");
      out.write("\t\t\t\t{\"name\":\"basicstyles\",\"groups\":[\"basicstyles\"]},\n");
      out.write("\t\t\t\t{\"name\":\"links\",\"groups\":[\"links\"]},\n");
      out.write("\t\t\t\t{\"name\":\"insert\",\"groups\":[\"insert\"]},\n");
      out.write("\t\t\t\t{\"name\":\"styles\",\"groups\":[\"styles\"]}\n");
      out.write("\t\t\t],\n");
      out.write("\t\t\tremoveButtons: 'Underline,Strike,Subscript,Superscript,Anchor,Styles,Specialchar'\n");
      out.write("\t\t} );\n");
      out.write("\t\t \n");
      out.write("\t\t</script> -->\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provinces}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("province");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
