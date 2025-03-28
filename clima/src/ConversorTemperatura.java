import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperatura {

    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Componentes da interface
        JLabel labelCelsius = new JLabel("Temperatura em Celsius:");
        JTextField campoCelsius = new JTextField(10);
        JButton botaoConverter = new JButton("Converter");
        JLabel labelResultado = new JLabel("Tipo de clima:");
        JLabel labelTipoClima = new JLabel("");
        
        // Adicionando os componentes à janela
        frame.add(labelCelsius);
        frame.add(campoCelsius);
        frame.add(botaoConverter);
        frame.add(labelResultado);
        frame.add(labelTipoClima);

        // Ação do botão para converter
        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperaturaCelsius = Double.parseDouble(campoCelsius.getText());
                    ConversorTemperatura conversor = new ConversorTemperatura(temperaturaCelsius);
                    String tipoClima = conversor.getTipoClima();
                    labelTipoClima.setText(tipoClima);
                    
                    // Alterando a cor do texto conforme o tipo de clima
                    switch (tipoClima) {
                        case "Frio":
                            labelTipoClima.setForeground(Color.BLUE);
                            break;
                        case "Agradável":
                            labelTipoClima.setForeground(Color.GREEN);
                            break;
                        case "Quente":
                            labelTipoClima.setForeground(Color.ORANGE);
                            break;
                        case "Muito quente":
                            labelTipoClima.setForeground(Color.RED);
                            break;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira um valor numérico válido para a temperatura.");
                }
            }
        });

        // Tornando a janela visível
        frame.setVisible(true);
    }

    private ConversorTemperatura(double temperaturaCelsius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getTipoClima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}