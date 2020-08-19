
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Arquivo {

    public void salvar(Colaborador colaborador) {   
        try {
            File file = new File("Cadastros.txt");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter arquivo = new PrintWriter (new FileWriter("Cadastros.txt", true))) {
                arquivo.println("Data/Hora: " + dateFormat.format(date) + "\n\nNome: " + colaborador.getNome()
                    + "\nIdade: " + colaborador.getIdade()
                    + "\nEmail: " + colaborador.getEmail()
                    + "\nCidade: " + colaborador.getCidade()
                    + "\nFormação: " + colaborador.getFormacao()
                    + "\nCargo: " + colaborador.getCargo()
                );
                arquivo.println("--------------------------------------------------");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
       
}
