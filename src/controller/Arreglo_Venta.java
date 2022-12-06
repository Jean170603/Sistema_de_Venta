/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Venta;

/**
 *
 * @author Alonso
 */
public class Arreglo_Venta {
    
    private ArrayList<Venta> ventaarray = new ArrayList<>();
    
    public Arreglo_Venta(){
        cargardatos_archivo_vector();
    }
    
    public void cargardatos_archivo_vector ()
    {
        BufferedReader lector;
        String linea;
        String partes[] = null;
        
        try{
            lector = new BufferedReader(new FileReader("venta.txt"));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                Venta dat = new Venta();
                dat.setId_venta(partes[0]);
                dat.setFecha(partes[1]);
                dat.setId_cliente(Integer.parseInt(partes[2]));
                dat.setId_vendedor(Integer.parseInt(partes[3]));
                dat.setMonto(Float.parseFloat(partes[4]));
                
                agregar_array(dat);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    public void agregar_array(Venta v){
        ventaarray.add(v);
    }
    
    
    public void grabarEnArchivo(Venta v){
        try{
            FileWriter f = new FileWriter("venta.txt", true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(v.getId_venta()+","+v.getFecha()+","+v.getId_cliente()+","+v.getId_vendedor()
            +","+v.getMonto());
            pw.flush();
            pw.close();
        } catch (Exception e){
            System.out.print(e);
        }
    }
     
    public void grabacorre(String corr){
       try{
           FileWriter f = new FileWriter("Correlativo.txt", true);
           BufferedWriter b = new BufferedWriter(f);
           PrintWriter pw = new PrintWriter(b);
           String corre2 = corr.substring(1, 8);
           int corr3 = Integer.parseInt(corre2) + 1;
           String corr4 = corr.substring(0,1) + String.format("%07d", corr3);
           pw.println(corr4);
           pw.flush();
           pw.close();
       }catch (Exception e){
           System.out.println(e);
       }
   }
    
     /*public int correlativo(){
     if(ventaarray.size()==0){
         return 1;
     }
         return ventaarray.get(ventaarray.size()-1).getId_venta()+1;
   }*/
    
    public int filas(){
        return ventaarray.size();
    }
    public Venta get(int pos){
        return ventaarray.get(pos);
    }
    
    
}
