package examenFinalDesin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {


	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBox;
    private JLabel restaurantLabel;

    public MainWindow() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

       
        JLabel titleLabel = new JLabel("Escoge comida de cadena rápida", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        String[] comidas = {"Pollo Frito", "Big Mac", "Whooper", "Crunch Wrap"};
        comboBox = new JComboBox<>(comidas);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        add(comboBox, BorderLayout.CENTER);

        
        restaurantLabel = new JLabel("", SwingConstants.CENTER);
        restaurantLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(restaurantLabel, BorderLayout.SOUTH);

        
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFood = (String) comboBox.getSelectedItem();
                switch (selectedFood) {
                    case "Pollo Frito":
                        restaurantLabel.setText("KFC");
                        break;
                    case "Big Mac":
                        restaurantLabel.setText("McDonald's");
                        break;
                    case "Whooper":
                        restaurantLabel.setText("Burger King");
                        break;
                    case "Crunch Wrap":
                        restaurantLabel.setText("Taco Bell");
                        break;
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow());
    }
}
