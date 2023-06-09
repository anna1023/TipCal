import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUIWindow extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JButton tipup;
    private JButton tipdown;
    private JButton numup;
    private JButton numdown;
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
        setSize(700,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tipup.addActionListener(this);
        numup.addActionListener(this);
        tipdown.addActionListener(this);
        calculateButton.addActionListener(this);
        numdown.addActionListener(this);
        textArea4.setText("0");
        textArea5.setText("0");
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){ //double check?
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if (button == tipup){
                int tip = Integer.parseInt(textArea4.getText());
                tip++;
                textArea4.setText("" + tip);
            }
            if(button == tipdown){
                int tip = Integer.parseInt(textArea4.getText());
                tip--;
                textArea4.setText("" + tip);
            }
            if(button == numup){
                int num = Integer.parseInt(textArea5.getText());
                num++;
                textArea5.setText("" + num);
            }
            if(button == numdown){
                int num = Integer.parseInt(textArea5.getText());
                num--;
                textArea5.setText("" + num);
            }
            if(button == calculateButton){
                TipCalculator calc = new TipCalculator(Double.parseDouble(textArea2.getText()),Integer.parseInt(textArea4.getText()),Integer.parseInt(textArea5.getText()));
                textArea3.setText(""+calc.calculateTip());
                textArea1.setText(""+calc.totalBill());
            }

        }

    }




}
