/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tello
 */
public class Admin {
  private String usuario;
    private String contraseña;
    private String cargo;
    String nombreArchivo;
    private String linea;
    private BufferedReader lector;
    private String partes[]=null;

    public Admin(String usuario, String contraseña,String cargo, String nombreArchivo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreArchivo = nombreArchivo;
        this.cargo = cargo;        
    }
    

    public Admin(String user, String pass, String logintxt) {
    }

    public Admin() {
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
   public void guardar(){
    try{
        FileWriter fi = new FileWriter(nombreArchivo,true);
        BufferedWriter b = new BufferedWriter(fi);
        PrintWriter pw = new PrintWriter(b);
        pw.println(usuario+","+contraseña+","+cargo);
        pw.flush();
        pw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
      public void leerArchivo(String nombreArchivo){
    try{
        
        lector = new BufferedReader(new FileReader(nombreArchivo));
        while((linea = lector.readLine())!=null){
            partes=linea.split(",");
           imprimir();
      
        }
         }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
         }
    }
     
      public void imprimir()
    {
       String[] fila = new String[4];
      
       fila[0] = getUsuario().toString();
      //  fila[1] = person.get(siguiente).getEdad().toString();
        fila[1] = getContraseña().toString();
        
                
        
    }
}
