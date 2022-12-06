/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tello
 */
public class DetVenta {
    String Id_Venta;
    String nombre;
    float precio;
    int codigo;
    int cantidad;
    String fecha;
    int Id_Producto;
    int Id_Venededor;
    int Id_Cliente;
    float precio_uni;
    float total;
    float total2;
    String formapago;

    public DetVenta() {
    }
    public DetVenta(String Id_Venta, String nombre, float precio, int codigo, int cantidad, String fecha, int Id_Producto, int Id_Venededor, int Id_Cliente, float precio_uni, float total, float total2, String formapago) {
        this.Id_Venta = Id_Venta;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.Id_Producto = Id_Producto;
        this.Id_Venededor = Id_Venededor;
        this.Id_Cliente = Id_Cliente;
        this.precio_uni = precio_uni;
        this.total = total;
        this.total2 = total2;
        this.formapago = formapago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


     public float getTotal2() {
        return total2;
    }

    public void setTotal2(float total2) {
        this.total2 = total2;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }


    public String getId_Venta() {
        return Id_Venta;
    }

    public void setId_Venta(String Id_Venta) {
        this.Id_Venta = Id_Venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public int getId_Venededor() {
        return Id_Venededor;
    }

    public void setId_Venededor(int Id_Venededor) {
        this.Id_Venededor = Id_Venededor;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrecio_uni() {
        return precio_uni;
    }

    public void setPrecio_uni(float precio_uni) {
        this.precio_uni = precio_uni;
    }

    public float PrecioTotal(){
        total=cantidad*precio_uni;
    return total;
}
   
     public float PrecioTotal2(){
        
        for(int i=0;i<10;i++)
        {
            total2= total2 + total;
        }
        return total2;
    }
    
    
}
