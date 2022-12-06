/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Proveedor;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Alonso
 */
public class Arreglo_proveedor {
    private ArrayList<Proveedor> proveedorarray = new ArrayList<>();
    
    
    public Arreglo_proveedor(){
        cargardatos_archivo_vector();
    }
    public void cargardatos_archivo_vector()
    {
        BufferedReader lector;
        String linea;
        String partes[] = null;
        try{
            lector = new BufferedReader(new FileReader("proveedor.txt"));
            while((linea=lector.readLine())!= null){
                partes=linea.split(",");
                Proveedor p = new Proveedor();
                p.setCodigo(Integer.parseInt(partes[0]));
                p.setRUC(Integer.parseInt(partes[1]));
                p.setRazon(partes[2]);
                p.setDireccion(partes[3]);
                p.setTelefono1(Integer.parseInt(partes[4]));
                p.setTelefono2(Integer.parseInt(partes[5]));
                p.setWeb(partes[6]);
                p.setSucursal(partes[7]);
                
                agregar_array(p);
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }    
    }
    public void agregar_array(Proveedor p){
        proveedorarray.add(p);
    }
    public int correlativo(){
        if(proveedorarray.size()==0){
            return 1;
        }
        else{
            return proveedorarray.get(proveedorarray.size()-1).getCodigo()+1;
        }
    }
    public void grabarEnArchivo(Proveedor p){
        try
        {
            FileWriter f = new FileWriter("proveedor.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(p.getCodigo()+","+p.getRUC()+","+p.getRazon()+","+
                    p.getDireccion()+","+p.getTelefono1()+","+p.getTelefono2()
            +","+ p.getWeb()+","+p.getSucursal());
            pw.flush();
            pw.close();
        }catch (Exception e){
            System.out.print(e);
        }
    }    
    public int filas(){
        return proveedorarray.size();   
    }
    
    public Proveedor get(int pos){
        return proveedorarray.get(pos);
    }
    
    public Proveedor buscarcodigo(int cod){
        Proveedor p = new Proveedor();
        p.setRazon("Error");
        for(Proveedor x:proveedorarray){
            if(cod==x.getCodigo()){
                return x;
            }
        }
        return p;
    }
    
    public boolean modificar(Proveedor p, int a, String b, String c,
            int d, int e, String f,String g)
    {
        for(int i = 0;i<filas();i++)
        {
            if(p.getCodigo()== get(i).getCodigo()){
                proveedorarray.get(i).setRUC(a);
                proveedorarray.get(i).setRazon(b);
                proveedorarray.get(i).setDireccion(c);
                proveedorarray.get(i).setTelefono1(d);
                proveedorarray.get(i).setTelefono2(e);
                proveedorarray.get(i).setWeb(f);
                proveedorarray.get(i).setSucursal(g);
                return true;
            }
        }
        return false;
    }
    
    public void grabarModificareliminar(){
        try{
            FileWriter f = new FileWriter("proveedor.txt",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Proveedor p:proveedorarray)
            {
                pw.println(p.getCodigo()+","+p.getRUC()+","+p.getRazon()
                +","+p.getDireccion()+","+p.getTelefono1()+","+p.getTelefono2()
                +","+p.getWeb()+","+p.getSucursal());
                
                pw.flush();
                pw.close();
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }
    }
    public void eliminar(Proveedor p)
    {
        proveedorarray.remove(getposarray(p));
    }
    public int getposarray(Proveedor p){
        for(int i=0; i<filas(); i++)
        {
            if(p.getCodigo()==proveedorarray.get(i).getCodigo()){
                return i;
            }
        }
        return -1;
    }
}
