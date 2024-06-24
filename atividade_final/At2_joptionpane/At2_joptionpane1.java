package at2_joptionpane1;

import javax.swing.JOptionPane;

public class At2_joptionpane1 {

    public static void main(String[] args) {
        // == Atividade 2: JOptionPane (parte 1: if) ==
        
        String input = JOptionPane.showInputDialog(null, "Digite qualquer número:", "Pergunta", JOptionPane.QUESTION_MESSAGE);

        int num = Integer.parseInt(input);

        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Seu número é positivo.", "Positivo!", JOptionPane.INFORMATION_MESSAGE);
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "Seu número é negativo.", "Negativo!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Seu número é zero.", "Zero!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
