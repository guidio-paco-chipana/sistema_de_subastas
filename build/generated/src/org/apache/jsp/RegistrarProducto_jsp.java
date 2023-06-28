package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clase.*;

public final class RegistrarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <!-- <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>       \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" /> -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./inc/link.html", out, false);
      out.write("\n");
      out.write("       <script type=\"text/javascript\" src=\"js/RegistrarProd.js\"></script>  \n");
      out.write("       <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");

        String codigo_p = ObtenerCodigo.CodigoProducto();
        String Codigo_CP =ObtenerCodigo.CodigoClaseProducto();
        String Codigo_MP =ObtenerCodigo.CodigoMarcaProducto();
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body onload=\"cargar()\">\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/navbar.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("                    \n");
      out.write("          <div class=\"tab-content\" >\n");
      out.write("                <!--==============================Panel productos===============================-->\n");
      out.write("             <div role=\"tabpanel\" class=\"\" id=\"Productos\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-3\"> \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                        <br><br><br>\n");
      out.write("                        <div id=\"add-product\">\n");
      out.write("                            <h2 class=\"text-primary text-center\"><small><i class=\"fa fa-plus\"></i></small>&nbsp;&nbsp;Agregar un producto nuevo</h2>\n");
      out.write("                            \n");
      out.write("                            <form name=\"frm\" action=\"Servlet_Prod\" method=\"POST\" id=\"frmRegistrarProd\" >\n");
      out.write("                              \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Código de producto</label>\n");
      out.write("                                <!--<input type=\"text\"   name=\"txtCodigo\"  value=\"\" readonly=\"readonly\"> -->\n");
      out.write("                                    ");
      out.print(codigo_p );
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                <label>Modelo</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Modelo\" required maxlength=\"30\" name=\"txtModelo\" id=\"txtModelo\">\n");
      out.write("                              </div>\n");
      out.write("                     \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Nombre de producto</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Nombre\" required maxlength=\"30\" name=\"txtNombre\" id=\"txtNombre\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Marca</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Marca\" required maxlength=\"30\" name=\"txtMarca\" id=\"txtMarca\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Dimenciones</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Dimenciones\" required maxlength=\"30\" name=\"txtDimenciones\" id=\"txtDimenciones\">\n");
      out.write("                              </div> \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Memoria Ram</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Memoria\" required maxlength=\"30\" name=\"txtMemoria\" id=\"txtMemoria\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Almacenamiento Interno</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Almacenamiento\" required maxlength=\"30\" name=\"txtAlmacenamiento\" id=\"txtAlmacenamiento\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Camara Frontal</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Camara Frontal\" required maxlength=\"30\" name=\"txtCamaraFrontal\" id=\"txtCamaraFrontal\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Camara Posterior</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Camara Posterior\" required maxlength=\"30\" name=\"txtCamaraPosterior\" id=\"txtCamaraPosterior\">\n");
      out.write("                              </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                <label>Bateria</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Bateria\" required maxlength=\"30\" name=\"txtBateria\" id=\"txtBateria\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Color</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Color\" required maxlength=\"30\" name=\"txtColor\" id=\"txtColor\">\n");
      out.write("                              </div>\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                <label>Unidades disponibles</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Unidades\" required maxlength=\"20\" pattern=\"[0-9]{1,20}\" name=\"txtUnidades\" id=\"txtUnidades\">\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Precio</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  placeholder=\"Precio\" required maxlength=\"20\" pattern=\"[0-9]{1,20}\" name=\"txtPrecio\" id=\"txtPrecio\">\n");
      out.write("                              </div>                     \n");
      out.write("                              \n");
      out.write("                             <!--   <option value=\"\"></option>                     \n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Proveedor</label>\n");
      out.write("                                <select class=\"form-control\" name=\"prod-codigoP\">                              \n");
      out.write("                                </select>\n");
      out.write("                              </div>\n");
      out.write("                                 -->\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label>Imagen de producto</label>\n");
      out.write("                                <input type=\"file\" name=\"txtImagen\" id=\"txtImagen\">\n");
      out.write("                                <p class=\"help-block\">Formato de imagenes admitido png, jpg, gif, jpeg</p>\n");
      out.write("                              </div>\n");
      out.write("                                <input type=\"hidden\"  name=\"admin-name\" value=\"\">\n");
      out.write("                                <p class=\"text-center\"><button type=\"button\" name=\"btnRegistrar\" id=\"btnRegistrar\" class=\"btn btn-primary\">Agregar a la tienda</button>\n");
      out.write("                                    <input type=\"button\" name=\"btnCancelar\" id=\"btnCancelar\" class=\"btn btn-primary\" value=\"Cancelar\"></p>\n");
      out.write("                              <div id=\"res-form-add\" style=\"width: 100%; text-align: center; margin: 0;\"></div>\n");
      out.write("                            \n");
      out.write("                               <input type=\"hidden\" name=\"accion\" value=\"insertar\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-3\"> \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("                              \n");
      out.write("          ");
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
