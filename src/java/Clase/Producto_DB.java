
package Clase;

import java.sql.*;
import java.util.*;
import Conexion.Conexion;

public class Producto_DB {
    // Traer todo los productos
    
    public static ArrayList<Producto> obtenerProductosHabilitados(){
        ArrayList<Producto> lista = new ArrayList<Producto>();
            Connection cn;
            Conexion con = new Conexion();
            cn = con.conectar();
       
            CallableStatement cs = null;
            ResultSet rs = null;
            
            try{
                cs=cn.prepareCall("CALL MOSTRAR_PRODUCTOS_HABILITADOS");
                rs=cs.executeQuery();
                while(rs.next()){
                        Producto p = new Producto(
                            rs.getString("codigo_p"),
                            rs.getString("modelo"),
                            rs.getString("nombre"),
                            rs.getString("marca"),
                            rs.getString("dim"),
                            rs.getString("men_ram"),
                            rs.getString("almace"),
                            rs.getString("cam_from"),
                            rs.getString("cam_pos"),
                            rs.getString("bateria"),
                            rs.getString("color"),
                            rs.getInt("un_disp"),
                            rs.getDouble("precio"),
                            rs.getString("imagen"),
                            rs.getString("Estado_P")
                            );
                            
                        
                    lista.add(p);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        return lista;
    }
   
    public static ArrayList<Producto> obtenerProductosInhabilitados(){
        ArrayList<Producto> lista = new ArrayList<Producto>();
            Connection cn;
            Conexion con = new Conexion();
            cn = con.conectar();            
            CallableStatement cs = null;
            ResultSet rs = null;           
            try{
                cs=cn.prepareCall("CALL MOSTRAR_PRODUCTOS_ELIMINADOS");
                rs=cs.executeQuery();
                while(rs.next()){
                    Producto p = new Producto(
                            rs.getString("Codigo_P"),
                            rs.getString("modelo"),
                            rs.getString("nombre"),
                            rs.getString("marca"),
                            rs.getString("dim"),
                            rs.getString("men_ram"),
                            rs.getString("almace"),
                            rs.getString("cam_from"),
                            rs.getString("cam_pos"),
                            rs.getString("bateria"),
                            rs.getString("color"),
                            rs.getInt("un_disp"),
                            rs.getDouble("precio"),
                            rs.getString("image"),
                            rs.getString("Estado_P")
                    );
                    lista.add(p);
                }               
            }catch(Exception e){
                System.out.println(e);
            }          
        return lista;
    }
  
    public static boolean insertarProducto(Producto p){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL REGISTRAR_PRODUCTO (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //cs.setString(1, p.getCodigoP());
            cs.setString(1, p.getModelo());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getMarca());
            cs.setString(4, p.getDimen());
            cs.setString(5, p.getMemram());
            cs.setString(6, p.getAlmace());
            cs.setString(7, p.getCamfrom());
            cs.setString(8, p.getCampos());
            cs.setString(9, p.getBateria());
            cs.setString(10, p.getColor());
            cs.setInt(11, p.getUndisp());
            cs.setDouble(12, p.getPrecio());
            cs.setString(13, p.getImagenP());
            int i = cs.executeUpdate();
            
            if(i==1)
                resp = true;
            else
                resp = false;
            
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static boolean actualizarProducto(Producto p){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL MODIFICAR_PRODUCTO (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            cs.setString(1, p.getCodigoP());       
            cs.setString(2, p.getModelo());
            cs.setString(3, p.getNombre());
            cs.setString(4, p.getMarca());
            cs.setString(5, p.getDimen());
            cs.setString(6, p.getMemram());
            cs.setString(7, p.getAlmace());
            cs.setString(8, p.getCamfrom());
            cs.setString(9, p.getCampos());
            cs.setString(10, p.getBateria());
            cs.setString(11, p.getColor());
            cs.setInt(12, p.getUndisp());
            cs.setDouble(13, p.getPrecio());
            cs.setString(14, p.getImagenP());
            
            cs.executeUpdate();
            
            int i = cs.executeUpdate();
            
            if(i==1)
                resp = true;
            else
                resp = false;
            
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    public static boolean eliminarProducto(Producto p){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL ELIMINAR_PRODUCTO (?)");
            cs.setString(1, p.getCodigoP());

            int i = cs.executeUpdate();
            
            if(i==1)
                resp = true;
            else
                resp = false;
            
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static boolean recuperarProducto(Producto p){
        boolean resp = false;
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL RECUPERAR_PRODUCTO (?)");
            cs.setString(1, p.getCodigoP());
            
            int i = cs.executeUpdate();
            
            if(i==1)
                resp = true;
            else
                resp = false;
            
        }catch(Exception e){System.out.println(e);}
        return resp;
    }
    
    public static Producto listarProductoPorCodigo(String Codigo){
        Producto p = new Producto();
        
        Connection cn;
        Conexion con = new Conexion();
        cn = con.conectar();
        
        try{
            CallableStatement cs = cn.prepareCall("CALL BUSCAR_PRODUCTO_CODIGO (?)");
            cs.setString(1, Codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                p.setCodigoP(rs.getString("codigo_p"));
                p.setModelo(rs.getString("modelo"));
                p.setNombre(rs.getString("nombre"));       
                p.setMarca(rs.getString("marca")); 
                p.setDimen(rs.getString("dim"));
                p.setMemram(rs.getString("men_ram"));
                p.setAlmace(rs.getString("almace")); 
                p.setCamfrom(rs.getString("cam_from"));  
                p.setCampos(rs.getString("cam_pos"));
                p.setBateria(rs.getString("bateria")); 
                p.setColor(rs.getString("color"));
                p.setUndisp(rs.getInt("un_disp"));
                p.setPrecio(rs.getDouble("precio"));
                p.setImagenP(rs.getString("imagen"));                   
            }
        }catch(Exception e){System.out.println(e);}
        return p;
    }
}
