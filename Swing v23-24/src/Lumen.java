import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Lumen implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public Lumen() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Lumen lumen = new Lumen();
            lumen.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Qasim Learning SWING");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout(3, 1));

            //menu at top
            cut = new JMenuItem("cut");
            copy = new JMenuItem("copy");
            paste = new JMenuItem("paste");
            selectAll = new JMenuItem("selectAll");
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);
            selectAll.addActionListener(this);

            mb = new JMenuBar();
            file = new JMenu("File");
            edit = new JMenu("Edit");
            help = new JMenu("Help");
            edit.add(cut);
            edit.add(copy);
            edit.add(paste);
            edit.add(selectAll);
            mb.add(file);
            mb.add(edit);
            mb.add(help);
            //end menu at top

            //ta = new JTextArea();
           // ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
            //mainFrame.add(mb);  //add menu bar
          //  mainFrame.add(ta);//add typing area
           // mainFrame.setJMenuBar(mb); //set menu bar

            statusLabel = new JLabel("Label", JLabel.CENTER);
            statusLabel.setSize(350, 100);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel

            mainFrame.add(controlPanel);
            //mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        private void showEventDemo() {

            JButton okButton = new JButton("OK");
            JButton submitButton = new JButton("Submit");
            JButton cancelButton = new JButton("Cancel");
            JButton whyButton = new JButton("why");
            JButton LButton = new JButton("L");

            okButton.setActionCommand("OK");
            submitButton.setActionCommand("Submit");
            cancelButton.setActionCommand("Cancel");

            okButton.addActionListener(new ButtonClickListener());
            submitButton.addActionListener(new ButtonClickListener());
            cancelButton.addActionListener(new ButtonClickListener());

            controlPanel.add(okButton, BorderLayout.EAST);
            controlPanel.add(submitButton, BorderLayout.WEST);
            controlPanel.add(cancelButton, BorderLayout.CENTER);
            controlPanel.add(whyButton, BorderLayout.NORTH);
            controlPanel.add(LButton, BorderLayout.SOUTH);
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
