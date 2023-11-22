import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Programm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(3);
        frame.setSize(494, 494);
        frame.setLayout(new GridBagLayout());
        JLabel element_1700240121034 = new JLabel("Número 1");
        GridBagConstraints constraints_element_1700240121034 = new GridBagConstraints();
        constraints_element_1700240121034.gridx = 1;
        constraints_element_1700240121034.gridy = 3;
        constraints_element_1700240121034.gridwidth = 1;
        constraints_element_1700240121034.gridheight = 1;
        constraints_element_1700240121034.fill = 2;
        frame.add(element_1700240121034, constraints_element_1700240121034);
        final JTextField element_1700240141074 = new JTextField(20);
        GridBagConstraints constraints_element_1700240141074 = new GridBagConstraints();
        constraints_element_1700240141074.gridx = 3;
        constraints_element_1700240141074.gridy = 3;
        constraints_element_1700240141074.gridwidth = 2;
        constraints_element_1700240141074.gridheight = 1;
        constraints_element_1700240141074.fill = 2;
        frame.add(element_1700240141074, constraints_element_1700240141074);
        JButton element_1700240155878 = new JButton("Sumar");
        GridBagConstraints constraints_element_1700240155878 = new GridBagConstraints();
        constraints_element_1700240155878.gridx = 5;
        constraints_element_1700240155878.gridy = 3;
        constraints_element_1700240155878.gridwidth = 2;
        constraints_element_1700240155878.gridheight = 1;
        constraints_element_1700240155878.fill = 2;
        frame.add(element_1700240155878, constraints_element_1700240155878);
        final JLabel element_1700240208048 = new JLabel("");
        GridBagConstraints constraints_element_1700240208048 = new GridBagConstraints();
        constraints_element_1700240208048.gridx = 8;
        constraints_element_1700240208048.gridy = 3;
        constraints_element_1700240208048.gridwidth = 2;
        constraints_element_1700240208048.gridheight = 1;
        constraints_element_1700240208048.fill = 2;
        frame.add(element_1700240208048, constraints_element_1700240208048);
        JLabel element_1700240127344 = new JLabel("Número 2");
        GridBagConstraints constraints_element_1700240127344 = new GridBagConstraints();
        constraints_element_1700240127344.gridx = 1;
        constraints_element_1700240127344.gridy = 4;
        constraints_element_1700240127344.gridwidth = 1;
        constraints_element_1700240127344.gridheight = 1;
        constraints_element_1700240127344.fill = 2;
        frame.add(element_1700240127344, constraints_element_1700240127344);
        final JTextField element_1700240144628 = new JTextField(20);
        GridBagConstraints constraints_element_1700240144628 = new GridBagConstraints();
        constraints_element_1700240144628.gridx = 3;
        constraints_element_1700240144628.gridy = 4;
        constraints_element_1700240144628.gridwidth = 2;
        constraints_element_1700240144628.gridheight = 1;
        constraints_element_1700240144628.fill = 2;
        frame.add(element_1700240144628, constraints_element_1700240144628);
        JButton element_1700240159926 = new JButton("Restar");
        GridBagConstraints constraints_element_1700240159926 = new GridBagConstraints();
        constraints_element_1700240159926.gridx = 5;
        constraints_element_1700240159926.gridy = 4;
        constraints_element_1700240159926.gridwidth = 2;
        constraints_element_1700240159926.gridheight = 1;
        constraints_element_1700240159926.fill = 2;
        frame.add(element_1700240159926, constraints_element_1700240159926);
        final JLabel element_1700240214455 = new JLabel("");
        GridBagConstraints constraints_element_1700240214455 = new GridBagConstraints();
        constraints_element_1700240214455.gridx = 8;
        constraints_element_1700240214455.gridy = 4;
        constraints_element_1700240214455.gridwidth = 2;
        constraints_element_1700240214455.gridheight = 1;
        constraints_element_1700240214455.fill = 2;
        frame.add(element_1700240214455, constraints_element_1700240214455);
        JButton element_1700240163866 = new JButton("Multiplicar");
        GridBagConstraints constraints_element_1700240163866 = new GridBagConstraints();
        constraints_element_1700240163866.gridx = 5;
        constraints_element_1700240163866.gridy = 5;
        constraints_element_1700240163866.gridwidth = 2;
        constraints_element_1700240163866.gridheight = 1;
        constraints_element_1700240163866.fill = 2;
        frame.add(element_1700240163866, constraints_element_1700240163866);
        final JLabel element_1700240218197 = new JLabel("");
        GridBagConstraints constraints_element_1700240218197 = new GridBagConstraints();
        constraints_element_1700240218197.gridx = 8;
        constraints_element_1700240218197.gridy = 5;
        constraints_element_1700240218197.gridwidth = 2;
        constraints_element_1700240218197.gridheight = 1;
        constraints_element_1700240218197.fill = 2;
        frame.add(element_1700240218197, constraints_element_1700240218197);
        JButton element_1700240176958 = new JButton("Dividir");
        GridBagConstraints constraints_element_1700240176958 = new GridBagConstraints();
        constraints_element_1700240176958.gridx = 5;
        constraints_element_1700240176958.gridy = 6;
        constraints_element_1700240176958.gridwidth = 2;
        constraints_element_1700240176958.gridheight = 1;
        constraints_element_1700240176958.fill = 2;
        frame.add(element_1700240176958, constraints_element_1700240176958);
        final JLabel element_1700240223301 = new JLabel("");
        GridBagConstraints constraints_element_1700240223301 = new GridBagConstraints();
        constraints_element_1700240223301.gridx = 8;
        constraints_element_1700240223301.gridy = 6;
        constraints_element_1700240223301.gridwidth = 2;
        constraints_element_1700240223301.gridheight = 1;
        constraints_element_1700240223301.fill = 2;
        frame.add(element_1700240223301, constraints_element_1700240223301);

        // A PARTIR DE AQUI TENEMOS QUE AÑADIR UN LISTENER POR BOTÓN
        element_1700240155878.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = element_1700240141074.getText();
                String text2 = element_1700240144628.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int sum = num1 + num2;
                element_1700240208048.setText(String.valueOf(sum));

            }
        });
        element_1700240159926.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = element_1700240141074.getText();
                String text2 = element_1700240144628.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int resta = num1 - num2;
                element_1700240214455.setText(String.valueOf(resta));

            }
        });
        element_1700240163866.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = element_1700240141074.getText();
                String text2 = element_1700240144628.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int multiplicar = num1 * num2;
                element_1700240218197.setText(String.valueOf(multiplicar));

            }
        });
        element_1700240176958.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text1 = element_1700240141074.getText();
                String text2 = element_1700240144628.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int dividir = num1 / num2;
                element_1700240223301.setText(String.valueOf(dividir));

            }
        });
        frame.setVisible(true);
    }
}