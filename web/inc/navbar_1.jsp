
<%@page import="Clase.*"%>
<%
                        
                             String codigo = (String)session.getAttribute("parametroCodigo");
            
                             Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);
            
                                 String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();                                      
                                   
%>         
<nav id="navbar-auto-hidden">
        <div class="row hidden-xs"><!-- Menu computadoras y tablets -->
            <div class="col-xs-4">
                <figure class="logo-navbar"></figure>
                <p class="text-navbar tittles-pages-logo">SAT TECNOLOGY </p>
            </div>
            <div class="col-xs-8">
                <div class="contenedor-tabla pull-right">
                    <div class="contenedor-tr">
                        <a href="Catalogo.jsp" class="table-cell-td">Inicio</a>
                        <a href="MostrarProducto.jsp" class="table-cell-td">Productos</a>
                     
                          <%
                        
                                String usuario = usu.getTipoUsuario();
                                     System.out.println(usuario);
                                     
                                        if(usuario =="administra"){
                           %> 
                                    <a href="configAdmin.php" class="table-cell-td">Administración</a>
                                    <a href="#" class="table-cell-td carrito-button-nav all-elements-tooltip" data-toggle="tooltip" data-placement="bottom" title="Ver carrito de compras">
                                        <i class="fa fa-shopping-cart"></i>&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-caret-down"></i>
                                    </a>
                                    <a href="#" class="table-cell-td" data-toggle="modal" data-target=".modal-logout">
                                        <i class="fa fa-user"></i>&nbsp;&nbsp;'.<%=usu.getNombreUsuario() %>.'
                                    </a>                        
                                        
                  
                                <%
                            }else if(usuario.equals("cliente")){
                              %>
                                    <a href="RegistrarVenta.jsp" class="table-cell-td">Pedido</a>
                                    <a href="#" class="table-cell-td carrito-button-nav all-elements-tooltip" data-toggle="tooltip" data-placement="bottom" title="Ver carrito de compras">
                                        <i class="fa fa-shopping-cart"></i>&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-caret-down"></i>
                                    </a>
                                    <a href="#" class="table-cell-td" data-toggle="modal" data-target=".modal-logout">
                                        <i class="fa fa-user"></i>&nbsp;&nbsp;<%=usu.getNombreUsuario() %>
                                    </a>
                                <%
                            }else{
                                %>
                                
                                    <a href="RegistrarCliente.jsp" class="table-cell-td">Registro</a>
                                    <a href="#" class="table-cell-td carrito-button-nav all-elements-tooltip" data-toggle="tooltip" data-placement="bottom" title="Ver carrito de compras">
                                        <i class="fa fa-shopping-cart"></i>&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-caret-down"></i>
                                    </a>
                                    <a href="Login.jsp" class="table-cell-td" data-toggle="modal" data-target=".modal-login">
                                        <i class="fa fa-user"></i>&nbsp;&nbsp;Login
                                    </a>
                             <%  
                            }
                        %>
                     
                    </div>
                </div>
            </div>
        </div>                  
    </nav>
