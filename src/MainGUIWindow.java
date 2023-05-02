import javax.swing.*;

public class MainGUIWindow extends JFrame{
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
        setVisible(true);

    }


}
