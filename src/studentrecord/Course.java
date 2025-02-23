/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentrecord;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Charliz Dana
 */
public class Course extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    /**
     * Creates new form Course
     */
    public Course() {
        initComponents();
    }
    public void refresh(){
        try {
            conn = ConnectDb.Connect();
            ps = conn.prepareStatement("SELECT*FROM studentRecord.COURSE ORDER BY COURSE_CODE");
            rs = ps.executeQuery();
            tblcourse.setModel(DbUtils.resultSetToTableModel(rs));
            
            tblcourse.getColumnModel().getColumn(0).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(3).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(4).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(5).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(6).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(7).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(8).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(9).setPreferredWidth(300);
            tblcourse.getColumnModel().getColumn(10).setPreferredWidth(300);
        
            }catch (Exception e){
            System.out.println(e);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt1description = new javax.swing.JTextField();
        txt1collegecode = new javax.swing.JTextField();
        txt1dateclosed = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt1status2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelCourse = new javax.swing.JLabel();
        cmbcourse = new javax.swing.JComboBox<>();
        btn1addschedule = new javax.swing.JButton();
        btn1recordgrade = new javax.swing.JButton();
        btn1viewschedule = new javax.swing.JButton();
        txt1dateopened = new javax.swing.JTextField();
        btn1viewgrade = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        searchcourse = new javax.swing.JTextField();
        btn1search = new javax.swing.JButton();
        btn1add = new javax.swing.JButton();
        btn1edit = new javax.swing.JButton();
        btn1delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcourse = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtcoursetab = new javax.swing.JTextField();
        btn1viewgrades = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo (4).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -10, 420, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transparent.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setText("Description:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txt1description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1descriptionActionPerformed(evt);
            }
        });
        getContentPane().add(txt1description, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 30));

        txt1collegecode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1collegecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1collegecodeActionPerformed(evt);
            }
        });
        getContentPane().add(txt1collegecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 30));

        txt1dateclosed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1dateclosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1dateclosedActionPerformed(evt);
            }
        });
        getContentPane().add(txt1dateclosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel13.setText("Date Opened:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setText("College Code:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel14.setText("Date Closed:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        txt1status2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1status2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1status2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 190, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Record");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel15.setText("Status:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 30));

        labelCourse.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        labelCourse.setForeground(new java.awt.Color(0, 0, 69));
        labelCourse.setText("Course");
        getContentPane().add(labelCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        cmbcourse.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        cmbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course", "College", "S.Y & Semester", "Subject", "Student", "Employee" }));
        cmbcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcourseActionPerformed(evt);
            }
        });
        getContentPane().add(cmbcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, 30));

        btn1addschedule.setBackground(new java.awt.Color(0, 0, 69));
        btn1addschedule.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn1addschedule.setForeground(new java.awt.Color(255, 255, 255));
        btn1addschedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (2).png"))); // NOI18N
        btn1addschedule.setText("Add Schedule");
        btn1addschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1addscheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btn1addschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 160, -1));

        btn1recordgrade.setBackground(new java.awt.Color(0, 0, 69));
        btn1recordgrade.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn1recordgrade.setForeground(new java.awt.Color(255, 255, 255));
        btn1recordgrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit (3).png"))); // NOI18N
        btn1recordgrade.setText("Record Grade");
        btn1recordgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1recordgradeActionPerformed(evt);
            }
        });
        getContentPane().add(btn1recordgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 160, -1));

        btn1viewschedule.setBackground(new java.awt.Color(0, 0, 69));
        btn1viewschedule.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn1viewschedule.setForeground(new java.awt.Color(255, 255, 255));
        btn1viewschedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view (1).png"))); // NOI18N
        btn1viewschedule.setText("View Schedule");
        btn1viewschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1viewscheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btn1viewschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 160, -1));

        txt1dateopened.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1dateopened.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1dateopenedActionPerformed(evt);
            }
        });
        getContentPane().add(txt1dateopened, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 190, 30));

        btn1viewgrade.setBackground(new java.awt.Color(0, 0, 69));
        btn1viewgrade.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn1viewgrade.setForeground(new java.awt.Color(255, 255, 255));
        btn1viewgrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye.png"))); // NOI18N
        btn1viewgrade.setText("View Grades");
        btn1viewgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1viewgradeActionPerformed(evt);
            }
        });
        getContentPane().add(btn1viewgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 160, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setText("Search:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        searchcourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchcourseMouseClicked(evt);
            }
        });
        searchcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcourseActionPerformed(evt);
            }
        });
        getContentPane().add(searchcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 230, 40));

        btn1search.setBackground(new java.awt.Color(0, 0, 69));
        btn1search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btn1search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn1search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 80, 40));

        btn1add.setBackground(new java.awt.Color(0, 0, 69));
        btn1add.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn1add.setForeground(new java.awt.Color(255, 255, 255));
        btn1add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (1).png"))); // NOI18N
        btn1add.setText("ADD");
        btn1add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1addActionPerformed(evt);
            }
        });
        getContentPane().add(btn1add, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 130, -1));

        btn1edit.setBackground(new java.awt.Color(0, 0, 69));
        btn1edit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn1edit.setForeground(new java.awt.Color(255, 255, 255));
        btn1edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editing.png"))); // NOI18N
        btn1edit.setText("EDIT");
        getContentPane().add(btn1edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, 130, 40));

        btn1delete.setBackground(new java.awt.Color(0, 0, 69));
        btn1delete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn1delete.setForeground(new java.awt.Color(255, 255, 255));
        btn1delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash.png"))); // NOI18N
        btn1delete.setText("DELETE");
        btn1delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn1delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 130, 40));

        tblcourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcourse);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 950, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setText("Course tab:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtcoursetab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcoursetab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursetabActionPerformed(evt);
            }
        });
        getContentPane().add(txtcoursetab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 30));

        btn1viewgrades.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btn1viewgrades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Beige and Black Minimalistic Modern Fashion Sale Blog Banner (3639 x 2138 px) (1360 x 730 px) (1).png"))); // NOI18N
        btn1viewgrades.setText("jLabel1");
        getContentPane().add(btn1viewgrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1360, 770));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel7.setText("Course tab:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setText("Course tab:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setText("Course tab:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcourseActionPerformed

    private void btn1addscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1addscheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1addscheduleActionPerformed

    private void btn1recordgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1recordgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1recordgradeActionPerformed

    private void btn1viewscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1viewscheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1viewscheduleActionPerformed

    private void btn1viewgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1viewgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1viewgradeActionPerformed

    private void searchcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchcourseActionPerformed

    private void btn1searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1searchActionPerformed

    private void btn1addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1addActionPerformed

    private void btn1deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1deleteActionPerformed

    private void tblcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcourseMouseClicked
        // TODO add your handling code here:
        int row = tblcourse.getSelectedRow();
    }//GEN-LAST:event_tblcourseMouseClicked

    private void txtcoursetabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursetabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoursetabActionPerformed

    private void txt1descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1descriptionActionPerformed

    private void txt1collegecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1collegecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1collegecodeActionPerformed

    private void txt1dateopenedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1dateopenedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1dateopenedActionPerformed

    private void txt1dateclosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1dateclosedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1dateclosedActionPerformed

    private void txt1status2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1status2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1status2ActionPerformed

    private void searchcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchcourseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchcourseMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1add;
    private javax.swing.JButton btn1addschedule;
    private javax.swing.JButton btn1delete;
    private javax.swing.JButton btn1edit;
    private javax.swing.JButton btn1recordgrade;
    private javax.swing.JButton btn1search;
    private javax.swing.JButton btn1viewgrade;
    private javax.swing.JLabel btn1viewgrades;
    private javax.swing.JButton btn1viewschedule;
    private javax.swing.JComboBox<String> cmbcourse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCourse;
    private javax.swing.JTextField searchcourse;
    private javax.swing.JTable tblcourse;
    private javax.swing.JTextField txt1collegecode;
    private javax.swing.JTextField txt1dateclosed;
    private javax.swing.JTextField txt1dateopened;
    private javax.swing.JTextField txt1description;
    private javax.swing.JTextField txt1status2;
    private javax.swing.JTextField txtcoursetab;
    // End of variables declaration//GEN-END:variables
}
