/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Arreglos_Detventa;
import model.DetVenta;
import controller.Arreglo_Vendedor;
import controller.Arreglo_Venta;
import controller.Arreglo_cliente;
import controller.Arreglo_producto;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Producto;
import model.Vendedor;
import model.Venta;

/**
 *
 * @author robca
 */
public class Usuario extends javax.swing.JFrame {
    int filas;
    ArrayList<Producto> datosProducto=new ArrayList<>();
    Producto producto = new Producto();
    Vendedor vendedor = new Vendedor();
    Cliente cliente = new Cliente();
    Arreglos_Detventa arreglo_detventa=new Arreglos_Detventa();
    Arreglo_producto arreglo_prod=new Arreglo_producto();
    Arreglo_Vendedor arreglo_vend= new Arreglo_Vendedor();
    Arreglo_Venta arreglo_venta = new Arreglo_Venta();
    Arreglo_cliente arreglo_cli = new Arreglo_cliente();
    DefaultTableModel Table = new DefaultTableModel();
    DefaultTableModel Table2 = new DefaultTableModel();
    DefaultTableModel TablaVen = new DefaultTableModel();
    DefaultTableModel TablaDetVen = new DefaultTableModel();
    
  
   

    public Usuario() {
        initComponents();
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(iconoventa.getWidth(), iconoventa.getHeight(), Image.SCALE_DEFAULT));
        iconoventa.setIcon(fondo1);
        this.setLocationRelativeTo(null);
        TablaDetVen.addColumn("ID PRODUCTO");
        TablaDetVen.addColumn("NOMBRE");
        TablaDetVen.addColumn("PRECIO");        
        TablaDetVen.addColumn("CANTIDAD");
        TablaDetVen.addColumn("SUB TOTAL");              
        TablaDetVenta.setModel(TablaDetVen); 
        Calendar c = new GregorianCalendar();
        fechaventa2.setCalendar(c);
        
        TablaVen.addColumn("Id Venta");
        TablaVen.addColumn("Fecha");
        TablaVen.addColumn("Id Cliente");
        TablaVen.addColumn("Id Vendedor");
        TablaVen.addColumn("Monto");
        TablaVenta.setModel(TablaVen);
        
        /*String[] filasventa = new String[5];
        for (int i = 0; i<arreglo_venta.filas(); i++){
            filasventa[0] = arreglo_venta.get(i).getId_venta();
            filasventa[1] = arreglo_venta.get(i).getFecha();
            filasventa[2] = String.valueOf(arreglo_venta.get(i).getId_cliente());
            filasventa[3] = String.valueOf(arreglo_venta.get(i).getId_vendedor());
            filasventa[4] = String.valueOf(arreglo_venta.get(i).getMonto());
            TablaVen.addRow(filasventa);
        }*/
        
        Table.addColumn("Código");
        Table.addColumn("DNI");
        Table.addColumn("Nombres");
        Table.addColumn("Apellidos");
        Table.addColumn("Fecha de nacimiento");
        Table.addColumn("Sexo");
        Table.addColumn("Email");
        Table.addColumn("Dirección");
        Table.addColumn("Distrito");
        Table.addColumn("Provincia");
        Table.addColumn("País");
        TablaClientes.setModel(Table);
        
        Table2.addColumn("Código");
        Table2.addColumn("Nombre");
        Table2.addColumn("Color:");
        Table2.addColumn("Tamaño:");
        Table2.addColumn("Stock:");
        Table2.addColumn("Precio:");
        Table2.addColumn("Costo:");
        Table2.addColumn("Edad Recomendada");
        TablaProductos.setModel(Table2);
        
        
        
        
        String [] filasprod=  new String[8];
   
     for(int i=0;i<arreglo_prod.filas();i++){
          filasprod[0] = String.valueOf(arreglo_prod.get(i).getCodigo());
          filasprod[1] =arreglo_prod.get(i).getNombre();
          filasprod[2] = arreglo_prod.get(i).getColor();
           filasprod[3] =arreglo_prod.get(i).getTamaño();
           filasprod[4] =String.valueOf(arreglo_prod.get(i).getStock());
           filasprod[5] = String.valueOf(arreglo_prod.get(i).getPrecio());
          filasprod[6] = String.valueOf(arreglo_prod.get(i).getCosto());      
          filasprod[7] = arreglo_prod.get(i).getEdad_rec();
           Table2.addRow(filasprod);   
           }   
           
     String [] filascliente = new String[11];

