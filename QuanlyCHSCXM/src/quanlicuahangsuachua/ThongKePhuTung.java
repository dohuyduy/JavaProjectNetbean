/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangsuachua;

import Connect.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huyduy
 */
public class ThongKePhuTung extends javax.swing.JFrame {
private Connection con;
private ResultSet rs;
private PreparedStatement stmt;
    /**
     * Creates new form ThongKePhuTung
     */
    public ThongKePhuTung() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = Data.getConnection();
        } catch (Exception e) {
        }
        showtbThongKePhuTung();
    }

    
    
    public void showtbThongKePhuTung(){
        Vector cols = new Vector();
    cols.addElement("ID Phụ tùng");
    cols.addElement("Tên Phụ Tùng");
        cols.addElement("Nhà Cung Cấp");
        //cols.addElement("Ngày nhập");
        cols.addElement("Số lượng còn lại");
        cols.addElement("Giá thành nhập");
        cols.addElement("Giá thành xuất");
        //tao vector du lieu
             Vector data1 = new Vector();
        String sql = "SELECT * FROM demoqlchscxm.nhapphutung";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select
            while(rs.next()){     //duyet du lieu
                 Vector tkpt1 = new Vector();
                 tkpt1.addElement(rs.getInt("idphutung"));
                 tkpt1.addElement(rs.getString("tenPhuTung"));
                 tkpt1.addElement(rs.getString("nhaCungCap"));
                 //stmt.setDate(3,java.sql.Date.valueOf(txtNgayNhap.getText()));
                 //tkpt1.addElement(rs.getDate("ngayNhap"));
                 tkpt1.addElement(rs.getInt("soLuongConLai"));
                 tkpt1.addElement(rs.getInt("giaThanh"));
                 tkpt1.addElement(rs.getInt("giaThanhXuat"));
                 data1.add(tkpt1);     
            }
            
        } catch (Exception e) {
        }
        
        tbThongKePhuTung.setModel(new DefaultTableModel(data1, cols));
   this.lbThongKePhuTung.setText("Tổng số có "+this.tbThongKePhuTung.getRowCount()+" phụ tùng");
    if (this.tbThongKePhuTung.getRowCount() == 0){
   

    
    
    }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongKePhuTung = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbThongKePhuTung = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ PHỤ TÙNG");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom-seach-icon-32.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSearch)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbThongKePhuTung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tbThongKePhuTung);

        lbThongKePhuTung.setText("Tổng số phụ tùng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lbThongKePhuTung, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbThongKePhuTung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        txtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow-next-3-icon-32.png"))); // NOI18N
        txtBack.setText("Quay lại");
        txtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBackActionPerformed(evt);
            }
        });
        jPanel5.add(txtBack);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-icon-32.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel5.add(btnExit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBackActionPerformed
        NhapPhuTung Frmm=new NhapPhuTung();
                    this.setVisible(false);
                    Frmm.setVisible(true); 
    }//GEN-LAST:event_txtBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Main Frmm=new Main();
                    this.setVisible(false);
                    Frmm.setVisible(true); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String textSearch = txtSearch.getText().trim();
        Vector cols = new Vector();
    cols.addElement("ID Phụ tùng");
    cols.addElement("Tên Phụ Tùng");
        cols.addElement("Nhà Cung Cấp");
        cols.addElement("Ngày nhập");
        cols.addElement("Số lượng");
        cols.addElement("Giá thành nhập");
        cols.addElement("Giá thành xuất");
        //tao vector du lieu
             Vector dataSearch = new Vector();
        
             String sql = "SELECT * FROM demoqlchscxm.nhapphutung";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select
            while(rs.next()){     //duyet du lieu
                 Vector npt1 = new Vector();
                 npt1.addElement(rs.getInt("idphutung"));
                 npt1.addElement(rs.getString("tenPhuTung"));
                 npt1.addElement(rs.getString("nhaCungCap"));
                 //stmt.setDate(3,java.sql.Date.valueOf(txtNgayNhap.getText()));
                 npt1.addElement(rs.getDate("ngayNhap"));
                 npt1.addElement(rs.getInt("soLuong"));
                 npt1.addElement(rs.getInt("giaThanh"));
                 npt1.addElement(rs.getInt("giaThanhXuat"));
                
                 if(npt1.toString().contains(textSearch)){  
                     dataSearch.addElement(npt1);
                 } 
                  
                
            }
            
        } catch (Exception e) {
        }
        
        tbThongKePhuTung.setModel(new DefaultTableModel(dataSearch, cols));
        if (textSearch == null)
            showtbThongKePhuTung();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKePhuTung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKePhuTung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKePhuTung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKePhuTung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKePhuTung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbThongKePhuTung;
    private javax.swing.JTable tbThongKePhuTung;
    private javax.swing.JButton txtBack;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
