/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Daniel
 */
public class Producto {
    private String CodigoP;
    private String modelo;
    private String nombre;
    private String marca;
    private String dimen;
    private String memram;
    private String almace;
    private String camfrom;
    private String campos;
    private String bateria;
    private String color;
    private int undisp;
    private double precio;
    private String ImagenP;
    private String estado;
 

    public Producto() {
    }

    public Producto(String CodigoP, String modelo, String nombre, String marca,
            String dimen,String memram,String almace,String camfrom,String campos,
           String bateria,String color, int undisp,double Precio, String ImagenP,String estado) {
        this.CodigoP = CodigoP;
        this.modelo = modelo;
        this.nombre=nombre;
        this.marca = marca;
        this.dimen = dimen;
        this.memram = memram;
        this.almace = almace;
        this.camfrom = camfrom;
        this.campos = campos;
        this.bateria = bateria;
        this.color = color;
        this.undisp = undisp;
        this.precio = Precio;
        this.ImagenP = ImagenP;
        this.estado = estado;
    }

    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDimen() {
        return dimen;
    }

    public void setDimen(String dimen) {
        this.dimen = dimen;
    }

    public String getMemram() {
        return memram;
    }

    public void setMemram(String memram) {
        this.memram = memram;
    }

    public String getAlmace() {
        return almace;
    }

    public void setAlmace(String almace) {
        this.almace = almace;
    }

    public String getCamfrom() {
        return camfrom;
    }

    public void setCamfrom(String camfrom) {
        this.camfrom = camfrom;
    }

    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUndisp() {
        return undisp;
    }

    public void setUndisp(int undisp) {
        this.undisp = undisp;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagenP() {
        return ImagenP;
    }

    public void setImagenP(String ImagenP) {
        this.ImagenP = ImagenP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
