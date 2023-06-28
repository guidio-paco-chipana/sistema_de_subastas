
package Clase;
import java.sql.*;
import Conexion.Conexion;
import java.util.*;
import java.sql.CallableStatement;
/**
 *
 *
 */
/* */
public class Usuario_DB {
    
    public static Usuario VerificarUsuario(String id_usuario){
        Usuario usu = new Usuario();
        
        //
        Statement sentencia;
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            /*usuario*/
           CallableStatement cs = cn.prepareCall("CALL LOGEAR_USUARIO (?)");
            sentencia=cn.createStatement();
            cs.setString(1,id_usuario);
            ResultSet rs = cs.executeQuery();
            //resultado del uso de procedimientos almacenados
            while(rs.next()){
                usu.setCodigoUsuario(rs.getString("ci_cli")); 
                usu.setNombreUsuario(rs.getString("nombre_us"));
                usu.setClaveUsuario(rs.getString("contra"));
                usu.setTipoUsuario(rs.getString("tipo_usuario"));
            }
        }catch(Exception e){System.out.println(e);}
        return usu;
    }
    
    public static Usuario listarUsuarioPorCodigo(String codigo){
        Usuario usu = new Usuario();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MOSTRAR_CLIENTE_POR_CODIGO (?)");
            cs.setString(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                //getString con la base de datos
                usu.setCodigoUsuario(rs.getString("ci_cli"));
                 usu.setNombre(rs.getString("nombre"));
                usu.setNombreUsuario(rs.getString("nombre_us"));
                usu.setApellidosUsuario(rs.getString("apellidos"));
                usu.setEmailUsuario(rs.getString("email"));
                usu.setPais(rs.getString("pais"));
                usu.setDireccion1Usuario(rs.getString("direccion"));
                usu.setClaveUsuario(rs.getString("contra"));
                usu.setTipoUsuario(rs.getString("tipo_usuario"));
                                     
                }
        }catch(Exception e){System.out.println(e);}
        return usu;
    }
    
     public static boolean RegistrarUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL REGISTRAR_USUARIO_CLIENTE (?,?,?,?,?,?,?,?,?)");
            cs.setString(1, usu.getCodigoUsuario());
            cs.setString(2, usu.getNombre());
            cs.setString(3, usu.getNombreUsuario());
            cs.setString(4, usu.getApellidosUsuario());
            cs.setString(5, usu.getEmailUsuario());
            cs.setString(6, usu.getPais());
            cs.setString(7, usu.getDireccion1Usuario());
            cs.setString(8, usu.getClaveUsuario());
            cs.setString(9, usu.getTipoUsuario());
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static ArrayList<Usuario> MostrarUsuarioHabilitado(){
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MOSTRAR_USUARIOS_CLIENTES_HABILITADOS");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Usuario usu = new Usuario();
                usu.setCodigoUsuario(rs.getString("Codigo_U"));
                usu.setNombreUsuario(rs.getString("Nombres_U"));
                usu.setApellidosUsuario(rs.getString("Apellidos_U"));
                usu.setEmailUsuario(rs.getString("Email_U")); 
                lista.add(usu);
            }
        }catch(Exception e){System.out.println(e);}
        return lista;
    }
    
    public static ArrayList<Usuario> MostrarUsuarioInhabilitado(){
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MOSTRAR_USUARIOS_CLIENTES_INHABILITADOS");
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Usuario usu = new Usuario();
                usu.setCodigoUsuario(rs.getString("Codigo_U"));
                usu.setNombreUsuario(rs.getString("Nombres_U"));
                usu.setApellidosUsuario(rs.getString("Apellidos_U"));
                lista.add(usu);
            }
        }catch(Exception e){System.out.println(e);}
        return lista;
    }
    
    
   
    
    public static boolean ModificarUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MODIFICAR_USUARIO (?,?,?,?,?,?,?,?)");
            cs.setString(1, usu.getCodigoUsuario());
            cs.setString(2, usu.getNombre());
            cs.setString(3, usu.getNombreUsuario());
            cs.setString(4, usu.getApellidosUsuario());
            cs.setString(5, usu.getEmailUsuario());
            cs.setString(6, usu.getPais());
            cs.setString(7, usu.getDireccion1Usuario());
            cs.setString(8, usu.getClaveUsuario());
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static boolean ModificarClaveUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MODIFICAR_CLAVE_USUARIO (?,?)");
            cs.setString(1, usu.getCodigoUsuario());
            cs.setString(2, usu.getClaveUsuario()); 
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static boolean ModificarEmailUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MODIFICAR_EMAIL_USUARIO (?,?)");
            cs.setString(1, usu.getCodigoUsuario());
            cs.setString(2, usu.getEmailUsuario()); 
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    
    public static boolean DarDeBajaUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL ELIMINAR_USUARIO (?)");
            cs.setString(1, usu.getCodigoUsuario());
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static boolean DarDeAltaUsuario(Usuario usu){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL RECUPERAR_USUARIO (?)");
            cs.setString(1, usu.getCodigoUsuario());
            int i = cs.executeUpdate();
            
            if(i == 1){
                resp = true;
            }else{
                resp = false;
            }
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    
    
}
