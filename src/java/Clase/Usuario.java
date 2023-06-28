
package Clase;
public class Usuario {
    private String CodigoUsuario;
    private String nombre;
    private String NombreUsuario;
    private String ApellidosUsuario;
    private String EmailUsuario;
    private String pais;
    private String Direccion1Usuario;
    private String ClaveUsuario;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(
            String CodigoUsuario,
             String Nombre, 
            String NombreUsuario, 
            String ApellidosUsuario, 
            String EmailUsuario,
            String pais,
            String Direccion1Usuario, 
            String ClaveUsuario) {
        this.CodigoUsuario = CodigoUsuario;
        this.nombre=Nombre;
        this.NombreUsuario = NombreUsuario;
        this.ApellidosUsuario = ApellidosUsuario;
        this.EmailUsuario = EmailUsuario;
        this.pais=pais;
        this.Direccion1Usuario = Direccion1Usuario;
        this.ClaveUsuario = ClaveUsuario;
    }

    public String getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(String CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getApellidosUsuario() {
        return ApellidosUsuario;
    }

    public void setApellidosUsuario(String ApellidosUsuario) {
        this.ApellidosUsuario = ApellidosUsuario;
    }

    public String getEmailUsuario() {
        return EmailUsuario;
    }

    public void setEmailUsuario(String EmailUsuario) {
        this.EmailUsuario = EmailUsuario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion1Usuario() {
        return Direccion1Usuario;
    }

    public void setDireccion1Usuario(String Direccion1Usuario) {
        this.Direccion1Usuario = Direccion1Usuario;
    }

    public String getClaveUsuario() {
        return ClaveUsuario;
    }

    public void setClaveUsuario(String ClaveUsuario) {
        this.ClaveUsuario = ClaveUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

   
    
/**********************************************/

    
    
}
