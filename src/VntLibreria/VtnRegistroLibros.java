/*
*PAQUETE EN EL QUE SE UBICAN LAS CLASES Y LAS VENTANAS
*IMPORTACION DE LIBRERIAS
 */
package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import recursos.CtrlInterfaz;
import recursos.Mensaje;
import recursos.Validaciones;

/**
 *
 * @author EDUARDO JIMENEZ APODACA, KEVIN IVAN SANCHEZ VALDIN
 */
public class VtnRegistroLibros extends javax.swing.JFrame
{

    //VARIABLE ENTERA PARA CONOCER LA POSISION EN X DE LA VENTANA
    int X_V;
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN Y DE LA VENTANA
    int Y_V;
    //OBJETO DE TIPO JFileChoser PARA EXTRAER UN FICHERO
    JFileChooser fc;
    //VARIABLE TIPO FILE PARA GUARDAR EL FICHERO GENERADO POR EL JFileChooser
    File fichero;
    //VARIABLE TIPO FileInputStream PARA LEER UN ARCHIVO EN BINARIO
    FileInputStream fis;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    /**
     * CREACION DEL CONSTRUCTOR POR DEFECTO DE VtnRegistroLibros
     */
    public VtnRegistroLibros(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
        

          Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);

        modeloC = new DefaultComboBoxModel();
        modeloC.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial ");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloC.addElement(rs.getString("nombre_editorial"));
            }
            txtEditorial.setModel(modeloC);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
        modeloCategoria = new DefaultComboBoxModel();
        modeloCategoria.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_categoria");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloCategoria.addElement(rs.getString("nombre_categoria"));
            }
            cbxCategoria.setModel(modeloCategoria);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
        modeloClasificacion = new DefaultComboBoxModel();
        modeloClasificacion.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_clasificacion");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloClasificacion.addElement(rs.getString("nombre_clasificacion"));
            }
            cbxClasificacíon.setModel(modeloClasificacion);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
    }

    DefaultComboBoxModel modeloC;
    DefaultComboBoxModel modeloCategoria;
    DefaultComboBoxModel modeloClasificacion;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panelImg = new javax.swing.JPanel();
        selectedPhoto1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_descripcion = new javax.swing.JTextArea();
        txtISBN = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNombre_libro = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        txtNombre8 = new javax.swing.JTextField();
        cbxClasificacíon = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        txtEditorial = new javax.swing.JComboBox<>();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        photoSelection1 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("REGISTRO DE LIBRO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 430, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 100, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Autor:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        selectedPhoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png"))); // NOI18N
        selectedPhoto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        selectedPhoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectedPhoto1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectedPhoto1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jPanel1.add(panelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 250));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Editorial:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Descripción:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Nombre:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Portada");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Edición:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Cantidad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre1.setText("Elege la portada");
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        txtNombre1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre1ActionPerformed(evt);
            }
        });
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 30));

        txt_autor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_autorActionPerformed(evt);
            }
        });
        txt_autor.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_autorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txt_autorKeyTyped(evt);
            }
        });
        jPanel1.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 180, -1));

        txtEdicion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEdicionActionPerformed(evt);
            }
        });
        txtEdicion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtEdicionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtEdicionKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, 20));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("ISBN:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Precio c/u:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 100, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("Clasificación:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        txtA_descripcion.setColumns(20);
        txtA_descripcion.setRows(5);
        jScrollPane1.setViewportView(txtA_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 530, 160));

        txtISBN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtISBNActionPerformed(evt);
            }
        });
        txtISBN.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtISBNKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtISBNKeyTyped(evt);
            }
        });
        jPanel1.add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 200, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Categoria:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        txtNombre_libro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre_libroActionPerformed(evt);
            }
        });
        txtNombre_libro.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre_libroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre_libroKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 190, -1));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 140, -1));

        txtNombre8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre8.setText("Elege la portada");
        txtNombre8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre8ActionPerformed(evt);
            }
        });
        txtNombre8.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre8KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 30));

        cbxClasificacíon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(cbxClasificacíon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 170, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 500, 1));
        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jSpinner1KeyPressed(evt);
            }
        });
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 70, -1));

        txtEditorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 170, -1));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        rSButton1.setText("Limpiar y Actualizar");
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton2.setText("Registrar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton3.setText("Regresar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

        photoSelection1.setBackground(new java.awt.Color(0, 51, 102));
        photoSelection1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png"))); // NOI18N
        photoSelection1.setColorHover(new java.awt.Color(0, 102, 204));
        photoSelection1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                photoSelection1ActionPerformed(evt);
            }
        });
        jPanel1.add(photoSelection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtPrecioActionPerformed
    {//GEN-HEADEREND:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPrecioKeyPressed
    {//GEN-HEADEREND:event_txtPrecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPrecioKeyTyped
    {//GEN-HEADEREND:event_txtPrecioKeyTyped
        Validaciones.validaFlotantes(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped

    public void btncierra()
    {
        if (pantallas_Usuario.equals("ADMINISTRADOR"))
        {
            new VtnBiblioteca(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
            this.dispose();
        } else
        {
            new VtnProgrmador(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
            this.dispose();
        }
    }
    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre1ActionPerformed
    {//GEN-HEADEREND:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtNombre1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre1KeyPressed
    {//GEN-HEADEREND:event_txtNombre1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyPressed

    private void txtNombre1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre1KeyTyped
    {//GEN-HEADEREND:event_txtNombre1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyTyped

    private void txt_autorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_autorActionPerformed
    {//GEN-HEADEREND:event_txt_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_autorActionPerformed

    private void txt_autorKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_autorKeyPressed
    {//GEN-HEADEREND:event_txt_autorKeyPressed
        Validaciones.enter(this, evt, txtEditorial);
    }//GEN-LAST:event_txt_autorKeyPressed

    private void txt_autorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_autorKeyTyped
    {//GEN-HEADEREND:event_txt_autorKeyTyped
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_txt_autorKeyTyped

    private void txtEdicionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEdicionActionPerformed
    {//GEN-HEADEREND:event_txtEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdicionActionPerformed

    private void txtEdicionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtEdicionKeyPressed
    {//GEN-HEADEREND:event_txtEdicionKeyPressed
        Validaciones.enter(this, evt, jSpinner1);
    }//GEN-LAST:event_txtEdicionKeyPressed

    private void txtEdicionKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtEdicionKeyTyped
    {//GEN-HEADEREND:event_txtEdicionKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtEdicionKeyTyped

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtISBNActionPerformed
    {//GEN-HEADEREND:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

    private void txtISBNKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtISBNKeyPressed
    {//GEN-HEADEREND:event_txtISBNKeyPressed
        Validaciones.enter(this, evt, txtPrecio);        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNKeyPressed

    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtISBNKeyTyped
    {//GEN-HEADEREND:event_txtISBNKeyTyped

    }//GEN-LAST:event_txtISBNKeyTyped

    private void txtNombre_libroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre_libroActionPerformed
    {//GEN-HEADEREND:event_txtNombre_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_libroActionPerformed

    private void txtNombre_libroKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre_libroKeyPressed
    {//GEN-HEADEREND:event_txtNombre_libroKeyPressed
        Validaciones.enter(this, evt, txt_autor);
    }//GEN-LAST:event_txtNombre_libroKeyPressed

    private void txtNombre_libroKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre_libroKeyTyped
    {//GEN-HEADEREND:event_txtNombre_libroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_libroKeyTyped

    private void txtNombre8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre8ActionPerformed
    {//GEN-HEADEREND:event_txtNombre8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre8ActionPerformed

    private void txtNombre8KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre8KeyPressed
    {//GEN-HEADEREND:event_txtNombre8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre8KeyPressed

    private void txtNombre8KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre8KeyTyped
    {//GEN-HEADEREND:event_txtNombre8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre8KeyTyped

    private void jSpinner1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jSpinner1KeyPressed
    {//GEN-HEADEREND:event_jSpinner1KeyPressed
        CtrlInterfaz.cambia(txtISBN);
    }//GEN-LAST:event_jSpinner1KeyPressed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        AudioClip music;
        music = Applet.newAudioClip(ClassLoader.getSystemResource("Windows 8 Sounds/BaseActualizada.wav"));
        music.play();

        CtrComponentes.limpiaTodo(txtA_descripcion, txtEdicion, txtEditorial, txtISBN, txtNombre1, txtNombre8, txtNombre_libro, txtPrecio, txt_autor, jSpinner1);
        selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png")));
        modeloC = new DefaultComboBoxModel();
        modeloC.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial ");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloC.addElement(rs.getString("nombre_editorial"));
            }
            txtEditorial.setModel(modeloC);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
        modeloCategoria = new DefaultComboBoxModel();
        modeloCategoria.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_categoria");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloCategoria.addElement(rs.getString("nombre_categoria"));
            }
            cbxCategoria.setModel(modeloCategoria);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
        modeloClasificacion = new DefaultComboBoxModel();
        modeloClasificacion.addElement("Seleccione");
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_clasificacion");

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next())
            {
                modeloClasificacion.addElement(rs.getString("nombre_clasificacion"));
            }
            cbxClasificacíon.setModel(modeloClasificacion);
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }
        panelImg.removeAll();

        panelImg.add(selectedPhoto1);

        panelImg.repaint();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        if (txtA_descripcion.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado la descripcion");
            CtrlInterfaz.cambia(txtA_descripcion);
        } else if (txtEdicion.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado la edicion");
            CtrlInterfaz.cambia(txtEdicion);
        } else if (txtEditorial.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No ha ingresado la editorial");
            CtrlInterfaz.cambia(txtEditorial);
        } else if (txtISBN.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el ISBN");
            CtrlInterfaz.cambia(txtISBN);
        } else if (txtNombre_libro.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el nombre del libro");
            CtrlInterfaz.cambia(txtNombre_libro);
        } else if (txtPrecio.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el precio");
            CtrlInterfaz.cambia(txtPrecio);
        } else if (txt_autor.getText().trim().isEmpty())
        {
            Mensaje.error(this, "No ha ingresado el autor");
            CtrlInterfaz.cambia(txt_autor);
        } else if (fichero == null)
        {
            Mensaje.error(this, "No ha ingresado la foto");
            CtrlInterfaz.cambia(selectedPhoto1);
        } else if (cbxCategoria.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No ha ingresado la categoria");
            CtrlInterfaz.cambia(cbxCategoria);
        } else if (cbxClasificacíon.getSelectedIndex() == 0)
        {
            Mensaje.error(this, "No ha ingresado la clasificacion");
            CtrlInterfaz.cambia(cbxClasificacíon);
        } else
        {

            try
            {
                Conexion.con = Conexion.getConexion();
                fis = new FileInputStream(fichero);
                String sql = "INSERT INTO t_libro(nombre_libro,autor_libro,editorial_libro,edicion_libro,descripcion_libro,nombre_clasificacion,nombre_categoria,no_existencia_libro,precio_libro,ISBN,portada,popularidad,no_prestamo_libro) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement ps = Conexion.con.prepareStatement(sql);
                ps.setString(1, txtNombre_libro.getText());
                ps.setString(2, txt_autor.getText());
                ps.setString(3, txtEditorial.getSelectedItem().toString());
                ps.setString(4, txtEdicion.getText());
                ps.setString(5, txtA_descripcion.getText());
                ps.setString(6, cbxClasificacíon.getSelectedItem().toString());
                ps.setString(7, cbxCategoria.getSelectedItem().toString());
                ps.setInt(8, Integer.parseInt(jSpinner1.getValue().toString()));
                ps.setFloat(9, Float.parseFloat(txtPrecio.getText()));
                ps.setString(10, txtISBN.getText());
                ps.setBinaryStream(11, fis, (int) fichero.length());
                ps.setInt(12, 0);
                ps.setInt(13, 0);

                int r = ps.executeUpdate();
                fis.close();
                if (r > 0)
                {
                    Mensaje.exito(this, "EXITO");
                    selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png")));

                    panelImg.removeAll();

                    panelImg.add(selectedPhoto1);

                    panelImg.repaint();
                } else
                {
                    Mensaje.exito(this, "Error");
                }

            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            } catch (FileNotFoundException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            } catch (IOException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        }


    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void photoSelection1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_photoSelection1ActionPerformed
    {//GEN-HEADEREND:event_photoSelection1ActionPerformed
        cargaImagen();
    }//GEN-LAST:event_photoSelection1ActionPerformed
    public void cargaImagen()
    {
        try
        {

            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("*.PNG", "png");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*.JPG", "jpg");
            fc.setFileFilter(filtro1);
            fc.setFileFilter(filtro2);

            int seleccion = fc.showOpenDialog(this);
            //jPanelImagem
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {//aceptar
                panelImg.removeAll();
                fichero = fc.getSelectedFile();//traer el archivo que se ha seleccionado
                String ruts = fichero.getAbsolutePath();

                int x = panelImg.getWidth();
                int y = panelImg.getHeight();

                Imagen img = new Imagen(x, y, ruts);

                panelImg.add(img);

            }
            panelImg.repaint();

        } catch (Exception e)
        {
            System.out.println("" + e.toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxClasificacíon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelImg;
    private rojeru_san.RSButton photoSelection1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private javax.swing.JLabel selectedPhoto1;
    private javax.swing.JTextArea txtA_descripcion;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JComboBox<String> txtEditorial;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre8;
    private javax.swing.JTextField txtNombre_libro;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txt_autor;
    // End of variables declaration//GEN-END:variables
}
