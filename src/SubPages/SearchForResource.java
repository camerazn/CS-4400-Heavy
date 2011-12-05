/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchForResource.java
 *
 * Created on Nov 30, 2011, 7:16:02 PM
 */
package SubPages;

import org.jdesktop.application.Action;
import java.sql.*;
import java.util.*;

/**
 *
 * @author roly_rf
 */
public class SearchForResource extends javax.swing.JFrame {
    Connection conn = null;
    String username = null;
//    ArrayList MyEsfList = new ArrayList();
//    ArrayList MyIncidentList = new ArrayList();

    /** Creates new form SearchForResource */
    public SearchForResource(String username, Connection conn) {
        initComponents();
        this.conn = conn;
        this.username = username;
        
        
        // We need to Run this query properly to populate the list for combobox
        //MyEsfList = runQuery("Select Name, Description From ESF");
        //MyIncidentList = runQuery("SELECT Incident_id, description" From incident)
        populateComboBox();
        populateComboBox2();
        initComponents();
     
    }
    
        public SearchForResource() {
        
        initComponents();
     
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(emergencymanagementapp.EmergencyManagementApp.class).getContext().getResourceMap(SearchForResource.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(emergencymanagementapp.EmergencyManagementApp.class).getContext().getActionMap(SearchForResource.class, this);
        jComboBox1.setAction(actionMap.get("populateComboBox")); // NOI18N
        jComboBox1.setName("jComboBox1"); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setAction(actionMap.get("populateComboBox2")); // NOI18N
        jComboBox2.setName("jComboBox2"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jButton1.setAction(actionMap.get("cancel")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("searchFor")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(63, 63, 63)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel4)
                        .add(jLabel2)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(51, 51, 51)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jComboBox1, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jComboBox2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jTextField1)))
                    .add(layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .add(jButton1)
                .add(18, 18, 18)
                .add(jButton2)
                .add(52, 52, 52))
            .add(layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 303, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(jLabel1)
                .add(27, 27, 27)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SearchForResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchForResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchForResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchForResource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchForResource().setVisible(true);
            }
        });
    }

    @Action
    public void cancel() {
        setVisible(false);
    }

    @Action
    public void searchFor() {
        
        comboitem selectedEsf = (comboitem)jComboBox1.getSelectedItem();
        int selectedEsfNum = selectedEsf.getNumber();
        
        comboitem selectedInc = (comboitem)jComboBox2.getSelectedItem();
        int selectedIncNum = selectedInc.getNumber();
        
        ArrayList<Integer> resources = new ArrayList();

        
        String keyWordField = jTextField1.getText();
        int distanceVar = Integer.parseInt(jTextField2.getText());
        
        
        String query = "SELECT res.RESOURCEID FROM ";
        query += "(RESOURCE as res ";
        query += "JOIN SECONDARY_ESF as esf ON res.RESOURCE_ID = esf.RESOURCE_ID) ";
        query += "JOIN RESOURCE_CAPABILITIES as cap ON res.RESOURCE_ID = cap.RESOURCE_ID ";
        query += "WHERE ";
        
        
        //assembling WHERE clause below
        
        if (!keyWordField.equals("")){
            //Add the keyword to the WHERE clause
            query += "res.NAME LIKE '%" + keyWordField + "%' OR ";
            query += "res.model LIKE '%" + keyWordField + "%' OR ";
            query += "cap.CAPABILITY LIKE '%" + keyWordField + "%' AND";
        }
        
        if (selectedEsfNum != 0){
            query += "res.PRIMARY_ESF = " + selectedEsfNum + " OR ";
            query += "esf.NUMBER = " + selectedEsfNum + " AND ";
        }
        
        query += "TRUE;";
        
        
    
        
        
        
        ResultSet rs = null;
                
        SearchResultsFrame sf = new SearchResultsFrame(username, conn, rs);
        sf.setVisible(true);

        
        try{
            Statement st = conn.createStatement();
            rs = st.executeQuery(query); //resultset rs will contain 1 if the username+pass is valid

            
            if(true) // IF the distance entered is "", don't do this. Writeme
            {
            rs.beforeFirst();
            while (rs.next()){
                int thisresourcenumber = rs.getInt(1);
                
                String askForResourceLoc = "SELECT LATITUDE, LONGITUDE from RESOURCE where RESOURCE_ID = " + thisresourcenumber;
                ResultSet distance = st.executeQuery(askForResourceLoc);
                

            }
            }
            
        }
        catch(SQLException s){
            s.printStackTrace(); // this is lazy. --chris
        }
        
        
    }

    @Action
    public void populateComboBox() {
        
        
        String query = "SELECT DISTINCT NAME, DESCRIPTION FROM ESF";
        ResultSet rs = null;
        
        jComboBox1.addItem(new comboitem(0,"No selection"));
        
        try{
            Statement st = conn.createStatement();
            rs = st.executeQuery(query); //resultset rs will contain 1 if the username+pass is valid
            
            
            rs.beforeFirst();
            
            while(rs.next()){
             
                jComboBox1.addItem(new comboitem (rs.getInt(1) , rs.getString(2)));
            }

        }
        catch(SQLException s){
            s.printStackTrace(); // this is lazy. --chris
        }
        

        
        //jComboBox1.getSelectedItem();
    }

    @Action
    public void populateComboBox2() {
        
        
        String query = "SELECT DISTINCT INCIDENT_ID, DESCRIPTION FROM INCIDENT;";
        ResultSet rs = null;
        
        jComboBox1.addItem(new comboitem(0,"No selection"));
        
        try{
            Statement st = conn.createStatement();
            rs = st.executeQuery(query); //resultset rs will contain 1 if the username+pass is valid
            
            
            rs.beforeFirst();
            
            while(rs.next()){
             
                jComboBox2.addItem(new comboitem (rs.getInt(1) , rs.getString(2)));
            }

        }
        catch(SQLException s){
            s.printStackTrace(); // this is lazy. --chris
        }
        
        
    } 
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}


class comboitem{
    
    public int number;
    public String description;
    
    public comboitem (int number, String description){
            this.number = number;
            this.description = description;
            
        
    }
    
    public String toString(){
        return ""+ number + " -- " + description;
    }
    
    public int getNumber(){
        return number;
    }
    
}