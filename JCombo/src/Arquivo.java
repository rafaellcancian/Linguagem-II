
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    public ArrayList<String> lerArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo + ".txt");
        ArrayList<String> cidades = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(arquivo, "Windows-1252");
            while (scanner.hasNext()) {
                cidades.add(scanner.nextLine());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return cidades;
    }
}
