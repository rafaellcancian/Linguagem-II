
package controller;

public class DBConfig {
    
    private static String banco;
    private static String host;
    private static String porta;
    private static String usuario;
    private static String senha;

    public static void definirValores(String banco, String host, String porta, String usuario, String senha) {
        DBConfig.banco = banco;
        DBConfig.host = host;
        DBConfig.porta = porta;
        DBConfig.usuario = usuario;
        DBConfig.senha = senha;
    }
    
    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        DBConfig.banco = banco;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        DBConfig.host = host;
    }

    public static String getPorta() {
        return porta;
    }

    public static void setPorta(String porta) {
        DBConfig.porta = porta;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        DBConfig.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        DBConfig.senha = senha;
    }
}
