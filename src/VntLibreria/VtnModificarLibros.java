/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import recursos.Mensaje;

/**
 *
 * @author HP
 */
public class VtnModificarLibros extends javax.swing.JFrame
{

    /**
     * Creates new form VtnRegistroLibros
     */
    int X_V;
    int Y_V;
    JFileChooser fc;
    File fichero;
    FileInputStream fis;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnModificarLibros(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Icono.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
   


        jTextField1.setVisible(false);

    }

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
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panelImg = new javax.swing.JPanel();
        selectedPhoto1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        txtNombre4 = new javax.swing.JTextField();
        txtNombre5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        jLabel16 = new javax.swing.JLabel();
        txtNombre6 = new javax.swing.JTextField();
        txtNombre8 = new javax.swing.JTextField();
        photoSelection1 = new rojeru_san.RSButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Modificar Libro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 300, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Autor:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 190, 30));

        selectedPhoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png"))); // NOI18N
        selectedPhoto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        selectedPhoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selectedPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selectedPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 210, 250));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Editorial:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("ISBM:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Nombre del libro:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Edición:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Cantidad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

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
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 150, 30));

        txtNombre2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre2ActionPerformed(evt);
            }
        });
        txtNombre2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 170, 30));

        txtNombre3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre3ActionPerformed(evt);
            }
        });
        txtNombre3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre3KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 210, 30));

        txtNombre4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre4ActionPerformed(evt);
            }
        });
        txtNombre4.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre4KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 60, 30));

        txtNombre5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre5ActionPerformed(evt);
            }
        });
        txtNombre5.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre5KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 60, 30));

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 120, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 290));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        rSButton1.setText("Regresar");
        rSButton1.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton2.setText("Modificar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png"))); // NOI18N
        rSButton3.setText("Buscar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, 30));

        rSButton4.setBackground(new java.awt.Color(0, 51, 102));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png"))); // NOI18N
        rSButton4.setText("Limpiar y Actualizar");
        rSButton4.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 190, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Portada");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        txtNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre6.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre6.setText("Elege la portada");
        txtNombre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        txtNombre6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombre6ActionPerformed(evt);
            }
        });
        txtNombre6.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombre6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombre6KeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 160, 30));

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
        jPanel1.add(txtNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 160, 30));

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
        jPanel1.add(photoSelection1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 50, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Nueva Portada  *Opcional");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyPressed
    {//GEN-HEADEREND:event_txtNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton1ActionPerformed
    {//GEN-HEADEREND:event_boton1ActionPerformed

    }//GEN-LAST:event_boton1ActionPerformed
    public void modifica()
    {
        try
        {
            Conexion.con = Conexion.getConexion();
            PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_libros where nombre_libro=?");
            ps.setString(1, txtNombre1.getText());
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next())
            {

                jTextField1.setText(rs.getString("id_libro"));
                txtNombre2.setText(rs.getString("autor_libro"));
                txtNombre3.setText(rs.getString("editorial_libro"));
                txtNombre4.setText(rs.getString("edicion_libro"));
                txtNombre5.setText(rs.getString("cantidad"));

                txtNombre.setText(rs.getString("ISBN"));
                BufferedImage buffing = null;
                Blob blob = rs.getBlob("portada");
                byte[] image = blob.getBytes(1, (int) blob.length());
                image = rs.getBytes("portada");

                try
                {
                    buffing = ImageIO.read(new ByteArrayInputStream(image));

                    ImageIcon icono = new ImageIcon(buffing);
                    jLabel1.setIcon(icono);

                } catch (Exception e)
                {
                }

            } else
            {
                JOptionPane.showMessageDialog(null, "LIBRO NO ENCONTRADO");
            }
        } catch (SQLException ex)
        {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
        }

    }
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton2ActionPerformed
    {//GEN-HEADEREND:event_boton2ActionPerformed

    }//GEN-LAST:event_boton2ActionPerformed

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

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre2ActionPerformed
    {//GEN-HEADEREND:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtNombre2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre2KeyPressed
    {//GEN-HEADEREND:event_txtNombre2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyPressed

    private void txtNombre2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre2KeyTyped
    {//GEN-HEADEREND:event_txtNombre2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2KeyTyped

    private void txtNombre3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre3ActionPerformed
    {//GEN-HEADEREND:event_txtNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre3ActionPerformed

    private void txtNombre3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre3KeyPressed
    {//GEN-HEADEREND:event_txtNombre3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre3KeyPressed

    private void txtNombre3KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre3KeyTyped
    {//GEN-HEADEREND:event_txtNombre3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre3KeyTyped

    private void txtNombre4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre4ActionPerformed
    {//GEN-HEADEREND:event_txtNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4ActionPerformed

    private void txtNombre4KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre4KeyPressed
    {//GEN-HEADEREND:event_txtNombre4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4KeyPressed

    private void txtNombre4KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre4KeyTyped
    {//GEN-HEADEREND:event_txtNombre4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4KeyTyped

    private void txtNombre5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre5ActionPerformed
    {//GEN-HEADEREND:event_txtNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre5ActionPerformed

    private void txtNombre5KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre5KeyPressed
    {//GEN-HEADEREND:event_txtNombre5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre5KeyPressed

    private void txtNombre5KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre5KeyTyped
    {//GEN-HEADEREND:event_txtNombre5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre5KeyTyped
    public void cargaimage()
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
            Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
        }
    }

    public void modificaU()
    {
        if (fichero == null)
        {//supone que no selecciono para modificar la imagen
            try
            {
                Conexion.con = Conexion.getConexion();
                String sql = "UPDATE libros SET nombre_libro=? ,autor_libro=?, editorial=? ,edicion=? ,cantidad=? ,ISBM=? WHERE id_libro=?";
                PreparedStatement ps = Conexion.con.prepareStatement(sql);
                ps.setString(1, txtNombre1.getText());
                ps.setString(2, txtNombre2.getText());
                ps.setString(3, txtNombre3.getText());
                ps.setString(4, txtNombre4.getText());
                ps.setString(5, txtNombre5.getText());
                ps.setString(6, txtNombre.getText());
                ps.setInt(7, Integer.parseInt(jTextField1.getText()));

                int r = ps.executeUpdate();
                if (r > 0)
                {
                    Mensaje.exito(this, "EXITO al modificar");
                } else
                {
                    Mensaje.exito(this, "Error al modificar");
                }

            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());

            }
        } else
        {
            try
            {
                Conexion.con = Conexion.getConexion();
                fis = new FileInputStream(fichero);
                String sql = "UPDATE libros SET nombre_libro=? ,autor_libro=? ,editorial=? ,edicion=? ,cantidad=? ,ISBM=?,portada=? WHERE id_libro=?";
                PreparedStatement ps = Conexion.con.prepareStatement(sql);
                ps.setString(1, txtNombre1.getText());
                ps.setString(2, txtNombre2.getText());
                ps.setString(3, txtNombre3.getText());
                ps.setString(4, txtNombre4.getText());
                ps.setString(5, txtNombre5.getText());
                ps.setString(6, txtNombre.getText());
                ps.setBinaryStream(7, fis, (int) fichero.length());
                ps.setInt(8, Integer.parseInt(jTextField1.getText()));

                int r = ps.executeUpdate();
                fis.close();
                if (r > 0)
                {
                    Mensaje.exito(this, "EXITO al modificar");
                } else
                {
                    Mensaje.exito(this, "Error al modificar");
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
    }
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton3ActionPerformed
    {//GEN-HEADEREND:event_boton3ActionPerformed


    }//GEN-LAST:event_boton3ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        CtrComponentes.limpiaTodo(txtNombre, txtNombre1, txtNombre2, txtNombre3, txtNombre4, txtNombre5, jTextField1);
        panelImg.removeAll();
        panelImg.repaint();
        jLabel1.removeAll();
        jLabel1.repaint();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton4ActionPerformed
    {//GEN-HEADEREND:event_rSButton4ActionPerformed
        CtrComponentes.limpiaTodo(txtNombre, txtNombre1, txtNombre2, txtNombre3, txtNombre4, txtNombre5, jTextField1);
        panelImg.removeAll();
        panelImg.repaint();
        jLabel1.removeAll();
        jLabel1.repaint();
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void txtNombre6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombre6ActionPerformed
    {//GEN-HEADEREND:event_txtNombre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre6ActionPerformed

    private void txtNombre6KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre6KeyPressed
    {//GEN-HEADEREND:event_txtNombre6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre6KeyPressed

    private void txtNombre6KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombre6KeyTyped
    {//GEN-HEADEREND:event_txtNombre6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre6KeyTyped

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

    private void photoSelection1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_photoSelection1ActionPerformed
    {//GEN-HEADEREND:event_photoSelection1ActionPerformed
        cargaimage();
    }//GEN-LAST:event_photoSelection1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelImg;
    private rojeru_san.RSButton photoSelection1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private javax.swing.JLabel selectedPhoto1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtNombre5;
    private javax.swing.JTextField txtNombre6;
    private javax.swing.JTextField txtNombre8;
    // End of variables declaration//GEN-END:variables
}