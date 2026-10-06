/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Penjualan;
import view.PenjualanView;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class PenjualanController {

    private final PenjualanView view;

    public PenjualanController(PenjualanView view) {
        this.view = view;
        loadTable();
        view.addSimpanListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kode = view.getTextKode().getText();
                String nama = view.getTextNama().getText();
                int harga = Integer.parseInt(view.getTextHarga().getText());
                new Penjualan(kode, nama, harga).save();
                loadTable();
            }
        });
        view.addHapusListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = view.getTable().getSelectedRow();
                if (selectedRow != -1) {
                    String kode = (String) view.getTableModel().getValueAt(selectedRow, 0);
                    Penjualan.delete(kode);
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(view, "Pilih data yang ingin dihapus!");
                }
            }
        });
    }

    private void loadTable() {
        DefaultTableModel tableModel = view.getTableModel();
        tableModel.setRowCount(0);
        for (Penjualan p : Penjualan.getAllPenjualan()) {
            tableModel.addRow(new Object[]{p.getKode(), p.getNama(),
                p.getHarga()});
        }
    }
}
