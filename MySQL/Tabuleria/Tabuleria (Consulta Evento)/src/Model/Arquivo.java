
package Model;

import Controller.Sessao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    public void gravar(Sessao sessao) {
        try {
            File file = new File("login" + ".json");

            try (PrintWriter arquivo = new PrintWriter(file)) {
                arquivo.println("{\n\t\"Banco\": " + "\"" + sessao.getBanco() + "\",");
                arquivo.println("\t\"Host\": " + "\"" + sessao.getHost() + "\",");
                arquivo.println("\t\"Porta\": " + "\"" + sessao.getPorta() + "\",");
                arquivo.println("\t\"Usuario\": " + "\"" + sessao.getUsuario() + "\",");
                arquivo.println("\t\"Senha\": " + "\"" + sessao.getSenha() + "\"" + "\n}");
                arquivo.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Sessao ler(File file) {
        Sessao sessao = new Sessao();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains("Banco")) {
                    sessao.setBanco(linha.substring(11, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Host")) {
                    sessao.setHost(linha.substring(10, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Porta")) {
                    sessao.setPorta(linha.substring(11, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Usuario")) {
                    sessao.setUsuario(linha.substring(13, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Senha")) {
                    sessao.setSenha(linha.substring(11, linha.lastIndexOf("\"")));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return sessao;
    }
}
