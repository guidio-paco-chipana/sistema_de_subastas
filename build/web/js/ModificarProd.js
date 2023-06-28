$(document).ready(function(){
    $('#txtModificarImagen').attr('disabled','disabled');
    
    $('#btnCancelar').click(function(){
        history.back();
    });
    
    $('#btnGuardar').click(function(){
        validarDatos();
    });
    
    $('#SelectImagenActual').click(function(){
        $('#txtImagen').removeAttr('disabled');
        $('#txtModificarImagen').attr('disabled','disabled');
    });
    
    $('#SelectModificarImagen').click(function(){
        $('#txtImagen').attr('disabled','disabled');
        $('#txtModificarImagen').removeAttr('disabled');
    });
});

function validarDatos(){
    var codigo = $('#txtCodigo').val();
    var modelo = $('#txtModelo').val();
    var nombre = $('#txtNombre').val();
    var marca = $('#txtMarca').val();
    var dimen = $('#txtDimenciones').val();
    var memo = $('#txtMemoria').val();
    var alma = $('#txtAlmacenamiento').val();
    var cama = $('#txtCamaraFrontal').val();
    var camap = $('#txtCamaraPosterior').val();  
    var bate = $('#txtBateria').val();
    var color = $('#txtColor').val();
    var unid = $('#txtUnidades').val();
    var pre = $('#txtPrecio').val();
    var imagen = $('#txtImagen').val();
    
    if(codigo == ""){
        alert("El campo codigo no puede estar vacio");
        $('#txtCodigo').focus();
    }
    else if(modelo == ""){
        alert("El campo modelo no puede estar vacio");
        $('#txtCodigo').focus();
    }
    else if(nombre == ""){
        alert("El campo nombre no puede estar vacio");
        $('#txtCodigo').focus();
    }
    else
        if(marca == ""){
        alert("El campo marca no puede estar vacio");
        $('#txtMarca').focus();
    }
    else 
        if(dimen == ""){
        alert("El campo dimenciones no puede estar vacio");
        $('#txtMarca').focus();
    }
    else
        if(memo == ""){
        alert("El campo memoria  no puede estar vacio");
        $('#txtMarca').focus();
    }
    else
        if(alma == ""){
        alert("El campo almacenamiento no puede estar vacio");
        $('#txtMarca').focus();
    }
    else if(cama == ""){
        alert("El campo camara frontal no puede estar vacio");
        $('#txtMarca').focus();
    }
    else if(camap == ""){
        alert("El campo camara posterior no puede estar vacio");
        $('#txtMarca').focus();
    }
    else if(bate == ""){
        alert("El campo bateria no puede estar vacio");
        $('#txtDescripcion').focus();
    }
    else if(color == ""){
        alert("El campo color  no puede estar vacio");
        $('#txtDescripcion').focus();
    }
    else if(unid == ""){
        alert("El campo unididad disponible no puede estar vacio");
        $('#txtDescripcion').focus();
    }
    else if(pre == ""){
        alert("El campo precio no puede estar vacio");
        $('#txtPrecio').focus();
    }
    else if(imagen == ""){
        alert("El campo imagen no puede estar vacio");
        $('#txtImagen').focus();
    }
    else{
        $('#frmModificarProd').submit();
    }
}