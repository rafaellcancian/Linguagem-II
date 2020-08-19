
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQL {
    
    private Connection c;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://" + DBConfig.getHost() + ":" + DBConfig.getPorta() + "/" + DBConfig.getBanco() + "?useTimezone=true&serverTimezone=UTC", DBConfig.getUsuario(), DBConfig.getSenha());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void desconectar() {
        try {
            c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Connection getC() {
        return c;
    }
    
    public ResultSet consultar(String query) {
        Statement st;
        ResultSet rs = null;
        try {
            st = c.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
    public int executeUpdate(String query) {
        Statement st;
        int statusQuery = 0;
        try {
            st = c.createStatement();
            statusQuery = st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return statusQuery;
    }
}
