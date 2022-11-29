import javax.swing.*;
import java.lang.Math;

public class GUI {
    public static double distance(int x1,int y1,int z1,int x2,int y2,int z2){
        int a = ((x2-x1)^2)+((y2-y1)^2)+((z2-z1)^2);
        return(Math.sqrt(a));
    }
    
    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000, 500);
        
        //Coords label 1
        JLabel coords1 = new JLabel("Coords: (x,y,z)");
        coords1.setBounds(20,10,100,20);
        f.add(coords1);

        //inputs for coords 1
        JFormattedTextField Coordx = new JFormattedTextField("x");
        Coordx.setBounds(120, 10, 100, 20);
        f.add(Coordx);

        JFormattedTextField Coordy = new JFormattedTextField();
        Coordy.setBounds(230, 10, 100, 20);
        f.add(Coordy);

        JFormattedTextField Coordz = new JFormattedTextField();
        Coordz.setBounds(340, 10, 100, 20);
        f.add(Coordz);

        String x1 = Coordx.getText();

        distance(x1, 0, 0, 0, 0, 0);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
}}
