
import java.util.ArrayList;

public class Colaborador {
    
    private String nome;
    private String email;
    private ArrayList<String> escolaridade = new ArrayList<>();
    private String estadoCivil;

    public ArrayList<String> getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String s) {
        escolaridade.add(s);
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
