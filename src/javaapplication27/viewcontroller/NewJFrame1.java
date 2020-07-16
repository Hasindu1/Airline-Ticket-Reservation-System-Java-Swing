/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27.viewcontroller;

import javaapplication27.entity.Seat;
import javaapplication27.entity.Payment;
import javaapplication27.entity.Customer;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.SimpleDateFormat;  
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.Locale;

import java.util.Properties;

import javax.mail.Message;

import javax.mail.MessagingException;

import javax.mail.PasswordAuthentication;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;
import javax.swing.JTextField;
import javax.swing.Timer;



/**
 *
 * @author Hasindu
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    
    private static int count1 =0;
     private static int count2= 0;
     private List slist;
     public static int tRow = 0;
     public static Object fid ;
     public static Object sid1 ;
    public static int row1 = -3;
    public static int row2 = -3;
    public static Object sname1;
    public static  Object adultPrice1;
    public static Object childPrice1;
    public static int payid;
    public static int cid1;
    public static DefaultTableModel tmodel3;
    public static String cardname;
    
   // public static String email;
    public NewJFrame1() {
        initComponents();
          showDate();
          showTime();
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel47.setVisible(false);
         jLabel52.setVisible(false);
         //jRadioButton12.setVisible(false);
        // jLabel29.setVisible(false);
        
    }
    public NewJFrame1(Locale lcl){
        initComponents();
        Locale.setDefault(lcl);
          showDate();
          showTime();
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel47.setVisible(false);
         jLabel52.setVisible(false);
         
    }
    
    public NewJFrame1(String b){
        initComponents();
        showDate();
          showTime();
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel47.setVisible(false);
         jLabel52.setVisible(false);
         cardname=b;
         viewPanel(b);
    }
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jLabel34.setText(s.format(d));
    }
   void showTime(){
       new Timer(0,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              Date d = new Date();
              SimpleDateFormat s =new SimpleDateFormat("hh:mm:ss a");
              jLabel78.setText(s.format(d));
           }
       }
       ).start();
       
       
       
       
       
       
       
       
   
   }
     void viewPanel(String cname) {
        CardLayout c1 = (CardLayout) jPanel1.getLayout();
        c1.show(jPanel1, cname);
    }
    public  void setColour(JPanel panel){
        panel.setBackground(new Color(51,0,0));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(255,0,0));
    }
    public void refreshTable1(List fList){
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, flightList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flightid}"));
        columnBinding.setColumnName("Flightid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${departdate}"));
        columnBinding.setColumnName("Departdate");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${returndate}"));
        columnBinding.setColumnName("Returndate");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${btime}"));
        columnBinding.setColumnName("Btime");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${airport1}"));
        columnBinding.setColumnName("Airport1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${airport2}"));
        columnBinding.setColumnName("Airport2");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
    }
 
//    void showDate(JTextField jTextField){
//        Date d = new Date();
//        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
//        jTextField.setText(s.format(d));
//    }
//    void showTime(){
//        new Timer(0,new ActionListner())
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("javaapplication27/viewcontroller/Bundle"); // NOI18N
        JavaApplication27PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(bundle.getString("NewJFrame1.JavaApplication27PUEntityManager.persistenceUnit")).createEntityManager(); // NOI18N
        flightQuery = java.beans.Beans.isDesignTime() ? null : JavaApplication27PUEntityManager.createQuery(bundle.getString("NewJFrame1.flightQuery.query")); // NOI18N
        flightList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : flightQuery.getResultList();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        flightQuery1 = java.beans.Beans.isDesignTime() ? null : JavaApplication27PUEntityManager.createQuery(bundle.getString("NewJFrame1.flightQuery1.query")); // NOI18N
        flightList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : flightQuery1.getResultList();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/image(2).png"))); // NOI18N
        jLabel2.setText(bundle.getString("NewJFrame1.jLabel2.text")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 0, 90, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/airasiaicon.png"))); // NOI18N
        jLabel3.setText(bundle.getString("NewJFrame1.jLabel3.text")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(260, 10, 260, 100);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(bundle.getString("NewJFrame1.jLabel5.text")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(290, 440, 100, 40);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(bundle.getString("NewJFrame1.jLabel4.text")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(140, 440, 100, 40);

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("NewJFrame1.jLabel6.text")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(450, 440, 100, 40);

        jLabel34.setText(bundle.getString("NewJFrame1.jLabel34.text")); // NOI18N
        jPanel2.add(jLabel34);
        jLabel34.setBounds(660, 510, 100, 16);

        jLabel78.setText(bundle.getString("NewJFrame1.jLabel78.text")); // NOI18N
        jPanel2.add(jLabel78);
        jLabel78.setBounds(660, 540, 100, 16);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText(bundle.getString("NewJFrame1.jLabel79.text")); // NOI18N
        jPanel2.add(jLabel79);
        jLabel79.setBounds(590, 510, 50, 15);

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText(bundle.getString("NewJFrame1.jLabel80.text")); // NOI18N
        jPanel2.add(jLabel80);
        jLabel80.setBounds(590, 540, 40, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/Panel1.jpg"))); // NOI18N
        jLabel1.setText(bundle.getString("NewJFrame1.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 580);

        jPanel1.add(jPanel2, "card2");

        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText(bundle.getString("NewJFrame1.jLabel29.text")); // NOI18N

        jRadioButton12.setText(bundle.getString("NewJFrame1.jRadioButton12.text")); // NOI18N
        jRadioButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton12MouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(bundle.getString("NewJFrame1.jLabel8.text")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/locationicon.png"))); // NOI18N
        jLabel19.setText(bundle.getString("NewJFrame1.jLabel19.text")); // NOI18N

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox3.setToolTipText(bundle.getString("NewJFrame1.jComboBox3.toolTipText")); // NOI18N
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox3MouseEntered(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/locationicon.png"))); // NOI18N
        jLabel20.setText(bundle.getString("NewJFrame1.jLabel20.text")); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(bundle.getString("NewJFrame1.jLabel10.text")); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/Calendaricon.png"))); // NOI18N
        jLabel21.setText(bundle.getString("NewJFrame1.jLabel21.text")); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText(bundle.getString("NewJFrame1.jLabel14.text")); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText(bundle.getString("NewJFrame1.jLabel26.text")); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/Calendaricon.png"))); // NOI18N
        jLabel22.setText(bundle.getString("NewJFrame1.jLabel22.text")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText(bundle.getString("NewJFrame1.jLabel13.text")); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/Passangericon.png"))); // NOI18N
        jLabel31.setText(bundle.getString("NewJFrame1.jLabel31.text")); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/Passangericon.png"))); // NOI18N
        jLabel32.setText(bundle.getString("NewJFrame1.jLabel32.text")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText(bundle.getString("NewJFrame1.jLabel23.text")); // NOI18N

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText(bundle.getString("NewJFrame1.jRadioButton6.text")); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText(bundle.getString("NewJFrame1.jLabel24.text")); // NOI18N

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText(bundle.getString("NewJFrame1.jRadioButton7.text")); // NOI18N
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText(bundle.getString("NewJFrame1.jLabel30.text")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText(bundle.getString("NewJFrame1.jLabel17.text")); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText(bundle.getString("NewJFrame1.jLabel25.text")); // NOI18N

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText(bundle.getString("NewJFrame1.jRadioButton1.text")); // NOI18N

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText(bundle.getString("NewJFrame1.jRadioButton5.text")); // NOI18N

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox4MouseEntered(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText(bundle.getString("NewJFrame1.jLabel28.text")); // NOI18N

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/Calendaricon.png"))); // NOI18N
        jLabel49.setText(bundle.getString("NewJFrame1.jLabel49.text")); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText(bundle.getString("NewJFrame1.jLabel11.text")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText(bundle.getString("NewJFrame1.jLabel15.text")); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText(bundle.getString("NewJFrame1.jLabel27.text")); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setText(bundle.getString("NewJFrame1.jLabel36.text")); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 0));
        jLabel37.setText(bundle.getString("NewJFrame1.jLabel37.text")); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText(bundle.getString("NewJFrame1.jLabel47.text")); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(bundle.getString("NewJFrame1.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText(bundle.getString("NewJFrame1.jRadioButton2.text")); // NOI18N

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText(bundle.getString("NewJFrame1.jRadioButton3.text")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel8)))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel36))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 23, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jRadioButton7)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(21, 21, 21)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton3))
                        .addGap(23, 23, 23))))
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(90, 80, 620, 460);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/airasiaicon.png"))); // NOI18N
        jLabel12.setText(bundle.getString("NewJFrame1.jLabel12.text")); // NOI18N
        jPanel6.add(jLabel12);
        jLabel12.setBounds(280, 0, 260, 80);

        jButton14.setBackground(new java.awt.Color(0, 0, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText(bundle.getString("NewJFrame1.jButton14.text")); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14);
        jButton14.setBounds(670, 0, 110, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/FirstSubPanel.jpeg"))); // NOI18N
        jLabel7.setText(bundle.getString("NewJFrame1.jLabel7.text")); // NOI18N
        jPanel6.add(jLabel7);
        jLabel7.setBounds(0, 0, 780, 580);

        jPanel1.add(jPanel6, "card3");

        jPanel9.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText(bundle.getString("NewJFrame1.jLabel16.text")); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText(bundle.getString("NewJFrame1.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, flightList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flightid}"));
        columnBinding.setColumnName("Flightid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${departdate}"));
        columnBinding.setColumnName("Departdate");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${returndate}"));
        columnBinding.setColumnName("Returndate");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${btime}"));
        columnBinding.setColumnName("Btime");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${airport1}"));
        columnBinding.setColumnName("Airport1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${airport2}"));
        columnBinding.setColumnName("Airport2");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setBackground(new java.awt.Color(0, 0, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText(bundle.getString("NewJFrame1.jButton7.text")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText(bundle.getString("NewJFrame1.jLabel81.text")); // NOI18N

        jTextField1.setText(bundle.getString("NewJFrame1.jTextField1.text")); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jRadioButton4.setText(bundle.getString("NewJFrame1.jRadioButton4.text")); // NOI18N

        jRadioButton10.setText(bundle.getString("NewJFrame1.jRadioButton10.text")); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addGap(419, 419, 419))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(36, 36, 36)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(23, 23, 23))
        );

        jPanel9.add(jPanel14);
        jPanel14.setBounds(70, 80, 640, 430);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/airasiaicon.png"))); // NOI18N
        jLabel51.setText(bundle.getString("NewJFrame1.jLabel51.text")); // NOI18N
        jPanel9.add(jLabel51);
        jLabel51.setBounds(280, 0, 260, 80);

        jButton13.setBackground(new java.awt.Color(0, 0, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText(bundle.getString("NewJFrame1.jButton13.text")); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton13);
        jButton13.setBounds(660, 0, 120, 30);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/FirstSubPanel.jpeg"))); // NOI18N
        jLabel50.setText(bundle.getString("NewJFrame1.jLabel50.text")); // NOI18N
        jPanel9.add(jLabel50);
        jLabel50.setBounds(-10, -10, 790, 570);

        jPanel1.add(jPanel9, "card4");

        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText(bundle.getString("NewJFrame1.jLabel33.text")); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SeatId", "Seat Name", "Seat Class", "Adult Price", "Child Price"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(bundle.getString("NewJFrame1.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText(bundle.getString("NewJFrame1.jButton8.text")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText(bundle.getString("NewJFrame1.jButton15.text")); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jButton15))
                .addGap(252, 252, 252))
        );

        jPanel10.add(jPanel11);
        jPanel11.setBounds(80, 60, 610, 440);

        jButton11.setBackground(new java.awt.Color(0, 51, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText(bundle.getString("NewJFrame1.jButton11.text")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton11);
        jButton11.setBounds(670, 0, 110, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/FirstSubPanel.jpeg"))); // NOI18N
        jLabel18.setText(bundle.getString("NewJFrame1.jLabel18.text")); // NOI18N
        jPanel10.add(jLabel18);
        jLabel18.setBounds(0, 0, 780, 560);

        jPanel1.add(jPanel10, "card5");

        jPanel12.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel46.setText(bundle.getString("NewJFrame1.jLabel46.text")); // NOI18N

        jLabel38.setText(bundle.getString("NewJFrame1.jLabel38.text")); // NOI18N

        jLabel39.setText(bundle.getString("NewJFrame1.jLabel39.text")); // NOI18N

        jLabel40.setText(bundle.getString("NewJFrame1.jLabel40.text")); // NOI18N

        jLabel42.setText(bundle.getString("NewJFrame1.jLabel42.text")); // NOI18N

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText(bundle.getString("NewJFrame1.jRadioButton8.text")); // NOI18N

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText(bundle.getString("NewJFrame1.jRadioButton9.text")); // NOI18N

        jTextField2.setText(bundle.getString("NewJFrame1.jTextField2.text")); // NOI18N

        jTextField3.setText(bundle.getString("NewJFrame1.jTextField3.text")); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText(bundle.getString("NewJFrame1.jTextField4.text")); // NOI18N

        jLabel44.setText(bundle.getString("NewJFrame1.jLabel44.text")); // NOI18N

        jTextField7.setText(bundle.getString("NewJFrame1.jTextField7.text")); // NOI18N

        jLabel45.setText(bundle.getString("NewJFrame1.jLabel45.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CreditCard", "Cash" }));

        jLabel48.setText(bundle.getString("NewJFrame1.jLabel48.text")); // NOI18N

        jTextField8.setText(bundle.getString("NewJFrame1.jTextField8.text")); // NOI18N

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(bundle.getString("NewJFrame1.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel41.setText(bundle.getString("NewJFrame1.jLabel41.text")); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setText(bundle.getString("NewJFrame1.jTextField6.text")); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 51));
        jLabel52.setText(bundle.getString("NewJFrame1.jLabel52.text")); // NOI18N

        jTextField9.setText(bundle.getString("NewJFrame1.jTextField9.text")); // NOI18N

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText(bundle.getString("NewJFrame1.jButton9.text")); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jRadioButton8)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButton9))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel39))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(jTextField3)))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(jTextField9))))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE))
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE))))))
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(37, 37, 37)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        jPanel12.add(jPanel13);
        jPanel13.setBounds(80, 70, 620, 440);

        jButton10.setBackground(new java.awt.Color(0, 0, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText(bundle.getString("NewJFrame1.jButton10.text")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton10);
        jButton10.setBounds(659, 0, 120, 25);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/FirstSubPanel.jpeg"))); // NOI18N
        jLabel35.setText(bundle.getString("NewJFrame1.jLabel35.text")); // NOI18N
        jPanel12.add(jLabel35);
        jLabel35.setBounds(0, 0, 780, 580);

        jPanel1.add(jPanel12, "card6");

        jPanel8.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText(bundle.getString("NewJFrame1.jLabel53.text")); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText(bundle.getString("NewJFrame1.jLabel54.text")); // NOI18N

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText(bundle.getString("NewJFrame1.jLabel55.text")); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText(bundle.getString("NewJFrame1.jLabel43.text")); // NOI18N

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText(bundle.getString("NewJFrame1.jLabel56.text")); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText(bundle.getString("NewJFrame1.jLabel57.text")); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText(bundle.getString("NewJFrame1.jLabel58.text")); // NOI18N

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText(bundle.getString("NewJFrame1.jLabel59.text")); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText(bundle.getString("NewJFrame1.jLabel60.text")); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText(bundle.getString("NewJFrame1.jLabel61.text")); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel62.setText(bundle.getString("NewJFrame1.jLabel62.text")); // NOI18N

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText(bundle.getString("NewJFrame1.jLabel63.text")); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText(bundle.getString("NewJFrame1.jLabel64.text")); // NOI18N

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setText(bundle.getString("NewJFrame1.jLabel65.text")); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel66.setText(bundle.getString("NewJFrame1.jLabel66.text")); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel67.setText(bundle.getString("NewJFrame1.jLabel67.text")); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText(bundle.getString("NewJFrame1.jLabel68.text")); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setText(bundle.getString("NewJFrame1.jLabel69.text")); // NOI18N

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 204));
        jLabel70.setText(bundle.getString("NewJFrame1.jLabel70.text")); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setText(bundle.getString("NewJFrame1.jLabel71.text")); // NOI18N

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setText(bundle.getString("NewJFrame1.jLabel72.text")); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setText(bundle.getString("NewJFrame1.jLabel73.text")); // NOI18N

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setText(bundle.getString("NewJFrame1.jLabel74.text")); // NOI18N

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setText(bundle.getString("NewJFrame1.jLabel75.text")); // NOI18N

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel76.setText(bundle.getString("NewJFrame1.jLabel76.text")); // NOI18N

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/airasiaicon.png"))); // NOI18N
        jLabel77.setText(bundle.getString("NewJFrame1.jLabel77.text")); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel66))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel71))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel58)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel61)
                                            .addComponent(jLabel65))))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(jLabel59)
                            .addComponent(jLabel76)
                            .addComponent(jLabel63)
                            .addComponent(jLabel67)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76))
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62)
                    .addComponent(jLabel60))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel66)
                    .addComponent(jLabel65)
                    .addComponent(jLabel67))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel15);
        jPanel15.setBounds(130, 40, 520, 450);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText(bundle.getString("NewJFrame1.jButton5.text")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText(bundle.getString("NewJFrame1.jButton6.text")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel16);
        jPanel16.setBounds(130, 490, 520, 50);

        jButton12.setBackground(new java.awt.Color(0, 0, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText(bundle.getString("NewJFrame1.jButton12.text")); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton12);
        jButton12.setBounds(660, 0, 120, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication27/assets/FirstSubPanel.jpeg"))); // NOI18N
        jLabel9.setText(bundle.getString("NewJFrame1.jLabel9.text")); // NOI18N
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 0, 780, 580);

        jPanel1.add(jPanel8, "card45");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
         setColour(jPanel3);
        resetColor(jPanel4);
        resetColor(jPanel5);
           new NewJFrame4().setVisible(true);;
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        setColour(jPanel4);
        resetColor(jPanel5);
        resetColor(jPanel3);
          new NewJFrame3().setVisible(true);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
       setColour(jPanel5);
        resetColor(jPanel3);
        resetColor(jPanel4);
         new NewJFrame5().setVisible(true);
        
    }//GEN-LAST:event_jLabel6MousePressed

    private void jRadioButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton12MousePressed

    }//GEN-LAST:event_jRadioButton12MousePressed

    private void jRadioButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton12MouseReleased
        if(jRadioButton12.isSelected()){
            jDateChooser2.setVisible(false);
        }
        else{
            jDateChooser2.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton12MouseReleased

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp +"\n" + "Searched Flights" +"\n");
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        boolean r = false;
        boolean r2 =false;
        if(jComboBox3.getSelectedItem().equals("Select")){

            jLabel26.setVisible(true);
        }
        else{
            jLabel26.setVisible(false);
        }
        if(jComboBox4.getSelectedItem().equals("Select")){

            jLabel28.setVisible(true);
        }
        else{
            jLabel28.setVisible(false);
        }
        if(jDateChooser1.getDate()== null){

            jLabel27.setVisible(true);
        }
        else{
            jLabel27.setVisible(false);
        }
        if((jRadioButton12.isSelected()) && (jDateChooser2.getDate() != null)){
            JOptionPane.showMessageDialog(rootPane,"You can select a return date to one way trip","Error in return date!!", 2);
            
        }
          if(!(jRadioButton12.isSelected()) && (jDateChooser2.getDate() == null)){
            jLabel36.setVisible(true);
        }
        if(jDateChooser1.getDate() != null){
            if(jDateChooser1.getDate().compareTo(new Date()) < 0){
                JOptionPane.showMessageDialog(rootPane,"Deaprt date must be higher than current date","Error in return date!!", 2);
                r2 = true;
            }
        }
        if(jDateChooser1.getDate() != null && jDateChooser2.getDate ()!= null){
            if((jDateChooser1.getDate().compareTo(jDateChooser2.getDate())>=0)){
                JOptionPane.showMessageDialog(rootPane,"Return date must be higher than depart date","Error in return date!!", 2);
                r = true;
            }
        }
        if(!(jRadioButton6.isSelected()|| jRadioButton7.isSelected()) ){

            jLabel37.setVisible(true);
        }
        else{
            jLabel37.setVisible(false);
        }
        if(!(jRadioButton1.isSelected()|| jRadioButton5.isSelected()||jRadioButton2.isSelected())){

            jLabel47.setVisible(true);
        }
        else{
            jLabel47.setVisible(false);
        }
        if(jRadioButton12.isSelected() &&!(jDateChooser2.getDate()== null) ){
            jDateChooser2.setDate(null);
        }
        if(!(jRadioButton12.isSelected()) &&!(jRadioButton3.isSelected())){
            if(!(jComboBox3.getSelectedItem().equals("Select")) && !(jComboBox4.getSelectedItem().equals("Select")) && (jDateChooser1.getDate()!= null) && r2 == false && r == false
                &&(jRadioButton6.isSelected()|| jRadioButton7.isSelected()) && (jRadioButton1.isSelected()|| jRadioButton5.isSelected()||jRadioButton2.isSelected())){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication27PU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                
                Query q = em.
                createQuery("SELECT f FROM Flight f WHERE f.country1 like :c1 AND f.country2 like :c2 AND f.departdate = :d1 AND f.returndate = :d2");
                q.setParameter("c1", "%" + jComboBox3.getSelectedItem() + "%");
                q.setParameter("c2", "%" + jComboBox4.getSelectedItem() + "%");
                 q.setParameter("d1",jDateChooser1.getDate(),TemporalType.TIMESTAMP);
                 q.setParameter("d2",jDateChooser2.getDate(),TemporalType.TIMESTAMP);
                
                flightList.clear();
                flightList = q.getResultList();
                if(q.getResultList().size() == 0){
                    JOptionPane.showMessageDialog(rootPane, " SORRY No Flights available !", "Flights Avialability error", 2);
                }
                else{
                    refreshTable1( flightList);

                    viewPanel("card4");
                }
                 }
        if((jRadioButton12.isSelected())){
            if(!(jComboBox3.getSelectedItem().equals("Select"))&& !(jComboBox4.getSelectedItem().equals("Select") ) && (jDateChooser1.getDate()!= null) && r2== false && (jRadioButton6.isSelected()|| jRadioButton7.isSelected()) &&
                (jRadioButton1.isSelected()|| jRadioButton5.isSelected()||jRadioButton2.isSelected())){
                viewPanel("card4");
            }
        
            
            }

        } 
        if(jRadioButton3.isSelected()){
            if(!(jComboBox3.getSelectedItem().equals("Select")) && !(jComboBox4.getSelectedItem().equals("Select")) && (jDateChooser1.getDate()!= null) && r2 == false && r == false
                &&(jRadioButton6.isSelected()|| jRadioButton7.isSelected()) && (jRadioButton1.isSelected()|| jRadioButton5.isSelected()||jRadioButton2.isSelected())){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication27PU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                
                Query q = em.
                createQuery("SELECT f FROM Flight f WHERE f.country1 like :c1 AND f.country2 like :c2 AND f.departdate BETWEEN :d1 AND :d2");
                q.setParameter("c1", "%" + jComboBox3.getSelectedItem() + "%");
                q.setParameter("c2", "%" + jComboBox4.getSelectedItem() + "%");
                 q.setParameter("d1",jDateChooser1.getDate(),TemporalType.TIMESTAMP);
                 q.setParameter("d2",jDateChooser2.getDate(),TemporalType.TIMESTAMP);
                
                flightList.clear();
                flightList = q.getResultList();
                if(q.getResultList().size() == 0){
                    JOptionPane.showMessageDialog(rootPane, " SORRY No Flights available !", "Flights Avialability error", 2);
                }
                else{
                    refreshTable1( flightList);

                    viewPanel("card4");
                }
            
        }
        }
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseEntered
       if(count2 == 0){
        count2 = 1;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication27PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
        Query q = em. createQuery("SELECT DISTINCT (f.country1) FROM Flight f ORDER BY f.country1 ASC");
        List<String> list = q.getResultList();  
        for(String s :list){
         jComboBox3.addItem(s);
          
         
        }
}
    }//GEN-LAST:event_jComboBox3MouseEntered

    private void jComboBox4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseEntered
                 if(count1 == 0){ 
            count1 = 1;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication27PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
        Query q = em. createQuery("SELECT DISTINCT(f.country2)FROM Flight f ORDER BY f.country2 ASC");
        List<String> list = q.getResultList();  
        for(String s :list){
         jComboBox4.addItem(s);
          
        }
        
        } 
    }//GEN-LAST:event_jComboBox4MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"Searched selected flight"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        if(row2 >=0 ){
        if(jRadioButton1.isSelected()){
        Object flightnumber;
       TableModel  model = (TableModel)jTable1.getModel();
       DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
       int rownumber = jTable1.getSelectedRow();
       flightnumber = model.getValueAt(rownumber,0);
      
       fid = flightnumber;
       try{
           
           Class.forName("java.sql.DriverManager");
           String url = "jdbc:derby://localhost:1527/Final1;user= hasindu; password=hasindu";
           Connection con = DriverManager.getConnection(url);
           String q = "select * from SEAT as s WHERE s.FLID = " +flightnumber + " AND s.STATUS =false" + " AND s.SEATCLASS LIKE 'first'" ;
           
           PreparedStatement pst = con.prepareStatement(q);
           
           ResultSet rs = pst.executeQuery();
           int count = 0;
           
           while(rs.next()){
               model2.insertRow(count,new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(5),rs.getInt(6)});
               System.out.println(rs.getInt(1));
               count ++;
           }
           jTable2.setModel(model2);
           tmodel3 = model2;
           viewPanel("card5");
           
           
           
           
           
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       }
         if(jRadioButton5.isSelected()){
        Object flightnumber;
       TableModel  model = (TableModel)jTable1.getModel();
       DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
       int rownumber = jTable1.getSelectedRow();
       flightnumber = model.getValueAt(rownumber,0);
       try{
           
           Class.forName("java.sql.DriverManager");
           String url = "jdbc:derby://localhost:1527/Final1;user= hasindu; password=hasindu";
           Connection con = DriverManager.getConnection(url);
           String q = "select * from SEAT as s WHERE s.FLID = " +flightnumber +" AND s.STATUS = false" + " AND s.SEATCLASS like 'business' " ;
           
           PreparedStatement pst = con.prepareStatement(q);
           
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               model2.insertRow(0,new Object[]{rs.getInt(1),rs.getString(2)});
               System.out.println(rs.getInt(1));
           }
           jTable2.setModel(model2);
           viewPanel("card5");
           
           
           
           
           
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       }
         if(jRadioButton2.isSelected()){
        Object flightnumber;
       TableModel  model = (TableModel)jTable1.getModel();
       DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
       int rownumber = jTable1.getSelectedRow();
       flightnumber = model.getValueAt(rownumber,0);
       try{
           
           Class.forName("java.sql.DriverManager");
           String url = "jdbc:derby://localhost:1527/Final1;user= hasindu; password=hasindu";
           Connection con = DriverManager.getConnection(url);
           String q = "select * from SEAT as s WHERE s.FLID = " +flightnumber +" AND s.STATUS = false" + " AND s.SEATCLASS like 'economy' " ;
           
           PreparedStatement pst = con.prepareStatement(q);
           
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               model2.insertRow(0,new Object[]{rs.getInt(1),rs.getString(2)});
               System.out.println(rs.getInt(1));
           }
           jTable2.setModel(model2);
           viewPanel("card5");
           
           
           
           
           
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       } 
        }
        if(row2 < 0){
           JOptionPane.showMessageDialog(rootPane,"Please select a row to continue","Error in selected row!!", 2);  
        }
        
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"Clicked procedd button on Payment details page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }       
        boolean r1 = false;
       boolean r2 = false;
       boolean r3 = false;
       boolean r4 = false;
       boolean r5 = false;
       boolean r6 = false;
      boolean r7 = false;
      boolean r8=false;
      boolean r9 =false;
        if((jTextField2.getText() == null)||(jTextField3.getText() == null)||(jTextField4.getText() == null)||(jTextField9.getText() == null)||(jTextField7.getText() == null)||(jTextField6.getText() == null)||(jTextField6.getText() == null)|| (jTextField2.getText().equals("")) || (jTextField3.getText().equals("")) ||(jTextField4.getText().equals("")) || (jTextField9.getText().equals(""))
             ||  (jTextField7.getText().equals("")) || (jTextField8.getText().equals("")) ||(jTextField6.getText().equals(""))|| !((jRadioButton8.isSelected()) || (jRadioButton9.isSelected())) || jComboBox1.getSelectedItem().equals("Select")){
           jLabel52.setVisible(true);
            r1 = true;
    }
       if(!(jTextField3.getText().contains("@") &&jTextField3.getText().contains(".com")) ){
            JOptionPane.showMessageDialog(rootPane,"Please enter a valid E-mail","Error in inserted Email!!", 2);
             r2 = true;
           
       }
       
//       if(jRadioButton6.isSelected() && (Integer.parseInt(jTextField9.getText())< 0) || (Integer.parseInt(jTextField9.getText())>150) || (Integer.parseInt(jTextField9.getText())< 18) ){
//           JOptionPane.showMessageDialog(rootPane,"Please enter a valid age","Error in inserted Age!!", 2);
//           r3 = true;
//           System.out.println("Adult");
//           System.out.println(Integer.parseInt(jTextField9.getText()));
//       }
//       if(jRadioButton7.isSelected() && (Integer.parseInt(jTextField9.getText())< 0) || (Integer.parseInt(jTextField9.getText())> 12) ){
//            JOptionPane.showMessageDialog(rootPane,"Please enter a valid age","Error in inserted Age!!", 2);
//             r4 = true;
//             System.out.println("Child");
//       }
        
       if(!(jTextField8.getText().contains("@") &&jTextField8.getText().contains(".com")) ){
            JOptionPane.showMessageDialog(rootPane,"Please enter a valid E-mail","Error in inserted Email!!", 2);
             r5 = true;
           
       }
//       
//       if(!((jTextField4.getText().matches("[0-9]+"))&& (jTextField4.getText().length()>7))){
//           JOptionPane.showMessageDialog(rootPane,"Please enter a valid phone number","Error in inserted number!!", 2);
//           r6 = true;
//       }
//       
//       if(!(jTextField9.getText().matches("^[0-9]*$"))|| !(jTextField9.getText().length()>1)){
//           JOptionPane.showMessageDialog(rootPane,"Age cannot consists alphebetic charactors","Error in inserted age!!", 2);
//           r7 = true;
//       }
        if(!(jTextField4.getText().matches("[0-9]+")) || (jTextField4.getText().length()<7)){
             JOptionPane.showMessageDialog(rootPane,"Please enter a valid phone number","Error in inserted number!!", 2);
             r6 = true;
        }
         if(!(jTextField9.getText().matches("[0-9]+")) || (jTextField9.getText().length()<0)){
             JOptionPane.showMessageDialog(rootPane,"Please enter a valid age ","Error in inserted number!!", 2);
             r7 = true;
        }
          if(jRadioButton6.isSelected() && !r7){
            if((Integer.parseInt(jTextField9.getText())< 0) ||(Integer.parseInt(jTextField9.getText())<12) ||(Integer.parseInt(jTextField9.getText())>150) ){
                r3 =true;
                 JOptionPane.showMessageDialog(rootPane,"Please enter a valid age","Error in inserted Age!!", 2);
            }
            
        }
        if(jRadioButton7.isSelected() && !r7 ){
            if((Integer.parseInt(jTextField9.getText())< 0 ) ||(Integer.parseInt(jTextField9.getText())>12)){
            
            r4 = true;
            JOptionPane.showMessageDialog(rootPane,"Please enter a valid age","Error in inserted Age!!", 2);
        }
        } 
      if(!(jTextField2.getText().matches("[a-zA-Z]+"))){
          JOptionPane.showMessageDialog(rootPane,"Please enter a valid Passanger name","Numberic Characters found!!", 2);
          r8 = true;
      }
        if(!(jTextField7.getText().matches("[a-zA-Z]+"))){
          JOptionPane.showMessageDialog(rootPane,"Please enter a valid Customer name","Numberic Characters found!!", 2);
          r9 =true;
      }
      
        
       
       if(!(r1 || r2 || r3 || r4 || r5 ||r6 || r7 || r8 || r9)){
           
        jLabel52.setVisible(false);
        //email =jTextField7.getText();
    
        try{
           
           Class.forName("java.sql.DriverManager");
           String url = "jdbc:derby://localhost:1527/Final1;user= hasindu; password=hasindu";
           Connection con = DriverManager.getConnection(url);
           String q2 = "select COUNT(*) from Passanger" ;
           
           PreparedStatement pst = con.prepareStatement(q2);
           
           ResultSet rs2 = pst.executeQuery();
           int records2 = 0;
           while(rs2.next()){
               records2 = rs2.getInt(1);
           }
           int reco = records2 + 1;
//            Passanger p1 = new Passanger();
//            p1.setFid((Flight)fid);
//            p1.setPassangerid(records2 + 1);
//            p1.setPname(jTextField2.getText());
//            p1.setEmail(jTextField3.getText());
//            p1.setContactnumber(jTextField4.getText());
//            p1.setAge(jTextField9.getText());
            if(jRadioButton8.isSelected()){
//            p1.setGender("male");
                String m = "male";
                    try{
        String sql = "INSERT INTO PASSANGER(PASSANGERID,PNAME,EMAIL,GENDER,CONTACTNUMBER,FID,AGE)VALUES(?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,reco);
        statement.setString(2,jTextField2.getText());
        statement.setString(3,jTextField3.getText());
        statement.setString(4,m);
        statement.setString(5,jTextField4.getText());
         statement.setInt(6,Integer.parseInt(fid.toString()));
         statement.setString(7,jTextField9.getText());
        statement.executeUpdate();
     }catch(SQLException e){
              System.out.println(e.getMessage());
     }
             
                
           }
           else if(jRadioButton9.isSelected()){
                String m2 = "female";
                    try{
        String sql = "INSERT INTO PASSANGER(PASSANGERID,PNAME,EMAIL,GENDER,CONTACTNUMBER,FID,AGE)VALUES(?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,reco);
        statement.setString(2,jTextField2.getText());
        statement.setString(3,jTextField3.getText());
        statement.setString(4,m2);
        statement.setString(5,jTextField4.getText());
         statement.setInt(6,Integer.parseInt(fid.toString()));
         statement.setString(7,jTextField9.getText());
        statement.executeUpdate();
     }catch(SQLException e){
              System.out.println(e.getMessage());
     }
           }
//            JavaApplication27PUEntityManager.getTransaction().begin();
//            JavaApplication27PUEntityManager.persist(p1);
//            JavaApplication27PUEntityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(rootPane, "Passanger added!", "Succeeded", 1);
       } 
        catch(Exception e){
           System.out.println(e.getMessage());
       }

       Customer c1 = new Customer();
      try{
           
           Class.forName("java.sql.DriverManager");
           String url = "jdbc:derby://localhost:1527/Final1;user= hasindu; password=hasindu";
           Connection con = DriverManager.getConnection(url);
           String q = "select COUNT(*) from Customer" ;
           
           PreparedStatement pst = con.prepareStatement(q);
           
           ResultSet rs = pst.executeQuery();
           int records = 0;
           while(rs.next()){
               records = rs.getInt(1);
           }
          
          
         
           c1.setCustomerid(records + 1);
           cid1 =records + 1;
          
           c1.setCustomername(jTextField7.getText());
           c1.setEmail(jTextField8.getText());
             JavaApplication27PUEntityManager.getTransaction().begin();
        JavaApplication27PUEntityManager.persist(c1);
       JavaApplication27PUEntityManager.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "Passanger added", "Info", 1);

           Payment pay1 = new Payment();
           String q1 = "Select COUNT(*) FROM Payment";
           PreparedStatement pst1 = con.prepareStatement(q1);
           
           ResultSet rs1 = pst1.executeQuery();
           int records1 = 0;
           while(rs1.next()){
               records1 = rs1.getInt(1);
           }
           int rs2 = records1 + 1;
          int pid = rs2;
          payid = pid;
          int val = Integer.parseInt(jTextField6.getText());
          String pType = jComboBox1.getSelectedItem().toString();
          int cid = records + 1;
          try{
        String sql = "INSERT INTO PAYMENT(PAYMENTID,PaymentType,Value,Cid)VALUES(?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,pid);
        statement.setString(2,pType);
        statement.setInt(3,val);
        statement.setInt(4,cid);
       
        statement.executeUpdate();
     }catch(SQLException e){
              System.out.println(e.getMessage());
     }
         
       JOptionPane.showMessageDialog(rootPane, "Payment details added", "Succeeded!!", 1);
           
           
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
      Seat s = JavaApplication27PUEntityManager.find(Seat.class,
                sid1);
         s.setStatus(true);
         
           JavaApplication27PUEntityManager.getTransaction().begin();
           JavaApplication27PUEntityManager.persist(s);
            JavaApplication27PUEntityManager.getTransaction().commit();
         JOptionPane.showMessageDialog(rootPane,"Seat booked!!", "Succeeded!!", 1);
         
         int r = jTable1.getSelectedRow();
         int f =flightList.get(r).getFlightid();
         Date d1 =flightList.get(r).getDepartdate();
         Date d2 =flightList.get(r).getReturndate();
         Date t1 = flightList.get(r).getBtime();
         String a1 = flightList.get(r).getAirport1();
          String a2 = flightList.get(r).getAirport2();
          String coun1 = flightList.get(r).getCountry1();
          String coun2 = flightList.get(r).getCountry2();
          int ter = flightList.get(r).getTerminal();
          
          jLabel69.setText(Integer.toString(f));
          DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
          DateFormat dateFormat1 = new SimpleDateFormat("hh:mm:ss");
          jLabel74.setText( dateFormat.format(d1));
          jLabel76.setText(dateFormat.format(d2));
          
          jLabel57.setText(a1);
          jLabel59.setText(a2);
          jLabel43.setText(coun1);
          jLabel56.setText(coun2);
          jLabel62.setText(dateFormat1.format(t1));
          jLabel63.setText(Integer.toString(ter));
          jLabel72.setText(jTextField2.getText());
          jLabel67.setText(sid1.toString());
          jLabel66.setText(sname1.toString());
          
          
          Properties props = new Properties();

        props.put("mail.smtp.host", "true");

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.port", "587");

        props.put("mail.smtp.auth", "true");

        //Establishing a session with required user details

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("hasiyadahanayake@gmail.com", "hasiya9898@dushyantha");

            }

        });

        try {

            //Creating a Message object to set the email content

            MimeMessage msg = new MimeMessage(session);

            //Storing the comma seperated values to email addresses

            String to = "hasiyadahanayake@gmail.com,hasindudahanayake1998@gmail.com";
             //String to = email;
            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email

            addresses in an array of InternetAddress objects*/

            InternetAddress[] address = InternetAddress.parse(to, true);

            //Setting the recepients from the address variable

            msg.setRecipients(Message.RecipientType.TO, address);

            //String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());

            msg.setSubject("AIR ASIA PAYMENT CONFIRMATION" + timeStamp);

            msg.setSentDate(new Date());
            String s1 = "Hasindu";
            String s2 ="Dahanaykae";
            

            msg.setText("                                  " + "PAYMENT RECEIPT AIRASIA" + "                               "+"\n"+"\n"+"\n" +"Customer Name:  " +jTextField7.getText() +"\t\t\t   " +"CustomerID:  " +cid1 +"\n\n"+"PaymentID:     " +payid+"\t" +"Payment Value      "+jTextField6.getText()
            );
          

            msg.setHeader("XPriority", "1");

            Transport.send(msg);

            System.out.println("Mail has been sent successfully");

        } catch (MessagingException mex) {

            System.out.println("Unable to send an email" + mex);

        }
        viewPanel("card45");
        String timeStamp1 = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("PassangerInfo.txt",true);
            fw.write( "Date:"  +timeStamp1 + "\t" +"Passanger Name:"+jTextField2.getText()+"\t"+"Flight ID: " +Integer.toString(f) +"\t" +"Seat ID "+sid1.toString()+"\t"+"Seat Name: "+sname1.toString() +"\n"  );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
       }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write("Date:"  +timeStamp + "\t" +"Searched selected seats"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }       
        Object sid;
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        
       int rownumber = jTable1.getSelectedRow();
        System.out.println("row number" + rownumber);
       if( row1 < 0){
          JOptionPane.showMessageDialog(rootPane, "Please select a table row to continue!","Error!", 2);
       }       if(row1>=0){
       sid = model2.getValueAt(rownumber,0);
       sid1 = sid;
       sname1 = model2.getValueAt(rownumber,1);
       adultPrice1 = model2.getValueAt(rownumber,3);
       childPrice1 =model2.getValueAt(rownumber,4);
       if(jRadioButton6.isSelected()){
           jTextField6.setText(adultPrice1.toString());
       }
       if(jRadioButton7.isSelected()){
           jTextField6.setText(childPrice1.toString());
       }
       //sname1 = model2.getValueAt(rownumber,1);
       viewPanel("card6");
       }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
       DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        
       int rownumber = jTable2.getSelectedRow();
       row1 = rownumber;
       
    }//GEN-LAST:event_jTable2MousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       int rownum = jTable1.getSelectedRow();
       row2 = rownum;
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"clicked continue button on passanger pass page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        Properties props = new Properties();

        props.put("mail.smtp.host", "true");

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.port", "587");

        props.put("mail.smtp.auth", "true");

        //Establishing a session with required user details

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("hasiyadahanayake@gmail.com", "hasiya9898@dushyantha");

            }

        });

        try {

            //Creating a Message object to set the email content

            MimeMessage msg = new MimeMessage(session);

            //Storing the comma seperated values to email addresses

            String to = "hasiyadahanayake@gmail.com,hasindudahanayake1998@gmail.com";

            /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email

            addresses in an array of InternetAddress objects*/

            InternetAddress[] address = InternetAddress.parse(to, true);

            //Setting the recepients from the address variable

            msg.setRecipients(Message.RecipientType.TO, address);

            //String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());

            msg.setSubject("AIR ASIA PASSANGER PASS" + timeStamp);

            msg.setSentDate(new Date());
            String s1 = "Hasindu";
            String s2 ="Dahanaykae";
            

            msg.setText("                                  " + "PASSANGER PASS AIR ASIA" + "                               "+"\n"+"\n"+"\n" +"FlightID  " +jLabel69.getText() +"\t\t\t   " +"Passanger Name  " +jLabel72.getText() +"\n\n"+"From     " +jLabel43.getText()+"\t" +"To      "
            +jLabel56.getText()+"\n\n" +"Depart airport  " +jLabel57.getText()+"\t" +"Return Airport  " +jLabel59.getText()+"\n\n"+"Depart Date   "+jLabel74.getText()+"\t" +"Return Date  "+jLabel76.getText()+"\n\n"+"Board Time  "+jLabel62.getText()+"\t\t\t" +"Terminal  "+jLabel63.getText()+"\n\n"+"SeatName  "+jLabel66.getText()+"\t\t\t\t"+"SeatID  "+jLabel67.getText() );
          

            msg.setHeader("XPriority", "1");

            Transport.send(msg);

            System.out.println("Mail has been sent successfully");

        } catch (MessagingException mex) {

            System.out.println("Unable to send an email" + mex);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"clicked home button on Passanger pass page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        flightList.clear();
                     tmodel3.setRowCount(0);
                     jComboBox3.setSelectedItem("Select");
                     jComboBox4.setSelectedItem("Select");
                     jDateChooser1.setDate(null);
                     jDateChooser2.setDate(null);
                     buttonGroup1.clearSelection();
                     jRadioButton6.setSelected(false);
                     jRadioButton7.setSelected(false);
                     buttonGroup2.clearSelection();
                     jRadioButton1.setSelected(false);
                     jRadioButton5.setSelected(false);
                     jRadioButton2.setSelected(false);
                      jLabel26.setVisible(false);
                      jLabel27.setVisible(false);
                        jLabel28.setVisible(false);
                        jLabel36.setVisible(false);
                        jLabel37.setVisible(false);
                        jLabel47.setVisible(false);
                        jTextField2.setText(null);
                        jTextField3.setText(null);
                        jTextField4.setText(null);
                        jTextField9.setText(null);
                        jTextField7.setText(null);
                        jTextField8.setText(null);
                        jComboBox1.setSelectedItem("Select");
                        jTextField6.setText(null);
                        buttonGroup3.clearSelection();
                        jRadioButton8.setSelected(false);
                        jRadioButton9.setSelected(false);
                        jLabel52.setVisible(false);
                      //model2.setRowCount(0);
                     viewPanel("card3");
                     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"Clicked back button on flight list page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        flightList.clear();
        jComboBox3.setSelectedItem("Select");
                     jComboBox4.setSelectedItem("Select");
                     jDateChooser1.setDate(null);
                     jDateChooser2.setDate(null);
                     buttonGroup1.clearSelection();
                     jRadioButton6.setSelected(false);
                     jRadioButton7.setSelected(false);
                     buttonGroup2.clearSelection();
                     jRadioButton1.setSelected(false);
                     jRadioButton5.setSelected(false);
                     jRadioButton2.setSelected(false);
                      jLabel26.setVisible(false);
                      jLabel27.setVisible(false);
                        jLabel28.setVisible(false);
                        jLabel36.setVisible(false);
                        jLabel37.setVisible(false);
                        jLabel47.setVisible(false);
                        viewPanel("card3");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"Clicked back button on seats page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        tmodel3.setRowCount(0);
        viewPanel("card4");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"Clicked back button on Payment details page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        jTextField2.setText(null);
                        jTextField3.setText(null);
                        jTextField4.setText(null);
                        jTextField9.setText(null);
                        jTextField7.setText(null);
                        jTextField8.setText(null);
                        jComboBox1.setSelectedItem("Select");
                        jTextField6.setText(null);
                        buttonGroup3.clearSelection();
                        jRadioButton8.setSelected(false);
                        jRadioButton9.setSelected(false);
                        jLabel52.setVisible(false);
                        viewPanel("card5");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
         new NewJFrame1().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         dispose();
         new NewJFrame1().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"LOGOUT"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        dispose();
         new NewJFrame1().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         dispose();
         new NewJFrame1().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         dispose();
         new NewJFrame1().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String timeStamp = new SimpleDateFormat("yyy-MM-dd HH:MM:ss").format(Calendar.getInstance().getTime());
          try{
            FileWriter fw = new FileWriter("LoginInfo.txt",true);
            fw.write( "Date:"  +timeStamp + "\t" +"clicked view char on seats page"+ "\n" );
              System.out.println("Successfull");
              fw.close();
          }
          catch(Exception e){
              
          }
        new NewJFrame6().setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       if(jRadioButton4.isSelected() && !(jRadioButton3.isSelected())){
           Query q = JavaApplication27PUEntityManager.
                    createQuery("SELECT f FROM Flight f WHERE f.airport1 like :aname AND f.country1 like :c1 AND f.country2 like :c2 AND f.departdate = :d1 AND f.returndate = :d2");
            q.setParameter("aname", "%" + jTextField1.getText() + "%");
             q.setParameter("c1", "%" + jComboBox3.getSelectedItem() + "%");
                q.setParameter("c2", "%" + jComboBox4.getSelectedItem() + "%");
                 q.setParameter("d1",jDateChooser1.getDate(),TemporalType.TIMESTAMP);
                 q.setParameter("d2",jDateChooser2.getDate(),TemporalType.TIMESTAMP);
            
            flightList.clear();
            flightList = q.getResultList();
            refreshTable1(flightList);
       }
       else if(jRadioButton10.isSelected()&& !(jRadioButton3.isSelected())){
            Query q = JavaApplication27PUEntityManager.
                    createQuery("SELECT f FROM Flight f WHERE f.airport2 like :aname AND f.country1 like :c1 AND f.country2 like :c2 AND f.departdate = :d1 AND f.returndate = :d2");
            q.setParameter("aname", "%" + jTextField1.getText() + "%");
             q.setParameter("c1", "%" + jComboBox3.getSelectedItem() + "%");
                q.setParameter("c2", "%" + jComboBox4.getSelectedItem() + "%");
                 q.setParameter("d1",jDateChooser1.getDate(),TemporalType.TIMESTAMP);
                 q.setParameter("d2",jDateChooser2.getDate(),TemporalType.TIMESTAMP);
            
            flightList.clear();
            flightList = q.getResultList();
            refreshTable1(flightList);
       }
       else{
           JOptionPane.showMessageDialog(rootPane, "Select a Area to search",
                    "Error!!", 2);
       }
       
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager JavaApplication27PUEntityManager;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private java.util.List<javaapplication27.entity.Flight> flightList;
    private java.util.List<javaapplication27.entity.Flight> flightList1;
    private javax.persistence.Query flightQuery;
    private javax.persistence.Query flightQuery1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    public javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
