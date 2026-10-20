/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author rakha
 */
public class TransactionDTO {

    private Database db;

    public TransactionDTO(Database db) {
        this.db = db;
    }

    public void printTransactionRecords() {
        try {
            String connection = db.getConnection();
            System.out.println("Printing transaction records from " + connection);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
