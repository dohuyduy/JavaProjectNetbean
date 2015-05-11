/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangsuachua;

/**
 *
 * @author huyduy
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("QUẢN LÍ CỬA HÀNG SỬA CHỮA XE MÁY");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mKhachhang = new javax.swing.JMenu();
        miThongKeXe = new javax.swing.JMenuItem();
        miPhieuSuaChua = new javax.swing.JMenuItem();
        mPhutung = new javax.swing.JMenu();
        miNhapPT = new javax.swing.JMenuItem();
        miTkPT = new javax.swing.JMenuItem();
        miDSNV = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        miLichLV = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        miTimKhach = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        miTimPT = new javax.swing.JMenuItem();
        TimNCC = new javax.swing.JMenuItem();
        mHDSD = new javax.swing.JMenu();
        miDangxuat = new javax.swing.JMenuItem();
        miThoat = new javax.swing.JMenuItem();
        mTacvu = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        mKhachhang.setText("Khách hàng");

        miThongKeXe.setText("Thống kê xe");
        miThongKeXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miThongKeXeActionPerformed(evt);
            }
        });
        mKhachhang.add(miThongKeXe);

        miPhieuSuaChua.setText("Phiếu sửa chữa");
        miPhieuSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPhieuSuaChuaActionPerformed(evt);
            }
        });
        mKhachhang.add(miPhieuSuaChua);

        jMenuBar1.add(mKhachhang);

        mPhutung.setText("Phụ tùng");

        miNhapPT.setText("Nhập phụ tùng");
        miNhapPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNhapPTActionPerformed(evt);
            }
        });
        mPhutung.add(miNhapPT);

        miTkPT.setText("Thống kê phụ tùng");
        miTkPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTkPTActionPerformed(evt);
            }
        });
        mPhutung.add(miTkPT);

        jMenuBar1.add(mPhutung);

        miDSNV.setText("Nhân viên");

        jMenuItem5.setText("Danh sách nhân viên");
        miDSNV.add(jMenuItem5);

        jMenuBar1.add(miDSNV);

        miLichLV.setText("Lịch làm việc");

        jMenuItem6.setText("Lịch làm việc");
        miLichLV.add(jMenuItem6);

        jMenuBar1.add(miLichLV);

        miTimKhach.setText("Tìm kiếm");

        jMenuItem7.setText("Tìm kiếm Khách hàng");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        miTimKhach.add(jMenuItem7);

        miTimPT.setText("Tìm kiếm Phụ tùng");
        miTimKhach.add(miTimPT);

        TimNCC.setText("Tìm kiếm nhà Cung cấp");
        miTimKhach.add(TimNCC);

        jMenuBar1.add(miTimKhach);

        mHDSD.setText("Tác vụ");

        miDangxuat.setText("Đăng xuất");
        mHDSD.add(miDangxuat);

        miThoat.setText("Thoát");
        mHDSD.add(miThoat);

        jMenuBar1.add(mHDSD);

        mTacvu.setText("Trợ giúp");

        jMenuItem12.setText("Hướng dẫn sử dụng");
        mTacvu.add(jMenuItem12);

        jMenuItem13.setText("Thông tin phần mềm");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        mTacvu.add(jMenuItem13);

        jMenuBar1.add(mTacvu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miThongKeXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miThongKeXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miThongKeXeActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void miPhieuSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPhieuSuaChuaActionPerformed
        PhieuSuaChua psc = new PhieuSuaChua();
               this.setVisible(false);
              psc.setVisible(true); 
    }//GEN-LAST:event_miPhieuSuaChuaActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
               ThongTinPhanMem ttpm = new ThongTinPhanMem();
               this.setVisible(true);
               ttpm.setVisible(true); 
               
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void miNhapPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNhapPTActionPerformed
 NhapPhuTung npt= new NhapPhuTung();
               this.setVisible(false);
               npt.setVisible(true);         
    }//GEN-LAST:event_miNhapPTActionPerformed

    private void miTkPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTkPTActionPerformed
        ThongKePhuTung tkpt= new ThongKePhuTung();
               this.setVisible(false);
               tkpt.setVisible(true);   
    }//GEN-LAST:event_miTkPTActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TimNCC;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mHDSD;
    private javax.swing.JMenu mKhachhang;
    private javax.swing.JMenu mPhutung;
    private javax.swing.JMenu mTacvu;
    private javax.swing.JMenu miDSNV;
    private javax.swing.JMenuItem miDangxuat;
    private javax.swing.JMenu miLichLV;
    private javax.swing.JMenuItem miNhapPT;
    private javax.swing.JMenuItem miPhieuSuaChua;
    private javax.swing.JMenuItem miThoat;
    private javax.swing.JMenuItem miThongKeXe;
    private javax.swing.JMenu miTimKhach;
    private javax.swing.JMenuItem miTimPT;
    private javax.swing.JMenuItem miTkPT;
    // End of variables declaration//GEN-END:variables
}
