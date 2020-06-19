/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    Queue<Object> antrian = new LinkedList<>(); //menambah antrian kedalam Linkedlist 
    int nomor = 0;
    
    public HalamanUtama() {
        initComponents();
        data();
    }

    private void data(){ 
        TextJumlahAntrian.setText("0");
        TextTotalAntrian.setText("0");
        BoxPanggilan.setText("-----");
        
        Label1.setText("Masjid Raya Mujahidin");
        Label2.setText("Jl. Jenderal Ahmad Yani");
        Label3.setText("Kota Pontianak, Kalimantan Barat 78121");
        Label4.setText("Kamis, 18 Juni 2020");
        Label5.setText("Nomor Antrian");
        Label6.setText("--------");
        Label7.setText("Silahkan menunggu");
        Label8.setText("--------");
    }
    private void tambahAntrian(){ //membuat tambah antrian
        nomor++; //menambah nomor
        String antr = "Antrian "+nomor; //simpan data variabel
        antrian.add(antr); //menambah antrian ke list
        String cvt = String.valueOf(antrian.size()); //mengambil panjang list
        TextJumlahAntrian.setText(cvt); //meng set text komponen agar menampilkan panjang list
        BoxPanggilan.setText(""+antrian.peek()); //menampilkan data yang paling atas
        TextTotalAntrian.setText(""+nomor); //menampilkan nomor ada berapa
        TextAntrian.append(antr + "\n");
        
        Label4.setText("Kamis, 18 Juni 2020");
        Label5.setText("Nomor Antrian");
        Label6.setText(""+nomor);
        Label7.setText("Silahkan menunggu " + cvt + " Antrian Lagi ");
        Label8.setText("Mohon untuk bersabar");
    }
    private void prosesAntrian(){ //membuat proses antrian
        if(antrian.isEmpty()){ // jika antrian tidak ada
            JOptionPane.showMessageDialog(this, "Ambil Nomor antrian terlebih dahulu !");
        }
        TextAntrian.setText(""); // mengosongkan textarea list antrian
        antrian.poll(); // mengambil antrian/menghapus antrian teratas
        antrian.forEach((Object element) -> { 
            TextAntrian.append("" + element + "\n"); // print semua antrian ke list daftar antrian
        });
        if(antrian.isEmpty()){
            BoxPanggilan.setText("-----"); //jika box panggilan antrian kosong
        }
        else{
            BoxPanggilan.setText(""+antrian.peek()); //jika box panggilan terisi
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAntrian = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AmbilAntrian = new javax.swing.JButton();
        TextJumlahAntrian = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BoxPanggilan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Label3 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TextTotalAntrian = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Label8 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        ProsesAntrian = new javax.swing.JButton();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gambar.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Antrian ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 20));

        TextAntrian.setColumns(20);
        TextAntrian.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TextAntrian.setRows(5);
        TextAntrian.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextAntrian.setEnabled(false);
        jScrollPane1.setViewportView(TextAntrian);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 460));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mesin Antrian");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 57, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Antrian Penerima Zakat");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Panggilan Nomor Antrian");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total Antrian");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, 30));

        AmbilAntrian.setBackground(new java.awt.Color(255, 204, 0));
        AmbilAntrian.setText("Ambil Nomor Antrian");
        AmbilAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbilAntrianActionPerformed(evt);
            }
        });
        jPanel2.add(AmbilAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 170, 30));

        TextJumlahAntrian.setEditable(false);
        TextJumlahAntrian.setBackground(new java.awt.Color(175, 175, 182));
        TextJumlahAntrian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextJumlahAntrian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextJumlahAntrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextJumlahAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextJumlahAntrianActionPerformed(evt);
            }
        });
        jPanel2.add(TextJumlahAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah Antrian");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        BoxPanggilan.setEditable(false);
        BoxPanggilan.setBackground(new java.awt.Color(175, 175, 182));
        BoxPanggilan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BoxPanggilan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BoxPanggilan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(BoxPanggilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 80));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 30));

        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, 110));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 230, -1));

        TextTotalAntrian.setEditable(false);
        TextTotalAntrian.setBackground(new java.awt.Color(175, 175, 182));
        TextTotalAntrian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextTotalAntrian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTotalAntrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextTotalAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTotalAntrianActionPerformed(evt);
            }
        });
        jPanel2.add(TextTotalAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 40));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(Label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 30));

        Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        Label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 30));

        Label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 30));

        Label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 230, 170));

        ProsesAntrian.setBackground(new java.awt.Color(255, 153, 0));
        ProsesAntrian.setText("Proses Antrian");
        ProsesAntrian.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProsesAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesAntrianActionPerformed(evt);
            }
        });
        jPanel2.add(ProsesAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 110, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 580, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmbilAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbilAntrianActionPerformed
        // TODO add your handling code here:
        tambahAntrian();
    }//GEN-LAST:event_AmbilAntrianActionPerformed

    private void ProsesAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesAntrianActionPerformed
        // TODO add your handling code here:
        prosesAntrian();
    }//GEN-LAST:event_ProsesAntrianActionPerformed

    private void TextTotalAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTotalAntrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTotalAntrianActionPerformed

    private void TextJumlahAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextJumlahAntrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextJumlahAntrianActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmbilAntrian;
    private javax.swing.JTextField BoxPanggilan;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JButton ProsesAntrian;
    private javax.swing.JTextArea TextAntrian;
    private javax.swing.JTextField TextJumlahAntrian;
    private javax.swing.JTextField TextTotalAntrian;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
