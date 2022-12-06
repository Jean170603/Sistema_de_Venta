/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Vendedor {
    
    private int codigo, dni,hijos, sueldo;
    private String nombres, apellidos,sexo,
                   masculino,femenino,fechaNac,email, 
                   direccion,distrito,provincia,pais,sistPension,fechaIng,seguro;
    

    public Vendedor() {
    }

    public Vendedor(int codigo, int dni, int hijos, int sueldo, String nombres, String apellidos, String sexo, String masculino, String femenino, String fechaNac, String email, String direccion, String distrito, String provincia, String pais, String sistPension, String fechaIng, String seguro) {
        this.codigo = codigo;
        this.dni = dni;
        this.hijos = hijos;
        this.sueldo = sueldo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.masculino = masculino;
        this.femenino = femenino;
        this.fechaNac = fechaNac;
        this.email = email;
        this.direccion = direccion;
        this.distrito = distrito;
        this.provincia = provincia;
        this.pais = pais;
        this.sistPension = sistPension;
        this.fechaIng = fechaIng;
        this.seguro = seguro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMasculino() {
        return masculino;
    }

    public void setMasculino(String masculino) {
        this.masculino = masculino;
    }

    public String getFemenino() {
        return femenino;
    }

    public void setFemenino(String femenino) {
        this.femenino = femenino;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSistPension() {
        return sistPension;
    }

    public void setSistPension(String sistPension) {
        this.sistPension = sistPension;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
} 