/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangsuachua;

import Connect.Data;
import Model.PhieuSuaChua1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huyduy
 */
public class ChiTietSuaChua extends javax.swing.JFrame {
private Connection con;
private ResultSet rs,rs1,rs2;
private PreparedStatement stmt,stmt1,stmt2;
    /**
     * Creates new form ChiTietSuaChua
     */

     
     public ChiTietSuaChua(PhieuSuaChua phieusuachua,PhieuSuaChua1 psc1){
         super();
          initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = Data.getConnection();
        } catch (Exception e) {
        }
    
        txtIdPhieuSuaChua.setText(String.valueOf(psc1.getIdPhieuSuaChua()));
        txtTenKhachHang.setText(psc1.getTenKhachHang());
        showtbThongKePhuTung();
        showtbPhieuXuat();
     }


     
    public ChiTietSuaChua() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = Data.getConnection();
        } catch (Exception e) {
        }
       // thanhTien();
        showtbThongKePhuTung();
        showtbPhieuXuat();
        
    }

    
    public void showtbThongKePhuTung(){
        Vector cols = new Vector();
    cols.addElement("ID Phụ tùng");
    cols.addElement("Tên Phụ Tùng");
        cols.addElement("Nhà Cung Cấp");
     
        cols.addElement("Số lượng nhập");
        cols.addElement("Giá thành nhập");
        cols.addElement("Giá thành xuất");
        cols.addElement("Số lượng còn lại");
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
                 tkpt1.addElement(rs.getInt("soLuong"));
                 tkpt1.addElement(rs.getInt("giaThanh"));
                 tkpt1.addElement(rs.getInt("giaThanhXuat"));
                  tkpt1.addElement(rs.getInt("soLuongConLai"));
                 data1.add(tkpt1);     
            }
            
        } catch (Exception e) {
        }
        
        tbThongKePhuTung.setModel(new DefaultTableModel(data1, cols));

    }
    
  
    
    public void showtbPhieuXuat(){
       Vector cols = new Vector();
       cols.addElement("ID Phieu Xuat");
       cols.addElement("ID phu tung");
       cols.addElement("Ten phu tung");
      cols.addElement("Gia Thanh Xuat");
       cols.addElement("So luong Xuat");
       cols.addElement("So luong Con Lai");
     cols.addElement("id Phieu Sua CHua");
       
   
                    Vector data1 = new Vector();
              
              String sql = "SELECT idPhieuXuat,phieuXuat.idphutung,nhapphutung.tenPhuTung,nhapphutung.giaThanhXuat,nhapphutung.soLuongConLai,soLuongXuat3,idPhieuSuaChua FROM demoqlchscxm.phieuXuat INNER JOIN demoqlchscxm.nhapphutung ON demoqlchscxm.nhapphutung.idphutung = demoqlchscxm.phieuXuat.idphutung";
        try {
          stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select
            
             
            
            while(rs.next()){     //duyet du lieu
                 
                 Vector px = new Vector();
                 px.addElement(rs.getInt("idPhieuXuat"));
                 px.addElement(rs.getInt("idphutung"));
                px.addElement(rs.getString("tenPhuTung"));
                 px.addElement(rs.getInt("giaThanhXuat"));
                 px.addElement(rs.getInt("soLuongXuat3"));
                 px.addElement(rs.getString("soLuongConLai"));
                 
                 px.addElement(rs.getInt("idPhieuSuaChua"));
                
               
                 data1.add(px);
            
            }
        } catch (Exception e) {
        }
                tbPhieuXuat.setModel(new DefaultTableModel(data1, cols));
    }
    
    
