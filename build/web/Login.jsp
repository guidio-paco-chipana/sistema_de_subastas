
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <jsp:include page="./inc/link.html" />   
       <script  type="text/javascript" src="js/Login.js"></script>
        <title>JSP Page</title>
    </head>
    
    <body id="container-page-registration" >
        <jsp:include page="inc/navbar.jsp" /> 
       <section id="form-registration">
        <div class="container">
            <div class="row">
                <div class="page-header">
                  <h1>LOGIN </h1>
                </div>
                <div class="col-xs-5 col-sm-10 text-center">             
                    <p><i class="fa fa-users fa-5x"></i></p>
                    <p class="lead">
                     REGISTRATE JUNTO A NOSOTROS, PORQUE NOSOTROS PENSAMOS EN TI
                    </p>
                </div>            
            <div class="col-xs-12 col-sm-20">
             <br>
    <div id="log" class="" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-sm">
          <div class="modal-content" id="modal-form-login">
                <div class="modal-header">                 
                  <h4 class="modal-title text-center text-primary" id="myModalLabel">SUBASTAS EN LINEA SAT</h4>
                </div>     
              
           <form   method="post" action="Servlet_Usu" id="frmLo" style="margin: 30px;"  >             
               <div class="form-group">
                      <label><span class="glyphicon glyphicon-user"></span>&nbsp;Nombre</label>
                      <input type="text" class="form-control" name="txtUsuario" id="txtUsuario" placeholder="INGRESE SU NUMERO DE IDENTIDAD" required=""/>
                  </div>
                  <div class="form-group">
                      <label><span class="glyphicon glyphicon-lock"></span>&nbsp;Contraseña</label>
                      <input type="password" class="form-control" name="txtClave" id="txtClave" placeholder="INGRESE SU CONTRACEÑA" required=""/>
                  </div>
                  <div class="modal-footer">                    
                    <input type="button" name="btnIngresar" value="INGRESAR " id="btnIngresar" class="btn btn-primary btn-sm">
                    <button type="button" name="btCancelar" value="btCancelar" id="btCancelar" class="btn btn-danger btn-sm" data-dismiss="modal">CANCELAR</button>                                          
                      <a href="RegistrarCliente.jsp" id="lnkRegistrarUsuario"><h4>NUEVO USUARIO?</h4></a>
                  </div>
                  <div class="ResFormL" style="width: 100%; text-align: left; margin: 0;"></div>                    
               <input type="hidden" name="accion" value="login">
                  
            </form>
          </div>
      </div>
    </div>
                </div>
            </div>
        </div>           
    </section>   
        
         <jsp:include page="./inc/footer.jsp" />
    </body>
</html>
