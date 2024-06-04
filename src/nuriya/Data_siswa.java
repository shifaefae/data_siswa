package nuriya;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.*;

public class Data_siswa extends javax.swing.JFrame {

    public Data_siswa() {
        initComponents();
        reset();
    }

    void reset() {
        tNis.setText("");
        tNama.setText("");
        tTempatLahir.setText("");
        tAlamat.setText("");
        vNis.setText("");

        vNama.setText("");
        vAlamat.setText("");
        vNis.setText("");
        vKelamin.setText("");
        vTtl.setText("");
        vFoto.setText("");
        vJurusan.setText("");

        Kelamin.clearSelection();
        tTanggalLahir.setCalendar(null);
        tJurusan.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelamin = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rPerempuan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNis = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        rPer = new javax.swing.JRadioButton();
        rLaki = new javax.swing.JRadioButton();
        tTempatLahir = new javax.swing.JTextField();
        tJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        bSimpan = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        pFoto = new javax.swing.JLabel();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();
        tFoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vNis = new javax.swing.JLabel();
        vNama = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTtl = new javax.swing.JLabel();
        vJurusan = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        vFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SISWA");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("NIS");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("TEMPAT LAHIR");

        jLabel6.setText("JURUSAN");

        jLabel7.setText("ALAMAT");

        Kelamin.add(rPer);
        rPer.setText("PEREMPUAN");

        Kelamin.add(rLaki);
        rLaki.setText("LAKI-LAKI");

        tJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "BAHASA", " " }));

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        jLabel8.setText("TANGGAL LAHIR");

        bSimpan.setBackground(new java.awt.Color(255, 51, 51));
        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(0, 102, 153));
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        pFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFoto.setText("FOTO");
        pFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pFoto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pFotoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFotoMouseClicked(evt);
            }
        });

        tFoto.setText("jLabel9");

        javax.swing.GroupLayout rPerempuanLayout = new javax.swing.GroupLayout(rPerempuan);
        rPerempuan.setLayout(rPerempuanLayout);
        rPerempuanLayout.setHorizontalGroup(
            rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rPerempuanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rPerempuanLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(rLaki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rPer))
                    .addGroup(rPerempuanLayout.createSequentialGroup()
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rPerempuanLayout.createSequentialGroup()
                                .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rPerempuanLayout.createSequentialGroup()
                                .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tTempatLahir)
                                    .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(tNis)
                                    .addComponent(tTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rPerempuanLayout.createSequentialGroup()
                                        .addComponent(bSimpan)
                                        .addGap(32, 32, 32)
                                        .addComponent(bReset))
                                    .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel8))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rPerempuanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tFoto)
                .addGap(76, 76, 76))
        );
        rPerempuanLayout.setVerticalGroup(
            rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rPerempuanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rPerempuanLayout.createSequentialGroup()
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rPer)
                            .addComponent(rLaki))
                        .addGap(18, 18, 18)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14))
                    .addGroup(rPerempuanLayout.createSequentialGroup()
                        .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rPerempuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSimpan)
                            .addComponent(bReset)))))
        );

        vNis.setText("jLabel9");

        vNama.setText("jLabel10");

        vKelamin.setText("jLabel11");

        vTtl.setText("jLabel12");

        vJurusan.setText("jLabel13");

        vAlamat.setText("jLabel14");

        vFoto.setText("jLabel15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vJurusan)
                            .addComponent(vTtl)
                            .addComponent(vNama))
                        .addContainerGap(620, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(vNis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vFoto)
                        .addGap(286, 286, 286))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(vKelamin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vAlamat)
                        .addGap(278, 278, 278))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vNis)
                    .addComponent(vFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vKelamin)
                    .addComponent(vAlamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vTtl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vJurusan)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pFotoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pFotoAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_pFotoAncestorAdded

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
        vNis.setText("Nis : "+tNis.getText());
        vNama.setText("Nama : "+tNama.getText());
        vJurusan.setText("Jurusan : "+tJurusan.getSelectedItem().toString());
        vAlamat.setText("Alamat : "+tAlamat.getText());
        if (rLaki.isSelected()){
            vKelamin.setText("Jenis kelamin : Laki-laki");
        }else if (rPer.isSelected()){
            vKelamin.setText("Jenis kelamin : Perempuan");
        }else{
            vKelamin.setText("Jenis kelamin : Tidak terdefinisi");
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String TglLahir = String .valueOf(sd.format(tTanggalLahir.getDate()));
        vTtl.setText("Tanggal lahir : "+tTempatLahir.getText()+","+TglLahir);
        String Filename;
        try {
            Filename = tFoto.getText();
            String filepath = "src/foto/";
            File folder = new File(filepath);
            if (!folder.exists()){
                folder.mkdir();
            }
            File sourceFile = null;
            File destFile = null;
            String ekstensi = Filename.substring(Filename.lastIndexOf('.')+1);
            sourceFile = new File(Filename);
            Date tglUpload = new Date();
            SimpleDateFormat fr = new SimpleDateFormat("yyyyMMddhhss");
            String tglBaru = String.valueOf(fr.format(tglUpload));
            destFile = new File(filepath+tglBaru.toString()+ "."+ ekstensi);
            Files.copy(sourceFile.toPath(), destFile.toPath());
            vFoto.setText("Foto : "+destFile.toString());
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPLOAD GAGAL"+e);
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void pFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFotoMouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.toString());
            Image image = icon.getImage().getScaledInstance(pFoto.getWidth(), pFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            pFoto.setText(null);
            pFoto.setIcon(ic);
            String filename = file.getAbsolutePath();
            tFoto.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPLOAD GAGAL" + e);
        }
    }//GEN-LAST:event_pFotoMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kelamin;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pFoto;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPer;
    private javax.swing.JPanel rPerempuan;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JLabel tFoto;
    private javax.swing.JComboBox<String> tJurusan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTempatLahir;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vFoto;
    private javax.swing.JLabel vJurusan;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vNis;
    private javax.swing.JLabel vTtl;
    // End of variables declaration//GEN-END:variables
}
