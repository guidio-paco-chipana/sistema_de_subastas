package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Clase.*;

public final class Catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Catalogo.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("        -->\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/link.html", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body id=\"container-page-index\" onload=\"cargar()\">\n");
      out.write("        \n");
      out.write("   <!-- <body onload=\"cargar()\">-->\n");
      out.write("        <!-- incluir jsp-->\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/navbar.jsp", out, false);
      out.write(" \n");
      out.write("        ");

            String codigo = (String)session.getAttribute("parametroCodigo");            
            Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);   
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
            //
          
        
      out.write("\n");
      out.write("       \n");
      out.write("         <!-- incluir html\n");
      out.write("         <jsp include page='./inc/navbar.html' />\n");
      out.write("         -->       \n");
      out.write("        <div class=\"jumbotron\" id=\"jumbotron-index\">\n");
      out.write("      <h1><span class=\"tittles-pages-logo\">SUBASTA EN LINEA SAT</span> <small style=\"color: #fff;\"></small></h1>\n");
      out.write("      <p>\n");
      out.write("          BIENBENIDO ALA MEJOR PAGINA DE SUSBASTAS EN LINEA\n");
      out.write("       </p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- catalogo -->\n");
      out.write("        <form id=\"frmCatalogo\" class=\"ResForm\">\n");
      out.write("            \n");
      out.write("            <table width=\"800\" id=\"tablaCatalogo\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"15\">\n");
      out.write("                        <h1> Catalogo de productos </h1>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                ");

                    //importar la clase Producto ademas obtener obtenerProductosHabilitados
                  ArrayList<Producto> lista = Producto_DB.obtenerProductosHabilitados(); 
                    int salto = 0;
                   for(int i=0; i<lista.size(); i++){
                        Producto p = lista.get(i);
                
      out.write("\n");
      out.write("                        \n");
      out.write("                            <th><img src=\"Imagen/");
      out.print(p.getImagenP() );
      out.write("\" width=\"100\" height=\"100\"><br>\n");
      out.write("                                ");
      out.print(p.getModelo());
      out.write(' ');
      out.print(p.getNombre());
      out.write(" <br>\n");
      out.write("                                ");
      out.print(p.getMarca());
      out.write("<br>\n");
      out.write("                                S/");
      out.print(p.getPrecio() );
      out.write("<br>\n");
      out.write("                            <input type=\"button\" class=\"BotonModificar\" name=\"btnModificar\" value=\"Modificar\" onclick=\"location.href='ModificarProducto.jsp?codigoP=");
      out.print(p.getCodigoP() );
      out.write("'\">\n");
      out.write("                            <input type=\"button\" class=\"BotonADD\" name=\"btnADD\" value=\"ADD Carrito\" onclick=\"location.href='AnadirCarrito.jsp?codigoP=");
      out.print(p.getCodigoP());
      out.write("&&cliente=");
      out.print(cliente );
      out.write("'\"><br>\n");
      out.write("                            </th>\n");
      out.write("                ");

                        salto++;
                        if(salto == 3){
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                \n");
      out.write("                            ");

                            salto = 0;
                        } 
                    }
                
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form> \n");
      out.write("                <!-- importando pie de pagina un tropo de codigo jsp --->\n");
      out.write("            ");
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
