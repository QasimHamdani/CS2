import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mooseheads implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Mooseheads() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Mooseheads mooseheads = new Mooseheads();
        mooseheads.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Qasim Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

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



        statusLabel = new JLabel("Label", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel


        //mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton OneButton = new JButton("One");
        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        JButton whyButton = new JButton("why");
        JButton LButton = new JButton("L");
        JButton TDButton = new JButton("TD");
        JButton eButton = new JButton("e");
        JButton WOWButton = new JButton("WOW");
        JButton LIPButton = new JButton("LIP");
        JLabel TLabel = new JLabel("T");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

       mainFrame.add(OneButton);
        mainFrame.add(LButton);
        mainFrame.add(submitButton);
        mainFrame.add(okButton);
        mainFrame.add(controlPanel);
        mainFrame.add(whyButton);

        controlPanel.add(TLabel, BorderLayout.CENTER);
        controlPanel.add(cancelButton, BorderLayout.EAST);
        controlPanel.add(TDButton, BorderLayout.SOUTH);
        mainFrame.add(WOWButton);
        mainFrame.add(eButton);
        mainFrame.add(LIPButton);




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
