
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="Clase.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <jsp:include page="./inc/link.html" />
       <title>JSP Page</title>
    </head>   
    <body onload="cargar()">
        <jsp:include page="inc/navbar.jsp" />
         <div class="tab-content" >
             <div class="col-xs-12">
                        <br><br>
                   <br><br><br>
                   <div id="add-product">   
                        <div class="panel panel-info">
                            <div class="panel-heading text-center"><i class="fa fa-refresh fa-2x"></i><h3>Actualizar datos de producto</h3>
                            
                            <a  href="CuentaAdministrador.jsp" class="link"><h4> Pagina principal </h4></a>
                            </div>
                            
                            <div class="table-responsive">
                              
                              <table class="table table-bordered">
                                  <thead class="">
                                      <tr>
                                          <th class="text-center">Código</th>
                                          <th class="text-center">modelo</th>
                                          <th class="text-center">nombre</th>
                                          <th class="text-center">marca</th>
                                          <th class="text-center">dimencion</th>
                                          <th class="text-center">memoria ram</th>
                                          <th class="text-center">almacenamiento</th>
                                          <th class="text-center">camara fromtal</th>
                                          <th class="text-center">camara trasera</th>
                                          <th class="text-center">bateria</th>
                                          <th class="text-center">color</th>
                                          <th class="text-center">Unidades</th>
                                          <th class="text-center">precio</th>
                                           <th class="text-center">imagen</th>
                                           <th class="text-center">eSTADO</th>
                                          <th class="text-center">Opciones</th>
                                      </tr>
                                  </thead>
                                 
                                      <%
                                              ArrayList<Producto> lista = Producto_DB.obtenerProductosHabilitados();
                                               for(int i=0; i<lista.size(); i++){
                                                    Producto P = lista.get(i);
                                                  %>
                                  <tbody>

                                      
                                          <div id="update-product">
                                                  <form>
                                                 
                                                    <tr>
                                                         
                                                        <td><%=P.getCodigoP()%></td>
                                                        <td><%=P.getModelo()%></td>
                                                        <td><%=P.getNombre()%></td>                                                       
                                                        <td><%=P.getMarca()%></td>
                                                        <td><%=P.getDimen()%></td>
                                                        <td><%=P.getMemram()%></td>
                                                        <td><%=P.getAlmace()%></td>
                                                        <td><%=P.getCamfrom()%></td>
                                                        <td><%=P.getCampos()%></td>
                                                        <td><%=P.getBateria()%></td>
                                                        <td><%=P.getColor()%></td>
                                                        <td><%=P.getUndisp()%></td>
                                                        <td><%=P.getPrecio()%></td>
                                                        <td><%=P.getImagenP()%></td>
                                                        <td><%=P.getEstado()%></td>
                                                        <td> <button type="button" class="btn btn-sm btn-primary button-UPR" name="btnModificar" id="btnModificar"  value="Modificar" onclick="location.href='ModificarProducto.jsp?codigoP=<%=P.getCodigoP() %>'">Actualizar</button>
                                                            
                                                        </td>
                                                        <td class="text-center">
                                                            <button type="button" class="btn btn-sm btn-primary button-UPR" name="btnEliminar" id="btnEliminar" value="Eliminar" onclick="location.href='Servlet_Prod?codigoP=<%=P.getCodigoP() %>&&accion=eliminar'">Eliminar</button>
                                                            <div id="" style="width: 100%; margin:0px; padding:0px;"></div>
                                                        </td>
                                                                     
                                                    </tr>                                                 
            
                                                  </form>
                                                </div>
                  
                                  </tbody>
                <%
                    }
                %>
                              </table>
                          </div>
                        </div>
                       </div>  
                   </div>
            </div>
    </body>
</html>
