/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import recursos.Mensaje;
import recursos.Validaciones;

/**
 *
 * @author HP
 */
public class VtnBajasLibrerias extends javax.swing.JFrame {

    /**
     * Creates new form VtnEliminarLibrerias
     */
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN X DE LA VENTANA
    int X_V;
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN Y DE LA VENTANA
    int Y_V;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnBajasLibrerias(String pantallas_Usuario, String nombre_Final_de_Usuario) {
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);

        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID LIBRERIA");
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("CORREO");
        modeloTabla.addColumn("TELEFONO");
        modeloTabla.addColumn("DIRECCION");

        Statement stTabla;
        Conexion.con = Conexion.getConexion();
        String sqlTabla = "SELECT * FROM t_libreria";
        Object datos[] = new Object[5];
        try {
            stTabla = Conexion.con.createStatement();
            ResultSet rstipos = stTabla.executeQuery(sqlTabla);
            while (rstipos.next()) {
                datos[0] = rstipos.getString("id_libreria");
                datos[1] = rstipos.getString("nombre_libreria");
                datos[2] = rstipos.getString("correo_libreria");
                datos[3] = rstipos.getString("tel_libreria");
                datos[4] = rstipos.getString("dir_libreria");
                modeloTabla.addRow(datos);
            }
            jTable1.setModel(modeloTabla);

        } catch (SQLException e) {
            Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
        }

    }
    DefaultTableModel modeloTabla;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        txtUsuario = new rojeru_san.RSMTextFull();

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Eliminar librería");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 400, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/4201994 - chat logo skype social social media.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 40, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/4202011 - email gmail logo mail social social media.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 40, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/4202110 - facebook logo social social media.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 40, 40));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/4202105 - logo microsoft social social media.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 40, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID LIBRERIA", "NOMBRE DE LA LIBRERÍA", "DIRECCIÓN", "CORREO ELECTRONICO", "TELEFONO", "Horario"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0)
        {
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1180, 280));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de la librería:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 190, 20));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N
        rSButton1.setText("Regresar");
        rSButton1.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, 160, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png"))); // NOI18N
        rSButton2.setText("Buscar");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 130, 40));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Delete_24px.png"))); // NOI18N
        rSButton3.setText("Eliminar");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 160, 40));

        txtUsuario.setForeground(new java.awt.Color(0, 51, 102));
        txtUsuario.setBordeColorFocus(new java.awt.Color(0, 51, 102));
        txtUsuario.setBordeColorNoFocus(new java.awt.Color(0, 153, 204));
        txtUsuario.setBotonColor(new java.awt.Color(0, 0, 51));
        txtUsuario.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        txtUsuario.setPlaceholder("Escribe...");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
//Eliminar desde el popMenu
        if (jTable1.getSelectedRow() == -1) {
            Mensaje.error(this, "NO ha selccionado nunguna fila");
        } else {
            Conexion.con = Conexion.getConexion();
            String sql = "DELETE FROM t_libreria WHERE id_libreria=?";
            try {
                PreparedStatement registro = Conexion.con.prepareStatement(sql);
                int fila = jTable1.getSelectedRow();
                String codigo = jTable1.getValueAt(fila, 0).toString();
                registro.setInt(1, Integer.parseInt(codigo));
                modeloTabla.removeRow(fila);

                //Actualiz los registros
                int rh = registro.executeUpdate();

                if (rh > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro no eliminado");
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            Mensaje.error(this, "NO ha selccionado nunguna fila");
        } else {
            Conexion.con = Conexion.getConexion();
            String sql = "DELETE FROM t_libreria WHERE id_libreria=?";
            try {
                PreparedStatement registro = Conexion.con.prepareStatement(sql);
                int fila = jTable1.getSelectedRow();
                String codigo = jTable1.getValueAt(fila, 0).toString();
                registro.setInt(1, Integer.parseInt(codigo));
                modeloTabla.removeRow(fila);

                //Actualiz los registros
                int rh = registro.executeUpdate();

                if (rh > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro no eliminado");
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
            }
        }
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        //Busqueda
        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID LIBRERIA");
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("CORREO");
        modeloTabla.addColumn("TELEFONO");
        modeloTabla.addColumn("DIRECCION");

        Statement stTabla;
        Conexion.con = Conexion.getConexion();
        if (txtUsuario.getText().equals("")) {
            String sqlTabla = "SELECT * FROM t_libreria";
            Object datos[] = new Object[5];
            try {
                stTabla = Conexion.con.createStatement();
                ResultSet rstipos = stTabla.executeQuery(sqlTabla);
                while (rstipos.next()) {
                    datos[0] = rstipos.getString("id_libreria");
                    datos[1] = rstipos.getString("nombre_libreria");
                    datos[2] = rstipos.getString("correo_libreria");
                    datos[3] = rstipos.getString("tel_libreria");
                    datos[4] = rstipos.getString("dir_libreria");
                    modeloTabla.addRow(datos);
                }
                jTable1.setModel(modeloTabla);

            } catch (SQLException e) {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
            }
        } else {
            String sqlTabla = "SELECT * FROM t_libreria like '" + txtUsuario.getText() + "'";
            Object datos[] = new Object[5];
            try {
                stTabla = Conexion.con.createStatement();
                ResultSet rstipos = stTabla.executeQuery(sqlTabla);
                while (rstipos.next()) {
                    datos[0] = rstipos.getString("id_libreria");
                    datos[1] = rstipos.getString("nombre_libreria");
                    datos[2] = rstipos.getString("correo_libreria");
                    datos[3] = rstipos.getString("tel_libreria");
                    datos[4] = rstipos.getString("dir_libreria");
                    modeloTabla.addRow(datos);
                }
                jTable1.setModel(modeloTabla);

            } catch (SQLException e) {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + e.toString());
            }
        }
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable1MouseClicked
    {//GEN-HEADEREND:event_jTable1MouseClicked

        if (jTable1.getSelectedRow() == -1) {

        } else {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.microsoft.com/"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.gmail.com/"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.skype.com/"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR..", "Se ha producido un error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
