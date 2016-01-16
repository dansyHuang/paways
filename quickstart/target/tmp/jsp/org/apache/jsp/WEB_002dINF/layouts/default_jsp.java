package org.apache.jsp.WEB_002dINF.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/layouts/header.jsp");
    _jspx_dependants.add("/WEB-INF/layouts/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_guest;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sitemesh_body_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_guest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sitemesh_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sitemesh_title_nobody.release();
    _jspx_tagPool_sitemesh_head_nobody.release();
    _jspx_tagPool_shiro_guest.release();
    _jspx_tagPool_sitemesh_body_nobody.release();
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

      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>QuickStart示例:");
      if (_jspx_meth_sitemesh_title_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\" />\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery-ui-1.11.4.custom/external/jquery/jquery.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/content.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/menu.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/pways.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/pways.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/select-picker.js\"></script>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bui/css/bs3/dpl.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bui/css/bs3/bui.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-------------------BUI----------------->\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bui/jquery-1.8.1.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bui/sea.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bui/config.js\"></script>\r\n");
      if (_jspx_meth_sitemesh_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container1\">\r\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t  $('#login-trigger').click(function(){\n");
      out.write("\t\t\t$('#login-content').slideToggle();\n");
      out.write("\t\t    $(this).toggleClass('active');          \n");
      out.write("\t\t    \n");
      out.write("\t\t    if ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;');\n");
      out.write("\t\t      else $(this).find('span').html('&#x25BC;');\n");
      out.write("\t\t})\n");
      out.write("\t});\n");
      out.write("//-->\n");
      out.write("</script>\n");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" <!-- ==================== S Top ==================== -->\n");
      out.write("    <div class=\"Top\"></div>\n");
      out.write("    <!-- ==================== E Top ==================== -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- ==================== S Header ==================== -->\n");
      out.write("    <div class=\"Header\">\n");
      out.write("    \t<div class=\"header-bg\" style=\"height:230px; background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/header.jpg) no-repeat top center;\">\n");
      out.write("\t    \t<div class=\"container clearfix\">  \n");
      out.write("\t\t    \t<!-- S logo -->\n");
      out.write("\t            <div class=\"logo\">\n");
      out.write("\t                <a href=\"home.html\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/logo.png\" alt=\"深圳明诚国学教育中心\" /></a>\n");
      out.write("\t            </div>\n");
      out.write("\t            <div class=\"logo\">\n");
      out.write("\t                <a href=\"home.html\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/logo.png\" alt=\"深圳明诚国学教育中心\" /></a>\n");
      out.write("\t            </div>\n");
      out.write("\t            <!-- E logo -->\n");
      out.write("\t            \n");
      out.write("\t            <!-- S top-widget-area -->\n");
      out.write("\t            <div class=\"top-widget-area\"></div>\n");
      out.write("\t            <!-- E top-widget-area -->           \n");
      out.write("\t        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"nav-area\">\n");
      out.write("        \t<div class=\"container clearfix\">\n");
      out.write("            \t<!-- S main_nav -->\n");
      out.write("                <div class=\"main-nav\">\n");
      out.write("                    <ul class=\"sf-menu\">\n");
      out.write("                        <li class=\"current\"><a href=\"index.html\">首页</a></li>\n");
      out.write("                        <li class=\"\"><a href=\"about.html\">中心简介</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#.html\">宗旨</a></li>\n");
      out.write("                                <li><a href=\"#.html\">校训</a></li>\n");
      out.write("                                <li><a href=\"#.html\">校规</a></li>\n");
      out.write("                                <li><a href=\"#.html\">教学形式</a></li>\n");
      out.write("                                <li><a href=\"#.html\">交通路线</a></li>\n");
      out.write("                                <li><a href=\"contact.html\">联系我们</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"\"><a href=\"news.html\">影音艺苑</a>\n");
      out.write("                        \t<ul>\n");
      out.write("                                <li><a href=\"news.html\">德音雅乐</a></li>\n");
      out.write("                                <li><a href=\"video.html\">影音课堂</a></li>\n");
      out.write("                                <li><a href=\"news.html\">活动记录</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"\"><a href=\"教学为先.html\">教学为先</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"news.html\">幸福人生讲座</a></li>\n");
      out.write("                                <li><a href=\"news.html\">王凤仪性命哲学思想</a></li>\n");
      out.write("                                <li><a href=\"news.html\">原始点</a></li>\n");
      out.write("                                <li><a href=\"news.html\">研习班</a></li>\n");
      out.write("                                <li><a href=\"news.html\">义工班</a></li>\n");
      out.write("                                <li><a href=\"news.html\">原始点</a></li>\n");
      out.write("                                <li><a href=\"news.html\">专题讲座</a></li>\n");
      out.write("                                <li><a href=\"news.html\">周末班</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"\"><a href=\"素食养生.html\">素食养生</a></li>\n");
      out.write("                        <li class=\"\"><a href=\"products.html\">义卖展示</a></li>\n");
      out.write("                        <li class=\"\"><a href=\"#.html\">爱心传递</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"义工风采.html\">义工风采</a></li>\n");
      out.write("                                <li><a href=\"义工活动.html\">义工活动</a></li>                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>                        \n");
      out.write("                        <li class=\"\"><a href=\"#.html\">网上报名</a>\n");
      out.write("                        \t<ul>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.html\">长期义工报名</a></li>\n");
      out.write("                                <li><a href=\"短期义工报名.html\">短期义工报名</a></li>\n");
      out.write("                                <li><a href=\"网上义工报名.html\">网上义工报名</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li  class=\"\" style=\"height:auto;\">\n");
      out.write("                        ");
      if (_jspx_meth_shiro_guest_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t   \n");
      out.write("                     </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- E main_nav -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_sitemesh_body_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\n");
      out.write(" <!-- ==================== S Footer ==================== -->\n");
      out.write("    <div class=\"Footer\"></div>\n");
      out.write("    <!-- ==================== E Footer ==================== -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- ==================== S Bottom ==================== -->\n");
      out.write("    <div class=\"Bottom\">\n");
      out.write("    \t<div class=\"container clearfix\">\n");
      out.write("        \t<!-- S module -->\n");
      out.write("        \t<div class=\"module\">\n");
      out.write("            \t<div class=\"mod-inner\">\n");
      out.write("                \t<div class=\"mod-content\">\n");
      out.write("\t                \t<!-- S qhd-module -->\n");
      out.write("\t                \t<div class=\"qhd-module\">\n");
      out.write("\t                    \t<div class=\"column\">\n");
      out.write("\t                        \t<div class=\"col-3-1\">\n");
      out.write("\t                            \t<!-- S module-help-contact -->\n");
      out.write("\t                            \t<div class=\"module module-help-contact module-no-margin\">\n");
      out.write("\t                                \t<div class=\"mod-inner\">\n");
      out.write("\t                                    \t<div class=\"mod-content\">\n");
      out.write("\t                                        \t<!-- S qhd-content -->\n");
      out.write("\t                                        \t<div class=\"qhd-content\">\n");
      out.write("\t                                            \t<h4 style=\"color:#a30001; font-size:15px;\">客服热线</h4>\n");
      out.write("\t                                                <p>便捷的电话咨询</p>\n");
      out.write("\t                                                <p style=\"font-family:'Impact'; color:#a30001; font-size:28px;\">400-123-4567</p>\n");
      out.write("\t                                            </div>\n");
      out.write("\t                                            <!-- E qhd-content -->\n");
      out.write("\t                                        </div>\n");
      out.write("\t                                    </div>\n");
      out.write("\t                                </div>\n");
      out.write("\t                                <!-- E module-help-contact -->\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"col-3-2 last\">\n");
      out.write("\t                            \t<!-- S module -->\n");
      out.write("\t                            \t<div class=\"module module-no-margin\">\n");
      out.write("\t                                \t<div class=\"mod-inner\">\n");
      out.write("\t                                    \t<div class=\"mod-tit\"><h3><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/images/fri_tit.png\" alt=\"友情链接\" /></h3></div>\n");
      out.write("                                            <div class=\"mod-content\">\n");
      out.write("\t\t                                    \t<!-- S friends-link -->\n");
      out.write("\t\t                                        <div class=\"friends-link\">                                        \t\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">大方广文化公益网</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">马来西亚中华文化教育中心</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">净空老教授专集网站</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">大方广文化公益网</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">马来西亚中华文化教育中心</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">净空老教授专集网站</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">大方广文化公益网</a>\n");
      out.write("\t\t                                            <a href=\"#\" target=\"_blank\">马来西亚中华文化教育中心</a>\n");
      out.write("\t\t                                        </div>\n");
      out.write("\t\t                                        <!-- E friends-link -->\n");
      out.write("\t\t                                    </div>\n");
      out.write("\t                                    </div>\n");
      out.write("\t                                </div>   \n");
      out.write("\t                                <!-- E module -->                         \t\n");
      out.write("\t                            </div>                            \n");
      out.write("\t                        </div>\n");
      out.write("\t                    </div>\n");
      out.write("\t                    <!-- E qhd-module -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- E module -->\n");
      out.write("            \n");
      out.write("            <!-- S module -->\n");
      out.write("        \t<div class=\"module\">\n");
      out.write("            \t<div class=\"mod-inner\">\n");
      out.write("                \t<div class=\"mod-content\">\n");
      out.write("                    \t<!-- S help-link -->\n");
      out.write("                    \t<div class=\"help-link\">\n");
      out.write("                        \t<a href=\"#\">首页</a>\n");
      out.write("                            <a href=\"#\">中心简介</a>\n");
      out.write("                            <a href=\"#\">影音艺苑</a>\n");
      out.write("                            <a href=\"#\">教学为先</a>\n");
      out.write("                            <a href=\"#\">素食养生</a>\n");
      out.write("                            <a href=\"#\">义卖展示</a>\n");
      out.write("                            <a href=\"#\">爱心传递</a>\n");
      out.write("                            <a href=\"#\">联系我们</a>\n");
      out.write("                            <a href=\"#\">网上报名</a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- E help-link -->\n");
      out.write("                    </div>                \t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- E module -->\n");
      out.write("            \n");
      out.write("            <!-- S module-no-margin -->\n");
      out.write("            <div class=\"module module-no-margin\">\n");
      out.write("                <div class=\"mod-inner\">\n");
      out.write("                    <div class=\"mod-content\">\n");
      out.write("                        <!-- S qhd-content -->\n");
      out.write("                        <div class=\"qhd-content\">                            \n");
      out.write("                            <p style=\"text-align:center; \">地址：深圳市福田区福强路福民新村福昌大厦一楼 &nbsp;&nbsp;&nbsp; 电话：020-123456 &nbsp;&nbsp;&nbsp; 邮箱：<a href=\"mailto:mingchengsz@163.com\">mingchengsz@163.com</a></p>\n");
      out.write("                            <p style=\"text-align:center; \">版权所有：明诚国学教育中心 &nbsp;&nbsp;&nbsp; 粤ICP备0903729*号</p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- E qhd-content -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- E module-no-margin -->\n");
      out.write("            \n");
      out.write("            <!-- S module-no-margin -->\n");
      out.write("            <div class=\"module module-no-margin\">\n");
      out.write("                <div class=\"mod-inner\">\n");
      out.write("                    <div class=\"mod-content\">\n");
      out.write("                        <!-- S service-link -->\n");
      out.write("                        <div class=\"service-link\">                            \n");
      out.write("                            <a href=\"http://wpa.qq.com/msgrd?v=3&amp;uin=12345678&amp;site=qq&amp;menu=yes\" target=\"_blank\">客服1</a>\n");
      out.write("                            <a href=\"http://wpa.qq.com/msgrd?v=3&amp;uin=12345678&amp;site=qq&amp;menu=yes\" target=\"_blank\">客服2</a>\n");
      out.write("                            <a href=\"http://wpa.qq.com/msgrd?v=3&amp;uin=12345678&amp;site=qq&amp;menu=yes\" target=\"_blank\">客服3</a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- E service-link -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- E module-no-margin -->\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ==================== E Bottom ==================== -->");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_sitemesh_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_sitemesh_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_sitemesh_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_sitemesh_title_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_title_0.setParent(null);
    int _jspx_eval_sitemesh_title_0 = _jspx_th_sitemesh_title_0.doStartTag();
    if (_jspx_th_sitemesh_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
      return true;
    }
    _jspx_tagPool_sitemesh_title_nobody.reuse(_jspx_th_sitemesh_title_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_sitemesh_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_sitemesh_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_sitemesh_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_head_0.setParent(null);
    int _jspx_eval_sitemesh_head_0 = _jspx_th_sitemesh_head_0.doStartTag();
    if (_jspx_th_sitemesh_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
      return true;
    }
    _jspx_tagPool_sitemesh_head_nobody.reuse(_jspx_th_sitemesh_head_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctx");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_shiro_guest_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:guest
    org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_guest_0 = (org.apache.shiro.web.tags.GuestTag) _jspx_tagPool_shiro_guest.get(org.apache.shiro.web.tags.GuestTag.class);
    _jspx_th_shiro_guest_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_guest_0.setParent(null);
    int _jspx_eval_shiro_guest_0 = _jspx_th_shiro_guest_0.doStartTag();
    if (_jspx_eval_shiro_guest_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t      <a id=\"login-trigger\"  href=\"#\">\n");
        out.write("\t\t\t\t\t       \t 登录 <span>▼</span>\n");
        out.write("\t\t\t\t\t      </a>\n");
        out.write("\t\t\t\t\t      <div id=\"login-content\">\n");
        out.write("\t\t\t\t\t        <form id=\"loginForm\" method=\"post\" action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/login\">\n");
        out.write("\t\t\t\t\t          <fieldset id=\"inputs\">\n");
        out.write("\t\t\t\t\t            <input id=\"\"username\"\" type=\"text\" name=\"username\" placeholder=\"您的注册帐号\" required>   \n");
        out.write("\t\t\t\t\t            <input id=\"password\" type=\"password\" name=\"password\" placeholder=\"您的密码\" required>\n");
        out.write("\t\t\t\t\t          </fieldset>\n");
        out.write("\t\t\t\t\t          <fieldset id=\"remember_me\">\n");
        out.write("\t\t\t\t\t             <label class=\"remember_me\"><input onclick=\"if($(this).attr('checked')=='checked')$('#remeberMe').val(true);else $('#remeberMe').val(false);\" type=\"checkbox\" checked=\"checked\">记住我</label>\n");
        out.write("\t\t\t\t\t             <input type=\"hidden\" id=\"rememberMe\" name=\"rememberMe\" value=\"true\"/>\n");
        out.write("\t\t\t\t\t          </fieldset> \n");
        out.write("\t\t\t\t\t          <fieldset id=\"actions\">\n");
        out.write("\t\t\t\t\t            <input type=\"submit\" class=\"submit\" id=\"submit\" value=\"登录\">\n");
        out.write("\t\t\t\t\t            <input type=\"button\" class=\"registry\" id=\"registry\" value=\"注册\">\n");
        out.write("\t\t\t\t\t          </fieldset>\n");
        out.write("\t\t\t\t\t        </form>\n");
        out.write("\t\t\t\t\t      </div>  \n");
        out.write("\t\t\t\t\t      ");
        int evalDoAfterBody = _jspx_th_shiro_guest_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_guest_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
      return true;
    }
    _jspx_tagPool_shiro_guest.reuse(_jspx_th_shiro_guest_0);
    return false;
  }

  private boolean _jspx_meth_sitemesh_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sitemesh:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_sitemesh_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_sitemesh_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_sitemesh_body_0.setPageContext(_jspx_page_context);
    _jspx_th_sitemesh_body_0.setParent(null);
    int _jspx_eval_sitemesh_body_0 = _jspx_th_sitemesh_body_0.doStartTag();
    if (_jspx_th_sitemesh_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
      return true;
    }
    _jspx_tagPool_sitemesh_body_nobody.reuse(_jspx_th_sitemesh_body_0);
    return false;
  }
}
