/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailwayReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Addtrain extends javax.swing.JFrame {

   
    public Addtrain()  {
        initComponents();
        Connect();
        Train_Details();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet r;
    
    
    public void Connect() 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/RAILWAY","root","root" );
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Train_Details()
    {
        try {
            ps=con.prepareStatement("select * from details");
            r=ps.executeQuery();
            
            ResultSetMetaData rad=r.getMetaData();
            int c;
            c =rad.getColumnCount();
            DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(r.next())
            {
                Vector v= new Vector();
                for(int i=0; i<=c; i++)
                {
                    v.add(r.getString("tno"));
                    v.add(r.getString("tname"));
                    v.add(r.getString("tstart"));
                    v.add(r.getString("tdestination"));
                    v.add(r.getString("tprice"));
                }
                d.addRow(v);
                
            }
            }
        catch (SQLException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tstart = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tdestination = new javax.swing.JTextField();
        tprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Train No.");

        tno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoActionPerformed(evt);
            }
        });

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Strart");

        jLabel3.setText("Train Name");

        jLabel4.setText("Destination");

        jLabel5.setText("Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tstart, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Train");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train No.", "Train Name", "Start", "Desitanation", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Add Train");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String TrainNO = tno.getText();
        String Tname = tname.getText();
        String Start = tstart.getText();
        String Des = tdestination.getText();
        String Price = tprice.getText();
        
        try {
            ps=con.prepareStatement("insert into details(tno,tname,tstart,tdestination,tprice) values(?,?,?,?,?)");
            ps.setString( 1, TrainNO);
            ps.setString( 2, Tname);
            ps.setString( 3, Start);
            ps.setString( 4, Des);
            ps.setString( 5, Price);
            int k=ps.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Record Added..");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Record Failed..");
            }
            tno.setText("");
            tname.setText("");
            tstart.setText("");
            tdestination.setText("");
            tprice.setText("");
            tno.requestFocus();
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String TrainNO = tno.getText();
        String Tname = tname.getText();
        String Start = tstart.getText();
        String Des = tdestination.getText();
        String Price = tprice.getText();
        
        try {
            ps=con.prepareStatement("update details set tname = ?, tstart= ?, tdestination= ?, tprice= ? where tno= ?   ");
           
            ps.setString( 1, Tname);
            ps.setString( 2, Start);
            ps.setString( 3, Des);
            ps.setString( 4, Price);
            ps.setString( 5, TrainNO);
            int k=ps.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Record Updated..");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Record Failed..");
            }
            tno.setText("");
            tname.setText("");
            tstart.setText("");
            tdestination.setText("");
            tprice.setText("");
            tno.requestFocus();
            jButton3.setEnabled(true);
            Train_Details();
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         String TrainNO = tno.getText();
        try {
            ps=con.prepareStatement("delete from details where tno= ?   ");
            
            ps.setString(1, TrainNO);
            int k=ps.executeUpdate(); 
            if(k==1)
            {
                JOptionPane.showMessageDialog(this,"Record Deleted..");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Record Failed..");
            }
            tno.setText("");
            tname.setText("");
            tstart.setText("");
            tdestination.setText("");
            tprice.setText("");
            tno.requestFocus();
            jButton3.setEnabled(false);
            Train_Details();
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Addtrain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    private void tnoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
    }                                   

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
        int selectindex = jTable1.getSelectedRow();
        
        
        tno.setText(d.getValueAt(selectindex,0).toString());
        tname.setText(d.getValueAt(selectindex,1).toString());
        tstart.setText(d.getValueAt(selectindex,2).toString());
        tdestination.setText(d.getValueAt(selectindex,3).toString());
        tprice.setText(d.getValueAt(selectindex,4).toString());
        
        jButton3.setEnabled(true);
        
    }                                    

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        jButton3.setEnabled(true);
        Train_Details(); 
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addtrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tdestination;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tstart;
    // End of variables declaration                   
}
