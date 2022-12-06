/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alonso
 */
public class Venta {
    private String id_venta;
    private String fecha;
    private int id_cliente;
    private int id_vendedor;
    private float monto;

    public Venta() {
    }

    public Venta(String id_venta, String fecha, int id_cliente, int id_vendedor, float monto) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.monto = monto;
    }

    
    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}
