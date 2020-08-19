
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Method {
    
    public boolean verificarCampos(Colaborador colaborador) {
        
        boolean erro;
        
        if ((colaborador.getNome().isEmpty()) || (colaborador.getEmail().isEmpty()) || (colaborador.getEstadoCivil().isEmpty()) || (colaborador.getEscolaridade().isEmpty())) {
            erro = true;
        } else erro = false;
   
        return erro;
    }
    
    public void limparFrame(GUI frame) {
        for (int i = 0; i < frame.getContentPane().getComponentCount(); i++){
            Component c = frame.getContentPane().getComponent(i);
            if (c instanceof JTextField){
                JTextField field = (JTextField) c;
                field.setText(null);  
            }
            if (c instanceof JCheckBox) {
                JCheckBox check = (JCheckBox) c;
                check.setSelected(false);
            }
        }
        frame.setButtonGroupEstadoCivil();
    }
    
}
