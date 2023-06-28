package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Clase.*;
import java.text.*;

public final class RegistrarVenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <!--   <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     -->\n");
      out.write("     <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/link.html", out, false);
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/RegistrarVenta.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String codigoVenta = ObtenerCodigo.CodigoVenta();
            String cliente = (String)session.getAttribute("parametroCliente");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"Servlet_Venta\" method=\"post\" id=\"frmRegistrarVenta\">\n");
      out.write("            <br>\n");
      out.write("            <table id=\"tablaRegistrarVenta\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"7\" class=\"TituloDV\">\n");
      out.write("                        <h3>CONFIRMAR SUBASTA</h3>\n");
      out.write("                        <input type=\"hidden\" name=\"txtCodigoV\" value=\"");
      out.print(codigoVenta );
      out.write("\">\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\" class=\"TituloDV\">\n");
      out.write("                        CLIENTE :  \n");
      out.write("                    </th>\n");
      out.write("                    <td colspan=\"5\" class=\"Contenido\">\n");
      out.write("                        ");
      out.print(cliente );
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"txtCliente\" value=\"");
      out.print(cliente );
      out.write("\" size=\"50\" readonly=\"readonly\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"7\" class=\"FilaEnBlanco\">\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        NRO DE LOTE\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        NOMBRE DE PRODUCTO \n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        PRRECIO BASE\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        PRECIO OFERTA\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        TIPO DE CLIENTE\n");
      out.write("                    </th>\n");
      out.write("                    \n");
      out.write("                    <th class=\"TituloDV\">\n");
      out.write("                        OPCION\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                    DecimalFormat df = new DecimalFormat("0.00");
                    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
                    dfs.setDecimalSeparator('.');
                    df.setDecimalFormatSymbols(dfs);
                    
                    double total = 0;
                    ArrayList<DetalleVenta> lista = (ArrayList<DetalleVenta>)session.getAttribute("carrito");
                    
                    if(lista != null){
                        for(DetalleVenta dv:lista){
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    ");
      out.print(dv.getNumero() );
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    ");
      out.print(dv.getNombreProducto() );
      out.write("\n");
      out.write("                                    <input type=\"hidden\" name=\"nombreProd\" value=\"");
      out.print(dv.getCodigoProducto());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    ");
      out.print(df.format(dv.getPrecio()));
      out.write("\n");
      out.write("                                    <input type=\"hidden\" name=\"precioProd\" value=\"");
      out.print(dv.getPrecio());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    ");
      out.print(dv.getCantidad());
      out.write("\n");
      out.write("                                    <input type=\"hidden\" name=\"cantidadProd\" value=\"");
      out.print(dv.getCantidad());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    ");
      out.print(df.format(dv.getDescuento()));
      out.write("\n");
      out.write("                                    <input type=\"hidden\" name=\"descuentoProd\" value=\"");
      out.print(dv.getDescuento());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"Contenido\">\n");
      out.write("                                    <div> ");
      out.print(df.format(dv.getSubTotal()) );
      out.write(" </div>\n");
      out.write("                                    <input type=\"hidden\" name=\"subTotalProd\" value=\"");
      out.print(dv.getSubTotal());
      out.write("\">\n");
      out.write("                                </td> \n");
      out.write("                                <td whidh=\"100\" class=\"Opcion\">\n");
      out.write("                                    <input type=\"button\" name=\"btnEliminar\" id=\"btnEliminar\" class=\"button\" value=\"Eliminar\" onclick=\"location.href='Servlet_Venta?numero=");
      out.print(dv.getNumero() );
      out.write("&&accion=quitar'\">\n");
      out.write("                                </td>\n");
      out.write("                                 <th colspan=\"5\" class=\"TituloDV\">\n");
      out.write("                        <div>   </div>\n");
      out.write("                    </th>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            ");

                            total = total + dv.getSubTotal();
                        }
                    }
                
      out.write("\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <th colspan=\"5\" class=\"TituloDV\">\n");
      out.write("                        <div> TOTAL (BS)  </div>\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"Contenido\">\n");
      out.write("                        <div> ");
      out.print(String.valueOf(df.format(total)) );
      out.write(" </div>\n");
      out.write("                        <input type=\"hidden\" name=\"txtTotal\" value=\"");
      out.print(String.valueOf(df.format(total)) );
      out.write("\" readonly=\"readonly\">\n");
      out.write("                    </th>\n");
      out.write("                    <th class=\"FilaEnBlanco\">\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"7\" class=\"FilaEnBlanco\">\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <table id=\"tablaRegresar\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"button\" name=\"btnRegistrar\" id=\"btnRegistrarVenta\" class=\"button\" value=\"CONFIRMAR OFERTA\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>        \n");
      out.write("                    <input type=\"hidden\" name=\"accion\" value=\"RegistrarVenta\"><br>\n");
      out.write("                    \n");
      out.write("        </form>\n");
      out.write("                    <h3 align=\"center\">\n");
      out.write("                        <a href=\"Catalogo.jsp\" class=\"link\">IR ATRAS</a>\n");
      out.write("                    </h3>\n");
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
