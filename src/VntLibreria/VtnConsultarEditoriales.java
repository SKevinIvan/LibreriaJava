package VntLibreria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import recursos.Mensaje;

public class VtnConsultarEditoriales extends javax.swing.JFrame
{

    /**
     * Creates new form VtnConsultarImprenta
     */
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN X DE LA VENTANA
    int X_V;
    //VARIABLE ENTERA PARA CONOCER LA POSISION EN Y DE LA VENTANA
    int Y_V;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public VtnConsultarEditoriales(String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        initComponents();
          Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenesG/buhoAzul.png"));
        setIconImage(icono);
        //   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);

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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panel1 = new org.edisoncor.gui.panel.Panel();
        Buscar = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        txtUsuario = new rojeru_san.RSMTextFull();
        panel2 = new org.edisoncor.gui.panel.Panel();
        panel3 = new org.edisoncor.gui.panel.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Buscar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 60, 20));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Consultar Editoriales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 430, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 280, 360));

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58608390_2129915260379537_9077232394469113856_n.jpg"))); // NOI18N
        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 160));

        Buscar.setBackground(new java.awt.Color(0, 51, 102));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setColorHover(new java.awt.Color(0, 102, 204));
        Buscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 140, 30));

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
        jPanel1.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, 130, 30));

        txtUsuario.setForeground(new java.awt.Color(0, 51, 102));
        txtUsuario.setBordeColorFocus(new java.awt.Color(0, 51, 102));
        txtUsuario.setBotonColor(new java.awt.Color(0, 51, 102));
        txtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsuario.setOpaque(false);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtUsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 190, -1));

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/58775420_2141918955845834_8675439655627259904_n.jpg"))); // NOI18N
        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 570, 160));

        panel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/52743175_2048960041808393_7988474849406222336_n.jpg"))); // NOI18N
        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 570, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        CtrComponentes.botonSalirSI(this, nombre_Final_de_Usuario, pantallas_Usuario);
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BuscarActionPerformed
    {//GEN-HEADEREND:event_BuscarActionPerformed
        if (txtUsuario.getText() == "")
        {
            DefaultListModel modelo = new DefaultListModel();
            try
            {
                Conexion.con = Conexion.getConexion();
                PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial ");
                ps.setString(1, txtUsuario.getText());
                ResultSet rs;
                rs = ps.executeQuery();
                while (rs.next())
                {
                    modelo.addElement(rs.getString("nombre_editorial"));
                }
                jList1.setModel(modelo);
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        } else
        {

            DefaultListModel modelo = new DefaultListModel();
            try
            {
                Conexion.con = Conexion.getConexion();
                PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial where nombre_editorial like '" + txtUsuario.getText() + "%'");
                ps.setString(1, txtUsuario.getText());
                ResultSet rs;
                rs = ps.executeQuery();
                while (rs.next())
                {
                    modelo.addElement(rs.getString("nombre_editorial"));
                }
                jList1.setModel(modelo);
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsuarioKeyReleased
    {//GEN-HEADEREND:event_txtUsuarioKeyReleased
        if (txtUsuario.getText() == "")
        {
            DefaultListModel modelo = new DefaultListModel();
            try
            {
                Conexion.con = Conexion.getConexion();
                PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial ");
                ps.setString(1, txtUsuario.getText());
                ResultSet rs;
                rs = ps.executeQuery();
                while (rs.next())
                {
                    modelo.addElement(rs.getString("nombre_editorial"));
                }
                jList1.setModel(modelo);
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        } else
        {

            DefaultListModel modelo = new DefaultListModel();
            try
            {
                Conexion.con = Conexion.getConexion();
                PreparedStatement ps = Conexion.con.prepareStatement("SELECT * FROM t_editorial where nombre_editorial like '" + txtUsuario.getText() + "%'");
                ps.setString(1, txtUsuario.getText());
                ResultSet rs;
                rs = ps.executeQuery();
                while (rs.next())
                {
                    modelo.addElement(rs.getString("nombre_editorial"));
                }
                jList1.setModel(modelo);
            } catch (SQLException ex)
            {
                Mensaje.errorException(this, "Ha ocurrido un error \n" + ex.toString());
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
