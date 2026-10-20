/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import auth.Authentication;

/**
 *
 * @author rakha
 */
public class Database {

    private Authentication auth;

    public Database(Authentication auth) {
        this.auth = auth;
    }

    public String getConnection() throws Exception {
        if (!auth.isAuthorized()) {
            throw new Exception("NO AUTHORIZATION");
        }
        return "EB413_DH1225_KV1025";
    }
}
