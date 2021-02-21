/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class JFrame_admin extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst=null;
    
    public JFrame_admin() {
        initComponents();
        setTitle("Admin Panel");
        conn=ConnectionCMS.ConnecrDb();
        Clock();
        
        table_employee.setBackground(new Color(0,0,0,0));
        table_employee.setOpaque(false);
        //table_employee.setGridColor(Color.BLACK);
        //table_employee.setShowGrid(true);
        scroll_employee.setOpaque(false);
        scroll_employee.getViewport().setOpaque(false);
        
        
        table_supplier.setBackground(new Color(0,0,0,0));
        table_supplier.setOpaque(false);
        //table_supplier.setGridColor(Color.BLACK);
        //table_supplier.setShowGrid(true);
        scroll_supplier.setOpaque(false);
        scroll_supplier.getViewport().setOpaque(false);
        
        
        table_product.setBackground(new Color(0,0,0,0));
        table_product.setOpaque(false);
        //table_product.setGridColor(Color.BLACK);
        //table_product.setShowGrid(true);
        scroll_product.setOpaque(false);
        scroll_product.getViewport().setOpaque(false);
        
        
        UpdateETable();
        UpdateSTable();
        UpdatePTable();
    }
    
    
    public void Clock()
    {
  
        Thread clock = new Thread()
        {
            public void run()
            {
                try
                {
                   while(true)
                   {
                       Calendar cal = new GregorianCalendar();
                       int month = cal.get(Calendar.MONTH);
                       int year = cal.get(Calendar.YEAR);
                       int day = cal.get(Calendar.DAY_OF_MONTH);
                       menu_date.setText("Current Date ->  "   + day + "/" + (month + 1) + "/" + year);
                       //System.out.println("Current date : "  + day + "/" + (month + 1) + "/" + year);
  
                       int second = cal.get(Calendar.SECOND);
                       int minute = cal.get(Calendar.MINUTE);
                       int hour = cal.get(Calendar.HOUR);
                       menu_time.setText(" |   Current Time ->  "+hour+" : "+minute+" : "+second);
     
                       //System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
                       
                       sleep(1000);
                   }
                }
                
                catch (InterruptedException e)
                {
                     e.printStackTrace();
                }
            }
        
        };
        
        clock.start();
    }
    
    private void UpdateETable()
    {
        
        
         String sql="Select * from employee ";
     
        try
        {
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pst.execute();
            table_employee.setModel(DbUtils.resultSetToTableModel(rs));
   
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
     
            }
  
            catch(Exception e)
            {
                  
            }
      
        } 


    }
    
    private void UpdateSTable()
    {
        
        
         String sql="Select * from supplier ";
     
        try
        {
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pst.execute();
            table_supplier.setModel(DbUtils.resultSetToTableModel(rs));
   
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
     
            }
  
            catch(Exception e)
            {
                  
            }
      
        } 


    }
    
    private void UpdatePTable()
    {
        
        
         String sql="Select * from product ";
     
        try
        {
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pst.execute();
            table_product.setModel(DbUtils.resultSetToTableModel(rs));
   
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
     
            }
  
            catch(Exception e)
            {
                  
            }
      
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
        btn_signOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_refresh = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_empId = new javax.swing.JTextField();
        txt_empName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_empUserId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_empPass = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_empShift = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_empAddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_empPhone = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        scroll_employee = new javax.swing.JScrollPane();
        table_employee = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_search1 = new javax.swing.JTextField();
        btn_search1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_refresh1 = new javax.swing.JButton();
        btn_delete1 = new javax.swing.JButton();
        btn_clear1 = new javax.swing.JButton();
        btn_edit1 = new javax.swing.JButton();
        btn_add1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_supId = new javax.swing.JTextField();
        txt_supName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_supAgencyName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_supRmId = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_supEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_supAddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_supPhone = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        scroll_supplier = new javax.swing.JScrollPane();
        table_supplier = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txt_search2 = new javax.swing.JTextField();
        btn_search2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btn_refresh2 = new javax.swing.JButton();
        btn_delete2 = new javax.swing.JButton();
        btn_clear2 = new javax.swing.JButton();
        btn_edit2 = new javax.swing.JButton();
        btn_add2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txt_pId = new javax.swing.JTextField();
        txt_pName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_pCat = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_pPrice = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_pStock = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_pAppTime = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_pIngredients = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        scroll_product = new javax.swing.JScrollPane();
        table_product = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_date = new javax.swing.JMenu();
        menu_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(190, 51, 0));

        btn_signOut.setBackground(new java.awt.Color(153, 0, 0));
        btn_signOut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_signOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_signOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit (1).png"))); // NOI18N
        btn_signOut.setText("Sign Out");
        btn_signOut.setBorder(null);
        btn_signOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signOutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(407, 407, 407)
                .addComponent(btn_signOut, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signOut, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Search");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_search.setForeground(new java.awt.Color(51, 51, 51));
        txt_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-circular-button (1).png"))); // NOI18N
        btn_search.setOpaque(false);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_refresh.setBackground(new java.awt.Color(153, 0, 0));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh-button.png"))); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(153, 0, 0));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(153, 0, 0));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-button (1).png"))); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(153, 0, 0));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil-striped-symbol-for-interface-edit-buttons.png"))); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(153, 0, 0));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rounded-add-button (1).png"))); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txt_search))
                .addGap(28, 28, 28)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Employee ID");

        txt_empId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empId.setForeground(new java.awt.Color(51, 51, 51));
        txt_empId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_empName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empName.setForeground(new java.awt.Color(51, 51, 51));
        txt_empName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Name");

        txt_empUserId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empUserId.setForeground(new java.awt.Color(51, 51, 51));
        txt_empUserId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("User ID");

        txt_empPass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empPass.setForeground(new java.awt.Color(51, 51, 51));
        txt_empPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Password");

        txt_empShift.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empShift.setForeground(new java.awt.Color(51, 51, 51));
        txt_empShift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Shift");

        txt_empAddress.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empAddress.setForeground(new java.awt.Color(51, 51, 51));
        txt_empAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Address");

        txt_empPhone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_empPhone.setForeground(new java.awt.Color(51, 51, 51));
        txt_empPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Phone");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_empPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txt_empAddress)
                    .addComponent(txt_empShift)
                    .addComponent(txt_empPass)
                    .addComponent(txt_empUserId)
                    .addComponent(txt_empName)
                    .addComponent(txt_empId))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empShift, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_employee.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_employee.setModel(new javax.swing.table.DefaultTableModel(
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
        table_employee.setGridColor(new java.awt.Color(255, 255, 255));
        table_employee.setRowHeight(26);
        table_employee.setSelectionBackground(new java.awt.Color(204, 51, 0));
        table_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_employee_mouseClicked(evt);
            }
        });
        scroll_employee.setViewportView(table_employee);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(scroll_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );

        jPanel6.getAccessibleContext().setAccessibleParent(this);

        jTabbedPane1.addTab("Employee ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Search");

        txt_search1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_search1.setForeground(new java.awt.Color(51, 51, 51));
        txt_search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-circular-button (1).png"))); // NOI18N
        btn_search1.setOpaque(false);
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_refresh1.setBackground(new java.awt.Color(153, 0, 0));
        btn_refresh1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh1.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh-button.png"))); // NOI18N
        btn_refresh1.setText("REFRESH");
        btn_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh1ActionPerformed(evt);
            }
        });

        btn_delete1.setBackground(new java.awt.Color(153, 0, 0));
        btn_delete1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete1.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        btn_delete1.setText("DELETE");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        btn_clear1.setBackground(new java.awt.Color(153, 0, 0));
        btn_clear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clear1.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-button (1).png"))); // NOI18N
        btn_clear1.setText("CLEAR");
        btn_clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear1ActionPerformed(evt);
            }
        });

        btn_edit1.setBackground(new java.awt.Color(153, 0, 0));
        btn_edit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit1.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil-striped-symbol-for-interface-edit-buttons.png"))); // NOI18N
        btn_edit1.setText("EDIT");
        btn_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit1ActionPerformed(evt);
            }
        });

        btn_add1.setBackground(new java.awt.Color(153, 0, 0));
        btn_add1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add1.setForeground(new java.awt.Color(255, 255, 255));
        btn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rounded-add-button (1).png"))); // NOI18N
        btn_add1.setText("ADD");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txt_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search1))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txt_search1))
                .addGap(28, 28, 28)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Supplier Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Supplier ID");

        txt_supId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supId.setForeground(new java.awt.Color(51, 51, 51));
        txt_supId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_supName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supName.setForeground(new java.awt.Color(51, 51, 51));
        txt_supName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Name");

        txt_supAgencyName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supAgencyName.setForeground(new java.awt.Color(51, 51, 51));
        txt_supAgencyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Agency Name");

        txt_supRmId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supRmId.setForeground(new java.awt.Color(51, 51, 51));
        txt_supRmId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Category ID");

        txt_supEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supEmail.setForeground(new java.awt.Color(51, 51, 51));
        txt_supEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Email");

        txt_supAddress.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supAddress.setForeground(new java.awt.Color(51, 51, 51));
        txt_supAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Address");

        txt_supPhone.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_supPhone.setForeground(new java.awt.Color(51, 51, 51));
        txt_supPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Phone");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_supAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txt_supEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_supRmId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_supAgencyName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_supName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_supId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_supPhone))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supRmId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_supplier.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_supplier.setModel(new javax.swing.table.DefaultTableModel(
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
        table_supplier.setGridColor(new java.awt.Color(255, 255, 255));
        table_supplier.setRowHeight(26);
        table_supplier.setSelectionBackground(new java.awt.Color(204, 51, 0));
        table_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_supplier_mouseClicked(evt);
            }
        });
        scroll_supplier.setViewportView(table_supplier);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Supplier", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Search");

        txt_search2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_search2.setForeground(new java.awt.Color(51, 51, 51));
        txt_search2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-circular-button (1).png"))); // NOI18N
        btn_search2.setOpaque(false);
        btn_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search2ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_refresh2.setBackground(new java.awt.Color(153, 0, 0));
        btn_refresh2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh2.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh-button.png"))); // NOI18N
        btn_refresh2.setText("REFRESH");
        btn_refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh2ActionPerformed(evt);
            }
        });

        btn_delete2.setBackground(new java.awt.Color(153, 0, 0));
        btn_delete2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete2.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubbish-bin-delete-button.png"))); // NOI18N
        btn_delete2.setText("DELETE");
        btn_delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete2ActionPerformed(evt);
            }
        });

        btn_clear2.setBackground(new java.awt.Color(153, 0, 0));
        btn_clear2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clear2.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-button (1).png"))); // NOI18N
        btn_clear2.setText("CLEAR");
        btn_clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear2ActionPerformed(evt);
            }
        });

        btn_edit2.setBackground(new java.awt.Color(153, 0, 0));
        btn_edit2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_edit2.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pencil-striped-symbol-for-interface-edit-buttons.png"))); // NOI18N
        btn_edit2.setText("EDIT");
        btn_edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit2ActionPerformed(evt);
            }
        });

        btn_add2.setBackground(new java.awt.Color(153, 0, 0));
        btn_add2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add2.setForeground(new java.awt.Color(255, 255, 255));
        btn_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rounded-add-button (1).png"))); // NOI18N
        btn_add2.setText("ADD");
        btn_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn_edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txt_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search2))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_search2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_search2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Product ID");

        txt_pId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pId.setForeground(new java.awt.Color(51, 51, 51));
        txt_pId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_pName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pName.setForeground(new java.awt.Color(51, 51, 51));
        txt_pName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Name");

        txt_pCat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pCat.setForeground(new java.awt.Color(51, 51, 51));
        txt_pCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Category");

        txt_pPrice.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pPrice.setForeground(new java.awt.Color(51, 51, 51));
        txt_pPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Price");

        txt_pStock.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pStock.setForeground(new java.awt.Color(51, 51, 51));
        txt_pStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Stock");

        txt_pAppTime.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pAppTime.setForeground(new java.awt.Color(51, 51, 51));
        txt_pAppTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Appeal Time");

        txt_pIngredients.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txt_pIngredients.setForeground(new java.awt.Color(51, 51, 51));
        txt_pIngredients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Ingredients");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_pAppTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txt_pStock, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pCat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pIngredients))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pAppTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_product.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_product.setModel(new javax.swing.table.DefaultTableModel(
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
        table_product.setGridColor(new java.awt.Color(255, 255, 255));
        table_product.setRowHeight(26);
        table_product.setSelectionBackground(new java.awt.Color(204, 51, 0));
        table_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_product_mouseClicked(evt);
            }
        });
        scroll_product.setViewportView(table_product);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_product, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(scroll_product, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        jTabbedPane1.addTab("Products", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 0));

        menu_date.setBackground(new java.awt.Color(255, 255, 255));
        menu_date.setForeground(new java.awt.Color(204, 51, 0));
        menu_date.setText("Date");
        menu_date.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_date.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuBar1.add(menu_date);

        menu_time.setBackground(new java.awt.Color(255, 255, 255));
        menu_time.setForeground(new java.awt.Color(204, 51, 0));
        menu_time.setText("Time");
        menu_time.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        menu_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuBar1.add(menu_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1187, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_employee_mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_employee_mouseClicked
        // TODO add your handling code here:
        
        int row = table_employee.getSelectedRow();
        txt_empId.setText(table_employee.getModel().getValueAt(row, 0).toString());
        txt_empName.setText(table_employee.getModel().getValueAt(row, 1).toString());
        txt_empUserId.setText(table_employee.getModel().getValueAt(row, 2).toString());
        txt_empPass.setText(table_employee.getModel().getValueAt(row, 3).toString());
        txt_empShift.setText(table_employee.getModel().getValueAt(row, 4).toString());
        txt_empAddress.setText(table_employee.getModel().getValueAt(row, 5).toString());
        txt_empPhone.setText(table_employee.getModel().getValueAt(row, 6).toString());
        
    }//GEN-LAST:event_table_employee_mouseClicked
   
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        
        String sql = "INSERT INTO employee (emp_id,name,user_id,password,shift,address,phone) values(?,?,?,?,?,?,?)";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_empId.getText());
            pst.setString(2, txt_empName.getText());
            pst.setString(3, txt_empUserId.getText());
            pst.setString(4, txt_empPass.getText());
            pst.setString(5, txt_empShift.getText());
            pst.setString(6, txt_empAddress.getText());
            pst.setString(7, txt_empPhone.getText());
   
            
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Saved");
            
    
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
                
            }
        } 
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String value1  = txt_empId.getText();
            String value2  = txt_empName.getText();
            String value3  = txt_empUserId.getText();
            String value4  = txt_empPass.getText();
            String value5  = txt_empShift.getText();
            String value6  = txt_empAddress.getText();
            String value7  = txt_empPhone.getText();
            

            String sql="update employee set name='"+value2+"',user_id='"+value3+"',password='"+value4+"', shift='"+value5+"',address='"+value6+"',phone='"+value7+"' where emp_id='"+value1+"'"; 
            
            pst =conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
            
             
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
            
            }
        
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        
        String sql="delete from employee where emp_id=?";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_empId.getText());
    
            // rs=pst.executeQuery();
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Deleted");
            
    
         
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                   
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        
        txt_empId.setText("");
        txt_empName.setText("");
        txt_empUserId.setText("");
        txt_empPass.setText("");
        txt_empShift.setText("");
        txt_empAddress.setText("");
        txt_empPhone.setText("");
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        UpdateETable();
        txt_search.setText("");
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String sql="select * from employee where emp_id=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("emp_id");
                txt_empId.setText(add1);
                String add2=rs.getString("name");
                txt_empName.setText(add2);
                String add3=rs.getString("user_id");
                txt_empUserId.setText(add3);
                String add4=rs.getString("password");
                txt_empPass.setText(add4);
                String add5=rs.getString("shift");
                txt_empShift.setText(add5);
                String add6=rs.getString("address");
                txt_empAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_empPhone.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                  
            }
        } 
        
             
        try
        {
            String sql="select * from employee where name=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("emp_id");
                txt_empId.setText(add1);
                String add2=rs.getString("name");
                txt_empName.setText(add2);
                String add3=rs.getString("user_id");
                txt_empUserId.setText(add3);
                String add4=rs.getString("password");
                txt_empPass.setText(add4);
                String add5=rs.getString("shift");
                txt_empShift.setText(add5);
                String add6=rs.getString("address");
                txt_empAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_empPhone.setText(add7);
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
         
        try
        {
            String sql="select * from employee where shift=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("emp_id");
                txt_empId.setText(add1);
                String add2=rs.getString("name");
                txt_empName.setText(add2);
                String add3=rs.getString("user_id");
                txt_empUserId.setText(add3);
                String add4=rs.getString("password");
                txt_empPass.setText(add4);
                String add5=rs.getString("shift");
                txt_empShift.setText(add5);
                String add6=rs.getString("address");
                txt_empAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_empPhone.setText(add7);
   
            }        
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
             
                                
        try
        {
            String sql="select * from employee where address=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("emp_id");
                txt_empId.setText(add1);
                String add2=rs.getString("name");
                txt_empName.setText(add2);
                String add3=rs.getString("user_id");
                txt_empUserId.setText(add3);
                String add4=rs.getString("password");
                txt_empPass.setText(add4);
                String add5=rs.getString("shift");
                txt_empShift.setText(add5);
                String add6=rs.getString("address");
                txt_empAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_empPhone.setText(add7);
   
            }        
        
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
  
            }
  
            catch(Exception e) 
            {
                  
            }
        }
        
        try
        {
            String sql="select * from employee where phone=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("emp_id");
                txt_empId.setText(add1);
                String add2=rs.getString("name");
                txt_empName.setText(add2);
                String add3=rs.getString("user_id");
                txt_empUserId.setText(add3);
                String add4=rs.getString("password");
                txt_empPass.setText(add4);
                String add5=rs.getString("shift");
                txt_empShift.setText(add5);
                String add6=rs.getString("address");
                txt_empAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_empPhone.setText(add7);
   
            }        
        
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
  
            }
  
            catch(Exception e) 
            {
                  
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signOutActionPerformed
        // TODO add your handling code here:
        
        try
        {
            rs.close();
            pst.close();
            conn.close();
        }
  
        catch(Exception e)
        {
                   
        }
        
        JFrame_welcome s = new JFrame_welcome();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_signOutActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql="select * from supplier where supplier_id=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("supplier_id");
                txt_supId.setText(add1);
                String add2=rs.getString("name");
                txt_supName.setText(add2);
                String add3=rs.getString("agency_name");
                txt_supAgencyName.setText(add3);
                String add4=rs.getString("rm_id");
                txt_supRmId.setText(add4);
                String add5=rs.getString("email");
                txt_supEmail.setText(add5);
                String add6=rs.getString("address");
                txt_supAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_supPhone.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                  
            }
        } 
        
             
        try
        {
            String sql="select * from supplier where name=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("supplier_id");
                txt_supId.setText(add1);
                String add2=rs.getString("name");
                txt_supName.setText(add2);
                String add3=rs.getString("agency_name");
                txt_supAgencyName.setText(add3);
                String add4=rs.getString("rm_id");
                txt_supRmId.setText(add4);
                String add5=rs.getString("email");
                txt_supEmail.setText(add5);
                String add6=rs.getString("address");
                txt_supAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_supPhone.setText(add7);
                
   
            }        
            
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
         
        try
        {
            String sql="select * from supplier where agency_name=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("supplier_id");
                txt_supId.setText(add1);
                String add2=rs.getString("name");
                txt_supName.setText(add2);
                String add3=rs.getString("agency_name");
                txt_supAgencyName.setText(add3);
                String add4=rs.getString("rm_id");
                txt_supRmId.setText(add4);
                String add5=rs.getString("email");
                txt_supEmail.setText(add5);
                String add6=rs.getString("address");
                txt_supAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_supPhone.setText(add7);
                
   
            }        
            
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
             
                                
        try
        {
            String sql="select * from supplier where address=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("supplier_id");
                txt_supId.setText(add1);
                String add2=rs.getString("name");
                txt_supName.setText(add2);
                String add3=rs.getString("agency_name");
                txt_supAgencyName.setText(add3);
                String add4=rs.getString("rm_id");
                txt_supRmId.setText(add4);
                String add5=rs.getString("email");
                txt_supEmail.setText(add5);
                String add6=rs.getString("address");
                txt_supAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_supPhone.setText(add7);
                
   
            }        
            
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
  
            }
  
            catch(Exception e) 
            {
                  
            }
        }
        
        try
        {
            String sql="select * from supplier where phone=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search1.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("supplier_id");
                txt_supId.setText(add1);
                String add2=rs.getString("name");
                txt_supName.setText(add2);
                String add3=rs.getString("agency_name");
                txt_supAgencyName.setText(add3);
                String add4=rs.getString("rm_id");
                txt_supRmId.setText(add4);
                String add5=rs.getString("email");
                txt_supEmail.setText(add5);
                String add6=rs.getString("address");
                txt_supAddress.setText(add6);
                String add7=rs.getString("phone");
                txt_supPhone.setText(add7);
                
   
            }        
            
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
  
            }
  
            catch(Exception e) 
            {
                  
            }
        }
        
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void btn_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh1ActionPerformed
        // TODO add your handling code here:
        UpdateSTable();
        txt_search1.setText("");
    }//GEN-LAST:event_btn_refresh1ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        // TODO add your handling code here:
        
        String sql="delete from supplier where supplier_id=?";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_supId.getText());
    
            // rs=pst.executeQuery();
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Deleted");
            
    
         
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                   
            }
        }
    
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear1ActionPerformed
        // TODO add your handling code here:
        
        txt_supId.setText("");
        txt_supName.setText("");
        txt_supAgencyName.setText("");
        txt_supRmId.setText("");
        txt_supEmail.setText("");
        txt_supAddress.setText("");
        txt_supPhone.setText("");
    }//GEN-LAST:event_btn_clear1ActionPerformed

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String value1  = txt_supId.getText();
            String value2  = txt_supName.getText();
            String value3  = txt_supAgencyName.getText();
            String value4  = txt_supRmId.getText();
            String value5  = txt_supEmail.getText();
            String value6  = txt_supAddress.getText();
            String value7  = txt_supPhone.getText();
            

            String sql="update supplier set name='"+value2+"',agency_name='"+value3+"',rm_id='"+value4+"', email='"+value5+"',address='"+value6+"',phone='"+value7+"' where supplier_id='"+value1+"'"; 
            
            pst =conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
            
             
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
            
            }
        
        }
    }//GEN-LAST:event_btn_edit1ActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        // TODO add your handling code here:
        
        String sql = "INSERT INTO supplier (supplier_id,name,agency_name,rm_id,email,address,phone) values(?,?,?,?,?,?,?)";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_supId.getText());
            pst.setString(2, txt_supName.getText());
            pst.setString(3, txt_supAgencyName.getText());
            pst.setString(4, txt_supRmId.getText());
            pst.setString(5, txt_supEmail.getText());
            pst.setString(6, txt_supAddress.getText());
            pst.setString(7, txt_supPhone.getText());
   
            
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Saved");
            
    
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
                
            }
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void table_supplier_mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_supplier_mouseClicked
        // TODO add your handling code here:
        
        int row = table_supplier.getSelectedRow();
        txt_supId.setText(table_supplier.getModel().getValueAt(row, 0).toString());
        txt_supName.setText(table_supplier.getModel().getValueAt(row, 1).toString());
        txt_supAgencyName.setText(table_supplier.getModel().getValueAt(row, 2).toString());
        txt_supRmId.setText(table_supplier.getModel().getValueAt(row, 3).toString());
        txt_supEmail.setText(table_supplier.getModel().getValueAt(row, 4).toString());
        txt_supAddress.setText(table_supplier.getModel().getValueAt(row, 5).toString());
        txt_supPhone.setText(table_supplier.getModel().getValueAt(row, 6).toString());
        
    }//GEN-LAST:event_table_supplier_mouseClicked

    private void btn_search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search2ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String sql="select * from product where product_id=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search2.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("product_id");
                txt_pId.setText(add1);
                String add2=rs.getString("name");
                txt_pName.setText(add2);
                String add3=rs.getString("category");
                txt_pCat.setText(add3);
                String add4=rs.getString("price");
                txt_pPrice.setText(add4);
                String add5=rs.getString("stock");
                txt_pStock.setText(add5);
                String add6=rs.getString("appeal_time");
                txt_pAppTime.setText(add6);
                String add7=rs.getString("ingredients");
                txt_pIngredients.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                  
            }
        } 
        
             
        try
        {
            String sql="select * from product where name=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search2.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("product_id");
                txt_pId.setText(add1);
                String add2=rs.getString("name");
                txt_pName.setText(add2);
                String add3=rs.getString("category");
                txt_pCat.setText(add3);
                String add4=rs.getString("price");
                txt_pPrice.setText(add4);
                String add5=rs.getString("stock");
                txt_pStock.setText(add5);
                String add6=rs.getString("appeal_time");
                txt_pAppTime.setText(add6);
                String add7=rs.getString("ingredients");
                txt_pIngredients.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);

        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
         
        try
        {
            String sql="select * from product where appeal_time=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search2.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("product_id");
                txt_pId.setText(add1);
                String add2=rs.getString("name");
                txt_pName.setText(add2);
                String add3=rs.getString("category");
                txt_pCat.setText(add3);
                String add4=rs.getString("price");
                txt_pPrice.setText(add4);
                String add5=rs.getString("stock");
                txt_pStock.setText(add5);
                String add6=rs.getString("appeal_time");
                txt_pAppTime.setText(add6);
                String add7=rs.getString("ingredients");
                txt_pIngredients.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
  
            catch(Exception e) 
            {
                   
            }
      
        } 
             
                                
        try
        {
            String sql="select * from product where category=? ";
            
            pst =conn.prepareStatement(sql);
            pst.setString(1,txt_search2.getText());
  
            rs=pst.executeQuery();
            // pst.execute();
            if(rs.next())
            {
                
                String add1=rs.getString("product_id");
                txt_pId.setText(add1);
                String add2=rs.getString("name");
                txt_pName.setText(add2);
                String add3=rs.getString("category");
                txt_pCat.setText(add3);
                String add4=rs.getString("price");
                txt_pPrice.setText(add4);
                String add5=rs.getString("stock");
                txt_pStock.setText(add5);
                String add6=rs.getString("appeal_time");
                txt_pAppTime.setText(add6);
                String add7=rs.getString("ingredients");
                txt_pIngredients.setText(add7);
                
   
            }        
    
        }
           
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
  
            }
  
            catch(Exception e) 
            {
                  
            }
        }
        
        
    }//GEN-LAST:event_btn_search2ActionPerformed

    private void btn_refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh2ActionPerformed
        // TODO add your handling code here:
        UpdatePTable();
        txt_search2.setText("");
    }//GEN-LAST:event_btn_refresh2ActionPerformed

    private void btn_delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete2ActionPerformed
        // TODO add your handling code here:
        
        String sql="delete from product where product_id=?";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_pId.getText());
    
            // rs=pst.executeQuery();
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Deleted");
            
    
         
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                //conn.close();
            }
            
            catch(Exception e)
            {
                   
            }
        }
    }//GEN-LAST:event_btn_delete2ActionPerformed

    private void btn_clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear2ActionPerformed
        // TODO add your handling code here:
        
        txt_pId.setText("");
        txt_pName.setText("");
        txt_pCat.setText("");
        txt_pPrice.setText("");
        txt_pStock.setText("");
        txt_pAppTime.setText("");
        txt_pIngredients.setText("");
    }//GEN-LAST:event_btn_clear2ActionPerformed

    private void btn_edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit2ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String value1  = txt_pId.getText();
            String value2  = txt_pName.getText();
            String value3  = txt_pCat.getText();
            String value4  = txt_pPrice.getText();
            String value5  = txt_pStock.getText();
            String value6  = txt_pAppTime.getText();
            String value7  = txt_pIngredients.getText();
            

            String sql="update product set name='"+value2+"',category='"+value3+"',price='"+value4+"', stock='"+value5+"',appeal_time='"+value6+"',ingredients='"+value7+"' where product_id='"+value1+"'"; 
            
            pst =conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
            
             
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
            
            }
        
        }
    }//GEN-LAST:event_btn_edit2ActionPerformed

    private void btn_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add2ActionPerformed
        // TODO add your handling code here:
        
        String sql = "INSERT INTO product (product_id,name,category,price,stock,appeal_time,ingredients) values(?,?,?,?,?,?,?)";
         
        try
        {
            pst =conn.prepareStatement(sql);
            pst.setString(1, txt_pId.getText());
            pst.setString(2, txt_pName.getText());
            pst.setString(3, txt_pCat.getText());
            pst.setString(4, txt_pPrice.getText());
            pst.setString(5, txt_pStock.getText());
            pst.setString(6, txt_pAppTime.getText());
            pst.setString(7, txt_pIngredients.getText());
   
            
            pst.execute();
    
            JOptionPane.showMessageDialog(null, "Saved");
            
    
        }
        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        finally 
        {
            try
            {
                rs.close();
                pst.close();
                // conn.close();
            }
            
            catch(Exception e) 
            {
                
            }
        }
    }//GEN-LAST:event_btn_add2ActionPerformed

    private void table_product_mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_product_mouseClicked
        // TODO add your handling code here:
        
        int row = table_product.getSelectedRow();
        txt_pId.setText(table_product.getModel().getValueAt(row, 0).toString());
        txt_pName.setText(table_product.getModel().getValueAt(row, 1).toString());
        txt_pCat.setText(table_product.getModel().getValueAt(row, 2).toString());
        txt_pPrice.setText(table_product.getModel().getValueAt(row, 3).toString());
        txt_pStock.setText(table_product.getModel().getValueAt(row, 4).toString());
        txt_pAppTime.setText(table_product.getModel().getValueAt(row, 5).toString());
        txt_pIngredients.setText(table_product.getModel().getValueAt(row, 6).toString());
    }//GEN-LAST:event_table_product_mouseClicked

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
            java.util.logging.Logger.getLogger(JFrame_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_add2;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_clear1;
    private javax.swing.JButton btn_clear2;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_delete2;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_edit1;
    private javax.swing.JButton btn_edit2;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_refresh1;
    private javax.swing.JButton btn_refresh2;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private javax.swing.JButton btn_search2;
    private javax.swing.JButton btn_signOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menu_date;
    private javax.swing.JMenu menu_time;
    private javax.swing.JScrollPane scroll_employee;
    private javax.swing.JScrollPane scroll_product;
    private javax.swing.JScrollPane scroll_supplier;
    private javax.swing.JTable table_employee;
    private javax.swing.JTable table_product;
    private javax.swing.JTable table_supplier;
    private javax.swing.JTextField txt_empAddress;
    private javax.swing.JTextField txt_empId;
    private javax.swing.JTextField txt_empName;
    private javax.swing.JTextField txt_empPass;
    private javax.swing.JTextField txt_empPhone;
    private javax.swing.JTextField txt_empShift;
    private javax.swing.JTextField txt_empUserId;
    private javax.swing.JTextField txt_pAppTime;
    private javax.swing.JTextField txt_pCat;
    private javax.swing.JTextField txt_pId;
    private javax.swing.JTextField txt_pIngredients;
    private javax.swing.JTextField txt_pName;
    private javax.swing.JTextField txt_pPrice;
    private javax.swing.JTextField txt_pStock;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search1;
    private javax.swing.JTextField txt_search2;
    private javax.swing.JTextField txt_supAddress;
    private javax.swing.JTextField txt_supAgencyName;
    private javax.swing.JTextField txt_supEmail;
    private javax.swing.JTextField txt_supId;
    private javax.swing.JTextField txt_supName;
    private javax.swing.JTextField txt_supPhone;
    private javax.swing.JTextField txt_supRmId;
    // End of variables declaration//GEN-END:variables
}
