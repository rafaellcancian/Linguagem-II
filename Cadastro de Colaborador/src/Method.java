
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Method {
    
    public boolean verificarCampos(Colaborador colaborador) {
        
        boolean erro;
        
        if ((colaborador.getNome().isEmpty()) || (colaborador.getIdade() < 0) || (colaborador.getIdade() > 100) || (colaborador.getEmail().isEmpty()) || (colaborador.getCidade().isEmpty()) || (colaborador.getFormacao().isEmpty()) || (colaborador.getCargo().isEmpty())) {
            erro = true;
        } else erro = false;
   
        return erro;
    }
    
    public void limparFrame(JFrame frame){
        for (int i=0; i < frame.getContentPane().getComponentCount(); i++){
            Component c = frame.getContentPane().getComponent(i);
            if (c instanceof JTextField){
                JTextField field = (JTextField) c;
                field.setText(null);  
            }
        }
    }
    
}
