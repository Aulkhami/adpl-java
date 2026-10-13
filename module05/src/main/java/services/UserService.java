/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author rakha
 */
public class UserService {

    public void createUser(String username, String email) {
        System.out.println("Creating user: " + username);
    }

    public void saveUser(String username, String email) {
        String sql = "INSERT INTO users (username, email) VALUES ('" + username + "', '" + email + "')";
        System.out.println("Executing SQL: " + sql);
    }

    public void sendNotification(String email) {
        System.out.println("Sending welcome email to: " + email);
    }
}
