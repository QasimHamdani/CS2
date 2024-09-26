import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chief implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel winPanel;
    private JPanel fitPanel;
    private JPanel GamePanel;
    private JPanel EwPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Chief() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Chief chief = new Chief();
        chief.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Qasim Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout(3, 3));

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);


        //end menu at top

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);


        statusLabel = new JLabel("Label", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3)); //set the layout of the pannel
        winPanel=new JPanel();
        winPanel.setLayout(new GridLayout(2,1));
        fitPanel=new JPanel();
        fitPanel.setLayout(new GridLayout(1,2));
        GamePanel=new JPanel();
        GamePanel.setLayout(new GridLayout(2,13));

        GamePanel.add(ta);//add typing area
        EwPanel=new JPanel();
        EwPanel.setLayout(new GridLayout(1,8));
        //mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JLabel OneLabel = new JLabel("One");
        JButton okButton = new JButton("OK");
        JLabel submitLabel = new JLabel("Submit");
        JButton cancelButton = new JButton("Cancel");
        JLabel whyLabel = new JLabel("why");
        JButton LButton = new JButton("L");
        JLabel TDLabel = new JLabel("TD");
        JLabel eLabel = new JLabel("e");
        JButton WOWButton = new JButton("WOW");
        JButton LIPButton = new JButton("LIP");
        JLabel TLabel = new JLabel("T");

        JLabel OLabel = new JLabel("O");
        JButton NButton = new JButton("N");
        JLabel SLabel = new JLabel("S");
        JButton CButton = new JButton("C");
        JLabel wLabel = new JLabel("w");
        JButton AButton = new JButton("a");
        JLabel DLabel = new JLabel("D");
        JLabel VLabel = new JLabel("V");
        JButton IButton = new JButton("I");
       // JTextArea ta =new JTextArea("ta");
        okButton.setActionCommand("OK");
        //submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        // submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(OneLabel);
        controlPanel.add(LButton);
        controlPanel.add(submitLabel);
        controlPanel.add(okButton);
        //mainFrame.add(controlPanel);
        controlPanel.add(whyLabel);
//mainFrame.add(winPanel);

        controlPanel.add(cancelButton);
        controlPanel.add(TDLabel);
        controlPanel.add(WOWButton);
        controlPanel.add(TLabel);
       // mainFrame.add(winPanel);
        winPanel.add(eLabel);
        winPanel.add(LIPButton);

        fitPanel.add(controlPanel);
        fitPanel.add(winPanel);
        GamePanel.add(fitPanel);
        GamePanel.add(ta);

        EwPanel.add(OLabel);
        EwPanel.add(NButton);
        EwPanel.add(SLabel);
        EwPanel.add(CButton);
        EwPanel.add(wLabel);
        EwPanel.add(AButton);
        EwPanel.add(DLabel);
        EwPanel.add(IButton);
        EwPanel.add(VLabel);

        mainFrame.add(EwPanel, BorderLayout.SOUTH);








        mainFrame.add(GamePanel);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}
