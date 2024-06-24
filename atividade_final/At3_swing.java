package at3_swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class At3_swing {

    public static void main(String[] args) {
        // Atividade 3: Interface simples com swing
        
        JFrame frame = new JFrame("Olá! ^^");

        frame.setSize(400, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(50, 30, 80, 25);
        JLabel labelSobrenome = new JLabel("Sobrenome:");
        labelSobrenome.setBounds(50, 70, 80, 25);

        JTextField campoNome = new JTextField(20);
        campoNome.setBounds(150, 30, 200, 25);
        JTextField campoSobrenome = new JTextField(20);
        campoSobrenome.setBounds(150, 70, 200, 25);

        JButton button = new JButton("Ok");
        button.setBounds(150, 110, 100, 25);

        button.addActionListener(e -> {
            String nome = campoNome.getText();
            String sobrenome = campoSobrenome.getText();

            String mensagem = "Olá " + nome + " " + sobrenome + "!";
            JOptionPane.showMessageDialog(frame, mensagem, "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
        });

        panel.add(labelNome);
        panel.add(labelSobrenome);
        panel.add(campoNome);
        panel.add(campoSobrenome);
        panel.add(button);

        frame.add(panel);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}