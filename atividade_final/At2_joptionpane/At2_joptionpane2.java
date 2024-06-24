package at2_joptionpane2;

import javax.swing.JOptionPane;

public class At2_joptionpane2 {

    public static void main(String[] args) {
        // == Atividade 2: JOptionPane (parte 2: while) ==
        
        int cont = 0;
        int num;
        
        do {
            String input = JOptionPane.showInputDialog(null, "Digite um número (digite 0 pra finalizar):", "Soma entre números", JOptionPane.QUESTION_MESSAGE);
            num = Integer.parseInt(input);
            cont += num;
        } while (num != 0);
        
        JOptionPane.showMessageDialog(null, "Soma dos números: " + cont, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
