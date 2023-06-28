package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clase.*;
import java.util.ArrayList;

public final class MostrarCP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form id=\"frmMostrarCabeceraCP\">\n");
      out.write("            <table id=\"tablaMostrarCabeceraCP\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <h1> Clase productos habilitados </h1>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"CuentaAdministrador.jsp\" class=\"link\"><h4> Pagina principal </h4></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <form id=\"frmMostrarCuerpoCP\">\n");
      out.write("            <table id=\"tablaMostrarCuerpoCP\">\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        CODIGO\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        NOMBRE\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        ESTADO\n");
      out.write("                    </th>\n");
      out.write("                    <th colspan=\"2\" class=\"Titulo\">\n");
      out.write("                        OPCION\n");
      out.write("                    </th>\n");
      out.write("                </tr>    \n");
      out.write("                \n");
      out.write("                ");

                    ArrayList<ClaseP> lista = ClaseP_DB.ObtenerCPHabilitados();
                    for(int i=0; i<lista.size(); i++){
                        ClaseP CP = lista.get(i);
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(CP.getCodigoCP() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(CP.getNombreCP() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(CP.getEstadoCP() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"Opcion\">\n");
      out.write("                        <input type=\"button\" name=\"btnModificar\" value=\"Modificar\" id=\"btnModificar\" class=\"button\" onclick=\"location.href='ModificarCP.jsp?codigoCP=");
      out.print(CP.getCodigoCP() );
      out.write("&&nombreCP=");
      out.print(CP.getNombreCP() );
      out.write("&&estadoCP=");
      out.print(CP.getEstadoCP() );
      out.write("'\">\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"Opcion\">\n");
      out.write("                        <input type=\"button\" name=\"btnEliminar\" value=\"Eliminar\" id=\"btnEliminar\" class=\"button\" onclick=\"location.href='Servlet_CP?codigoCP=");
      out.print(CP.getCodigoCP() );
      out.write("&&accion=eliminar'\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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