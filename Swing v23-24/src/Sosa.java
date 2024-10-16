import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Sosa implements ActionListener {
        private JFrame mainFrame;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JMenuBar mb;
        private JMenu file, edit, help;
        private JMenuItem cut, copy, paste, selectAll;
        private JTextArea ta; //typing area
        private int WIDTH=800;
        private int HEIGHT=700;


        public Sosa() {
            prepareGUI();
        }

        public static void main(String[] args) {
            Sosa sosa = new Sosa();
            sosa.showEventDemo();
        }

        private void prepareGUI() {
            mainFrame = new JFrame("Qasim Learning SWING");
            mainFrame.setSize(WIDTH, HEIGHT);
            mainFrame.setLayout(new BorderLayout());


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



            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350, 100);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new GridLayout(2,3)); //set the layout of the pannel

            mainFrame.add(controlPanel);
            //mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }

        private void showEventDemo() {
            JButton OneButton = new JButton("One");
            JButton okButton = new JButton("OK");
            JLabel submitLabel = new JLabel("Submit");
            JButton cancelButton = new JButton("Cancel");
            JLabel whyLabel = new JLabel("why");
            JButton LButton = new JButton("L");
            JButton TDButton = new JButton("TD");

            okButton.setActionCommand("OK");

            cancelButton.setActionCommand("Cancel");


            mainFrame.add(OneButton, BorderLayout.NORTH);
            controlPanel.add(LButton);
            controlPanel.add(submitLabel);
            controlPanel.add(okButton);
            controlPanel.add(whyLabel);
            controlPanel.add(cancelButton);
            mainFrame.add(TDButton, BorderLayout.SOUTH);


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


    }

