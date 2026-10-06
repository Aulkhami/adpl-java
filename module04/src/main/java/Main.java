/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author rakha
 */

import controller.PenjualanController;
import view.PenjualanView;

public class Main {

    public static void main(String[] args) {
        PenjualanView view = new PenjualanView();
        new PenjualanController(view);
    }
}
