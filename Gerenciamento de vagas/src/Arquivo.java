
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo {

    public void gravar(Veiculo veiculo, String vaga) {
        try {
            File file = new File("Vagas", "Vaga" + vaga + ".json");
            file.getParentFile().mkdir();

            try (PrintWriter arquivo = new PrintWriter(file)) {
                arquivo.println("{\n\t\"Placa\": " + "\"" + veiculo.getPlaca() + "\",");
                arquivo.println("\t\"Tipo\": " + "\"" + veiculo.getTipo() + "\",");
                arquivo.println("\t\"Data/Hora\": " + "\"" + veiculo.getData() + "\"" + "\n}");
                arquivo.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Veiculo ler(File file, String vaga) {
        Veiculo veiculo = new Veiculo();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains("Placa")) {
                    veiculo.setPlaca(linha.substring(11, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Tipo")) {
                    veiculo.setTipo(linha.substring(10, linha.lastIndexOf("\"")));
                }
                if (linha.contains("Data/Hora")) {
                    veiculo.setData(linha.substring(15, linha.lastIndexOf("\"")));
                }
            }
            scanner.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }

        return veiculo;
    }
}
