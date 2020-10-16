package aplikasicrud;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUD extends javax.swing.JFrame {
    DefaultTableModel model;
    public CRUD() {
        initComponents();
        Dimension lcd = Toolkit.getDefaultToolkit().getScreenSize();// mengambil ukuran layar
        int x = lcd.width / 2  - this.getSize().width / 2; // membuat titik x dan y
        int y = lcd.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
        String []judul = {"ID", "USERNAME", "NAMA", "ALAMAT", "PEKERJAAN"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        tampilkan();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textAlamat = new javax.swing.JTextField();
        textPekerjaan = new javax.swing.JTextField();
        buttonTambah = new javax.swing.JButton();
        buttonGanti = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        textCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonReset = new javax.swing.JButton();
        textUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        buttonKeluar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PROGRAM CRUD");

        jLabel2.setText("ID");

        jLabel4.setText("USERNAME");

        jLabel5.setText("ALAMAT");

        jLabel6.setText("PEKERJAAN");

        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonGanti.setText("GANTI");
        buttonGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGantiActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonCari.setText("CARI");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonReset.setText("RESET");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        jLabel7.setText("NAMA");

        jLabel8.setText("PASSWORD");

        buttonKeluar.setText("KELUAR");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(439, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonTambah)
                        .addGap(38, 38, 38)
                        .addComponent(buttonGanti)
                        .addGap(51, 51, 51)
                        .addComponent(buttonHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textId, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(textUsername))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(textAlamat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textPekerjaan, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(textPassword))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonKeluar)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(textPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonGanti)
                    .addComponent(buttonHapus)
                    .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari)
                    .addComponent(buttonReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buttonKeluar)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection on = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud");
            on.createStatement().executeUpdate("insert into crud_tabel values "+" ('"+textId.getText()+"', '"+textUsername.getText()+"', '"+textNama.getText()+"', '"+textAlamat.getText()+"', '"+textPekerjaan.getText()+"', '"+textPassword.getText()+"')");
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "PEMBERITAHUAN", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.print("GAGAL KONEKSI");
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGantiActionPerformed
        // TODO add your handling code here:

        try {
            Connection on = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud");
            on.createStatement().executeUpdate("update crud_tabel set nama='"+textNama.getText()+"', username='"+textUsername.getText()+"' , alamat='"+textAlamat.getText()+"', pekerjaan='"+textPekerjaan.getText()+"' where id='"+textId.getText()+"'");
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dirubah", "PEMBERITAHUAN", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonGantiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if (i > -1){
            textId.setText(model.getValueAt(i, 0).toString());
            textUsername.setText(model.getValueAt(i, 1).toString());
            textNama.setText(model.getValueAt(i, 2).toString());
            textAlamat.setText(model.getValueAt(i, 3).toString());
            textPekerjaan.setText(model.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection on = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud");
            on.createStatement().executeUpdate("delete from crud_tabel where id='"+textId.getText()+"'");
            tampilkan();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "PEMBERITAHUAN", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getRowCount();
        for(int a = 0; a<row; a++){
            model.removeRow(0);
        }
        try {
            Connection on = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud");
            ResultSet rs = on.createStatement().executeQuery("SELECT * FROM crud_tabel WHERE id='"+textCari.getText()+"' ");
            while (rs.next()){
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.print("GAGAL KONEKSI");
        }
        reset();
    }//GEN-LAST:event_buttonCariActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        reset();
        tampilkan();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }
    private void tampilkan() {
        int row = jTable1.getRowCount();
        for(int a = 0; a<row; a++){
            model.removeRow(0);
        }
        try {
            Connection on = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud");
            ResultSet rs = on.createStatement().executeQuery("SELECT * FROM crud_tabel");
            while (rs.next()){
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.print("GAGAL KONEKSI");
        }    
    }
    private void reset(){
        textId.setText("");
        textNama.setText("");
        textAlamat.setText("");
        textPekerjaan.setText("");
        textCari.setText("");
        textUsername.setText("");
        textPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonGanti;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNama;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textPekerjaan;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