        for(int i=0; i<arreglo_cli.filas();i++){
            filascliente[0] = String.valueOf(arreglo_cli.get(i).getCodigo());
            filascliente[1] = String.valueOf(arreglo_cli.get(i).getDni());
            filascliente[2] = arreglo_cli.get(i).getNombre();
            filascliente[3] = arreglo_cli.get(i).getApellido();
            filascliente[4] = arreglo_cli.get(i).getNacimiento();
            filascliente[5] = arreglo_cli.get(i).getSexo();
            filascliente[6] = arreglo_cli.get(i).getEmail();
            filascliente[7] = arreglo_cli.get(i).getDireccion();
            filascliente[8] = arreglo_cli.get(i).getDistrito();
            filascliente[9] = arreglo_cli.get(i).getProvincia();
            filascliente[10] = arreglo_cli.get(i).getPais();
            Table.addRow(filascliente);
        }
     
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaDetVenta = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        labelMonto = new javax.swing.JLabel();
        labelMonto1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        buscarproducto = new javax.swing.JButton();
        calcularsub = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCliente1 = new javax.swing.JTextField();
        spnFac = new javax.swing.JRadioButton();
        spnBol = new javax.swing.JRadioButton();
        fechaventa2 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodVendedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JLabel();
        btnBuscarVendedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        iconoventa = new javax.swing.JLabel();
        ListarVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(14, 176, 68));

        jPanel13.setBackground(new java.awt.Color(14, 176, 68));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resumen de Venta"));
        jPanel13.setForeground(new java.awt.Color(242, 242, 242));
        jPanel13.setToolTipText("");
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaDetVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaDetVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetVentaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TablaDetVenta);

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 51));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        labelMonto.setBackground(new java.awt.Color(255, 255, 255));

        labelMonto1.setBackground(new java.awt.Color(255, 255, 255));
        labelMonto1.setText("El monto Total:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMonto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMonto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        jPanel14.setBackground(new java.awt.Color(14, 176, 68));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Producto"));
        jPanel14.setForeground(new java.awt.Color(242, 242, 242));
        jPanel14.setToolTipText("");
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setText("Codigo");

        jLabel12.setText("Cantidad:");

        jLabel13.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sub Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 102));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(255, 153, 153));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        buscarproducto.setBackground(new java.awt.Color(255, 255, 51));
        buscarproducto.setText("Buscar");
        buscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarproductoActionPerformed(evt);
            }
        });

        calcularsub.setBackground(new java.awt.Color(255, 255, 51));
        calcularsub.setText("Calcular");
        calcularsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularsubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCantidad))
                .addGap(421, 421, 421)
                .addComponent(buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(calcularsub, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calcularsub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)))
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(14, 176, 68));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de Venta"));
        jPanel15.setForeground(new java.awt.Color(242, 242, 242));
        jPanel15.setToolTipText("");
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setText("Cliente");

        txtCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliente1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(spnFac);
        spnFac.setText("Factura");
        spnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnFacActionPerformed(evt);
            }
        });

        buttonGroup2.add(spnBol);
        spnBol.setText("Boleta");

        fechaventa2.setBackground(new java.awt.Color(14, 176, 68));

        jLabel16.setText("Fecha:");

        jLabel11.setText("ID Vendedor");

        jLabel17.setText("Vendedor");

        txtVendedor.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarVendedor.setBackground(new java.awt.Color(255, 255, 51));
        btnBuscarVendedor.setText("Buscar");
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Cliente");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txtCodVendedor))
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spnFac)
                .addGap(26, 26, 26)
                .addComponent(spnBol)
                .addGap(36, 36, 36)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaventa2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnBuscarVendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15)
                    .addComponent(txtCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaventa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarVendedor)
                .addGap(19, 19, 19))
        );

        jPanel16.setBackground(new java.awt.Color(14, 176, 68));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operaciones"));
        jPanel16.setForeground(new java.awt.Color(242, 242, 242));
        jPanel16.setToolTipText("");
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 255, 51));
        Regresar.setText("Finalizar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane2.addTab("Carrito", jPanel12);

        jPanel3.setBackground(new java.awt.Color(14, 176, 68));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(247, 247, 44));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla de Venta"));

        TablaVenta.setAutoCreateRowSorter(true);
        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaVenta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 950, 430));

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tai Loy");
        jLabel7.setToolTipText("");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 80));
        jPanel3.add(iconoventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 100, 80));

        ListarVenta.setBackground(new java.awt.Color(255, 255, 51));
        ListarVenta.setText("Listar");
        ListarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(ListarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 612, 160, 40));

        jTabbedPane2.addTab("Venta", jPanel3);

        jPanel1.setBackground(new java.awt.Color(14, 176, 68));

        jPanel17.setBackground(new java.awt.Color(14, 176, 68));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla de Productos"));
        jPanel17.setForeground(new java.awt.Color(242, 242, 242));
        jPanel17.setToolTipText("");
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tabla de Productos", jPanel1);

        jPanel5.setBackground(new java.awt.Color(14, 176, 68));

        jPanel11.setBackground(new java.awt.Color(14, 176, 68));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla de Clientes"));
        jPanel11.setForeground(new java.awt.Color(242, 242, 242));
        jPanel11.setToolTipText("");
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(TablaClientes);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane2.addTab("Tabla de Clientes", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliente1ActionPerformed

    private void spnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnFacActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String form;
        String fec;       
        int cod,codrelativo;        
        
        cod = Integer.parseInt(txtCodigo.getText());
        codrelativo = arreglo_detventa.correlativo(); 
        
       
       
            if(txtidcliente.getText().isEmpty()|| txtCodVendedor.getText().isEmpty()
                    || txtCodigo.getText().isEmpty()|| txtNombre.getText().isEmpty()|| txtPrecio.getText().isEmpty()
                || txtCantidad.getText().isEmpty()||txtTotal.getText().isEmpty()|| spnBol.getText().isEmpty()
                || spnFac.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No dejar campos vacios");
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "Confirmar");
            
            
        if(spnFac.isSelected()){
            form = "F" + codrelativo;
        }
        else{
            form = "B" ;
        }

        String linea;
        String corf = null;
        String corb = null;
        
        try{
            BufferedReader pcorr = new BufferedReader(new FileReader("Correlativo.txt"));
            while ((linea = pcorr.readLine()) != null){
                String tipo = linea.substring(0,1);
                if(tipo.equals("F")){
                corf = linea.substring(0,8);
            }else{
                    corb = linea.substring(0,8);
                    }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        DetVenta ven = new DetVenta();
        if(spnFac.isSelected()){
            ven.setId_Venta(corf);
        } else {
            ven.setId_Venta(corb);
        }
        
        //ven.setId_Venta(form);   
        
        
        int idproducto = Integer.parseInt(txtCodigo.getText());
         int idvendedor = Integer.parseInt(txtCodVendedor.getText());
         int canti = Integer.parseInt(txtCantidad.getText());
         float precio = Float.parseFloat(txtTotal.getText());
        SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
         String date = ff.format(fechaventa2.getDate());
         
        ven.setId_Producto(idproducto);
        ven.setId_Venededor(idvendedor);
        ven.setCantidad(canti);
        ven.setFecha(date);
        ven.setPrecio(precio);
        ven.setTotal(Float.parseFloat(txtPrecio.getText()) * Integer.parseInt(txtCantidad.getText()));

        arreglo_detventa.agregar_array(ven);
        String [] filas_vent=new String[5];
        filas_vent[0]=txtCodigo.getText();
        filas_vent[1]=txtNombre.getText();         
        filas_vent[2]=txtPrecio.getText();        
        filas_vent[3]=txtCantidad.getText(); 
        filas_vent[4]=txtTotal.getText();
        TablaDetVen.addRow(filas_vent);
        
        Arreglos_Detventa b = new Arreglos_Detventa();
        b.grabarEnArchivo(ven);
        
        labelMonto.setText("0");
        int contar=TablaDetVen.getRowCount();
        int suma=0;
        do try{
            int f=suma++;
            float n1 = Float.parseFloat(TablaDetVen.getValueAt(f, 4).toString());
            String nu= labelMonto.getText();
            float nu2= Float.parseFloat(nu);
            float re= n1+nu2;
            labelMonto.setText(String.valueOf(re));
        }catch(Exception e){           
        }
        while(suma<contar);  
        
        
        
              
        
       
        
        
        /*arreglo_detventa.agregar_array(ven);
        arreglo_detventa.grabarEnArchivo(ven);*/
          
        
        
        
        
        txtCodigo.setText("");
        txtNombre.setText("");         
        txtPrecio.setText("");        
        txtCantidad.setText(""); 
        txtTotal.setText("");
        
        
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
        String linea;
        String corf = null;
        String corb = null;
        try{
            BufferedReader pcorr = new BufferedReader(new FileReader("Correlativo.txt"));
            while ((linea = pcorr.readLine()) != null){
                String tipo = linea.substring(0, 1);
                if(tipo.equals("F")){
                    corf = linea.substring(1, 8);
                } else {
                    corb = linea.substring(1, 8);
                }
                     
            }
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        //Con el correlativo busca en venta detalle
        String txtcorr = null;
        String partes[] = null;
        String cidven = null;
        Float prec1 = null;
       // Float acum = null   ;
        if (spnFac.isSelected()){
            txtcorr = corf;
        } else {
            txtcorr = corb;
        }
        try{
            BufferedReader corr2 = new BufferedReader(new FileReader("detalleVenta.txt"));
            while ((linea = corr2.readLine()) != null ){
                String tipo = linea.substring(1, 8);
                if(tipo.equals(txtcorr)){
                    //acumula total
                    partes = linea.split(",");
                    DetVenta dat = new DetVenta();
                    cidven = partes[0];
                    prec1 = (Float.parseFloat(partes[5]));
                    //Acumula
                    //acum = acum + prec1;
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //graba venta
        
        
        float monto;
       String form;
       
       Venta v = new Venta();
        
        SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
         String date = ff.format(fechaventa2.getDate());
        int idcliente = Integer.parseInt(txtidcliente.getText());
        int idvendedor = Integer.parseInt(txtCodVendedor.getText());
        monto = Float.parseFloat(labelMonto.getText());
        
        //v.setId_venta(Integer.parseInt(form));
        v.setId_venta(cidven);
        v.setFecha(date);
        v.setId_cliente(idcliente);
        v.setId_vendedor(idvendedor);
        v.setMonto(monto);
        
        
        
        Arreglo_Venta d = new Arreglo_Venta();
        d.grabarEnArchivo(v);
        d.grabacorre(cidven);
        
        
        labelMonto.setText(String.valueOf(0));
        
        
        TablaDetVen.getDataVector().removeAllElements();
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void TablaDetVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetVentaMouseClicked
        // TODO add your handling code here:
        int seleccion=TablaDetVenta.getSelectedRow();
        txtCodigo.setText(TablaDetVenta.getValueAt(seleccion, 0).toString());
        txtNombre.setText(TablaDetVenta.getValueAt(seleccion, 1).toString());         
        txtPrecio.setText(TablaDetVenta.getValueAt(seleccion, 2).toString());        
        txtCantidad.setText(TablaDetVenta.getValueAt(seleccion, 3).toString()); 
        txtTotal.setText(TablaDetVenta.getValueAt(seleccion, 4).toString());
        filas=seleccion;
    }//GEN-LAST:event_TablaDetVentaMouseClicked

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed
        // TODO add your handling code here:
         int codvendedor=0;
         int codcliente=0;
         
         if(txtidcliente.getText().isEmpty()|| txtCodVendedor.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(null, "No dejar campos vacios");
         }
         codcliente= Integer.parseInt(txtidcliente.getText());
        codvendedor=Integer.parseInt(txtCodVendedor.getText());
         vendedor =arreglo_vend.buscarcodigo(codvendedor);
         cliente = arreglo_cli.buscarcodigo(codcliente);
         
        
        if(vendedor.getNombres()!="Error" || producto.getNombre()!="Error"){          
             String nomvendedor = vendedor.getNombres();
             String apevendedor = String.valueOf(vendedor.getApellidos());
             String nomcliente = cliente.getNombre();
             String apecliente = cliente.getApellido();
             txtCliente1.setText(nomcliente + " " + apecliente);
            txtVendedor.setText(nomvendedor +" " +apevendedor); 
        }else{
            JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        }      
        
        
        
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        dispose();
        Inicio inic = new Inicio();
        inic.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void buscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarproductoActionPerformed
        int cod=0;
        cod=Integer.parseInt(txtCodigo.getText());
         producto =arreglo_prod.buscarcodigo(cod);
        
        if(producto.getNombre()!="Error"){
           
            txtNombre.setText(producto.getNombre());
            txtPrecio.setText(String.valueOf(producto.getPrecio())); 
        }else{
            JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buscarproductoActionPerformed

    private void calcularsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularsubActionPerformed
        int can,pre;     
        can =Integer.parseInt(txtCantidad.getText());
        pre = (int) Float.parseFloat(txtPrecio.getText());       
        txtTotal.setText(String.valueOf(can*pre));
        
        int canti = Integer.parseInt(txtCantidad.getText());
       String [] filasprod=  new String[8];
   
       
    }//GEN-LAST:event_calcularsubActionPerformed

    private void ListarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVentaActionPerformed
        // TODO add your handling code here:
        String [] filas1 = new String [5];
        
        for(int i=0; i<arreglo_venta.filas(); i++){
            filas1[0] = arreglo_venta.get(i).getId_venta();
            filas1[1] = arreglo_venta.get(i).getFecha();
            filas1[2] = String.valueOf(arreglo_venta.get(i).getId_cliente());
            filas1[3] = String.valueOf(arreglo_venta.get(i).getId_vendedor());
            filas1[4] = String.valueOf(arreglo_venta.get(i).getMonto());
            TablaVen.addRow(filas1);
        }
    
    }//GEN-LAST:event_ListarVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarVenta;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaDetVenta;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaVenta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarVendedor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton buscarproducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton calcularsub;
    private com.toedter.calendar.JDateChooser fechaventa2;
    private javax.swing.JLabel iconoventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelMonto;
    private javax.swing.JLabel labelMonto1;
    private javax.swing.JRadioButton spnBol;
    private javax.swing.JRadioButton spnFac;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente1;
    private javax.swing.JTextField txtCodVendedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtVendedor;
    private javax.swing.JTextField txtidcliente;
    // End of variables declaration//GEN-END:variables
}
