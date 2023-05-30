import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MainGUIWindow extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JButton as;
    private JButton de;
    private JButton cend;
    private JButton sned;
    private JButton calculateButton;
    private JLabel Bill;
    private JLabel tip;
    private JLabel ppl;
    private JLabel finaltip;
    private JLabel total;

    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        setContentPane(mainPanel);
        setTitle("Tip Calculate");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        as.addActionListener(this);
        cend.addActionListener(this);
        de.addActionListener(this);
        calculateButton.addActionListener(this);
        sned.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){ //double check?
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if (button == as){
                double tip = Double.parseDouble(textArea4.getText());
                tip++;
                textArea4.setText("" + tip);
            }
            if(button == de){
                double tip = Double.parseDouble(textArea4.getText());
                tip--;
                textArea4.setText("" + tip);
            }
            if(button == cend){
                double num = Double.parseDouble(textArea5.getText());
                num++;
                textArea4.setText("" + num);
            }
            if(button == sned){
                double tip = Double.parseDouble(textArea5.getText());
                tip--;
                textArea4.setText("" + tip);
            }
            if(button == calculateButton){
                TipCalculator calc = new TipCalculator(Double.parseDouble(textArea2.getText()),Integer.parseInt(textArea4.getText()),Integer.parseInt(textArea5.getText()));
                textArea3.setText(""+calc.getTip());
                textArea1.setText(""+calc.getBill());
            }

        }

    }




}
