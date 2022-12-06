/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Producto;
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
public class Arreglo_producto {
    private ArrayList<Producto> datosarray=new ArrayList<>();
    
    public Arreglo_producto(){
        cargardatos_archivo_vector();
    }
  public void  cargardatos_archivo_vector()
    {
      
        BufferedReader lector;
        String linea;
         String partes[]=null;
        try{
            lector=new BufferedReader(new FileReader("Productos.txt"));
            while((linea=lector.readLine())!=null){
               
                partes=linea.split(",");
                Producto dat=new Producto();
                dat.setCodigo(Integer.parseInt(partes[0]));
                dat.setNombre(partes[1]);
                dat.setColor(partes[2]);
                dat.setTamaño(partes[3]);
                dat.setStock(Integer.parseInt(partes[4]));
                dat.setPrecio(Float.parseFloat(partes[5]));
                dat.setCosto(Float.parseFloat(partes[6]));
                dat.setEdad_rec(partes[7]);
                
                
               agregar_array(dat);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
  
 public void agregar_array(Producto dat){
     datosarray.add(dat);
         
 }
  
public  int correlativo(){
     if(datosarray.size()==0){
         return 1;
     }
     else{
         return datosarray.get(datosarray.size()-1).getCodigo()+1;
     }
 }
   public  void grabarEnArchivo(Producto dat){
      try
        {
            FileWriter f = new FileWriter("Productos.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(dat.getCodigo() + "," + dat.getNombre() + "," + dat.getColor()+ "," +
                    dat.getTamaño()+ "," + dat.getStock()+","+dat.getPrecio()+ "," +dat.getCosto()+ "," +dat.getEdad_rec());
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }       
    
  public int filas(){
      return datosarray.size();
  }
  
  public Producto get(int pos){
      return datosarray.get(pos);
  }
  
  public Producto buscarcodigo(int cod){
      Producto dat=new Producto();
      dat.setNombre("Error");
      for(Producto x:datosarray){
          if(cod==x.getCodigo()){
              return x;
          }
      }
      return dat;
  }
    
   public boolean modificar(Producto dat,String a,String b, String c, int d,float e, float f,String g){
       for(int i=0;i<filas();i++){
           if(dat.getCodigo()==get(i).getCodigo()){
               datosarray.get(i).setNombre(a);              
               datosarray.get(i).setColor(b);
               datosarray.get(i).setTamaño(c);
               datosarray.get(i).setStock(d);
               datosarray.get(i).setPrecio(e);
               datosarray.get(i).setCosto(f);
               datosarray.get(i).setEdad_rec(g);
               
               
               
               return true;
           }
       }
       return false;
   }
   
   public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter("Productos.txt",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Producto dat:datosarray)
            {
               pw.println(dat.getCodigo() + "," + dat.getNombre() + "," + dat.getColor()+ ","+
                    dat.getTamaño()+","+dat.getStock()+ "," +dat.getPrecio()+ "," +dat.getCosto()+ "," +dat.getEdad_rec()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }
   public void eliminar(Producto dat){
       datosarray.remove(getposarray(dat));
   }
   public int getposarray(Producto dat){
       for(int i=0;i<filas();i++){
           if(dat.getCodigo()==datosarray.get(i).getCodigo()){
               return i;
           }
       }
       
       return -1;
   }
}
