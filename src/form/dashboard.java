/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dashboard.java
 *
 * Created on 09-Jun-2013, 09:45:11
 */

package form;

/**
 *
 * @author Administrator
 */
public class dashboard extends javax.swing.JFrame {

    /** Creates new form dashboard */
    public dashboard() {
        initComponents();
        
        javax.swing.LookAndFeel If =
                new javax.swing.plaf.metal.MetalLookAndFeel();
        try {
            javax.swing.UIManager.setLookAndFeel (If);
        } catch (Exception e) {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_anggota = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_buku = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_pinjam = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dilarang masuk.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 140, 140));

        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(".:: IKHTIAR");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/label.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(".:: NIAT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(".:: TAWAKKAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 680, 120));

        jLabel6.setBackground(new java.awt.Color(50, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("♀ PEMINJAMAN BUKU ♀");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 30));

        btn_anggota.setFont(new java.awt.Font("Tahoma", 1, 10));
        btn_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angg.png"))); // NOI18N
        btn_anggota.setBorderPainted(false);
        btn_anggota.setContentAreaFilled(false);
        btn_anggota.setFocusPainted(false);
        btn_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anggotaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, 130));

        jLabel8.setBackground(new java.awt.Color(50, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("♀ ANGGOTA ♀");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 30));

        btn_buku.setFont(new java.awt.Font("Tahoma", 1, 10));
        btn_buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku.png"))); // NOI18N
        btn_buku.setBorderPainted(false);
        btn_buku.setContentAreaFilled(false);
        btn_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bukuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 130, 120));

        jLabel9.setBackground(new java.awt.Color(50, 0, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("☺ PENGEMBALIAN BUKU ♀");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 190, 30));

        btn_pinjam.setFont(new java.awt.Font("Tahoma", 1, 10));
        btn_pinjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pinjm.png"))); // NOI18N
        btn_pinjam.setBorderPainted(false);
        btn_pinjam.setContentAreaFilled(false);
        btn_pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pinjamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 90));

        jLabel10.setBackground(new java.awt.Color(50, 0, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("♀ LAPORAN♀");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 150, 30));

        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 10));
        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kmbali.png"))); // NOI18N
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 110, 100));

        jButton1.setIcon(new javax.swing.ImageIcon("F:\\bismillah\\button\\thumbnail_laporan.png")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 150, 100));

        jLabel11.setBackground(new java.awt.Color(50, 0, 153));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("♀ BUKU ♀");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_backSM.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 590));

        jLabel12.setBackground(new java.awt.Color(50, 0, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("♀ BUKU ♀");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anggotaActionPerformed
        // TODO add your handling code here:
       frmanggota an = new frmanggota(this, rootPaneCheckingEnabled);
       an.setVisible(true);
    }//GEN-LAST:event_btn_anggotaActionPerformed

    private void btn_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bukuActionPerformed
        // TODO add your handling code here:
        frmbuku bk = new frmbuku(this, rootPaneCheckingEnabled);
        bk.setVisible(true);
    }//GEN-LAST:event_btn_bukuActionPerformed

    private void btn_pinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pinjamActionPerformed
        // TODO add your handling code here:
        frmpeminjaman pmj = new frmpeminjaman(this, rootPaneCheckingEnabled);
        pmj.setVisible(true);
    }//GEN-LAST:event_btn_pinjamActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        frmpengembalian pgmbl = new frmpengembalian(this, rootPaneCheckingEnabled);
        pgmbl.setVisible(true);
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Laporan lpr = new Laporan();
lpr.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anggota;
    private javax.swing.JButton btn_buku;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
