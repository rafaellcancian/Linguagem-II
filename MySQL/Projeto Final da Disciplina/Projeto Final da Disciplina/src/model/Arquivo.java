
package model;

import controller.DBConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    public void gravar() {
        try {
            File file = new File("login" + ".json");

            try (PrintWriter arquivo = new PrintWriter(file)) {
                arquivo.println("{\n\t\"Banco\": " + "\"" + DBConfig.getBanco() + "\",");
                arquivo.println("\t\"Host\": " + "\"" + DBConfig.getHost() + "\",");
                arquivo.println("\t\"Porta\": " + "\"" + DBConfig.getPorta() + "\",");
                arquivo.println("\t\"Usuario\": " + "\"" + DBConfig.getUsuario() + "\",");
                arquivo.println("\t\"Senha\": " + "\"" + DBConfig.getSenha() + "\"" + "\n}");
                arquivo.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ler(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains("Banco")) {
                    DBConfig.setBanco(linha.substring(11, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Host")) {
                    DBConfig.setHost(linha.substring(10, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Porta")) {
                    DBConfig.setPorta(linha.substring(11, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Usuario")) {
                    DBConfig.setUsuario(linha.substring(13, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Senha")) {
                    DBConfig.setSenha(linha.substring(11, linha.lastIndexOf("\"")));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
