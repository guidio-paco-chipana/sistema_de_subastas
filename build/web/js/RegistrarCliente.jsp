

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clase.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <!-- <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/RegistrarCliente.js"></script>
        <link type="text/css" rel="stylesheet" href="css/css1.css" />
       -->     
        <jsp:include page="./inc/link.html" />
        <script type="text/javascript" src="js/RegistrarCliente.js"></script>
        
    </head>
        <body  id="container-page-registration" onload="cargar()" >
            <jsp:include page="inc/navbar.jsp" />                          
           <!-- 
           
           <form name="frm" action="Servlet_Usu" method="post" id="frmRegistrarUsuario">
            <input type="hidden" name="accion" value="registrar">
            
                <tr>
                    <td colspan="3" class="Botones">
                        <br>
                        <input type="button" name="btnCancelar" id="btnCancelar" class="button" value="Cancelar">
                        <input type="button" name="btnRegistrar" id="btnRegistrar" class="button" value="Registrar">
                    </td>
                </tr>
           </form>
           -->
     
       <section id="form-registration">
        <div class="container">
            <div class="row">
                <div class="page-header">
                  <h1>Registro de usuarios <small class="tittles-pages-logo">Gab Electronics</small></h1>
                </div>
                <div class="col-xs-12 col-sm-6 text-center">
                   <br><br><br>
                    <p><i class="fa fa-users fa-5x"></i></p>
                    <p class="lead">
                      ok
                    </p>
                    <br>

                    <img src="assets/img/img-registration.png" alt="electrodomesticos" class="img-responsive">
                </div>
                <div class="col-xs-12 col-sm-6">
                   <br><br>
                    <div id="container-form">
                       <p style="color:#fff;" class="text-center lead">Debera de llenar todos los campos para registrarse</p>
                       <br><br>
                       <!--  name="frm" action="Servlet_Usu" method="post" -->
                       
                       <form name="frm"  class="form-horizontal FormCatElec" action="Servlet_Usu" method="post" id="frmRegistrarU" >
                           <input type="hidden" name="accion" value="registrar">
                          
                           <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-credit-card"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese su número de NIT o CI" required name="txtCodigo_U" id="txtCodigo_U" data-toggle="tooltip" data-placement="top" title="Ingrese su número de NIT o CI. Solamente números " maxlength="30" pattern="[0-9]{7,30}">
                              </div>
                            </div>
                            
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese sus nombres" required name="txtNombres" id="txtNombres" data-toggle="tooltip" data-placement="top" title="Ingrese sus nombres.(solamente letras)" pattern="[a-zA-Z ]{1,50}" maxlength="50">
                              </div>
                            </div>
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese su nombre de usuario" required name="txtNombres_U" id="txtNombres_U" data-toggle="tooltip" data-placement="top" title="Ingrese su nombre. Máximo 9 caracteres (solamente letras)" pattern="[a-zA-Z]{1,9}" maxlength="9">
                              </div>
                            </div>
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese sus apellidos" required name="txtApellidos" id="txtApellidos" data-toggle="tooltip" data-placement="top" title="Ingrese sus apellido(solamente letras)" pattern="[a-zA-Z ]{1,50}" maxlength="50">
                              </div>
                            </div>
                           <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-at"></i></div>
                                <input class="form-control all-elements-tooltip" type="email" placeholder="Ingrese su Email" required name="txtEmail" id="txtEmail" data-toggle="tooltip" data-placement="top" title="Ingrese la dirección de su Email" maxlength="50">
                              </div>
                            </div>
                           <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-mobile"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese su pais" required name="txtPais" id="txtPais" maxlength="100"  data-toggle="tooltip" data-placement="top" title="Ingrese su pais">
                              </div>
                            </div>
                             <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-home"></i></div>
                                <input class="form-control all-elements-tooltip" type="text" placeholder="Ingrese su dirección" required name="txtDireccion" id="txtDireccion" data-toggle="tooltip" data-placement="top" title="Ingrese la direción en la reside actualmente" maxlength="100">
                              </div>
                            </div>                           
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-lock"></i></div>
                                <input class="form-control all-elements-tooltip" type="password" placeholder="Introdusca una contraseña" required name="txtClave" id="txtClave" data-toggle="tooltip" data-placement="top" title="Defina una contraseña para iniciar sesión">
                              </div>
                            </div>
                           
                            <!--
                            <br>
                            <div class="form-group">
                              <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-mobile"></i></div>
                                <input class="form-control all-elements-tooltip" type="tel" placeholder="Ingrese su número telefónico" required name="clien-phone" maxlength="11" pattern="[0-9]{8,11}" data-toggle="tooltip" data-placement="top" title="Ingrese su número telefónico. Mínimo 8 digitos máximo 11">
                              </div>
                            </div>
                            -->
                            <input class="form-control all-elements-tooltip" type="hidden"  name="txtTipoU" value="cliente">
                            <br>
                           <p><button type="button" class="btn btn-success btn-block" name="btnRegistrar" id="btnRegistrar" value="btnRegistrar"><i class="fa fa-pencil"></i>&nbsp;Registrarse</button></p>                         
                           <!-- <input type="button" name="btnCancelar" id="btnCancelar" class="btn btn-success btn-block" value="Cancelar"> -->
                           <div class="ResForm" style="width: 100%; color: #fff; text-align: center; margin: 0;"></div>                                                  
                       </form>
                    </div>
                </div>
            </div>
        </div>           
    </section>                
          <jsp:include page="./inc/footer.jsp" />   
    </body>
</html>
