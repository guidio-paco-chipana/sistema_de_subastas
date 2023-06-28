package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.persistence.Convert;
import Clase.*;
import java.util.ArrayList;
import java.text.*;

public final class MostrarVenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form id=\"frmMostrarCabeceraVenta\">\n");
      out.write("            <table id=\"tablaMostrarCabeceraVenta\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <h1> Pedidos realizados </h1>\n");
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
      out.write("        <form id=\"frmMostrarCuerpoVenta\">\n");
      out.write("            <table id=\"tablaMostrarCuerpoVenta\">\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        CODIGO\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        CLIENTE\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        IMPORTE (S/.)\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Titulo\">\n");
      out.write("                        FECHA Y HORA\n");
      out.write("                    </th>\n");
      out.write("                    <th colspan=\"2\" class=\"Titulo\">\n");
      out.write("                        OPCION\n");
      out.write("                    </th>\n");
      out.write("                </tr>    \n");
      out.write("                \n");
      out.write("                ");

                    DecimalFormat df = new DecimalFormat("0.00");
                    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
                    dfs.setDecimalSeparator('.');
                    df.setDecimalFormatSymbols(dfs);
                    
                    ArrayList<Venta> lista = Venta_DB.ObtenerVentas();
                    for(int i=0; i<lista.size(); i++){
                        Venta v = lista.get(i);
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(v.getCodigoVenta());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(v.getCliente());
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(df.format(v.getTotal()));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(v.getFecha() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"Opcion\">\n");
      out.write("                        <input type=\"button\" name=\"btnDetalle\" id=\"btnDetalle\" class=\"button\" value=\"Detalle venta\" onclick=\"location.href='Servlet_Venta?codigoV=");
      out.print(v.getCodigoVenta() );
      out.write("&&cliente=");
      out.print(v.getCliente() );
      out.write("&&importe=");
      out.print(v.getTotal() );
      out.write("&&FechaV=");
      out.print(v.getFecha() );
      out.write("&&codigoCli=");
      out.print(v.getCodigoCliente() );
      out.write("&&accion=MostrarDetalle'\">\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"Opcion\">\n");
      out.write("                        <input type=\"button\" name=\"btnEliminar\" id=\"btnEliminar\" class=\"button\" value=\"Eliminar\" onclick=\"location.href='Servlet_Venta?codigoV=");
      out.print(v.getCodigoVenta() );
      out.write("&&accion=EliminarVenta'\"> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
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
