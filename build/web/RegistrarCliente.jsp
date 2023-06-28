

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clase.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="./inc/link.html" />
        <script type="text/javascript" src="js/RegistrarCliente.js"></script>
        
    </head>
        <body  id="container-page-registration" onload="cargar()" >
            <jsp:include page="inc/navbar.jsp" />                               
       <section id="form-registration">
        <div class="container">
            <div class="row">
                <div class="page-header">
                  <h1>REGISTRO DE NUEVOS USUARIOS </h1>
                </div>
                <div class="col-xs-12 col-sm-2 text-center lead">
                </div>
                <div class="col-xs-12 col-sm-7 text-center lead">
                   <br><br>
                    <div id="container-form">
                       <p style="color:#fffF;" class="text-center lead">BIENBENIDO A NUESTRA PLATAFORMA ONLINE DE SUBASTAS</p>
                       <br><br>
                       <form name="frm"  class="form-horizontal FormCatElec" action="Servlet_Usu" method="post" id="frmRegistrarU" >
                           <input type="hidden" name="accion" value="registrar">
                          
                           <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-credit-card"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="INGRESE SU NUM DE IDENTIFICACION NACIONAL" required name="txtCodigo_U" id="txtCodigo_U" data-toggle="tooltip" data-placement="top" title="Ingrese su número de NIT o CI. Solamente números " maxlength="30" pattern="[0-9]{7,30}">
                              </div>
                            </div>
                            
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="INGRESE SU NOMBRE" required name="txtNombres" id="txtNombres" data-toggle="tooltip" data-placement="top" title="Ingrese su primer nombre .(solamente letras)" pattern="[a-zA-Z ]{1,50}" maxlength="50">
                              </div>
                            </div>
                            <br>        
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="INGRESE SUS APELLIDOS" required name="txtApellidos" id="txtApellidos" data-toggle="tooltip" data-placement="top" title="Ingrese sus apellidos(solamente letras)" pattern="[a-zA-Z ]{1,50}" maxlength="50">
                              </div>
                            </div>
                           <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-at"></i></div>
                                <input class="form-control all-elements-tooltip" type="email" placeholder="INGRESE SU CORREO ELECTRONICO" required name="txtEmail" id="txtEmail" data-toggle="tooltip" data-placement="top" title="Ingrese su correo electronico" maxlength="50">
                              </div>
                            </div>
                           <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-mobile"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="INGRESE SU PAIS DE ORIGEN" required name="txtPais" id="txtPais" maxlength="100"  data-toggle="tooltip" data-placement="top" title="Ingrese  su pais de origen">
                              </div>
                            </div>
                             <br>
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-lock"></i></div>
                                <input class="form-control all-elements-tooltip" type="password" placeholder="INGRESE NUEVA CONTRACEÑA" required name="txtClave" id="txtClave" data-toggle="tooltip" data-placement="top" title="Defina una contraseña para iniciar sesión">
                              </div>
                            </div>
                           
                            <input class="form-control all-elements-tooltip" type="hidden"  name="txtTipoU" value="cliente">
                            <br>
                           <p><button type="button" class="btn btn-success btn-block" name="btnRegistrar" id="btnRegistrar" value="btnRegistrar"><i class="fa fa-pencil"></i>&nbsp;COMPLETAR EL REGISTRO</button></p>                                                   
                           <div class="ResForm" style="width: 100%; color: #fff; text-align: center; margin: 0;"></div>                                                  
                       </form>
                    </div>
                </div>
            </div>
        </div>           
    </section>                
         
    </body>
</html>
