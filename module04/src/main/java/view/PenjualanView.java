/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class PenjualanView extends JFrame {

    private final JTextField textKode, textNama, textHarga;
    private final JTable table;
    private final DefaultTableModel tableModel;
    private final JButton btnSimpan, btnHapus;

    public PenjualanView() {
        setTitle("Manajemen Data Penjualan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
        JPanel panelForm = new JPanel(new GridLayout(4, 2));
        panelForm.add(new JLabel("Kode:"));
        textKode = new JTextField();
        panelForm.add(textKode);
        panelForm.add(new JLabel("Nama:"));
        textNama = new JTextField();
        panelForm.add(textNama);
        panelForm.add(new JLabel("Harga:"));
        textHarga = new JTextField();
        panelForm.add(textHarga);
        btnSimpan = new JButton("Simpan");
        btnHapus = new JButton("Hapus");
        panelForm.add(btnSimpan);
        panelForm.add(btnHapus);
        tableModel = new DefaultTableModel(new String[]{"Kode", "Nama", "Harga"},
                0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(panelForm, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }

    public JTextField getTextKode() {
        return textKode;
    }

    public JTextField getTextNama() {
        return textNama;
    }

    public JTextField getTextHarga() {
        return textHarga;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JTable getTable() {
        return table;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void addSimpanListener(ActionListener listener) {
        btnSimpan.addActionListener(listener);
    }

    public void addHapusListener(ActionListener listener) {
        btnHapus.addActionListener(listener);
    }
}
