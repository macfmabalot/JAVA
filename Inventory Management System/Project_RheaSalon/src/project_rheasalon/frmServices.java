/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_rheasalon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;


import java.util.HashMap;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author macbook
 */
public class frmServices extends javax.swing.JPanel {
private static final String username = "root";
private static final String password = "12345!@#$%a";
private static final String dataConn = "jdbc:mysql://localhost:3306/db_Rhea";

Connection sqlConn = null;
PreparedStatement pst = null;
ResultSet rs = null;
int q, i, id, deleteItem;
String code;
    /**
     * Creates new form frmServices
     */
    public frmServices() {
        initComponents();
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        updateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtService = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 2, true));

        btnAdd.setText("Add");
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Update");
        btnSave.setName("btnAdd"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPrint.setText("Print Report");
        btnPrint.setName("btnAdd"); // NOI18N
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setName("btnAdd"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel2.setText("Code:");

        txtCode.setEnabled(false);
        txtCode.setName("txtUsername"); // NOI18N

        txtService.setName("txtUsername"); // NOI18N

        jLabel4.setText("Category:");
        jLabel4.setToolTipText("");

        jLabel5.setText("Price:");

        txtPrice.setName("txtUsername"); // NOI18N

        jLabel6.setText("Service:");

        txtCategory.setName("txtUsername"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtService, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Service", "Category", "Price"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 204, 255));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        txtSearch.setText("Type the word");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Service Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        public void updateDB(){
        
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        sqlConn = DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("Select * from tblService");
        
        rs= pst.executeQuery();
        ResultSetMetaData stData=rs.getMetaData();
        
        q = stData.getColumnCount();
        
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
        RecordTable.setRowCount(0);
        
        while(rs.next()) {
        Vector columnData = new Vector();
        
        for (i = 1; i <= q; i++)
        {
        /*columnData.add(rs.getShort("ID"));*/
        columnData.add(rs.getString("Code"));
        columnData.add(rs.getString("Service"));
        columnData.add(rs.getString("Category"));
        columnData.add(rs.getString("Price"));
        }
        RecordTable.addRow(columnData);
        }
        txtCode.setText("");
        txtService.setText("");
        txtCategory.setText("");
        txtPrice.setText("");
        }
        catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null,e);
        
    }
    }
    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            if (txtService.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Service");
            }
            else if (txtCategory.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Category");
            }
            else if (txtPrice.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Price");
            }
            else {
                Class.forName("com.mysql.cj.jdbc.Driver");

                sqlConn = DriverManager.getConnection(dataConn,username,password);
                pst = sqlConn.prepareStatement("INSERT INTO tblService ( Code, Service, Category, Price)VALUES (?, ?, ?, ?)");
                LocalDate ld = LocalDate.now();
                LocalTime lt = LocalTime.now();
                /*LocalDate ld = LocalDate.now(ZoneId.of("Asia/Shanghai"));
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");*/
                txtCode.setText("ser-"+ld+lt);

                pst.setString(1, txtCode.getText());
                pst.setString(2, txtService.getText());
                pst.setString(3, txtCategory.getText());
                pst.setString(4, txtPrice.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"The record has been added!");
                updateDB();
            }
        }catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            if (txtService.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Service");
            }
            else if (txtCategory.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Category");
            }
            else if (txtPrice.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out Price");
            }
            else {
                Class.forName("com.mysql.cj.jdbc.Driver");

                sqlConn = DriverManager.getConnection(dataConn,username,password);
                pst = sqlConn.prepareStatement("UPDATE tblService SET Code=?, Service=?, Category=?, Price=? Where Code='"+txtCode.getText()+"'");

                pst.setString(1, txtCode.getText());
                pst.setString(2, txtService.getText());
                pst.setString(3, txtCategory.getText());
                pst.setString(4, txtPrice.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"The record has been updated!");
                updateDB();

                btnSave.setEnabled(false);
                btnDelete.setEnabled(false);
                btnAdd.setEnabled(true);
                txtCode.setText("");
                txtService.setText("");
                txtCategory.setText("");
                txtPrice.setText("");
            }
        }catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();

        try {
            code = RecordTable.getValueAt(SelectedRows, 0).toString();

            deleteItem = JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item", "Warning", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == deleteItem )
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                sqlConn = DriverManager.getConnection(dataConn,username,password);
                pst = sqlConn.prepareStatement("DELETE FROM tblService where Code=?");

                pst.setString(1, code);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"The record has been deleted!");
                updateDB();

                txtCode.setText("");
                txtService.setText("");
                txtCategory.setText("");
                txtPrice.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) { System.err.println(ex);}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();

        txtCode.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtService.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtCategory.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtPrice.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password); 
                String reportPath = "/Users/macbook/JaspersoftWorkspace/MyReports/rptServiceList.jrxml";
               
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                
                Map parameters = new HashMap<>();
                JasperPrint jp = JasperFillManager.fillReport(jr, parameters, sqlConn);
                
                JasperExportManager.exportReportToPdfFile(jp,"output_report.pdf");
                
                JasperViewer.viewReport(jp, false);
            
        } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (JRException ex) {
        Logger.getLogger(frmServices.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(RecordTable);
        jTable2.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }//GEN-LAST:event_btnSearchActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtService;
    // End of variables declaration//GEN-END:variables
}
