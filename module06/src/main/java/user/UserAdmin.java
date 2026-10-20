/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author rakha
 */
public class UserAdmin implements User {

    private String username;
    private String displayName;
    private String password;

    public UserAdmin(String username, String displayName, String password) {
        this.username = username;
        this.displayName = displayName;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getPermissions() {
        return "Admin Permissions";
    }

    @Override
    public void getAdminPrivileges() {
        System.out.println("Saya Admin!");
    }
}
