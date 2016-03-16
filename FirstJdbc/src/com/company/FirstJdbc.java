package com.company;

import java.sql.*;
import java.io.*;

/**
 * Created by Admin on 31.03.2015.
 */

class CreateLogin {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void CLogin() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Create new member:");
            System.out.print("Login: ");
            login = br.readLine();

            System.out.println();
            System.out.print("Password: ");
            password = br.readLine();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}

public class FirstJdbc {
    public static void main(String[] args) throws ClassNotFoundException {

        String login;
        String password;

        CreateLogin memb1 = new CreateLogin();

        memb1.CLogin();

        login = memb1.getLogin();
        password = memb1.getPassword();

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection db = DriverManager.getConnection(
                    "jdbc:mariadb://127.0.0.1:3306/test","root", "Sergeybondar34");

            PreparedStatement pstmt = db.prepareStatement("INSERT INTO user VALUES ('2', ?, ?)");
            pstmt.setString(1, login);
            pstmt.setString(2, password);

            pstmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