//    public void thanhTien(){
//       int tongTien;
//         String sql = "SELECT * FROM demoqlchscxm.phieuXuat";
//         try {
//        int row = -1;
//        tongTien = 0;
//             stmt = con.prepareStatement(sql);
//            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select
//            
//      while(rs.next()){
//    row = row + 1;
//     txtTongTien.setText(" "+String.valueOf(tongTien)); 
//    int giaThanhXuat = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 3)).toString());
//      int soLuongXuat1  = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 4)).toString());
//    tongTien = tongTien + giaThanhXuat * soLuongXuat1;
//    txtTongTien.setText(" "+String.valueOf(tongTien)); 
//            }
//            
//            
//            
//        } catch (Exception e) {
//        }
//      
//    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongKePhuTung = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieuXuat = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSoLuongXuat = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btnTongTien = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSoLuongConLai = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPhieuSuaChua = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtTry = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbThongKePhuTung.setModel(new javax.swing.table.DefaultTableModel(
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
        tbThongKePhuTung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongKePhuTungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongKePhuTung);

        tbPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuXuatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPhieuXuat);

        jLabel1.setText("Số lượng xuất: ");

        txtSoLuongXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongXuatActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSoLuongXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSoLuongXuat)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom-seach-icon-32.png"))); // NOI18N
        jButton1.setText("Search");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        btnTongTien.setText("Tổng tiền");
        btnTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongTienActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print-icon-32.png"))); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnBack.setText("Exit");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSoLuongConLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongConLaiActionPerformed(evt);
            }
        });

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Phiếu Sửa Chữa:");

        jLabel3.setText("Khách hàng:");

        txtIdPhieuSuaChua.setText("ID PSC");
        txtIdPhieuSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPhieuSuaChuaActionPerformed(evt);
            }
        });

        txtTenKhachHang.setText("Tên khách hàng");

        txtTry.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPhieuSuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addComponent(txtSoLuongConLai, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTongTien)
                .addGap(18, 18, 18)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton4)
                .addGap(196, 196, 196)
                .addComponent(txtTry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSoLuongConLai, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdPhieuSuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

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

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        PhieuSuaChua psc = new PhieuSuaChua();
        this.setVisible(false);
        psc.setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtSoLuongConLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongConLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongConLaiActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Main Frr = new Main();
        this.setVisible(false);
        Frr.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongTienActionPerformed
        int tongTien;
        String sql = "SELECT * FROM demoqlchscxm.phieuXuat";
        try {
            int row = -1;
            tongTien = 0;
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql); //dung querry vi dung cau lenh select

            while(rs.next()){
                row = row + 1;
                txtTongTien.setText(" "+String.valueOf(tongTien));
                int giaThanhXuat = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 3)).toString());
                int soLuongXuat1  = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 4)).toString());
                tongTien = tongTien + giaThanhXuat * soLuongXuat1;
                txtTongTien.setText(" "+String.valueOf(tongTien));
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTongTienActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String sql1 = "UPDATE demoqlchscxm.nhapphutung SET soLuongConLai = ? WHERE idphutung = ?";
        String sql = "DELETE FROM demoqlchscxm.phieuXuat WHERE idPhieuXuat = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt1 = con.prepareStatement(sql1);
            //phieu Xuat
            int row=this.tbPhieuXuat.getSelectedRow();// lay dong hien tai dang nhan chuot
            int IDrowPhieuXuat = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 0)).toString());// lay gia tri id cua dong thu i
            int IDrowPhuTung  = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 1)).toString());
            int soLuongXuat1  = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 4)).toString());//chinh cai naylai xoa duoc
            int soLuongConLai1 = Integer.parseInt((this.tbPhieuXuat.getModel().getValueAt(row, 5)).toString());

            stmt1.setInt(1, soLuongXuat1 + soLuongConLai1);  //phai cong them so luong xuat lay tu bang thong ke phu tung
            stmt1.setInt(2, IDrowPhuTung);

            stmt.setInt(1,IDrowPhieuXuat);

            stmt1.executeUpdate();
            stmt.executeUpdate();
            // thanhTien();

        } catch (Exception e) {
        }

        showtbPhieuXuat();
        showtbThongKePhuTung();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String sql1 = "UPDATE demoqlchscxm.nhapphutung SET soLuongConLai = ? WHERE idphutung = ?";
        String sql = "INSERT INTO demoqlchscxm.phieuXuat (idphutung,soLuongXuat3) VALUES (?,?)";
//,idPhieuSuaChua  ,?
        try {
            stmt = con.prepareStatement(sql);
            stmt1 = con.prepareStatement(sql1);

            int row=this.tbThongKePhuTung.getSelectedRow();// lay dong hien tai dang nhan chuot
            String IDrow= (this.tbThongKePhuTung.getModel().getValueAt(row, 0)).toString();// lay gia tri id cua dong thu i
            int idCuaPhuTung = Integer.parseInt(IDrow);
            stmt.setInt(1,idCuaPhuTung);
            stmt.setInt(2,Integer.parseInt(txtSoLuongXuat.getText()));
            //stmt.setInt(3,13); //tai SAO SAI????  txtIdPhieuSuaChua.getText()
           // this.lbtongphutung.setText("Tổng số có "+this.tbdanhsach.getRowCount()+" phụ tùng");
            
           // this.txtTry.setText("Hello");  //txtTenKhachHang.getText()
            
            String IDrow6 = (this.tbThongKePhuTung.getModel().getValueAt(row, 6)).toString();
            int SoLuongConLaiDangCo = Integer.parseInt(IDrow6);
            stmt1.setInt(1,(SoLuongConLaiDangCo - Integer.parseInt(txtSoLuongXuat.getText())));
            stmt1.setInt(2,idCuaPhuTung);

            

                    stmt.executeUpdate();
                    stmt1.executeUpdate();
                    // thanhTien();

                } catch (Exception e) {
                }

                showtbPhieuXuat();
                showtbThongKePhuTung();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSoLuongXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongXuatActionPerformed

    private void tbPhieuXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuXuatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPhieuXuatMouseClicked

    private void tbThongKePhuTungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongKePhuTungMouseClicked
//        int row = tbThongKePhuTung.getSelectedRow();
//        if(row != -1 ){
//
//            txtSoLuongConLai.setText(tbThongKePhuTung.getValueAt(row, 6).toString());
//
//        }
    }//GEN-LAST:event_tbThongKePhuTungMouseClicked

    private void txtIdPhieuSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPhieuSuaChuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPhieuSuaChuaActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietSuaChua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSuaChua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTongTien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbPhieuXuat;
    private javax.swing.JTable tbThongKePhuTung;
    private javax.swing.JTextField txtIdPhieuSuaChua;
    private javax.swing.JTextField txtSoLuongConLai;
    private javax.swing.JTextField txtSoLuongXuat;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTry;
    // End of variables declaration//GEN-END:variables
}
