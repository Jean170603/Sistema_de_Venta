/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Arreglo_Vendedor;
import java.awt.Image;
import model.Vendedor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;
import javax.swing.table.DefaultTableModel;

public class Interfaz_Vendedor extends javax.swing.JFrame {

   Arreglo_Vendedor arreglovector=new Arreglo_Vendedor();
  Vendedor Wmodificar=new Vendedor();
  Vendedor Weliminar=new Vendedor();
  DefaultTableModel Table = new DefaultTableModel();
    
    public Interfaz_Vendedor() {
        initComponents();   
        this.setLocationRelativeTo(null);
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        Icon fondo1= new ImageIcon(imagen1.getImage().getScaledInstance(iconovendedores.getWidth(), iconovendedores.getHeight(), Image.SCALE_DEFAULT));
        iconovendedores.setIcon(fondo1);
        iconovendedores1.setIcon(fondo1);
        iconovendedores2.setIcon(fondo1);
        iconovendedores3.setIcon(fondo1);
        Table.addColumn("Cod.");        
        Table.addColumn("DNI");
        Table.addColumn("Nombres");
        Table.addColumn("Apellidos");        
        Table.addColumn("Fecha");
        Table.addColumn("Sexo");        
        Table.addColumn("E-mail");   
        Table.addColumn("Direc.");        
        Table.addColumn("Distrito");        
        Table.addColumn("Provincia");        
        Table.addColumn("Pais");        
        Table.addColumn("Sueldo");        
        Table.addColumn("Sist.Pension");        
        Table.addColumn("Fecha pension");        
        Table.addColumn("Nº Hijos");    
        Table.addColumn("Seguro");                
        Table1.setModel(Table);     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        spnMas = new javax.swing.JRadioButton();
        spnFem = new javax.swing.JRadioButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JComboBox<>();
        jLabel113 = new javax.swing.JLabel();
        txtPais = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        spnAfp = new javax.swing.JRadioButton();
        jLabel78 = new javax.swing.JLabel();
        spnOnp = new javax.swing.JRadioButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtHijos = new javax.swing.JSpinner();
        txtSeguro = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        listar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        dateFechaNac = new com.toedter.calendar.JDateChooser();
        dateFechaIng = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        iconovendedores = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        BuscarE = new javax.swing.JButton();
        EliminarE = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        txtNomE = new javax.swing.JLabel();
        txtDniE = new javax.swing.JLabel();
        txtApeE = new javax.swing.JLabel();
        txtFechaNacE = new javax.swing.JLabel();
        txtSexoE = new javax.swing.JLabel();
        txtDireccionE = new javax.swing.JLabel();
        txtEmailE = new javax.swing.JLabel();
        txtDistritoE = new javax.swing.JLabel();
        txtProvinciaE = new javax.swing.JLabel();
        txtPaisE = new javax.swing.JLabel();
        txtSueldoE = new javax.swing.JLabel();
        txtFechaIngE = new javax.swing.JLabel();
        txtSistPensionE = new javax.swing.JLabel();
        txtHijosE = new javax.swing.JLabel();
        txtSeguroE = new javax.swing.JLabel();
        txtCodigoE = new javax.swing.JTextField();
        iconovendedores1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BuscarB = new javax.swing.JButton();
        jLabel142 = new javax.swing.JLabel();
        txtDniB = new javax.swing.JLabel();
        txtNomB = new javax.swing.JLabel();
        txtApeB = new javax.swing.JLabel();
        txtFechaNacB = new javax.swing.JLabel();
        txtSexoB = new javax.swing.JLabel();
        txtEmailB = new javax.swing.JLabel();
        txtDireccionB = new javax.swing.JLabel();
        txtDistritoB = new javax.swing.JLabel();
        txtPaisB = new javax.swing.JLabel();
        txtProvinciaB = new javax.swing.JLabel();
        txtHijosB = new javax.swing.JLabel();
        txtFechaIngB = new javax.swing.JLabel();
        txtSueldoB = new javax.swing.JLabel();
        txtSistPensionB = new javax.swing.JLabel();
        txtSeguroB = new javax.swing.JLabel();
        txtCodigoB = new javax.swing.JTextField();
        iconovendedores2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        txtHijosM = new javax.swing.JSpinner();
        spnAfpM = new javax.swing.JRadioButton();
        jLabel84 = new javax.swing.JLabel();
        txtSeguroM = new javax.swing.JComboBox<>();
        spnOnpM = new javax.swing.JRadioButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        txtDireccionM = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        txtDistritoM = new javax.swing.JTextField();
        txtProvinciaM = new javax.swing.JComboBox<>();
        txtEmailM = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        txtPaisM = new javax.swing.JComboBox<>();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        txtSueldoM = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        txtDniM = new javax.swing.JTextField();
        spnMasM = new javax.swing.JRadioButton();
        spnFemM = new javax.swing.JRadioButton();
        jLabel140 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txtNomM = new javax.swing.JTextField();
        txtApeM = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ModificarM = new javax.swing.JButton();
        BuscarM = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        txtFechaNacM = new javax.swing.JTextField();
        txtSexoM = new javax.swing.JTextField();
        txtSistPensionM = new javax.swing.JTextField();
        txtFechaIngM = new javax.swing.JTextField();
        dateFechaNacM = new com.toedter.calendar.JDateChooser();
        dateFechaIngM = new com.toedter.calendar.JDateChooser();
        iconovendedores3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 176, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Registro de Vendedores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 17, -1, -1));

        jLabel98.setText("DNI");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 98, 31, -1));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 95, 126, -1));

        jLabel89.setText("Nombre");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 126, -1, -1));

        jLabel90.setText("Apellidos");
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 154, -1, -1));

        txtNom.setToolTipText("");
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 123, 170, -1));
        jPanel1.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 151, 170, -1));

        jLabel100.setText("E-mail");
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 266, -1, -1));

        spnMas.setText("Masculino");
        jPanel1.add(spnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 231, -1, -1));

        spnFem.setText("Femenino");
        jPanel1.add(spnFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 231, -1, -1));

        jLabel102.setText("Sexo");
        jPanel1.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 233, -1, -1));

        jLabel103.setText("Fecha Nacimiento");
        jPanel1.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 197, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 263, 157, -1));

        jLabel111.setText("Dirección");
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, -1, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 297, 193, -1));

        jLabel112.setText("Distrito");
        jPanel1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 334, -1, -1));
        jPanel1.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 331, 149, -1));

        txtProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        jPanel1.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 365, -1, -1));

        jLabel113.setText("Provincia");
        jPanel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 368, -1, -1));

        txtPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Argentina", "Bolivia", "Brasil", "Colombia", "Chile", "Ecuador", "México", "Paraguay", "Perú" }));
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 407, -1, -1));

        jLabel106.setText("País");
        jPanel1.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 410, 29, -1));

        jLabel107.setText("Sueldo");
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 446, -1, -1));
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 443, 126, -1));

        spnAfp.setText("AFP");
        spnAfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnAfpActionPerformed(evt);
            }
        });
        jPanel1.add(spnAfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 483, -1, -1));

        jLabel78.setText("Fecha Ingreso");
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 515, 123, -1));

        spnOnp.setText("ONP");
        spnOnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnOnpActionPerformed(evt);
            }
        });
        jPanel1.add(spnOnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 483, -1, -1));

        jLabel110.setText("Sistema Pensión");
        jPanel1.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 485, -1, -1));

        jLabel104.setText("Número de hijos");
        jPanel1.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 555, -1, -1));
        jPanel1.add(txtHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 549, 74, -1));

        txtSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "RIMAC", "MAPFRE", "Pacífico", "La Positiva", "EsSalud", " " }));
        txtSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeguroActionPerformed(evt);
            }
        });
        jPanel1.add(txtSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 589, -1, -1));

        jLabel79.setText("Seguro de Salud");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 592, 91, -1));

        listar.setText("LISTAR");
        listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel1.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 78, 38));

        cancelar.setText("VOLVER");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, 38));

        guardar.setText("GUARDAR");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, 38));
        jPanel1.add(dateFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 191, -1, -1));
        jPanel1.add(dateFechaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 509, -1, -1));

        jPanel5.setBackground(new java.awt.Color(14, 176, 68));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Vendedores"));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        Table1.setGridColor(new java.awt.Color(0, 204, 204));
        jScrollPane4.setViewportView(Table1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 340));
        jPanel1.add(iconovendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 530, 110, 100));

        jTabbedPane1.addTab("Registro", jPanel1);

        jPanel3.setBackground(new java.awt.Color(14, 176, 68));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel120.setText("DNI");
        jPanel3.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 31, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Eliminar");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, -1, -1));

        jLabel93.setText("Nombre");
        jPanel3.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 145, -1, -1));

        jLabel94.setText("Apellidos");
        jPanel3.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 174, -1, -1));

        jLabel121.setText("Fecha de Nacimiento");
        jPanel3.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 202, 123, -1));

        jLabel122.setText("E-mail");
        jPanel3.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 271, 41, -1));

        jLabel123.setText("Sexo");
        jPanel3.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 236, -1, -1));

        jLabel124.setText("Dirección");
        jPanel3.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 306, -1, -1));

        jLabel125.setText("Distrito");
        jPanel3.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 341, -1, -1));

        jLabel126.setText("Provincia");
        jPanel3.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 395, -1, -1));

        jLabel127.setText("País");
        jPanel3.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 424, 29, -1));

        jLabel128.setText("Sueldo");
        jPanel3.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 453, -1, -1));

        jLabel129.setText("Número de hijos");
        jPanel3.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 577, -1, -1));

        jLabel82.setText("Fecha de Ingreso");
        jPanel3.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 531, 123, -1));

        jLabel83.setText("Seguro de Salud");
        jPanel3.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 611, 91, -1));

        jLabel130.setText("Sistema Pensión");
        jPanel3.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        BuscarE.setText("BUSCAR");
        BuscarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEActionPerformed(evt);
            }
        });
        jPanel3.add(BuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 236, 96, 51));

        EliminarE.setText("ELIMINAR");
        EliminarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEActionPerformed(evt);
            }
        });
        jPanel3.add(EliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 236, 99, 51));

        jLabel143.setText("Codigo");
        jPanel3.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 43, -1));

        txtNomE.setBackground(new java.awt.Color(0, 153, 153));
        txtNomE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtNomE, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 144, 72, 17));

        txtDniE.setBackground(new java.awt.Color(0, 153, 153));
        txtDniE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtDniE, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 110, 72, 17));

        txtApeE.setBackground(new java.awt.Color(0, 153, 153));
        txtApeE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtApeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 174, 72, 17));

        txtFechaNacE.setBackground(new java.awt.Color(0, 153, 153));
        txtFechaNacE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtFechaNacE, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 201, 72, 17));

        txtSexoE.setBackground(new java.awt.Color(0, 153, 153));
        txtSexoE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtSexoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 236, 72, 17));

        txtDireccionE.setBackground(new java.awt.Color(0, 153, 153));
        txtDireccionE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtDireccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 306, 72, 17));

        txtEmailE.setBackground(new java.awt.Color(0, 153, 153));
        txtEmailE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtEmailE, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 271, 72, 17));

        txtDistritoE.setBackground(new java.awt.Color(0, 153, 153));
        txtDistritoE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtDistritoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 341, 72, 17));

        txtProvinciaE.setBackground(new java.awt.Color(0, 153, 153));
        txtProvinciaE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtProvinciaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 395, 72, 17));

        txtPaisE.setBackground(new java.awt.Color(0, 153, 153));
        txtPaisE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtPaisE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 424, 72, 17));

        txtSueldoE.setBackground(new java.awt.Color(0, 153, 153));
        txtSueldoE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtSueldoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 453, 72, 17));

        txtFechaIngE.setBackground(new java.awt.Color(0, 153, 153));
        txtFechaIngE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtFechaIngE, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 530, 72, 17));

        txtSistPensionE.setBackground(new java.awt.Color(0, 153, 153));
        txtSistPensionE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtSistPensionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 499, 72, 17));

        txtHijosE.setBackground(new java.awt.Color(0, 153, 153));
        txtHijosE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtHijosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 577, 72, 17));

        txtSeguroE.setBackground(new java.awt.Color(0, 153, 153));
        txtSeguroE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtSeguroE, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 612, 72, 17));

        txtCodigoE.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCodigoE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txtCodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 65, 71, -1));
        jPanel3.add(iconovendedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 530, 110, 100));

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jPanel2.setBackground(new java.awt.Color(14, 176, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setText("DNI");
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, 31, -1));

        jLabel101.setText("Dirección");
        jPanel2.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 283, -1, -1));

        jLabel105.setText("E-mail");
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 255, 41, -1));

        jLabel108.setText("Distrito");
        jPanel2.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 311, -1, -1));

        jLabel109.setText("Sexo");
        jPanel2.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 227, -1, -1));

        jLabel91.setText("Nombre");
        jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 122, -1, -1));

        jLabel92.setText("Apellidos");
        jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, -1, -1));

        jLabel114.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 184, 123, -1));

        jLabel115.setText("Número de hijos");
        jPanel2.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 509, -1, -1));

        jLabel116.setText("Provincia");
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 339, -1, 22));

        jLabel117.setText("País");
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 379, 29, -1));

        jLabel118.setText("Sueldo");
        jPanel2.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 413, -1, -1));

        jLabel80.setText("Fecha de Ingreso");
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 475, 123, -1));

        jLabel81.setText("Seguro de Salud");
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 552, 91, -1));

        jLabel119.setText("Sistema Pensión");
        jPanel2.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 441, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Buscador");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, -1));

        BuscarB.setText("BUSCAR");
        BuscarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBActionPerformed(evt);
            }
        });
        jPanel2.add(BuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 123, 36));

        jLabel142.setText("Codigo");
        jPanel2.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 66, -1, -1));

        txtDniB.setBackground(new java.awt.Color(0, 153, 153));
        txtDniB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtDniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 100, 70, 16));

        txtNomB.setBackground(new java.awt.Color(0, 153, 153));
        txtNomB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtNomB, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 122, 92, 16));

        txtApeB.setBackground(new java.awt.Color(0, 153, 153));
        txtApeB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtApeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 92, 16));

        txtFechaNacB.setBackground(new java.awt.Color(0, 153, 153));
        txtFechaNacB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtFechaNacB, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 184, 92, 16));

        txtSexoB.setBackground(new java.awt.Color(0, 153, 153));
        txtSexoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtSexoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 227, 92, 16));

        txtEmailB.setBackground(new java.awt.Color(0, 153, 153));
        txtEmailB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtEmailB, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 255, 92, 16));

        txtDireccionB.setBackground(new java.awt.Color(0, 153, 153));
        txtDireccionB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtDireccionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 283, 92, 16));

        txtDistritoB.setBackground(new java.awt.Color(0, 153, 153));
        txtDistritoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtDistritoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 311, 92, 16));

        txtPaisB.setBackground(new java.awt.Color(0, 153, 153));
        txtPaisB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtPaisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 379, 92, 16));

        txtProvinciaB.setBackground(new java.awt.Color(0, 153, 153));
        txtProvinciaB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtProvinciaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 339, 92, 15));

        txtHijosB.setBackground(new java.awt.Color(0, 153, 153));
        txtHijosB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtHijosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 509, 92, 16));

        txtFechaIngB.setBackground(new java.awt.Color(0, 153, 153));
        txtFechaIngB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtFechaIngB, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 475, 92, 16));

        txtSueldoB.setBackground(new java.awt.Color(0, 153, 153));
        txtSueldoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtSueldoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 413, 92, 16));

        txtSistPensionB.setBackground(new java.awt.Color(0, 153, 153));
        txtSistPensionB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtSistPensionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 441, 92, 16));

        txtSeguroB.setBackground(new java.awt.Color(0, 153, 153));
        txtSeguroB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtSeguroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 552, 92, 16));

        txtCodigoB.setBackground(new java.awt.Color(153, 153, 153));
        txtCodigoB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtCodigoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 62, 71, -1));
        jPanel2.add(iconovendedores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 530, 110, 100));

        jTabbedPane1.addTab("Buscar", jPanel2);

        jPanel4.setBackground(new java.awt.Color(14, 176, 68));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel131.setText("Número de hijos");
        jPanel4.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 585, -1, -1));
        jPanel4.add(txtHijosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 582, 74, -1));

        buttonGroup4.add(spnAfpM);
        spnAfpM.setText("AFP");
        spnAfpM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnAfpMActionPerformed(evt);
            }
        });
        jPanel4.add(spnAfpM, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 515, -1, -1));

        jLabel84.setText("Fecha de Ingreso");
        jPanel4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 548, 123, -1));

        txtSeguroM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "RIMAC", "MAPFRE", "Pacífico", "La Positiva", "EsSalud", " " }));
        jPanel4.add(txtSeguroM, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 622, -1, -1));

        buttonGroup4.add(spnOnpM);
        spnOnpM.setText("ONP");
        spnOnpM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnOnpMActionPerformed(evt);
            }
        });
        jPanel4.add(spnOnpM, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 515, -1, -1));

        jLabel85.setText("Seguro de Salud");
        jPanel4.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 625, 91, -1));

        jLabel132.setText("Sistema Pensión");
        jPanel4.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 517, -1, -1));

        jLabel133.setText("Dirección");
        jPanel4.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, -1, -1));

        jLabel134.setText("E-mail");
        jPanel4.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 298, 41, -1));
        jPanel4.add(txtDireccionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 335, 137, -1));

        jLabel135.setText("Distrito");
        jPanel4.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 375, -1, -1));

        txtDistritoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoMActionPerformed(evt);
            }
        });
        jPanel4.add(txtDistritoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 375, 126, -1));

        txtProvinciaM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        jPanel4.add(txtProvinciaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 418, -1, -1));
        jPanel4.add(txtEmailM, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 295, 146, -1));

        jLabel136.setText("Provincia");
        jPanel4.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 421, -1, -1));

        txtPaisM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Argentina", "Bolivia", "Brasil", "Colombia", "Chile", "Ecuador", "México", "Paraguay", "Perú" }));
        jPanel4.add(txtPaisM, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 452, -1, -1));

        jLabel137.setText("País");
        jPanel4.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 455, 29, -1));

        jLabel138.setText("Sueldo");
        jPanel4.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 483, -1, -1));
        jPanel4.add(txtSueldoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 480, 126, -1));

        jLabel139.setText("DNI");
        jPanel4.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 31, -1));
        jPanel4.add(txtDniM, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 94, 126, -1));

        buttonGroup3.add(spnMasM);
        spnMasM.setText("Masculino");
        spnMasM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnMasMActionPerformed(evt);
            }
        });
        jPanel4.add(spnMasM, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 255, -1, -1));

        buttonGroup3.add(spnFemM);
        spnFemM.setText("Femenino");
        spnFemM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spnFemMActionPerformed(evt);
            }
        });
        jPanel4.add(spnFemM, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 255, -1, -1));

        jLabel140.setText("Sexo");
        jPanel4.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, -1, -1));

        jLabel95.setText("Nombre");
        jPanel4.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, -1, -1));

        jLabel96.setText("Apellidos");
        jPanel4.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 177, -1, -1));

        txtNomM.setToolTipText("");
        jPanel4.add(txtNomM, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 134, 170, -1));
        jPanel4.add(txtApeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 174, 170, -1));

        jLabel141.setText("Fecha de Nacimiento");
        jPanel4.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, 123, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Modificar");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        ModificarM.setText("MODIFICAR");
        ModificarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarMActionPerformed(evt);
            }
        });
        jPanel4.add(ModificarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 358, 112, 42));

        BuscarM.setText("BUSCAR");
        BuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMActionPerformed(evt);
            }
        });
        jPanel4.add(BuscarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 358, 90, 42));

        jLabel144.setText("Codigo");
        jPanel4.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 69, 57, -1));
        jPanel4.add(txtCodigoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 66, 112, -1));
        jPanel4.add(txtFechaNacM, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 214, 90, -1));
        jPanel4.add(txtSexoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 254, 87, -1));
        jPanel4.add(txtSistPensionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 514, 76, -1));
        jPanel4.add(txtFechaIngM, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 542, 76, -1));
        jPanel4.add(dateFechaNacM, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 214, -1, -1));
        jPanel4.add(dateFechaIngM, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 542, -1, -1));
        jPanel4.add(iconovendedores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 530, 110, 100));

        jTabbedPane1.addTab("Modificar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void spnAfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnAfpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnAfpActionPerformed

    private void spnOnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnOnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnOnpActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
        Table.getDataVector().removeAllElements();
        
        String [] filas =  new String[16];
   
     for(int i=0; i < arreglovector.filas(); i++){
          filas[0] = String.valueOf(arreglovector.get(i).getCodigo());
          filas[1] = String.valueOf(arreglovector.get(i).getDni());
          filas[2] = arreglovector.get(i).getNombres();
          filas[3] = arreglovector.get(i).getApellidos();
          filas[4] = arreglovector.get(i).getFechaNac();
          filas[5] = arreglovector.get(i).getSexo();
          filas[6] = arreglovector.get(i).getEmail();
          filas[7] = arreglovector.get(i).getDireccion();
          filas[8] = arreglovector.get(i).getDistrito();
          filas[9] = arreglovector.get(i).getProvincia();
          filas[10] = arreglovector.get(i).getPais();
          filas[11] = String.valueOf(arreglovector.get(i).getSueldo());
          filas[12] = arreglovector.get(i).getSistPension();
          filas[13] = arreglovector.get(i).getFechaIng();
          filas[14] = String.valueOf(arreglovector.get(i).getHijos());
          filas[15] = arreglovector.get(i).getSeguro(); 
          Table.addRow(filas);  
          }           
    }//GEN-LAST:event_listarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        dispose();
       Administrador inic = new Administrador();
       inic.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
   String nom=null;
   String ape=null;
   String sex,
          ema,dire,dis,pro,fec,
          pais,sistPension,seg,fec_ing;
   int dni,sue,hij,cod =0;
   
   
      cod = arreglovector.correlativo();    
       if(txtDni.getText().isEmpty() || txtNom.getText().isEmpty() || txtApe.getText().isEmpty()
               || txtEmail.getText().isEmpty() || txtDireccion.getText().isEmpty()||txtDistrito.getText().isEmpty()
                ||txtSueldo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NO dejar carmpos vacíos");
        }
        else
       {
      dni = Integer.parseInt(txtDni.getText());
      nom = txtNom.getText();
      ape = txtApe.getText();
      ema = txtEmail.getText();
      dire = txtDireccion.getText();
      dis = txtDistrito.getText();
      pro = txtProvincia.getSelectedItem().toString();
      pais = txtPais.getSelectedItem().toString();
      sue = Integer.parseInt(txtSueldo.getText());
      hij = Integer.parseInt(txtHijos.getValue().toString());
      seg = txtSeguro.getSelectedItem().toString(); 
      
       SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
        fec = ff.format(dateFechaNac.getDate()); 
    
      
      if(spnMas.isSelected()){
          sex = "Masculino";
      }
      else{
          sex = "Femenino";
      }
      
      if(spnAfp.isSelected()){
          sistPension = "AFP";
      }
      else{
          sistPension = "ONP";
      }   
      
      SimpleDateFormat f_ing = new SimpleDateFormat("dd-MM-yyyy");
        fec_ing = f_ing.format(dateFechaIng.getDate()); 
      
    
      Vendedor w=new Vendedor();
      w.setCodigo(cod);
      w.setDni(dni);
      w.setNombres(nom);
      w.setApellidos(ape);    
      w.setFechaNac(fec);
      w.setSexo(sex);
      w.setEmail(ema);
      w.setDireccion(dire);
      w.setDistrito(dis);
      w.setProvincia(pro);
      w.setPais(pais);
      w.setSueldo(sue);     
      w.setSistPension(sistPension);
      w.setHijos(hij);
      w.setSeguro(seg);
      w.setFechaIng(fec);
      

      arreglovector.agregar_array(w);
      arreglovector.grabarEnArchivo(w);
       }
       txtDni.setText("");
       txtNom.setText("");
       txtApe.setText("");
       txtEmail.setText("");
       txtDireccion.setText("");
       txtDistrito.setText("");
       txtSueldo.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void BuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBActionPerformed
        // TODO add your handling code here:
         int cod=0;
        cod=Integer.parseInt(txtCodigoB.getText());
        Vendedor w=arreglovector.buscarcodigo(cod);
        
        if(w.getNombres()!="Error"){

            txtDniB.setText(String.valueOf(w.getDni()));
            txtNomB.setText(w.getNombres());
            txtApeB.setText(w.getApellidos());
            txtSexoB.setText(w.getSexo());
            txtFechaNacB.setText(w.getFechaNac());          
            txtEmailB.setText(w.getEmail());
            txtDireccionB.setText(w.getDireccion());
            txtDistritoB.setText(w.getDistrito());           
            txtProvinciaB.setText(w.getProvincia());
            txtPaisB.setText(w.getPais());
            txtSistPensionB.setText(w.getSistPension());
            txtFechaIngB.setText(w.getFechaIng());  
            txtSueldoB.setText(String.valueOf(w.getSueldo()));
            txtHijosB.setText(String.valueOf(w.getHijos()));
            txtSeguroB.setText(w.getSeguro());           
        }else{
            JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_BuscarBActionPerformed

    private void BuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEActionPerformed
        // TODO add your handling code here:
         int cod=0;
        cod=Integer.parseInt(txtCodigoE.getText());
         Weliminar=arreglovector.buscarcodigo(cod);
        
        if(Weliminar.getNombres()!="Error"){            
            txtDniE.setText(String.valueOf(Weliminar.getDni()));
            txtNomE.setText(Weliminar.getNombres());
            txtApeE.setText(Weliminar.getApellidos());
            txtSexoE.setText(Weliminar.getSexo());
            txtFechaNacE.setText(Weliminar.getFechaNac());          
            txtEmailE.setText(Weliminar.getEmail());
            txtDireccionE.setText(Weliminar.getDireccion());
            txtDistritoE.setText(Weliminar.getDistrito());           
            txtProvinciaE.setText(Weliminar.getProvincia());
            txtPaisE.setText(Weliminar.getPais());
            txtSistPensionE.setText(Weliminar.getSistPension());                  
            txtFechaIngE.setText(Weliminar.getFechaIng());       
            txtSueldoE.setText(String.valueOf(Weliminar.getSueldo()));
            txtHijosE.setText(String.valueOf(Weliminar.getHijos()));
            txtSeguroE.setText(Weliminar.getSeguro());    
            
        }else{
            JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BuscarEActionPerformed

    private void EliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEActionPerformed
        // TODO add your handling code here:
         if(Weliminar.getNombres()!="Error"){
            
            
            arreglovector.eliminar(Weliminar);
            arreglovector.grabarModificareliminar();
            JOptionPane.showMessageDialog(null,"Registro Eliminado");
        }else{
              JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EliminarEActionPerformed

    private void spnAfpMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnAfpMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnAfpMActionPerformed

    private void spnOnpMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnOnpMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnOnpMActionPerformed

    private void spnMasMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnMasMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnMasMActionPerformed

    private void spnFemMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spnFemMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spnFemMActionPerformed

    private void ModificarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarMActionPerformed
        // TODO add your handling code here:
        int cod;              
        int dnii;
        String nom;
        String ape;        
        String sex;
        String ema;
        String dir;
        String dis;
        String prov;
        String pa;
        int sue;
        String pen;
        int hi;
        String seg ;       
        
        dnii = Integer.parseInt(txtDniM.getText());
        nom = txtNomM.getText();
        ape= txtApeM.getText(); 
        ema=txtEmailM.getText();
        dir=txtDireccionM.getText();
        dis=txtDistritoM.getText();
        prov=txtProvinciaM.getSelectedItem().toString();
        pa=txtPaisM.getSelectedItem().toString();
        sue = Integer.parseInt(txtSueldoM.getText());
        hi = Integer.parseInt(txtHijosM.getValue().toString());
        cod = Integer.parseInt(txtCodigoM.getText());
        seg = txtSeguroM.getSelectedItem().toString(); 
        
        SimpleDateFormat ff = new SimpleDateFormat("dd-MM-yyyy");
        String dat1 = ff.format(dateFechaNacM.getDate());
        String dat2 = ff.format(dateFechaIngM.getDate());
        
        if(spnMas.isSelected()){
            sex="Masculino";
            txtSexoM.setText(sex);
        
        }else{
            sex="Femenino";
            txtSexoM.setText(sex);
        
        if(spnAfp.isSelected()){
          pen = "AFP";
          txtSistPensionM.setText(pen);
      }
      else{
          pen = "ONP";
          txtSistPensionM.setText(pen);

      }  
       
        boolean estado=arreglovector.modificar(Wmodificar,dnii, nom, ape,dat1,sex,ema,
                                    dir, dis, prov, pa, sue, pen,dat2,hi,seg);   
        
        if(estado==true){
            JOptionPane.showMessageDialog(null,"Registro Modificado");
            arreglovector.grabarModificareliminar();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No se pudo Modificar","Error",JOptionPane.WARNING_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_ModificarMActionPerformed

    private void BuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMActionPerformed
        // TODO add your handling code here:
         int cod=0;
        cod=Integer.parseInt(txtCodigoM.getText());
         Wmodificar=arreglovector.buscarcodigo(cod);
        
        if(Wmodificar.getNombres()!="Error"){
            txtNomE.setText(Wmodificar.getNombres());
          
            txtDniM.setText(String.valueOf(Wmodificar.getDni()));
            txtNomM.setText(Wmodificar.getNombres());
            txtApeM.setText(Wmodificar.getApellidos());
            txtSexoM.setText(Wmodificar.getSexo());
            txtFechaNacM.setText(Wmodificar.getFechaNac());          
            txtEmailM.setText(Wmodificar.getEmail());
            txtDireccionM.setText(Wmodificar.getDireccion());
            txtDistritoM.setText(Wmodificar.getDistrito());           
            txtProvinciaM.setSelectedItem(Wmodificar.getProvincia());
            txtPaisM.setSelectedItem(Wmodificar.getPais());
            txtSueldoM.setText(String.valueOf(Wmodificar.getSueldo()));           
            txtSistPensionM.setText(Wmodificar.getSistPension());
            txtFechaIngM.setText(Wmodificar.getFechaIng());           
            txtHijosM.setValue(Wmodificar.getHijos());
            txtSeguroM.setSelectedItem(Wmodificar.getSeguro());    
            
        }else{
            JOptionPane.showMessageDialog(null,"No existe código","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BuscarMActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDistritoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoMActionPerformed

    private void txtSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeguroActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Vendedor().setVisible(true);
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarB;
    private javax.swing.JButton BuscarE;
    private javax.swing.JButton BuscarM;
    private javax.swing.JButton EliminarE;
    private javax.swing.JButton ModificarM;
    private javax.swing.JTable Table1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton cancelar;
    private com.toedter.calendar.JDateChooser dateFechaIng;
    private com.toedter.calendar.JDateChooser dateFechaIngM;
    private com.toedter.calendar.JDateChooser dateFechaNac;
    private com.toedter.calendar.JDateChooser dateFechaNacM;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel iconovendedores;
    private javax.swing.JLabel iconovendedores1;
    private javax.swing.JLabel iconovendedores2;
    private javax.swing.JLabel iconovendedores3;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton listar;
    private javax.swing.JRadioButton spnAfp;
    private javax.swing.JRadioButton spnAfpM;
    private javax.swing.JRadioButton spnFem;
    private javax.swing.JRadioButton spnFemM;
    private javax.swing.JRadioButton spnMas;
    private javax.swing.JRadioButton spnMasM;
    private javax.swing.JRadioButton spnOnp;
    private javax.swing.JRadioButton spnOnpM;
    private javax.swing.JTextField txtApe;
    private javax.swing.JLabel txtApeB;
    private javax.swing.JLabel txtApeE;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtCodigoB;
    private javax.swing.JTextField txtCodigoE;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtDireccionB;
    private javax.swing.JLabel txtDireccionE;
    private javax.swing.JTextField txtDireccionM;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JLabel txtDistritoB;
    private javax.swing.JLabel txtDistritoE;
    private javax.swing.JTextField txtDistritoM;
    private javax.swing.JTextField txtDni;
    private javax.swing.JLabel txtDniB;
    private javax.swing.JLabel txtDniE;
    private javax.swing.JTextField txtDniM;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmailB;
    private javax.swing.JLabel txtEmailE;
    private javax.swing.JTextField txtEmailM;
    private javax.swing.JLabel txtFechaIngB;
    private javax.swing.JLabel txtFechaIngE;
    private javax.swing.JTextField txtFechaIngM;
    private javax.swing.JLabel txtFechaNacB;
    private javax.swing.JLabel txtFechaNacE;
    private javax.swing.JTextField txtFechaNacM;
    private javax.swing.JSpinner txtHijos;
    private javax.swing.JLabel txtHijosB;
    private javax.swing.JLabel txtHijosE;
    private javax.swing.JSpinner txtHijosM;
    private javax.swing.JTextField txtNom;
    private javax.swing.JLabel txtNomB;
    private javax.swing.JLabel txtNomE;
    private javax.swing.JTextField txtNomM;
    private javax.swing.JComboBox<String> txtPais;
    private javax.swing.JLabel txtPaisB;
    private javax.swing.JLabel txtPaisE;
    private javax.swing.JComboBox<String> txtPaisM;
    private javax.swing.JComboBox<String> txtProvincia;
    private javax.swing.JLabel txtProvinciaB;
    private javax.swing.JLabel txtProvinciaE;
    private javax.swing.JComboBox<String> txtProvinciaM;
    private javax.swing.JComboBox<String> txtSeguro;
    private javax.swing.JLabel txtSeguroB;
    private javax.swing.JLabel txtSeguroE;
    private javax.swing.JComboBox<String> txtSeguroM;
    private javax.swing.JLabel txtSexoB;
    private javax.swing.JLabel txtSexoE;
    private javax.swing.JTextField txtSexoM;
    private javax.swing.JLabel txtSistPensionB;
    private javax.swing.JLabel txtSistPensionE;
    private javax.swing.JTextField txtSistPensionM;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JLabel txtSueldoB;
    private javax.swing.JLabel txtSueldoE;
    private javax.swing.JTextField txtSueldoM;
    // End of variables declaration//GEN-END:variables
}
