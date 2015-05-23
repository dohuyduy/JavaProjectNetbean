/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangsuachua;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

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
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/repair.png")));
        
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mKhachhang = new javax.swing.JMenu();
        miPhieuSuaChua = new javax.swing.JMenuItem();
        miThongKeXe = new javax.swing.JMenuItem();
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
        mTacvu = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        mHDSD = new javax.swing.JMenu();
        miDangxuat = new javax.swing.JMenuItem();
        miThoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vespa.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(459, 55));

        mKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contact-icon-48.png"))); // NOI18N
        mKhachhang.setText("KHÁCH");
        mKhachhang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mKhachhang.setPreferredSize(new java.awt.Dimension(123, 60));

        miPhieuSuaChua.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miPhieuSuaChua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting-icon-32.png"))); // NOI18N
        miPhieuSuaChua.setText("Phiếu sửa chữa");
        miPhieuSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPhieuSuaChuaActionPerformed(evt);
            }
        });
        mKhachhang.add(miPhieuSuaChua);

        miThongKeXe.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miThongKeXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stat-icon-32.png"))); // NOI18N
        miThongKeXe.setText("Thống kê xe");
        miThongKeXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miThongKeXeActionPerformed(evt);
            }
        });
        mKhachhang.add(miThongKeXe);

        jMenuBar1.add(mKhachhang);

        mPhutung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/scooter-icon-48.png"))); // NOI18N
        mPhutung.setText("PHỤ TÙNG");
        mPhutung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        miNhapPT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miNhapPT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cart-add-icon-32.png"))); // NOI18N
        miNhapPT.setText("Nhập phụ tùng");
        miNhapPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNhapPTActionPerformed(evt);
            }
        });
        mPhutung.add(miNhapPT);

        miTkPT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miTkPT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stat-icon-32.png"))); // NOI18N
        miTkPT.setText("Thống kê phụ tùng");
        miTkPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTkPTActionPerformed(evt);
            }
        });
        mPhutung.add(miTkPT);

        jMenuBar1.add(mPhutung);

        miDSNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/msg-brown-icon-48.png"))); // NOI18N
        miDSNV.setText("NHÂN VIÊN");
        miDSNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contacts-icon-32.png"))); // NOI18N
        jMenuItem5.setText("Danh sách nhân viên");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        miDSNV.add(jMenuItem5);

        jMenuBar1.add(miDSNV);

        miLichLV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar-icon-48.png"))); // NOI18N
        miLichLV.setText("LỊCH LÀM VIỆC");
        miLichLV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar-icon-32.png"))); // NOI18N
        jMenuItem6.setText("Lịch làm việc");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        miLichLV.add(jMenuItem6);

        jMenuBar1.add(miLichLV);

        miTimKhach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom-seach-icon-48.png"))); // NOI18N
        miTimKhach.setText("TÌM KIẾM");
        miTimKhach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find-icon-32.png"))); // NOI18N
        jMenuItem7.setText("Tìm kiếm Khách hàng");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        miTimKhach.add(jMenuItem7);

        miTimPT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miTimPT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom-seach-icon-32.png"))); // NOI18N
        miTimPT.setText("Tìm kiếm Phụ tùng");
        miTimPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTimPTActionPerformed(evt);
            }
        });
        miTimKhach.add(miTimPT);

        jMenuBar1.add(miTimKhach);

        mTacvu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chat-icon-48.png"))); // NOI18N
        mTacvu.setText("TRỢ GIÚP");
        mTacvu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/compose-icon-32.png"))); // NOI18N
        jMenuItem12.setText("Hướng dẫn sử dụng");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        mTacvu.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/like-icon-32.png"))); // NOI18N
        jMenuItem13.setText("Thông tin phần mềm");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        mTacvu.add(jMenuItem13);

        jMenuBar1.add(mTacvu);

        mHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/power-icon-48.png"))); // NOI18N
        mHDSD.setText("TÁC VỤ");
        mHDSD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        miDangxuat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow-forward-icon-32.png"))); // NOI18N
        miDangxuat.setText("Đăng xuất");
        miDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDangxuatActionPerformed(evt);
            }
        });
        mHDSD.add(miDangxuat);

        miThoat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        miThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-icon-32.png"))); // NOI18N
        miThoat.setText("Thoát");
        miThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miThoatActionPerformed(evt);
            }
        });
        mHDSD.add(miThoat);

        jMenuBar1.add(mHDSD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miThongKeXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miThongKeXeActionPerformed
        thongkexe tkx = new thongkexe();
        this.setVisible(false);
        tkx.setVisible(true);
    }//GEN-LAST:event_miThongKeXeActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        thongkexe tkx = new thongkexe();
        this.setVisible(false);
        tkx.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void miPhieuSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPhieuSuaChuaActionPerformed
        PhieuSuaChua psc = new PhieuSuaChua();
               this.setVisible(false);
              psc.setVisible(true); 
    }//GEN-LAST:event_miPhieuSuaChuaActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
              ThongTinPhanMem ttpm = new ThongTinPhanMem();
              this.setLocationRelativeTo(null);
              this.setVisible(false);
             ttpm.setVisible(true); 
               
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void miNhapPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNhapPTActionPerformed
 
      
        NhapPhuTung npt= new NhapPhuTung();
   this.setLocationRelativeTo(null);
               this.setVisible(false);
               npt.setVisible(true);         
    }//GEN-LAST:event_miNhapPTActionPerformed

    private void miTkPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTkPTActionPerformed
       
        ThongKePhuTung tkpt= new ThongKePhuTung();
        this.setLocationRelativeTo(null);
               this.setVisible(false);
               tkpt.setVisible(true);   
    }//GEN-LAST:event_miTkPTActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        
        HuongDanSuDung hdsd = new HuongDanSuDung();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        hdsd.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void miDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDangxuatActionPerformed
         DangNhap dn1 = new DangNhap();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        dn1.setVisible(true);
    }//GEN-LAST:event_miDangxuatActionPerformed

    private void miThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miThoatActionPerformed
if(JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát khỏi chương trình không?", "Thông báo", 2) == 0)
    this.dispose();          
    }//GEN-LAST:event_miThoatActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       LichLamViec llv = new LichLamViec();
        this.setVisible(false);
        llv.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        nhanvien nv = new nhanvien();
        this.setVisible(false);
        nv.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void miTimPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTimPTActionPerformed
        NhapPhuTung npt = new NhapPhuTung();
        this.setVisible(false);
        npt.setVisible(true);
    }//GEN-LAST:event_miTimPTActionPerformed

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
    private javax.swing.JLabel jLabel1;
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
