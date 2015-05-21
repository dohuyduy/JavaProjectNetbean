/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangsuachua;
import Connect.Data;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author huyduy
 */
public class nhanvien extends javax.swing.JFrame {
private Connection con;
private ResultSet rs;
private PreparedStatement stmt;
    /**
     * Creates new form nhanvien
     */
    public nhanvien() {
       
        
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = Data.getConnection();
        } catch (Exception e) {
        }
        showtbNhanVien();
       
    }

    
    public void showtbNhanVien(){
    Vector cols = new Vector();
    cols.addElement("ID Nhân Viên");
    cols.addElement("Tên Nhân Viên");
        cols.addElement("Mật khẩu");
        cols.addElement("Chức vụ");
        
        //tao vector du lieu
             Vector data1 = new Vector();
        String sql = "SELECT * FROM demoqlchscxm.user";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select
            while(rs.next()){     //duyet du lieu
                 Vector nv1 = new Vector();
                 nv1.addElement(rs.getInt("iduser"));
                 nv1.addElement(rs.getString("user"));
                 nv1.addElement(rs.getString("passWord"));
                 nv1.addElement(rs.getString("chucVu"));
                 data1.add(nv1);     
            }
            
        } catch (Exception e) {
        }
        
        tbNhanVien.setModel(new DefaultTableModel(data1, cols));
   this.lbNhanVien.setText("Tổng số có "+this.tbNhanVien.getRowCount()+" nhân viên"); 

}
    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLichLamViec = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdNhanVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbChucVu = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lbNhanVien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        tbLichLamViec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbLichLamViec);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("ID nhân viên");
        jPanel1.add(jLabel1);

        txtIdNhanVien.setEditable(false);
        jPanel1.add(txtIdNhanVien);

        jLabel2.setText("Tên nhân viên");
        jPanel1.add(jLabel2);
        jPanel1.add(txtTenNhanVien);

        jLabel3.setText("Mật khẩu");
        jPanel1.add(jLabel3);
        jPanel1.add(txtMatKhau);

        jLabel4.setText("Chức vụ");
        jPanel1.add(jLabel4);

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NVPV", "NVSC", "admin" }));
        jPanel1.add(cbChucVu);

        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.txtIdNhanVien.setText(null);
         this.txtTenNhanVien.setText(null);
         this.txtMatKhau.setText(null);
        
         showtbNhanVien();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         String sql = "UPDATE demoqlchscxm.user SET user = ?,passWord = ?,chucVu =? WHERE iduser = ?";
        try {
            int id = Integer.parseInt(txtIdNhanVien.getText());
            stmt = con.prepareStatement(sql);
            stmt.setString(1,txtTenNhanVien.getText());
            stmt.setString(2,txtMatKhau.getText());
            stmt.setString(3,cbChucVu.getSelectedItem().toString());
            stmt.setInt(4,id);
            
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chon 1 user truoc khi update");
        }
        showtbNhanVien();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
      String sql = "INSERT INTO demoqlchscxm.user (user,passWord,chucVu) VALUES (?,?,?)";
     
      try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, txtTenNhanVien.getText());
            stmt.setString(2, txtMatKhau.getText());
        stmt.setString(3, cbChucVu.getSelectedItem().toString());
        
        stmt.executeUpdate();

        } catch (Exception e) {
        }
        showtbNhanVien();
      
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        int row = tbNhanVien.getSelectedRow();
        if(row != -1 ){
            
          
            txtIdNhanVien.setText(tbNhanVien.getValueAt(row, 0).toString());
    
            txtTenNhanVien.setText(tbNhanVien.getValueAt(row, 1).toString());
            txtMatKhau.setText(tbNhanVien.getValueAt(row, 2).toString());
            cbChucVu.setSelectedItem(tbNhanVien.getValueAt(row, 3).toString());
           
    }//GEN-LAST:event_tbNhanVienMouseClicked
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String sql = "DELETE FROM demoqlchscxm.user WHERE iduser = ?";
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?");
        if(choice == JOptionPane.YES_OPTION){
            try {
               int id = Integer.parseInt(txtIdNhanVien.getText());
               stmt = con.prepareStatement(sql);
               stmt.setInt(1, id);
               stmt.executeUpdate();
               
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Chọn nhân viên trước khi thực hiện");
            }
        }
        showtbNhanVien();
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
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
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNhanVien;
    private javax.swing.JTable tbLichLamViec;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtIdNhanVien;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
