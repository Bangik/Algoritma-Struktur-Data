
package LayoutSwing;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.scene.control.RadioButton;
import javax.swing.*;

/**
 *
 * @author asd
 */
public class gridbaglaout extends JFrame {
    public gridbaglaout(){
        this.setTitle("Form Transaksi");
        this.setSize(550,700);
        Dimension lcd = Toolkit.getDefaultToolkit().getScreenSize();// mengambil ukuran layar
        Dimension frameSize = this.getSize();
        this.setLocation((lcd.width - frameSize.width) / 2, (lcd.height - frameSize.height) / 2); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        Font f1 = new Font("TimesRoman", Font.BOLD, 18);
        
        JLabel labelTop = new JLabel("FORM TRANSAKSI PENJUALAN");
        JLabel labelIdTransaksi = new JLabel("ID_TRANSAKSI : ");
        JLabel labelTanggal = new JLabel("TANGGAL : ");
        JLabel labelKodeBarang = new JLabel("KODE_BARANG : ");
        JLabel labelNamaBarang = new JLabel("NAMA_BARANG : ");
        JLabel labelHargaJual = new JLabel("HARGA_JUAL : ");
        JLabel labelJumlah = new JLabel("JUMLAH : ");
        JLabel labelJenisBayar = new JLabel("JENIS BAYAR : ");
        JLabel labelTotal = new JLabel("TOTAL       : ");
        JLabel labelBayar = new JLabel("BAYAR       : ");
        JLabel labelKembali = new JLabel("KEMBALI   : ");
                
        labelTop.setFont(f1);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        JTextField fieldIdTransaksi = new JTextField();
        JFormattedTextField fieldTanggal = new JFormattedTextField(dateFormat);
        JTextField fieldKodeBarang = new JTextField();
        JTextField fieldNamaBarang = new JTextField();
        JTextField fieldHargaJual = new JTextField();
        JTextField fieldJumlah = new JTextField();
        JTextField fieldTotal = new JTextField();
        JTextField fieldBayar = new JTextField();
        JTextField fieldKembali = new JTextField();       
        
        fieldTanggal.setValue(new Date());
        
        JComboBox comboSatuan = new JComboBox();
        
        ButtonGroup btg = new ButtonGroup();
        
        JRadioButton radioTunai = new JRadioButton("Tunai");
        JRadioButton radioNonTunai = new JRadioButton("Non Tunai");
        
        btg.add(radioTunai);
        btg.add(radioNonTunai);
        
        JPanel panel1 = new JPanel();
        
        JCheckBox checkMember = new JCheckBox("Member");
        JCheckBox checkDiskon = new JCheckBox("Diskon");
        
        String[][] data = { 
            { "B002", "AQUA 600 ML", "4000", "5", "20.000"}, 
            { "B001", "INDOMIE GORENG - R", "3000", "10", "30.000"} 
        }; 
        String [] namaKolom = {"KD_B", "NAMA_BARANG", "H_JUAL", "JUMLAH", "SUB_TOTAL"};
        JTable tabelTransaksi = new JTable(data, namaKolom);
        tabelTransaksi.setBounds(30, 40, 200, 300);
        
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItemRemove = new JMenuItem("Hapus");
        JMenuItem menuItemEdit = new JMenuItem("Edit");
        
        popupMenu.add(menuItemRemove);
        popupMenu.add(menuItemEdit);
        
        tabelTransaksi.setComponentPopupMenu(popupMenu);
                
        JScrollPane panelScroll = new JScrollPane(tabelTransaksi);
        
        JButton buttonSave = new JButton("Save");
        JButton buttonHapus = new JButton("Hapus");
        
        Container mainContain = this.getContentPane();
        mainContain.setLayout(new GridBagLayout());
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,0,10,0);
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.PAGE_START;
        mainContain.add(labelTop, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        mainContain.add(labelIdTransaksi, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        fieldIdTransaksi.setPreferredSize(new Dimension(150,20));
        mainContain.add(fieldIdTransaksi, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        mainContain.add(labelTanggal, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        fieldTanggal.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldTanggal, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainContain.add(labelKodeBarang, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        fieldKodeBarang.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldKodeBarang, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainContain.add(labelNamaBarang, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        fieldNamaBarang.setPreferredSize(new Dimension(300, 20));
        mainContain.add(fieldNamaBarang, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        mainContain.add(labelHargaJual, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        fieldHargaJual.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldHargaJual, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 4;
        comboSatuan.addItem("pcs");
        comboSatuan.addItem("Dus");
        comboSatuan.setPreferredSize(new Dimension(150, 20));
        mainContain.add(comboSatuan, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainContain.add(labelJumlah, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        fieldJumlah.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldJumlah, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        mainContain.add(labelJenisBayar, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        mainContain.add(radioTunai, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 7;
        mainContain.add(radioNonTunai, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel1.setBackground(Color.lightGray);
        panel1.add(checkMember);
        panel1.add(checkDiskon);
        mainContain.add(panel1, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.LINE_START;
        panelScroll.setPreferredSize(new Dimension(500,100));
        panelScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        mainContain.add(panelScroll, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        mainContain.add(buttonSave, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 10;
        mainContain.add(buttonHapus, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 10;
        mainContain.add(labelTotal, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 10;
        fieldTotal.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldTotal, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 11;
        mainContain.add(labelBayar, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 11;
        fieldBayar.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldBayar, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 12;
        mainContain.add(labelKembali, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 12;
        fieldKembali.setPreferredSize(new Dimension(150, 20));
        mainContain.add(fieldKembali, gbc);  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        gridbaglaout grid = new gridbaglaout();
        grid.setVisible(true);
    }  
}
