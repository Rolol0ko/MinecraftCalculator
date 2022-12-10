import java.awt.event.*;
import javax.swing.*;
import java.text.ParseException;

public class Distance {
    public static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 150);

        // Coords label 1
        JLabel upperCoordsLabel = new JLabel("Coords: (x,y,z)");
        upperCoordsLabel.setBounds(20, 10, 100, 20);
        f.add(upperCoordsLabel);

        // inputs for coords 1
        JFormattedTextField textFieldx1 = new JFormattedTextField(0);
        textFieldx1.setBounds(120, 10, 100, 20);
        f.add(textFieldx1);

        JFormattedTextField textField1y = new JFormattedTextField(0);
        textField1y.setBounds(230, 10, 100, 20);
        f.add(textField1y);

        JFormattedTextField textField1z = new JFormattedTextField(0);
        textField1z.setBounds(340, 10, 100, 20);
        f.add(textField1z);

        // coords label 2
        JLabel lowerCoordsLabel = new JLabel("Coords: (x,y,z)");
        lowerCoordsLabel.setBounds(20, 40, 100, 20);
        f.add(lowerCoordsLabel);

        // inputs for coords 2
        JFormattedTextField textFieldx2 = new JFormattedTextField(0);
        textFieldx2.setBounds(120, 40, 100, 20);
        f.add(textFieldx2);

        JFormattedTextField textFieldy2 = new JFormattedTextField(0);
        textFieldy2.setBounds(230, 40, 100, 20);
        f.add(textFieldy2);

        JFormattedTextField textFieldz2 = new JFormattedTextField(0);
        textFieldz2.setBounds(340, 40, 100, 20);
        f.add(textFieldz2);

        JLabel DistanceLabel = new JLabel("0");
        DistanceLabel.setBounds(120, 70, 100, 20);
        f.add(DistanceLabel);

        // Calculate Button
        JButton Button = new JButton("Calculate");
        Button.setBounds(10, 70, 100, 20);
        Button.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
            try{
                textFieldx1.commitEdit();
                textField1y.commitEdit();
                textField1z.commitEdit();
                textFieldx2.commitEdit();
                textFieldy2.commitEdit();
                textFieldz2.commitEdit();
            }catch (ParseException s){}

            DistanceLabel.setText(Calculations.distance(
                Integer.parseInt(textFieldx1.getText()), 
                Integer.parseInt(textField1y.getText()), 
                Integer.parseInt(textField1z.getText()), 
                Integer.parseInt(textFieldx2.getText()), 
                Integer.parseInt(textFieldy2.getText()), 
                Integer.parseInt(textFieldz2.getText())));
        }});
        f.add(Button);

        f.setVisible(true);
    }}