import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setSize(1000, 500);

            JButton distanceButton = new JButton("Distance Calculator");
            distanceButton.setBounds(10, 10, 150, 20);
            distanceButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
                Distance.createAndShowGUI();
            }});
            f.add(distanceButton);

            JButton netherButton = new JButton("Nether Calculator");
            netherButton.setBounds(170, 10, 150, 20);
            netherButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
            }});
            f.add(netherButton);

            f.setVisible(true);
    }});
}}