<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="Clase.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>JSP Page</title>
        <jsp:include page="./inc/link.html" />
       
       
    </head>
    <body id="container-page-index" onload="cargar()">
        
   <!-- <body onload="cargar()">-->
        <!-- incluir jsp-->
         <jsp:include page="inc/navbar.jsp" /> 
        <%
            String codigo = (String)session.getAttribute("parametroCodigo");            
            Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);   
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
            //
          
        %>
           
        <div class="jumbotron" id="jumbotron-index">
      <h1><span class="tittles-pages-logo">SUBASTA EN LINEA SAT</span> <small style="color: #fff;"></small></h1>
      <p>
          BIENBENIDO ALA MEJOR PAGINA DE SUSBASTAS EN LINEA
       </p>
        </div>
        <div class="recommended_items"><!--recommended_items-->
<h2 class="title text-center">recommended items</h2>			
						<div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
							<div class="carousel-inner">
								<div class="item active">	
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend1.jpg" alt="" />
													<h2>36000 BS</h2>
													<p>auto  modelo 2019</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERRTAR SUBASTA</button>
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend2.jpg" alt="" />
													<h2>300BS</h2>
													<p>JOYA DE 10KILATES</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERTAR SUBASTA</button>
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend3.jpg" alt="" />
													<h2>100BS</h2>
													<p>ROPA MARCO POLO</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERTAR SUBASTA</button>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="item">	
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend1.jpg" alt="" />
													<h2>15000 BS</h2>
													<p>MOTO ZUSUKI NIJA</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERTAR SUBASTA</button>
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend2.jpg" alt="" />
													<h2>100000 BS</h2>
													<p>AUTO RAV 4 2019</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERTAR SUBASTA</button>
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend3.jpg" alt="" />
													<h2>6500 BS</h2>
													<p>CELULAR S10+</p>
													<button type="button" class="btn btn-default add-to-cart"><a href="RegistrarVenta.jsp">OFERTAR SUBASTA</button>
   
												</div>
											</div>
										</div>				</div>
								</div>
							</div>
							 <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
								<i class="fa fa-angle-left"></i>
							  </a>
							  <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
								<i class="fa fa-angle-right"></i>
							  </a>			
						</div>
					</div><!--/recommended_items-->
					
        <!-- catalogo -->
        <form id="frmCatalogo" class="ResForm">
            
            <table width="800" id="tablaCatalogo">
                <tr>
                    <th colspan="15">
                       
                    </th>
                </tr>
                
                <tbody>
                <%
                    //importar la clase Producto ademas obtener obtenerProductosHabilitados
                  ArrayList<Producto> lista = Producto_DB.obtenerProductosHabilitados(); 
                    int salto = 0;
                   for(int i=0; i<lista.size(); i++){
                        Producto p = lista.get(i);
                %>
                        
                            <th><img src="Imagen/<%=p.getImagenP() %>" width="100" height="100"><br>
                                <%=p.getModelo()%> <%=p.getNombre()%> <br>
                                <%=p.getMarca()%><br>
                                S/<%=p.getPrecio() %><br>
                            <input type="button" class="BotonModificar" name="btnModificar" value="Modificar" onclick="location.href='ModificarProducto.jsp?codigoP=<%=p.getCodigoP() %>'">
                            <input type="button" class="BotonADD" name="btnADD" value="ADD Carrito" onclick="location.href='AnadirCarrito.jsp?codigoP=<%=p.getCodigoP()%>&&cliente=<%=cliente %>'"><br>
                            </th>
                <%
                        salto++;
                        if(salto == 3){
                            %>
                            
                            <tr>
                                
                            <%
                            salto = 0;
                        } 
                    }
                %>
                </tbody>
            </table>
        </form> 
                
            <jsp:include page="./inc/footer.jsp" />
            
            
    </body>
</html>
