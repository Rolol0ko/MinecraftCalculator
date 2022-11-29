import java.awt.event.*;
import java.lang.Math;
import javax.swing.*;

public class GUI {
    public static double distance(
        int x1, int y1, int z1, int x2, int y2, int z2) {
        return (Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2) + ((z2 - z1) ^ 2)));
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000, 500);

        // Coords label 1
        JLabel coords1 = new JLabel("Coords: (x,y,z)");
        coords1.setBounds(20, 10, 100, 20);
        f.add(coords1);

        // inputs for coords 1
        JFormattedTextField Coord1x = new JFormattedTextField(0);
        Coord1x.setBounds(120, 10, 100, 20);
        f.add(Coord1x);

        JFormattedTextField Coord1y = new JFormattedTextField(0);
        Coord1y.setBounds(230, 10, 100, 20);
        f.add(Coord1y);

        JFormattedTextField Coord1z = new JFormattedTextField(0);
        Coord1z.setBounds(340, 10, 100, 20);
        f.add(Coord1z);

        // coords label 2
        JLabel coords2 = new JLabel("Coords: (x,y,z)");
        coords2.setBounds(20, 40, 100, 20);
        f.add(coords2);

        // inputs for coords 2
        JFormattedTextField Coord2x = new JFormattedTextField(0);
        Coord2x.setBounds(120, 40, 100, 20);
        f.add(Coord2x);

        JFormattedTextField Coord2y = new JFormattedTextField(0);
        Coord2y.setBounds(230, 40, 100, 20);
        f.add(Coord2y);

        JFormattedTextField Coord2z = new JFormattedTextField(0);
        Coord2z.setBounds(340, 40, 100, 20);
        f.add(Coord2z);

        // Calculated distance
        double distance = distance(
            Integer.parseInt(Coord1x.getText()),
            Integer.parseInt(Coord1y.getText()),
            Integer.parseInt(Coord1z.getText()),
            Integer.parseInt(Coord2x.getText()),
            Integer.parseInt(Coord2y.getText()),
            Integer.parseInt(Coord2z.getText()));
        Double d = distance;
        String result = d.toString();
        JLabel DistanceLabel = new JLabel(result);
        DistanceLabel.setBounds(120, 70, 100, 20);
        f.add(DistanceLabel);

        // Calculate Button
        JButton Button = new JButton("Calculate");
        Button.setBounds(10, 70, 100, 20);
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        f.add(Button);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }});
}}