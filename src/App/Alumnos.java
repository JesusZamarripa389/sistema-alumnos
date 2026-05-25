/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zamarripa
 */
public class Alumnos extends javax.swing.JFrame {

    public Alumnos() {
        initComponents();
        jTextID.setVisible(false);
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanelMain1 = new javax.swing.JPanel();
        jButGuardar = new javax.swing.JPanel();
        jLabGuardar = new javax.swing.JLabel();
        IconGuardar = new javax.swing.JLabel();
        jButActualizar = new javax.swing.JPanel();
        jLabModficar = new javax.swing.JLabel();
        IconModificar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jPanelDatos = new javax.swing.JPanel();
        jLabelMatricula = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextMatricula = new javax.swing.JTextField();
        jLabNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabEdad = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabSexo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jRadioButMasculino = new javax.swing.JRadioButton();
        jRadioButFemenino = new javax.swing.JRadioButton();
        jTextEmail = new javax.swing.JTextField();
        jLabelMatricula1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextID = new javax.swing.JTextField();
        jButBorrar = new javax.swing.JPanel();
        jLabBorrar = new javax.swing.JLabel();
        IconBorrar = new javax.swing.JLabel();
        jButLimpiar = new javax.swing.JPanel();
        jLabLiimpiar = new javax.swing.JLabel();
        IconLimpiar = new javax.swing.JLabel();
        jLabAlumnos = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jCheckDesencriptar = new javax.swing.JCheckBox();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");
        setName("Alumnos"); // NOI18N
        setResizable(false);

        jPanelMain1.setBackground(new java.awt.Color(47, 48, 51));
        jPanelMain1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButGuardarMousePressed(evt);
            }
        });

        jLabGuardar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabGuardar.setText("Guardar");

        IconGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/resources/guardar.png"))); // NOI18N

        javax.swing.GroupLayout jButGuardarLayout = new javax.swing.GroupLayout(jButGuardar);
        jButGuardar.setLayout(jButGuardarLayout);
        jButGuardarLayout.setHorizontalGroup(
            jButGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(IconGuardar)
                .addContainerGap())
        );
        jButGuardarLayout.setVerticalGroup(
            jButGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButGuardarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jButGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabGuardar)
                    .addComponent(IconGuardar)))
        );

        jPanelMain1.add(jButGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 30));

        jButActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButActualizarMousePressed(evt);
            }
        });

        jLabModficar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabModficar.setText("Actualizar");

        IconModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/resources/modificar.png"))); // NOI18N

        javax.swing.GroupLayout jButActualizarLayout = new javax.swing.GroupLayout(jButActualizar);
        jButActualizar.setLayout(jButActualizarLayout);
        jButActualizarLayout.setHorizontalGroup(
            jButActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabModficar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IconModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jButActualizarLayout.setVerticalGroup(
            jButActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButActualizarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jButActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabModficar)
                    .addComponent(IconModificar)))
        );

        jPanelMain1.add(jButActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 100, 30));

        jTableAlumnos.setBackground(new java.awt.Color(250, 250, 250));
        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matricula", "Nombre", "Sexo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlumnos);
        if (jTableAlumnos.getColumnModel().getColumnCount() > 0) {
            jTableAlumnos.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableAlumnos.getColumnModel().getColumn(1).setMaxWidth(70);
            jTableAlumnos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanelMain1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 640, 310));

        jPanelDatos.setBackground(new java.awt.Color(254, 249, 224));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 14))); // NOI18N

        jLabelMatricula.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelMatricula.setText("Matricula:");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jTextMatricula.setBackground(new java.awt.Color(254, 249, 224));
        jTextMatricula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextMatricula.setBorder(null);

        jLabNombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabNombre.setText("Nombre:");

        jTextNombre.setBackground(new java.awt.Color(254, 249, 224));
        jTextNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextNombre.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jLabEdad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabEdad.setText("Edad:");

        jTextEdad.setBackground(new java.awt.Color(254, 249, 224));
        jTextEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextEdad.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        jLabSexo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabSexo.setText("Sexo:");

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        jRadioButMasculino.setBackground(new java.awt.Color(254, 249, 224));
        buttonGroupSexo.add(jRadioButMasculino);
        jRadioButMasculino.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButMasculino.setText("Masculino");

        jRadioButFemenino.setBackground(new java.awt.Color(254, 249, 224));
        buttonGroupSexo.add(jRadioButFemenino);
        jRadioButFemenino.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButFemenino.setText("Femenino");

        jTextEmail.setBackground(new java.awt.Color(254, 249, 224));
        jTextEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextEmail.setBorder(null);

        jLabelMatricula1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabelMatricula1.setText("Email:");

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

        jTextID.setBackground(new java.awt.Color(254, 249, 224));
        jTextID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextID.setBorder(null);

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButFemenino))
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                                            .addComponent(jLabEdad)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                                            .addComponent(jLabelMatricula)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                                            .addComponent(jLabNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelMatricula1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jTextID)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabEdad)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabSexo)
                    .addComponent(jRadioButMasculino)
                    .addComponent(jRadioButFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula1)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanelMain1.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 340, 290));

        jButBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButBorrarMousePressed(evt);
            }
        });

        jLabBorrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabBorrar.setText("Borrar");

        IconBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/resources/borrar.png"))); // NOI18N

        javax.swing.GroupLayout jButBorrarLayout = new javax.swing.GroupLayout(jButBorrar);
        jButBorrar.setLayout(jButBorrarLayout);
        jButBorrarLayout.setHorizontalGroup(
            jButBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IconBorrar)
                .addContainerGap())
        );
        jButBorrarLayout.setVerticalGroup(
            jButBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButBorrarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jButBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabBorrar)
                    .addComponent(IconBorrar)))
        );

        jPanelMain1.add(jButBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 100, 30));

        jButLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButLimpiarMousePressed(evt);
            }
        });

        jLabLiimpiar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabLiimpiar.setText("Limpiar");

        IconLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/resources/limpiar.png"))); // NOI18N

        javax.swing.GroupLayout jButLimpiarLayout = new javax.swing.GroupLayout(jButLimpiar);
        jButLimpiar.setLayout(jButLimpiarLayout);
        jButLimpiarLayout.setHorizontalGroup(
            jButLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabLiimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(IconLimpiar)
                .addContainerGap())
        );
        jButLimpiarLayout.setVerticalGroup(
            jButLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabLiimpiar)
                .addGap(7, 7, 7))
            .addGroup(jButLimpiarLayout.createSequentialGroup()
                .addComponent(IconLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain1.add(jButLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 100, 30));

        jLabAlumnos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jLabAlumnos.setText("ALUMNOS");
        jPanelMain1.add(jLabAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, 20));
        jPanelMain1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 260, 10));
        jPanelMain1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 10));

        jPanel1.setBackground(new java.awt.Color(34, 112, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanelMain1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 360, 430));

        jCheckDesencriptar.setBackground(new java.awt.Color(47, 48, 51));
        jCheckDesencriptar.setForeground(new java.awt.Color(255, 255, 255));
        jCheckDesencriptar.setText("Desencriptar Información");
        jCheckDesencriptar.setBorder(null);
        jCheckDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDesencriptarActionPerformed(evt);
            }
        });
        jPanelMain1.add(jCheckDesencriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMain1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 157, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarTabla() {
 // Crear el modelo de la tabla a partir de la tabla de alumnos (jTableAlumnos)
    DefaultTableModel tabla = (DefaultTableModel) jTableAlumnos.getModel();
    // Establecer el número de filas en cero (para limpiar la tabla antes de cargar nuevos datos)
    tabla.setRowCount(0);

    // Declarar variables para manejar consultas a la base de datos
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;

    Connection con = null;
    try {
        // Obtener la conexión a la base de datos
        con = Conexion.getConexion();

        // Desactivar autocommit para gestionar la transacción
        con.setAutoCommit(false);

        // Establecer el nivel de aislamiento de la transacción (por ejemplo, SERIALIZABLE)
        con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

        // Preparar la consulta SQL para seleccionar registros activos de la tabla 'alumnos'
        ps = con.prepareStatement("SELECT id, matricula, nombre, sexo, email FROM alumnos WHERE activo=1");

        // Ejecutar la consulta SQL
        rs = ps.executeQuery();
        // Obtener los metadatos del resultado de la consulta (como el número de columnas)
        rsmd = rs.getMetaData();
        // Obtener el número de columnas de los resultados
        columnas = rsmd.getColumnCount();

        // Iterar sobre los resultados de la consulta
        while (rs.next()) {
            // Crear un arreglo para almacenar cada fila de resultados
            Object[] fila = new Object[columnas];
            // Iterar sobre cada columna de la fila
            for (int indice = 0; indice < columnas; indice++) {
                // Obtener el valor de cada columna y almacenarlo en el arreglo
                fila[indice] = rs.getObject(indice + 1);
            }
            // Añadir la fila a la tabla
            tabla.addRow(fila);
        }

        // Confirmar la transacción
        con.commit();
    } catch (SQLException e) {
        // En caso de error, hacer rollback de la transacción
        if (con != null) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al realizar rollback: " + ex.toString());
            }
        }
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        // Asegurarse de que la conexión se cierre correctamente
        try {
            if (con != null) {
                con.setAutoCommit(true);  // Restablecer autocommit
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
        }
    }
}


    private boolean validarCampos() {
        // Verificar si algún campo de texto está vacío
        if (jTextMatricula.getText().isEmpty() || jTextNombre.getText().isEmpty() || jTextEdad.getText().isEmpty() || jTextEmail.getText().isEmpty()) {
            // Mostrar mensaje de error si falta algún campo
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
            return false;
        }
        try {
            // Intentar convertir el valor de edad a un número entero
            Integer.parseInt(jTextEdad.getText());
        } catch (NumberFormatException e) {
            // Mostrar mensaje de error si la edad no es un número válido
            JOptionPane.showMessageDialog(null, "La edad debe ser un número válido.");
            return false;
        }
        // Si todas las validaciones pasan, retornar true
        return true;
    }

    private String obtenerSexo() {
        // Verificar si el botón de radio masculino está seleccionado
        if (jRadioButMasculino.isSelected()) {
            return "M"; // Retornar "M" si está seleccionado
        } else if (jRadioButFemenino.isSelected()) {
            return "F"; // Retornar "F" si el botón femenino está seleccionado
        } else {
            // Mostrar mensaje de error y retornar "M" como valor por defecto
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado un sexo. Sexo por defecto: 'M'.");
            return "M";
        }
    }
    private void jButGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButGuardarMousePressed
      // Si la validación de campos falla, se detiene la ejecución
    if (!validarCampos()) {
        return;
    }

    // Obtener valores de los campos de texto
    String matricula = jTextMatricula.getText();
    String nombre = jTextNombre.getText();
    int edad = Integer.parseInt(jTextEdad.getText());
    String email = jTextEmail.getText();
    String sexo = obtenerSexo();

    Connection con = null;
    try {
        // Establecer la conexión a la base de datos
        con = Conexion.getConexion();

        // Desactivar autocommit para gestionar la transacción
        con.setAutoCommit(false);

        // Establecer el nivel de aislamiento de la transacción
        con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        // Preparar la consulta SQL para insertar un nuevo registro en la tabla 'alumnos'
        PreparedStatement ps = con.prepareStatement("INSERT INTO alumnos (matricula, nombre, edad, sexo, email, activo) VALUES (?,?,?,?,?,?)");
        // Asignar los valores a la consulta SQL
        ps.setString(1, matricula);
        ps.setString(2, nombre);
        ps.setInt(3, edad);
        ps.setString(4, sexo);
        ps.setString(5, email);
        ps.setInt(6, 1); // El campo 'activo' se establece en 1
        // Ejecutar la actualización (insertar el nuevo registro)
        ps.executeUpdate();

        // Confirmar la transacción
        con.commit();

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Registro Guardado!");

        // Limpiar los campos y recargar la tabla
        limpiar();
        cargarTabla();
    } catch (SQLException e) {
        // En caso de error, hacer rollback de la transacción
        if (con != null) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al realizar rollback: " + ex.toString());
            }
        }
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        // Asegurarse de que la conexión se cierre correctamente
        try {
            if (con != null) {
                con.setAutoCommit(true);  // Restablecer autocommit
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
        }
    }
    }//GEN-LAST:event_jButGuardarMousePressed

    private void jButActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButActualizarMousePressed
    // Si la validación de campos falla, se detiene la ejecución
    if (!validarCampos()) {
        return;
    }

    int id = Integer.parseInt(jTextID.getText());
    String matricula = jTextMatricula.getText();
    String nombre = jTextNombre.getText();
    int edad = Integer.parseInt(jTextEdad.getText());
    String email = jTextEmail.getText();
    String sexo = obtenerSexo();

    Connection con = null;
    PreparedStatement ps = null;

    try {
        // Obtener la conexión a la base de datos
        con = Conexion.getConexion();
        con.setAutoCommit(false); // Desactivar auto-commit
        
        // Establecer el nivel de aislamiento
        con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        // Preparar la consulta SQL para actualizar el registro
        ps = con.prepareStatement("UPDATE alumnos SET matricula = ?, nombre = ?, edad = ?, sexo = ?, email = ? WHERE id = ?");
        ps.setString(1, matricula);
        ps.setString(2, nombre);
        ps.setInt(3, edad);
        ps.setString(4, sexo);
        ps.setString(5, email);
        ps.setInt(0, id);

        // Ejecutar la actualización
        ps.executeUpdate();

        // Confirmar la transacción (commit)
        con.commit();
        JOptionPane.showMessageDialog(null, "Registro Actualizado!");

        // Limpiar los campos y recargar la tabla
        limpiar();
        cargarTabla();

    } catch (SQLException e) {
        try {
            if (con != null) {
                con.rollback(); // Rollback si hay un error
            }
        } catch (SQLException rollbackException) {
            JOptionPane.showMessageDialog(null, "Error al deshacer la transacción: " + rollbackException.toString());
        }
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (con != null) {
                con.setAutoCommit(true); // Restaurar el autocommit
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.toString());
        }
    }
    }//GEN-LAST:event_jButActualizarMousePressed

    private void jButLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButLimpiarMousePressed
        limpiar();

    }//GEN-LAST:event_jButLimpiarMousePressed
    private void jTableAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlumnosMouseClicked

        try {
            // Obtener la fila seleccionada en la tabla
            int fila = jTableAlumnos.getSelectedRow();
            // Obtener el ID del alumno de la primera columna de la fila seleccionada
            int id = Integer.parseInt(jTableAlumnos.getValueAt(fila, 0).toString());
            // Declarar variables para la consulta SQL
            PreparedStatement ps;
            ResultSet rs;
            // Establecer la conexión a la base de datos
            Connection con = Conexion.getConexion();
            // Preparar la consulta SQL para obtener los datos del alumno por ID
            ps = con.prepareStatement("SELECT nombre, edad, sexo FROM alumnos WHERE id=?");
            ps.setInt(1, id);
            // Ejecutar la consulta SQL
            rs = ps.executeQuery();

            // Llenar los campos de texto con los valores obtenidos de la base de datos
            while (rs.next()) {
                jTextID.setText(String.valueOf(id));

                jTextNombre.setText(rs.getString("nombre"));
                jTextEdad.setText(rs.getString("edad"));

                // Seleccionar el botón de radio correspondiente al sexo
                if (rs.getString("sexo").equals("M")) {
                    jRadioButMasculino.setSelected(true);
                } else if (rs.getString("sexo").equals("F")) {
                    jRadioButFemenino.setSelected(true);
                }
            }
        } catch (SQLException e) {
            // Mostrar mensaje de error si ocurre una excepción de SQL
            JOptionPane.showMessageDialog(null, e.toString());

        } catch (Exception e) {
            // Mostrar mensaje de error si ocurre una excepción
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
        }
        try {

            // Obtener la fila seleccionada en la tabla
            int fila = jTableAlumnos.getSelectedRow();

            // Verificar que la fila no esté vacía
            if (fila != -1) {
                // Obtener los valores directamente de la tabla
                String matricula = jTableAlumnos.getValueAt(fila, 1).toString();
                String email = jTableAlumnos.getValueAt(fila, 4).toString();
                jTextMatricula.setText(matricula);
                jTextEmail.setText(email);

            }
        } catch (Exception e) {
            // Mostrar mensaje de error si ocurre una excepción
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
        }


    }//GEN-LAST:event_jTableAlumnosMouseClicked

    private void jButBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButBorrarMousePressed
        // Verificar si el campo ID está vacío
        if (jTextID.getText().trim().isEmpty()) {
            // Mostrar un mensaje de error si el campo está vacío
            JOptionPane.showMessageDialog(null, "No has seleccionado algún alumno", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución si el campo está vacío
        }

        // Obtener el ID del registro que se desea eliminar
        int id = Integer.parseInt(jTextID.getText());

        try {
            // Establecer la conexión a la base de datos
            Connection con = Conexion.getConexion();
            // Preparar la consulta SQL para marcar el registro como inactivo
            PreparedStatement ps = con.prepareStatement("UPDATE alumnos SET activo=0 WHERE id=?");
            ps.setInt(1, id);
            // Ejecutar la actualización
            ps.executeUpdate();
            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Registro ELIMINADO!");

            // Limpiar los campos y recargar la tabla
            limpiar();
            cargarTabla();
        } catch (SQLException e) {
            // Mostrar mensaje de error si ocurre una excepción de SQL
            JOptionPane.showMessageDialog(null, e.toString(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButBorrarMousePressed

    private void jCheckDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDesencriptarActionPerformed
        // Verificar si el JCheckBox está seleccionado
        if (jCheckDesencriptar.isSelected()) {
            // Si está seleccionado, desencriptar la información
            cargarTablaDesencriptada();
            limpiar();

        } else {
            // Si no está seleccionado, mostrar los datos encriptados
            cargarTabla();
            limpiar();

        }

    }//GEN-LAST:event_jCheckDesencriptarActionPerformed

    private void cargarTablaDesencriptada() {
        // Crear el modelo de la tabla a partir de la tabla de alumnos (jTableAlumnos)
        DefaultTableModel tabla = (DefaultTableModel) jTableAlumnos.getModel();
        // Establecer el número de filas en cero (para limpiar la tabla antes de cargar nuevos datos)
        tabla.setRowCount(0);

        // Declarar variables para manejar consultas a la base de datos
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            // Obtener la conexión a la base de datos
            Connection con = Conexion.getConexion();
            // Preparar la consulta SQL para obtener los registros desencriptados
            String sql = "OPEN SYMMETRIC KEY AES_Key DECRYPTION BY CERTIFICATE CertificadoAES; "
                    + "SELECT ID, "
                    + "CONVERT(VARCHAR(8), DECRYPTBYKEY(Matricula)) AS Matricula, "
                    + "Nombre, Sexo, "
                    + "CONVERT(VARCHAR(30), DECRYPTBYKEY(Email)) AS Email "
                    + "FROM Alumnos WHERE activo=1";

            ps = con.prepareStatement(sql);

            // Ejecutar la consulta SQL
            rs = ps.executeQuery();
            // Obtener los metadatos del resultado de la consulta (como el número de columnas)
            rsmd = rs.getMetaData();
            // Obtener el número de columnas de los resultados
            columnas = rsmd.getColumnCount();

            // Iterar sobre los resultados de la consulta
            while (rs.next()) {
                // Crear un arreglo para almacenar cada fila de resultados
                Object[] fila = new Object[columnas];
                // Iterar sobre cada columna de la fila
                for (int indice = 0; indice < columnas; indice++) {
                    // Obtener el valor de cada columna y almacenarlo en el arreglo
                    fila[indice] = rs.getObject(indice + 1);
                }
                // Añadir la fila a la tabla
                tabla.addRow(fila);
            }
        } catch (SQLException e) {
            // Mostrar un mensaje de error si ocurre una excepción de SQL
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void jTableAlumnosDesencriptadosMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            // Obtener la fila seleccionada en la tabla
            int fila = jTableAlumnos.getSelectedRow();
            // Obtener el ID del alumno de la primera columna de la fila seleccionada
            int id = Integer.parseInt(jTableAlumnos.getValueAt(fila, 0).toString());
            // Declarar variables para la consulta SQL
            PreparedStatement ps;
            ResultSet rs;
            // Establecer la conexión a la base de datos
            Connection con = Conexion.getConexion();
            // Preparar la consulta SQL para obtener los datos del alumno por ID
            ps = con.prepareStatement("SELECT matricula, nombre, edad, sexo, email FROM alumnos WHERE id=?");
            ps.setInt(1, id);
            // Ejecutar la consulta SQL
            rs = ps.executeQuery();

            // Llenar los campos de texto con los valores obtenidos de la base de datos
            while (rs.next()) {
                jTextID.setText(String.valueOf(id));
                jTextMatricula.setText(rs.getString("matricula"));
                jTextNombre.setText(rs.getString("nombre"));
                jTextEdad.setText(rs.getString("edad"));
                jTextEmail.setText(rs.getString("email"));

                // Seleccionar el botón de radio correspondiente al sexo
                if (rs.getString("sexo").equals("M")) {
                    jRadioButMasculino.setSelected(true);
                } else if (rs.getString("sexo").equals("F")) {
                    jRadioButFemenino.setSelected(true);
                }
            }
        } catch (SQLException e) {
            // Mostrar mensaje de error si ocurre una excepción de SQL
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }

    private void limpiar() {
        jTextMatricula.setText("");
        jTextNombre.setText("");
        jTextEdad.setText("");
        buttonGroupSexo.clearSelection();
        jTextEmail.setText("");
        jTextID.setText("");
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconBorrar;
    private javax.swing.JLabel IconGuardar;
    private javax.swing.JLabel IconLimpiar;
    private javax.swing.JLabel IconModificar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JPanel jButActualizar;
    private javax.swing.JPanel jButBorrar;
    private javax.swing.JPanel jButGuardar;
    private javax.swing.JPanel jButLimpiar;
    private javax.swing.JCheckBox jCheckDesencriptar;
    private javax.swing.JLabel jLabAlumnos;
    private javax.swing.JLabel jLabBorrar;
    private javax.swing.JLabel jLabEdad;
    private javax.swing.JLabel jLabGuardar;
    private javax.swing.JLabel jLabLiimpiar;
    private javax.swing.JLabel jLabModficar;
    private javax.swing.JLabel jLabNombre;
    private javax.swing.JLabel jLabSexo;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelMatricula1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelMain1;
    private javax.swing.JRadioButton jRadioButFemenino;
    private javax.swing.JRadioButton jRadioButMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
