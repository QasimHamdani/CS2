import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlRead {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JPanel opPanel;
    private JPanel rePanel;
    private JTextArea ta;
    private JTextArea ta2;
    private JTextArea ta3;
    private int WIDTH=800;
    private int HEIGHT=700;

    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
        html.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("HTML Reader");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta2 = new JTextArea();
        ta2.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta3 = new JTextArea();
        ta3.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1,3));
        opPanel = new JPanel();
        opPanel.setLayout(new GridLayout(3,3));
        rePanel = new JPanel();
        rePanel.setLayout(new GridLayout(3,3));
        mainFrame.add(controlPanel);
        mainFrame.add(opPanel);
        mainFrame.add(rePanel);
        controlPanel.add(ta);
        opPanel.add(ta2);
        rePanel.add(ta3);
         //set the layout of the pannel

        mainFrame.setVisible(true);

    }
    private void showEventDemo() {
        JButton StartButton = new JButton("Start");
        StartButton.setActionCommand("Start");
        StartButton.addActionListener(new ButtonClickListener());
    mainFrame.add(controlPanel);
    opPanel.add(StartButton);
    opPanel.add(ta2);
    rePanel.add(ta3);
        mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Start")) {

                try {
                    System.out.println();
                    System.out.print("hello \n");
                    URL url = new URL("https://www.milton.edu/");
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(url.openStream())
                    );
                    String line;

                    while ( (line = reader.readLine()) != null ) {
                        if (line.contains("href")) {

                            int start = line.indexOf("href")+6;
                            String link = line.substring(start);

                            int end = link.indexOf(("\""));
                            if (end==-1){
                                end = link.indexOf("'");
                            }
                            if( end==-1){
                                end = link.indexOf("--");
                            }
                            //System.out.println(start+ "," + end);
                            System.out.print(line.substring(start, start+end)+ "\n");

                            ta.append((line.substring(start, start+end))+"\n");

                        }


                    }
                    reader.close();
                } catch(Exception ex) {
                    System.out.println(ex);
                }


            }

        }
    }
    public HtmlRead() {
        prepareGUI();

    }
    public void actionPerformed(ActionEvent e) {

    }

}
