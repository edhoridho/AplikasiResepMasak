/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuUtamaFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtamaFrame
     */
    
    public MenuUtamaFrame() {
        initComponents();
    // Inisialisasi aksi untuk tombol-tombol
    initActions();

    // Load data resep dari database ke tabel
    loadResepToTable();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnCariOnline = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResep = new javax.swing.JTable();
        btnCetakSemua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("~ MY RECIPE ~");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        btnTambah.setText("Tambah");

        btnUbah.setText("Ubah");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnDetail.setText("Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnCariOnline.setText("Cari Online");

        btnCetak.setText("Cetak");

        tblResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Resep", "Bahan", "Langkah"
            }
        ));
        jScrollPane1.setViewportView(tblResep);

        btnCetakSemua.setText("Cetak Semua");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCetak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUbah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(41, 41, 41))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCariOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCetakSemua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetakSemua)
                        .addGap(5, 5, 5)
                        .addComponent(btnCariOnline))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtamaFrame().setVisible(true);
            }
        });
    }
    
// Memuat data dari database ke tabel
private void loadResepToTable() {
    DefaultTableModel model = (DefaultTableModel) tblResep.getModel();
    model.setRowCount(0); // Menghapus semua baris sebelum memuat ulang

    DatabaseHandler dbHandler = new DatabaseHandler();
    for (Recipe recipe : dbHandler.getAllRecipes()) {
        model.addRow(new Object[]{recipe.getName(), recipe.getIngredients(), recipe.getSteps()});
    }
}

// Mengatur aksi untuk setiap tombol
private void initActions() {
    // Aksi tombol Tambah
    btnTambah.addActionListener(e -> {
        new InputResepFrame().setVisible(true); // Buka form input
        dispose(); // Tutup Menu Utama
    });

    // Aksi tombol Ubah
    btnUbah.addActionListener(e -> {
        int selectedRow = tblResep.getSelectedRow();
        if (selectedRow >= 0) {
            String namaResep = tblResep.getValueAt(selectedRow, 0).toString();
            String bahan = tblResep.getValueAt(selectedRow, 1).toString();
            String langkah = tblResep.getValueAt(selectedRow, 2).toString();

            Recipe recipe = new Recipe(0, namaResep, bahan, langkah, null);
            new InputResepFrame(recipe).setVisible(true); // Buka form input dengan data
            dispose(); // Tutup Menu Utama
        } else {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diubah!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    });

    // Aksi tombol Hapus
    btnHapus.addActionListener(e -> {
        int selectedRow = tblResep.getSelectedRow();
        if (selectedRow >= 0) {
            String namaResep = tblResep.getValueAt(selectedRow, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus resep \"" + namaResep + "\"?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DatabaseHandler dbHandler = new DatabaseHandler();
                dbHandler.deleteRecipe(selectedRow + 1); // Anggap ID sama dengan row index + 1
                loadResepToTable(); // Refresh tabel
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dihapus!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    });

    // Aksi tombol Detail
    btnDetail.addActionListener(e -> {
        int selectedRow = tblResep.getSelectedRow();
        if (selectedRow >= 0) {
            String namaResep = tblResep.getValueAt(selectedRow, 0).toString();
            String bahan = tblResep.getValueAt(selectedRow, 1).toString();
            String langkah = tblResep.getValueAt(selectedRow, 2).toString();

            Recipe recipe = new Recipe(0, namaResep, bahan, langkah, null);
            new DetailResepFrame(recipe).setVisible(true); // Buka frame detail
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dilihat detailnya!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    });

    // Aksi tombol Cetak
    btnCetak.addActionListener(e -> {
        int selectedRow = tblResep.getSelectedRow();
        if (selectedRow >= 0) {
            String namaResep = tblResep.getValueAt(selectedRow, 0).toString();
            String bahan = tblResep.getValueAt(selectedRow, 1).toString();
            String langkah = tblResep.getValueAt(selectedRow, 2).toString();

            String dataResep = "Nama Resep: " + namaResep + "\nBahan:\n" + bahan + "\nLangkah:\n" + langkah;
            CetakPDF.cetakResep(dataResep);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dicetak!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    });

    // Aksi tombol Cetak Semua
    btnCetakSemua.addActionListener(e -> {
        StringBuilder dataSemuaResep = new StringBuilder();
        DefaultTableModel model = (DefaultTableModel) tblResep.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            dataSemuaResep.append("Nama Resep: ").append(model.getValueAt(i, 0).toString()).append("\n")
                    .append("Bahan:\n").append(model.getValueAt(i, 1).toString()).append("\n")
                    .append("Langkah:\n").append(model.getValueAt(i, 2).toString()).append("\n\n");
        }
        CetakPDF.cetakSemuaResep(dataSemuaResep.toString());
    });

    // Aksi tombol Cari Online
    btnCariOnline.addActionListener(e -> {
        new CariResepOnlineFrame().setVisible(true); // Buka frame cari online
        dispose();
    });
}

//method untuk update tabel
//private void refreshTable() {
  //  DatabaseHandler dbHandler = new DatabaseHandler();
    //List<Recipe> recipes = dbHandler.getAllRecipes();

    // Bersihkan tabel sebelum mengisi ulang
    //DefaultTableModel model = (DefaultTableModel) tblResep.getModel();
   // model.setRowCount(0);

    // Tambahkan data baru ke tabel
    //for (Recipe recipe : recipes) {
    //    model.addRow(new Object[]{recipe.getName(), recipe.getIngredients(), recipe.getSteps()});
   // }
//}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariOnline;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnCetakSemua;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResep;
    // End of variables declaration//GEN-END:variables
}
