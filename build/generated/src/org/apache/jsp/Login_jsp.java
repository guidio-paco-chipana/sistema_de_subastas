package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <!-- <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Login.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("       -->       \n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/link.html", out, false);
      out.write("   \n");
      out.write("       <script  type=\"text/javascript\" src=\"js/Login.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body id=\"container-page-registration\" >\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/navbar.jsp", out, false);
      out.write(" \n");
      out.write("    <!--     \n");
      out.write("    <div class=\"jumbotron\" id=\"jumbotron-index\">\n");
      out.write("      <h1><span class=\"tittles-pages-logo\">Venta de Celulares</span> <small style=\"color: #fff;\">La paz</small></h1>\n");
      out.write("      <p>\n");
      out.write("          Bienvenido a nuestra tienda en linea, aquí encontrara una gran variedad de Celulares\n");
      out.write("       </p>\n");
      out.write("    </div>\n");
      out.write("     -->\n");
      out.write("       <section id=\"form-registration\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                  <h1>LOGIN </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 text-center\">             \n");
      out.write("                    <p><i class=\"fa fa-users fa-5x\"></i></p>\n");
      out.write("                    <p class=\"lead\">\n");
      out.write("                     REGISTRATE JUNTO A NOSOTROS, PORQUE NOSOTROS PENSAMOS EN TI\n");
      out.write("                    </p>\n");
      out.write("                </div>            \n");
      out.write("            <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("             <br>\n");
      out.write("                    \n");
      out.write("         <!-- Modal login  modal fade modal-login-->\n");
      out.write("    <div id=\"log\" class=\"\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog modal-sm\">\n");
      out.write("          <div class=\"modal-content\" id=\"modal-form-login\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                  <!--<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button> -->\n");
      out.write("                  <h4 class=\"modal-title text-center text-primary\" id=\"myModalLabel\">SUBASTAS EN LINEA SAT</h4>\n");
      out.write("                </div>     \n");
      out.write("           <form   method=\"post\" action=\"Servlet_Usu\" id=\"frmLo\" style=\"margin: 20px;\"  >\n");
      out.write("             \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                      <label><span class=\"glyphicon glyphicon-user\"></span>&nbsp;Nombre</label>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" name=\"txtUsuario\" id=\"txtUsuario\" placeholder=\"Escribe tu nombre\" required=\"\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <label><span class=\"glyphicon glyphicon-lock\"></span>&nbsp;Contraseña</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" name=\"txtClave\" id=\"txtClave\" placeholder=\"Escribe tu contraseña\" required=\"\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"modal-footer\">                    \n");
      out.write("                    <input type=\"button\" name=\"btnIngresar\" value=\"INGRESAR \" id=\"btnIngresar\" class=\"btn btn-primary btn-sm\">\n");
      out.write("                    <button type=\"button\" name=\"btCancelar\" value=\"btCancelar\" id=\"btCancelar\" class=\"btn btn-danger btn-sm\" data-dismiss=\"modal\">CANCELAR</button>                                          \n");
      out.write("                      <a href=\"RegistrarCliente.jsp\" id=\"lnkRegistrarUsuario\"><h4>NUEVO USUARIO?</h4></a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"ResFormL\" style=\"width: 100%; text-align: center; margin: 0;\"></div>                    \n");
      out.write("               <input type=\"hidden\" name=\"accion\" value=\"login\">\n");
      out.write("                  \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>           \n");
      out.write("    </section>   \n");
      out.write("        \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
