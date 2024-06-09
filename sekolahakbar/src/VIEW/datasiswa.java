/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

 /*
 * @author DELL
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.print.DocFlavor;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;



public class datasiswa extends javax.swing.JFrame {

    private DefaultTableModel table;
    private ResultSet RsSiswa = null;

public datasiswa() {
    initComponents();
    // Initialize other components or perform additional setup here
    Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    
    if (frameSize.height > screenSize.height) {
        frameSize.height = screenSize.height;
    }
    
    if (frameSize.width > screenSize.width) {
        frameSize.width = screenSize.width;
    }
    
    // Corrected assignment on the next line
    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 20);

    // Fungsi Tampil data dan set edit off dijalankan saat aplikasi dijalankan
    tampilData();
    SetEditOff();
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nis = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jurusan = new javax.swing.JLabel();
        lamat = new javax.swing.JLabel();
        nohp = new javax.swing.JLabel();
        txt_nisn = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        combo_box = new javax.swing.JComboBox<>();
        txt_alamat = new javax.swing.JTextField();
        txt_nohp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_ubah = new javax.swing.JButton();
        btn_baru = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_bersih = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("FORM SISWA");

        nis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nis.setText("NISN");

        nama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nama.setText("Nama");

        jurusan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jurusan.setText("Jurusan");

        lamat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lamat.setText("Alamat");

        nohp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nohp.setText("No.HP");

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+++PILIHAN+++", "RPL", "TKJ", "DKV", "BDP", "OTKP", "UPW", "TBG" }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NISN", "Nama", "Jurusan", "Alamat", "No.HP"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_baru.setText("Baru");

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_bersih.setText("Bersih");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_simpan)
                    .addComponent(btn_bersih)
                    .addComponent(btn_ubah)
                    .addComponent(btn_baru)
                    .addComponent(btn_hapus))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_simpan)
                .addGap(12, 12, 12)
                .addComponent(btn_ubah)
                .addGap(12, 12, 12)
                .addComponent(btn_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bersih)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jurusan)
                                    .addComponent(lamat)
                                    .addComponent(nohp))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nis)
                                    .addComponent(nama))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nisn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(266, 266, 266)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nis)
                            .addComponent(txt_nisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jurusan)
                            .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lamat)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nohp)
                            .addComponent(txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
    String Nisn = txt_nisn.getText();
    String Nama = txt_nama.getText();
    String Jurusan = combo_box.getSelectedItem().toString();
    String Alamat = txt_alamat.getText();
    String Nohp = txt_nohp.getText();

    // Validasi input
    if (Nisn.isEmpty()) {
        JOptionPane.showMessageDialog(null, "NISN tidak boleh kosong");
        txt_nisn.requestFocus();
    } else if (Nama.isEmpty()){
        JOptionPane.showMessageDialog(null, "NAMA tidak boleh kosong");
        txt_nama.requestFocus();
    } else if (Jurusan.isEmpty()){
        JOptionPane.showMessageDialog(null, "Jurusan tidak boleh kosong");
        combo_box.requestFocus();
    } else if (Nohp.isEmpty()){
        JOptionPane.showMessageDialog(null, "NOMOR HANDPHONE tidak boleh kosong");
        txt_nohp.requestFocus();
    } else {
        try {
           Connection conn = (Connection) koneksi.koneksiDB();
           Statement stt = conn.createStatement();
            stt.executeUpdate("INSERT INTO tb_siswa(nisn, nama, jurusan, alamat, nohp) "
                + "VALUES('" + Nisn + "','" + Nama + "','" + Jurusan + "','" + Alamat + "','" + Nohp + "')");
            BersihData();
            tampilData();
            SetEditOff();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Simpan data gagal\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
    String Nisn = txt_nisn.getText();
    String Nama = txt_nama.getText();
    String Jurusan = combo_box.getSelectedItem().toString();
    String Alamat = txt_alamat.getText();
    String Nohp = txt_nohp.getText();
    
    if (Nisn.isEmpty()) {
        JOptionPane.showMessageDialog(null, "NISN tidak boleh kosong");
        txt_nisn.requestFocus();
    } else if (Nama.isEmpty()){
        JOptionPane.showMessageDialog(null, "NAMA tidak boleh kosong");
        txt_nama.requestFocus();
    } else if (Jurusan.isEmpty()){
        JOptionPane.showMessageDialog(null, "JURUSAN tidak boleh kosong");
        combo_box.requestFocus();
    } else if (Alamat.isEmpty()){
        JOptionPane.showMessageDialog(null, "ALAMAT tidak boleh kosong");
        txt_alamat.requestFocus();
    } else if (Nohp.isEmpty()){
        JOptionPane.showMessageDialog(null, "NO.HP tidak boleh kosong");
        txt_nohp.requestFocus();
    } else {
        try {
            Connection conn = (Connection) koneksi.koneksiDB();
            Statement stt = conn.createStatement();
            stt.executeUpdate("UPDATE tb_siswa SET Nama='" + Nama + "', jurusan='" + Jurusan
                    + "', alamat='" + Alamat + "', No_HP='" + Nohp + "' WHERE nisn='" + Nisn + "'");
            BersihData();
            tampilData();
            SetEditOff();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ubah data gagal\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String NISN = txt_nisn.getSelectedText();
        
        if (NISN.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NISN tidak boleh kosong");      
        } else if (JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan menghapus data ini?",
                "Informasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
            try {
                Connection conn = (Connection) koneksi.koneksiDB();
                Statement stt = conn.createStatement();
                stt.executeUpdate("DELETE FROM tb_siswa WHERE Nisn='" + NISN + "'");
                BersihData();
                tampilData();
                SetEditOff();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Delete gagal\n" + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    /**
     * @param  the command line arguments
     */
    public static void main(String args[] ) {
    /* Set the Nimbus look and feel */
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baru;
    private javax.swing.JButton btn_bersih;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel lamat;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nis;
    private javax.swing.JLabel nohp;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nisn;
    private javax.swing.JTextField txt_nohp;
    // End of variables declaration//GEN-END:variables


 private void tampilData() {
   // Change tabelModel to TABELKU
    try {
    Object[] judul_kolom = ("Nisn","Nama","Jurusan","Alamat","NoHP");

        tb_siswa = stt.executeQuery("SELECT * FROM tb_siswa"); // Fix typo in your SQL query ("FORM" to "FROM")
        while (RsSiswa.next()) {
            Object[] data = {
                    RsSiswa.getString("nisn"),
                    RsSiswa.getString("nama"),
                    RsSiswa.getString("jurusan"),
                    RsSiswa.getString("alamat"),
                    RsSiswa.getString("nohp")
            };
            table.addRow(data); // Change tabelModel to TABELKU
        }

        // Disable buttons after displaying data
        btn_simpan.setEnabled(false);
        btn_ubah.setEnabled(false);
        btn_bersih.setEnabled(false);
        btn_hapus.setEnabled(false);
    } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
}

    private void BersihData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SetEditOff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
