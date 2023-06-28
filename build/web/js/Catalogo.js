$(document).ready(function (){
    var tipo = $('#txtTipo').val();
    
    if(tipo == "administrador"||tipo == "ADMINISTRADOR"){
        cuentaAdministrador()
    }
    else if(tipo == "cliente"||tipo == "CLIENTE"){
        cuentaUsuario();
    }
    else{
        cuentaNegada();
        $('.BotonADD').click(function (){
            $(location).attr('href',"Login.jsp");
        });
    }
});

function cuentaAdministrador(){
    $('#lnkAdm').show();
    $('#lnkLogout').show();
    $('#lnkLogin').hide();
    $('.BotonModificar').show();
     $('#lnkIn').hide();
    
}
function cuentaUsuario(){
    $('#lnkLogout').show();//se visualiza en el menu
    $('#lnkLogin').hide();//non se visualiza en el menu
    $('#lnkReg').hide();
    $('#lnkAdm').hide(); 
    $('.BotonModificar').hide();
}
function cuentaNegada(){
    $('#lnkLogin').show();
    $('#lnkLogout').hide();
    $('#lnkAdm').hide();
    $('#lnkPerfil').hide();
    $('.BotonModificar').hide();
   
}