$(document).ready(function (){
    limpiarCampos();
    
    $('#btnRegistrar').click(function (){
        validarDatos();
    });
    
    $('#btnCancelar').click(function (){
        history.back();
    });
    
    $('#SelectDepartamento').change(function (){
        $('#text_depart').val("1");
        $.pos
        $.post("cbProvincia.jsp","#frmDepartamento".serialize(),function(data){
            $('#SelectProvincia').html(data);
        });
    });
});

function limpiarCampos(){
    $('.form-control all-elements-tooltip').val("");
}

function validarDatos(){
    
    var codigo_u = $('#txtCodigo_U').val();    
    var nombre = $('#txtNombres').val();
    var usuario = $('#txtNombres_U').val(); 
    var apellido = $('#txtApellidos').val();
    var email = $('#txtEmail').val();
    var pais = $('#txtPais').val();
    var direccion1 = $('#txtDireccion').val();
    var pass1 = $('#txtClave').val();  
    
    if(codigo_u == ""){
        alert("El campo ci  no puede estar vacio");
        $('#txtCodigo_U').focus();
    }else
    if(nombre == ""){
        alert("El campo nombre no puede estar vacio");
        $('#txtNombres').focus();
    }else
    if(usuario == ""){
        alert("El campo usuario no puede estar vacio");
        $('#txtNombres_U').focus();
         }else
    if(apellido == ""){
        alert("El campo apellido no puede estar vacio");
        $('#txtApellidos').focus();
    }else
    if(email == ""){
        alert("El campo email no puede estar vacio");
        $('#txtEmail').focus();
    }else
    if(pais == ""){
        alert("El campo pais no puede estar vacio");
        $('#txtPais').focus();
    } else  
     if(direccion1 == ""){
        alert("El campo direccion1 no puede estar vacio");
        $('#txtDireccion').focus();
    } else    
     if(pass1 == ""){
        alert("El campo clave no puede estar vacio");
        $('#txtClave').focus();
    }else{
     $('#frmRegistrarU').submit();
    
    }  
    /* else{
       if(email != email2){
            alert("Los correos electronicos no son iguales");
        }
        else if(pass1 != pass2){
            alert("Las contraseñas no son iguales");
        }
        else{
            $('#frmRegistrarUsuario').submit();
        }
       
       
    } */
    
}