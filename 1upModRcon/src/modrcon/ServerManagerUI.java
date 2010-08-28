/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ServerManagerUI.java
 *
 * Created on Aug 15, 2010, 8:34:18 PM
 */

package modrcon;

import javax.swing.table.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Pyrite
 */
public class ServerManagerUI extends JFrame {

    protected MainUI parent;

    /** Creates new form ServerManagerUI */
    public ServerManagerUI(MainUI owner) {
        this.parent = owner;
        initComponents();
        this.readFile();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new GradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serversTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddServer = new javax.swing.JLabel();
        btnRemoveServer = new javax.swing.JLabel();
        btnEditServer = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("1up ModRcon - Manage Servers");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modrcon/resources/1upModRconLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Server List"));

        serversTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Server Name", "IP", "Port", "Mod Password", "Rcon Password"
            }
        ));
        jScrollPane1.setViewportView(serversTable);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modrcon/resources/about.png"))); // NOI18N
        jLabel1.setText("Key Assignments");
        jLabel1.setToolTipText("Tab (Move to the next cell in the grid)\n\nEsc (Undo changes to a cell while editing)");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAddServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modrcon/resources/add.png"))); // NOI18N
        btnAddServer.setToolTipText("Add a new row/server to the list.");
        btnAddServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddServerMouseClicked(evt);
            }
        });

        btnRemoveServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modrcon/resources/del.png"))); // NOI18N
        btnRemoveServer.setToolTipText("Remove selected row/server from the list.");
        btnRemoveServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveServerMouseClicked(evt);
            }
        });

        btnEditServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modrcon/resources/files_edit.png"))); // NOI18N
        btnEditServer.setToolTipText("Edit selected cell");
        btnEditServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditServerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                        .addComponent(btnAddServer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditServer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveServer)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnAddServer)
                    .addComponent(btnEditServer)
                    .addComponent(btnRemoveServer))
                .addContainerGap())
        );

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Note: Changes are only saved to the database after clicking the Save button.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSave)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        TableModel tm = this.serversTable.getModel();
        int numRows = tm.getRowCount();
        String contents = "<servers>\r\n";
        for (int i = 0; i < numRows; i++) {
            contents += "\t<server>\r\n";

            String name = (String)tm.getValueAt(i, 0);
            if (name == null) name = "";
            contents += "\t\t<name>"+name+"</name>\r\n";

            String ip = (String)tm.getValueAt(i, 1);
            if (ip == null) ip = "";
            contents += "\t\t<ip>"+ip+"</ip>\r\n";
            
            String port = (String)tm.getValueAt(i, 2);
            if (port == null) port = "";
            contents += "\t\t<port>"+port+"</port>\r\n";
            
            String modpass = (String)tm.getValueAt(i, 3);
            if (modpass == null) modpass = "";
            contents += "\t\t<modpass>"+modpass+"</modpass>\r\n";
            
            String rconpass = (String)tm.getValueAt(i, 4);
            if (rconpass == null) rconpass = "";
            contents += "\t\t<rconpass>"+rconpass+"</rconpass>\r\n";

            contents += "\t</server>\r\n";
        }
        contents += "</servers>\r\n";

        //System.out.print(contents);
        this.writeFile(contents);
        this.parent.refreshServerCombo();
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServerMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel)this.serversTable.getModel();
        tm.addRow(new Server().toArray());

    }//GEN-LAST:event_btnAddServerMouseClicked

    private void btnRemoveServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveServerMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel)this.serversTable.getModel();
        int row = this.serversTable.getSelectedRow();
        if (row != -1) {
            tm.removeRow(row);
        }
    }//GEN-LAST:event_btnRemoveServerMouseClicked

    private void btnEditServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditServerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditServerMouseClicked

    private void writeFile(String contents) {
        try {
            // Will put the file where the 1upmodrcon.properties file exists.
            // Will also create the file if it does not exist!
            FileOutputStream fos = new FileOutputStream("servers.xml");
            OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
            out.write(contents);
            out.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void readFile() {
        DefaultTableModel dm = (DefaultTableModel)this.serversTable.getModel();

        // Clear any Rows that may be there by default.
        dm.getDataVector().removeAllElements();

        // Bring in Servers from servers.xml
        ServerParser sp = new ServerParser();
        List servers = sp.getServers();
        for (int i=0; i < servers.size(); i++) {
            dm.addRow(((Server)servers.get(i)).toArray());
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddServer;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel btnEditServer;
    private javax.swing.JLabel btnRemoveServer;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable serversTable;
    // End of variables declaration//GEN-END:variables

}
