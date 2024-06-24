package at2_joptionpane3;

import javax.swing.JOptionPane;

public class At2_joptionpane3 {

    public static void main(String[] args) {
        // == Atividade 2: JOptionPane (parte 3: for) ==
        
        String input = JOptionPane.showInputDialog(null, "Digite um número e veja sua tabuada: ", "Gerador de Tabuadas", JOptionPane.QUESTION_MESSAGE);
    
        int num = Integer.parseInt(input);
    
        StringBuilder result = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
            result.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
            }
        
        JOptionPane.showMessageDialog(null, result.toString(), "Tabuada do " + num, JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    
