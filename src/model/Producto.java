/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tello
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private String color;
    private String tamaño;
    private int stock;
    private Float costo;
    private Float precio;
    private String edad_rec;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String color, String tamaño, int stock, Float precio, Float costo, String edad_rec) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.stock = stock; 
        this.precio = precio;
        this.costo = costo;     
        this.edad_rec = edad_rec;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getEdad_rec() {
        return edad_rec;
    }

    public void setEdad_rec(String edad_rec) {
        this.edad_rec = edad_rec;
    }
}
