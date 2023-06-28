package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clase.*;
import java.util.*;

public final class RegistrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       <!-- <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/RegistrarCliente.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("       -->     \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/link.html", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/RegistrarCliente.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("        <body  id=\"container-page-registration\" onload=\"cargar()\" >\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/navbar.jsp", out, false);
      out.write("                          \n");
      out.write("           <!-- \n");
      out.write("           \n");
      out.write("           <form name=\"frm\" action=\"Servlet_Usu\" method=\"post\" id=\"frmRegistrarUsuario\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"registrar\">\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\" class=\"Botones\">\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"button\" name=\"btnCancelar\" id=\"btnCancelar\" class=\"button\" value=\"Cancelar\">\n");
      out.write("                        <input type=\"button\" name=\"btnRegistrar\" id=\"btnRegistrar\" class=\"button\" value=\"Registrar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("           </form>\n");
      out.write("           -->\n");
      out.write("     \n");
      out.write("       <section id=\"form-registration\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                  <h1>Registro de usuarios <small class=\"tittles-pages-logo\">Gab Electronics</small></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 text-center\">\n");
      out.write("                   <br><br><br>\n");
      out.write("                    <p><i class=\"fa fa-users fa-5x\"></i></p>\n");
      out.write("                    <p class=\"lead\">\n");
      out.write("                      ok\n");
      out.write("                    </p>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <img src=\"assets/img/img-registration.png\" alt=\"electrodomesticos\" class=\"img-responsive\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                   <br><br>\n");
      out.write("                    <div id=\"container-form\">\n");
      out.write("                       <p style=\"color:#fff;\" class=\"text-center lead\">Debera de llenar todos los campos para registrarse</p>\n");
      out.write("                       <br><br>\n");
      out.write("                       <!--  name=\"frm\" action=\"Servlet_Usu\" method=\"post\" -->\n");
      out.write("                       \n");
      out.write("                       <form name=\"frm\"  class=\"form-horizontal FormCatElec\" action=\"Servlet_Usu\" method=\"post\" id=\"frmRegistrarU\" >\n");
      out.write("                           <input type=\"hidden\" name=\"accion\" value=\"registrar\">\n");
      out.write("                          \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-credit-card\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese su número de NIT o CI\" required name=\"txtCodigo_U\" id=\"txtCodigo_U\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese su número de NIT o CI. Solamente números \" maxlength=\"30\" pattern=\"[0-9]{7,30}\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese sus nombres\" required name=\"txtNombres\" id=\"txtNombres\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese sus nombres.(solamente letras)\" pattern=\"[a-zA-Z ]{1,50}\" maxlength=\"50\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese su nombre de usuario\" required name=\"txtNombres_U\" id=\"txtNombres_U\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese su nombre. Máximo 9 caracteres (solamente letras)\" pattern=\"[a-zA-Z]{1,9}\" maxlength=\"9\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese sus apellidos\" required name=\"txtApellidos\" id=\"txtApellidos\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese sus apellido(solamente letras)\" pattern=\"[a-zA-Z ]{1,50}\" maxlength=\"50\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                           <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-at\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"email\" placeholder=\"Ingrese su Email\" required name=\"txtEmail\" id=\"txtEmail\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese la dirección de su Email\" maxlength=\"50\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                           <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-mobile\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese su pais\" required name=\"txtPais\" id=\"txtPais\" maxlength=\"100\"  data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese su pais\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                             <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-home\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"text\" placeholder=\"Ingrese su dirección\" required name=\"txtDireccion\" id=\"txtDireccion\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese la direción en la reside actualmente\" maxlength=\"100\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>                           \n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"password\" placeholder=\"Introdusca una contraseña\" required name=\"txtClave\" id=\"txtClave\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Defina una contraseña para iniciar sesión\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <!--\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\"><i class=\"fa fa-mobile\"></i></div>\n");
      out.write("                                <input class=\"form-control all-elements-tooltip\" type=\"tel\" placeholder=\"Ingrese su número telefónico\" required name=\"clien-phone\" maxlength=\"11\" pattern=\"[0-9]{8,11}\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Ingrese su número telefónico. Mínimo 8 digitos máximo 11\">\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            -->\n");
      out.write("                            <input class=\"form-control all-elements-tooltip\" type=\"hidden\"  name=\"txtTipoU\" value=\"cliente\">\n");
      out.write("                            <br>\n");
      out.write("                           <p><button type=\"button\" class=\"btn btn-success btn-block\" name=\"btnRegistrar\" id=\"btnRegistrar\" value=\"btnRegistrar\"><i class=\"fa fa-pencil\"></i>&nbsp;Registrarse</button></p>                         \n");
      out.write("                           <!-- <input type=\"button\" name=\"btnCancelar\" id=\"btnCancelar\" class=\"btn btn-success btn-block\" value=\"Cancelar\"> -->\n");
      out.write("                           <div class=\"ResForm\" style=\"width: 100%; color: #fff; text-align: center; margin: 0;\"></div>                                                  \n");
      out.write("                       </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>           \n");
      out.write("    </section>                \n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/footer.jsp", out, false);
      out.write("   \n");
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
