/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Vendedor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Pc
 */
public class Arreglo_Vendedor {
    
    private ArrayList<Vendedor> webarray=new ArrayList<>();
    
    public Arreglo_Vendedor(){
        cargardatos_archivo_vector();
    }
  public void  cargardatos_archivo_vector()
    {
        BufferedReader lector;
        String linea;
         String partes[]=null;
        try{
            lector=new BufferedReader(new FileReader("trabajadores.txt"));
            while((linea=lector.readLine())!=null){   
                partes=linea.split(",");
                
                Vendedor w=new Vendedor();
                w.setCodigo(Integer.parseInt(partes[0]));
                w.setDni(Integer.parseInt(partes[1]));
                w.setNombres(partes[2]);
                w.setApellidos(partes[3]);                
                w.setFechaNac(partes[4]);
                w.setSexo(partes[5]);
                w.setEmail(partes[6]);
                w.setDireccion(partes[7]);
                w.setDistrito(partes[8]);
                w.setProvincia(partes[9]);
                w.setPais(partes[10]);
                w.setSueldo(Integer.parseInt(partes[11]));     
                w.setSistPension(partes[12]);
                w.setFechaIng(partes[13]);
                w.setHijos(Integer.parseInt(partes[14]));
                w.setSeguro(partes[15]);                            
             
                agregar_array(w);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
    }
  
 public void agregar_array(Vendedor w){
     webarray.add(w);       
 }
  
 public int correlativo(){
     if(webarray.size()==0){
         return 1;
     }
     else{
         return webarray.get(webarray.size()-1).getCodigo()+1;
     }
 }
    public void grabarEnArchivo(Vendedor w){
      try
        {           
            FileWriter f = new FileWriter("trabajadores.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            pw.println(w.getCodigo() + "," + w.getDni() + "," + w.getNombres() + "," + w.getApellidos()
                + "," + w.getFechaNac()+ "," + w.getSexo() + "," + w.getEmail() 
                + "," + w.getDireccion() + "," + w.getDistrito() + "," + w.getProvincia() + "," + w.getPais()
                + "," + w.getSueldo() + "," + w.getSistPension() + "," + w.getFechaIng() + ","+w.getHijos() + "," + w.getSeguro());
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }       
    
 public int filas(){
      return webarray.size();
  }
  
 public Vendedor get(int pos){
      return webarray.get(pos);
  }
  
 public Vendedor buscarcodigo(int cod){
      Vendedor w=new Vendedor();
      w.setNombres("Error");
      for(Vendedor x:webarray){
          if(cod==x.getCodigo()){
              return x;
          }
      }
      return w;
  }
    
   public boolean modificar(Vendedor w, int d,String n,String a,String fn,String s,
                    String e,String di,String dis,String pro,String p,
                    int su,String pe,String fi,int h,String seg){
       for(int i=0;i<filas();i++){
           if(w.getCodigo() == get(i).getCodigo()){
               webarray.get(i).setDni(d);
               webarray.get(i).setNombres(n);
               webarray.get(i).setApellidos(a);
               webarray.get(i).setFechaNac(fn);
               webarray.get(i).setSexo(s);
               webarray.get(i).setEmail(e);
               webarray.get(i).setDireccion(di);
               webarray.get(i).setDistrito(dis);
               webarray.get(i).setProvincia(pro);
               webarray.get(i).setPais(p);
               webarray.get(i).setSueldo(su);
               webarray.get(i).setSistPension(pe);
               webarray.get(i).setFechaIng(fi);
               webarray.get(i).setHijos(h);
               webarray.get(i).setSeguro(seg);

               return true;
           }
       }
       return false;
   }
   
   public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter("trabajadores.txt",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Vendedor w:webarray)
            {
               pw.println(w.getCodigo() + "," + w.getDni() + "," + w.getNombres() + "," + w.getApellidos()
                                        + "," + w.getFechaNac()+ "," + w.getSexo() + "," + w.getEmail()
                                        + "," + w.getDireccion() + "," + w.getDistrito() + "," + w.getProvincia()
                                        + "," + w.getPais() + "," + w.getSueldo() + "," + w.getSistPension()
                                        + "," + w.getFechaIng() + ","+w.getHijos() + "," + w.getSeguro()); 
            }            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }
   public void eliminar(Vendedor w){
       webarray.remove(getposarray(w));
   }
   public int getposarray(Vendedor w){
       for(int i=0;i<filas();i++){
           if(w.getCodigo()==webarray.get(i).getCodigo()){
               return i;
           }
       }     
       return -1;
   }
}

