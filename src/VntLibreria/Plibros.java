package VntLibreria;

import javax.swing.JFrame;

public class Plibros extends javax.swing.JPanel
{

    JFrame jf;
    String pantallas_Usuario = "";
    String nombre_Final_de_Usuario = "";

    public Plibros(JFrame jf, String pantallas_Usuario, String nombre_Final_de_Usuario)
    {
        this.jf = jf;
        initComponents();
        this.pantallas_Usuario = pantallas_Usuario;
        this.nombre_Final_de_Usuario = nombre_Final_de_Usuario;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea1 = new javax.swing.JTextArea();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(970, 599));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TOOLLS/49599 - add package.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 300));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TOOLLS/49590 - boxes customers inventory products.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel7)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 190, 300));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TOOLLS/49601 - package warning.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 190, 300));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar libros");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar libros");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de libros");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 190, 30));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TOOLLS/49608 - box product shipment shipping.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 170, 300));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consultar libros");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 190, 30));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("        Registra uno o más\n                  libros\n             desde aquí.\n\n");
        jTextArea2.setBorder(null);
        jTextArea2.setFocusable(false);
        jTextArea2.setOpaque(false);
        jTextArea2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("        Eliminar uno o más\n                  libros\n             desde aquí.\n\n");
        jTextArea3.setBorder(null);
        jTextArea3.setFocusable(false);
        jTextArea3.setOpaque(false);
        jTextArea3.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea3.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 190, -1));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("         Consulta datos de \n             interes para\n                  libros.");
        jTextArea4.setBorder(null);
        jTextArea4.setFocusable(false);
        jTextArea4.setOpaque(false);
        jTextArea4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea4.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 190, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("   ¿Cometiste un error al\n       registrar un libro?\n        Modificalo aquí.");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 170, -1));

        rSButton1.setBackground(new java.awt.Color(0, 51, 102));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton1.setText("Clic aquí");
        rSButton1.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton1ActionPerformed(evt);
            }
        });
        add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 160, -1));

        rSButton2.setBackground(new java.awt.Color(0, 51, 102));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton2.setText("Clic aquí");
        rSButton2.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton2ActionPerformed(evt);
            }
        });
        add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 170, -1));

        rSButton3.setBackground(new java.awt.Color(0, 51, 102));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton3.setText("Clic aquí");
        rSButton3.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton3ActionPerformed(evt);
            }
        });
        add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 170, -1));

        rSButton4.setBackground(new java.awt.Color(0, 51, 102));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_3.png"))); // NOI18N
        rSButton4.setText("Clic aquí");
        rSButton4.setColorHover(new java.awt.Color(0, 102, 204));
        rSButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rSButton4ActionPerformed(evt);
            }
        });
        add(rSButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton2ActionPerformed
    {//GEN-HEADEREND:event_rSButton2ActionPerformed
        new VtnRegistroLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        jf.dispose();
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton3ActionPerformed
    {//GEN-HEADEREND:event_rSButton3ActionPerformed
        new VtnBajasLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        jf.dispose();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton4ActionPerformed
    {//GEN-HEADEREND:event_rSButton4ActionPerformed
        new VtnConsultaPersonalizadaLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        jf.dispose();
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rSButton1ActionPerformed
    {//GEN-HEADEREND:event_rSButton1ActionPerformed
        new VtnModificarLibros(pantallas_Usuario, nombre_Final_de_Usuario).setVisible(true);
        jf.dispose();
    }//GEN-LAST:event_rSButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    // End of variables declaration//GEN-END:variables
}
