
<%@page import="Clase.*"%>
 <%
            String codigo = (String)session.getAttribute("parametroCodigo");          
            Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);
            /**********************************************/
 %>

<nav id="navbar-auto-hidden">
    <input type="hidden" value="<%= usu.getTipoUsuario()%>" name="txtTipo" id="txtTipo">
        <div class="row hidden-xs"><!--  -->
            <div class="col-xs-3">
                <figure class="logo-navbar"></figure>
                <p class="text-navbar tittles-pages-logo">SAT TECNOLOGY </p>
            </div>
            <div class="col-xs-8">
                <div class="contenedor-tabla pull-right">
                    <div class="contenedor-tr">
                        <a href="Catalogo.jsp" class="table-cell-td" id="lnkIn" >Inicio</a>
                        <a href="Catalogo.jsp" class="table-cell-td" id="lnkPro">Productos</a>
                        <a href="RegistrarCliente.jsp" class="table-cell-td" id="lnkReg">Registro</a>
                        <a href="CuentaAdministrador.jsp" class="table-cell-td" id="lnkAdm">Administrar</a>
                        <a href="RegistrarVenta.jsp" id="lnkCompra" class="table-cell-td" 
                        data-toggle="tooltip" data-placement="bottom" title="Ver carrito de compras">Confirmar Venta</a>                      
                        <a href="Login.jsp"  id="lnkLogin" class="table-cell-td" >
                        <i class="fa fa-user"></i>&nbsp;&nbsp;LOGIN
                        </a> 
                        <a href="Servlet_Usu?accion=logout" class="table-cell-td" id="lnkLogout">Salir
                        <i class="fa fa-user"></i>&nbsp;&nbsp;<%=usu.getNombreUsuario() %></a>
                    </div>
                </div>
            </div>
        </div>
         <input type="hidden" name="accion" value="logout">     
 </nav>
              

    
    