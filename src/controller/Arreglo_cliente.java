/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Alonso
 */
public class Arreglo_cliente {
    
    private ArrayList<Cliente> clientearray = new ArrayList<>();
    
    public Arreglo_cliente(){
        cargardatos_archivo_vector();
    }
    
    public void cargardatos_archivo_vector()
    {
        BufferedReader lector;
        String linea;
        String partes[] = null;
        try{
            lector = new BufferedReader(new FileReader("cliente.txt"));
            while((linea = lector.readLine())!= null){
            partes=linea.split(",");
            Cliente c = new Cliente();
            c.setCodigo(Integer.parseInt(partes[0]));
            c.setDni(Integer.parseInt(partes[1]));
            c.setNombre(partes[2]);
            c.setApellido(partes[3]);
            c.setNacimiento(partes[4]);
            c.setSexo(partes[5]);
            c.setEmail(partes[6]);
            c.setDireccion(partes[7]);
            c.setDistrito(partes[8]);
            c.setProvincia(partes[9]);
            c.setPais(partes[10]);
            
            agregar_array(c);     
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void agregar_array(Cliente c){
        clientearray.add(c);
    }
    public int correlativo(){
        if(clientearray.size()==0){
            return 1;
        }
        else
        {
            return clientearray.get(clientearray.size()-1).getCodigo()+1;
        }
    }
    public void grabarEnArchivo(Cliente c){
        try
        {
            FileWriter f = new FileWriter("cliente.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(c.getCodigo()+ ","+c.getDni()+","+c.getNombre()+","+c.getApellido()+","+c.getNacimiento()
                      +","+c.getSexo()+","+c.getEmail()+","+c.getDireccion()+","+c.getDistrito()
                        +","+c.getProvincia()+","+c.getPais());
            pw.flush();
            pw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public int filas(){
        return clientearray.size();
    }
    public Cliente get(int pos){
        return clientearray.get(pos);
    }
    
    public Cliente buscarcodigo(int cod){
        Cliente c = new Cliente();
        c.setApellido("Error");
        for(Cliente x:clientearray){
            if(cod==x.getCodigo()){
                return x;
            }
        }
        return c;
    }
 
    
   public  boolean modificar(Cliente c, int a,String m,String n,String d,
                String e,String f,String g,String h,String j,String k){
        for(int i=0;i<filas();i++){
            if(c.getCodigo()== get(i).getCodigo()){
                clientearray.get(i).setDni(a);                       
                clientearray.get(i).setNombre(m);
                clientearray.get(i).setApellido(n);
                clientearray.get(i).setNacimiento(d);
                clientearray.get(i).setSexo(e);
                clientearray.get(i).setEmail(f);
                clientearray.get(i).setDireccion(g);
                clientearray.get(i).setDistrito(h);
                clientearray.get(i).setProvincia(j);
                clientearray.get(i).setPais(k);
                
                return true;
            }
        }
        return false;
    }
    
   public void grabarModificareliminar(){
        try{
            FileWriter f = new FileWriter("cliente.txt",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Cliente c:clientearray)
            {
                pw.println(c.getCodigo()+","+c.getDni()+","+c.getNombre()+","+c.getApellido()+","+c.getNacimiento()
                      +","+c.getSexo()+","+c.getEmail()+","+c.getDireccion()+","+c.getDistrito()
                        +","+c.getProvincia()+","+c.getPais());
            }
            pw.flush();
            pw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
   public void eliminar(Cliente c)
    {
        clientearray.remove(getposarray(c));
    }
    public int getposarray(Cliente c){
        for(int i=0; i<filas();i++)
        {
            if(c.getCodigo()==clientearray.get(i).getCodigo()){
                return i;
            }
        }
        return -1;
    }
    
    
}
