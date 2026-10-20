/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;

/**
 *
 * @author rakha
 */
public class Authentication {

    private boolean authorized;

    public Authentication(boolean authorized) {
        this.authorized = authorized;
    }

    public boolean isAuthorized() {
        return authorized;
    }
}
