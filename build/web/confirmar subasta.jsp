
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="Clase.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
       <jsp:include page="./inc/link.html" />
       
         <script type="text/javascript" src="js/RegistrarCliente.js"></script>
        <title>JSP Page</title>     
    </head>
    <%
        String cliente = request.getParameter("cliente");
        Producto p = Producto_DB.listarProductoPorCodigo(request.getParameter("codigoP"));
    %>
    
    <body onload="cargar()">
         <jsp:include page="inc/navbar.jsp" /> 
         
        <form name="frm" action="Servlet_Prod" method="post" id="frmAnadirCarrito">
            <input type="hidden" name="txtCliente" value="<%=cliente %>">
            <table id="tablaAnadirCarrito">
                <tr>
                    <th colspan="2">
                        <h1>Añadir a carrito</h1>
                    </th>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="hidden" name="txtCodigo" value="<%=p.getCodigoP() %>">
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Nombre producto :
                    </td>
                    <td>
                        <input type="text" name="txtNombreP" class="campoNoEditable" value="<%=p.getNombre()%> <%=p.getMarca()%> - <%=p.getModelo()%>" 
                               size="60" readonly="readonly">
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Precio producto :
                    </td>
                    <td>
                      <input type="text" name="txtPrecio" class="campoNoEditable" value="<%=p.getPrecio() %>" readonly="readonly">
                    </td>
                </tr>
                <tr>
                    <td class="primeraColumna">
                        Cantidad :
                    </td>
                    <td>
                        <input type="number" name="txtCantidad" value="1" min="1">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="Botones">
                        <br>
                        <input type="button" name="btnCancelar" id="btnCancelar" class="button" value="Cancelar">
                        <input type="submit" name="btnGuardar" id="btnGuardar" class="button" value="ADD carrito">
                    </td>
                </tr>
                <tr>
                    <td>
                        <br>
                    </td>
                </tr>
            </table>
                    <input type="hidden" name="accion" value="anadirCarrito">
        </form>

    </body>
</html>
