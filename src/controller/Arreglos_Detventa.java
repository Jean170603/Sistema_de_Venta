/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DetVenta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author tello
 */
public class Arreglos_Detventa {
     private ArrayList<DetVenta> detventaarray =new ArrayList<>();
    
    public Arreglos_Detventa(){
        cargardatos_archivo_vector();
    }
  public void  cargardatos_archivo_vector()
    {
      
        BufferedReader lector;
        String linea;
         String partes[]=null;
        try{
            lector=new BufferedReader(new FileReader("detalleVenta.txt"));
            while((linea=lector.readLine())!=null){
                
               
                partes=linea.split(",");
                DetVenta dat=new DetVenta();
                
                dat.setId_Venta(partes[0]);
                dat.setId_Producto(Integer.parseInt(partes[1]));
                dat.setId_Venededor(Integer.parseInt(partes[2]));
                dat.setCantidad(Integer.parseInt(partes[3]));
                dat.setFecha(partes[4]);
                dat.setPrecio(Float.parseFloat(partes[5]));
                
               agregar_array(dat);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
  
 public void agregar_array(DetVenta ven){
     detventaarray.add(ven);        
 }
 public int correlativo(){
     if(detventaarray.size()==0){
         return 1;
     }
         return detventaarray.get(detventaarray.size()-1).getCodigo()+1;
   }
 
   public void grabarEnArchivo(DetVenta ven){
      try
        {
            FileWriter f = new FileWriter("detalleVenta.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(ven.getId_Venta() + "," + ven.getId_Producto() + "," + ven.getId_Venededor()+ "," +
                    ven.getCantidad()+ "," +ven.getFecha()+ "," + ven.getPrecio()) ;/*+ "," + ven.getFormapago())*/
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
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
  
    
  public int filas(){
      return detventaarray.size();
  }
  
  public DetVenta get(int pos){
      return detventaarray.get(pos);
  }

  public DetVenta buscarcodigo(String cod){
      DetVenta dat=new DetVenta();
      dat.setFecha("Error");
      for(DetVenta x:detventaarray){
          if(cod==x.getId_Venta()){
              return x;
          }
      }
      return dat;
  }
  public DetVenta buscarcod(int cod){
      DetVenta dat=new DetVenta();
      dat.setFecha("Error");
      for(DetVenta x:detventaarray){
          if(cod == x.getId_Producto()){
              return x;
          }
      }
      return dat;
  }
     
}

