package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Kho sách - Thư viện</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <link href=\"css/stylehome.css\" rel=\"stylesheet\" type=\"text/css\"/>     \n");
      out.write("        <link href=\"css/books.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/pagination/pagger.js\" type=\"text/javascript\"></script>\n");
      out.write("        ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("now");
      _jspx_th_c_set_0.setValue( new java.util.Date());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--this is header-->\n");
      out.write("        <header>\n");
      out.write("            <div class = \"container-fluid\">\n");
      out.write("                <div class = \"row\">\n");
      out.write("                    <div class =\"col-md-7\">\n");
      out.write("                        <img src=\"images/logo_main.png\" alt=\"Trường THPT Nghi lộc 4\" width = \"100px\"/>\n");
      out.write("                        <span class = \"name-banner\">THƯ VIỆN XANH - KHO TÀNG SÁCH</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class =\"col-md-5\">\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link\" href=\"#\">Thông tin mượn sách</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link\" href=\"#\">Thông tin cá nhân</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                              <a class=\"nav-link\" href=\"#\">Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>  \n");
      out.write("                </div> \n");
      out.write("                <div class = \"row header-second\">\n");
      out.write("                    <div class = \"col-md-12\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("                                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                                    <li class=\"nav-item color-menu\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"home\">Trang chủ</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item color-menu\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Thông báo</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item color-menu\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"books\">Kho sách</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item color-menu\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Góc thảo luận</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item color-menu\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"#\">Hướng dẫn mượn sách</a>\n");
      out.write("                                    </li>      \n");
      out.write("                                </ul>\n");
      out.write("<!--                                <div class=\"dropdown mr-auto\">\n");
      out.write("                                    <button type=\"button\" class=\"my-size-category btn btn-success btn-block dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        Danh Mục Sách\n");
      out.write("                                    </button>\n");
      out.write("                                    <div class=\"dropdown-menu btn-block\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>            -->\n");
      out.write("                                <form class=\"form-inline\" action = \"books\" method=\"GET\">\n");
      out.write("                                    <input class=\"form-control mr-sm-2\" type=\"search\" name = \"bname\"  placeholder=\"Sách cần tìm...\">\n");
      out.write("                                    <button class=\"btn btn-warning\" type=\"submit\">Tìm Kiếm</button>\n");
      out.write("                                </form>          \n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!--notification-->\n");
      out.write("        <marquee width=\"60%\" direction=\"left\" height=\"50px\" scrollamount=\"4\">\n");
      out.write("            <span>Trường THPT Nghi Lộc 4 xin thông báo ngày \n");
      out.write("                           ");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                  còn 50 lượt mượn sách\n");
      out.write("            </span>\n");
      out.write("            <span class = \"notice-covid\"> -  HỌC SINH PHẢI CHẤP HÀNH THỰC HIỆN QUY ĐỊNH 5K ĐẢM BẢO AN TOÀN PHÒNG CHỐNG DỊCH COVID-19 KHI QUAY TRỞ LẠI TRƯỜNG VÀ MƯỢN SÁCH</span>\n");
      out.write("        </marquee>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                          <a class=\"dropdown-item\" href=\"books?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>      \n");
          out.write("                                        ");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
