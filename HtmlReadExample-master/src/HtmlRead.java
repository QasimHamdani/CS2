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
    private JScrollPane pane;


    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
        html.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("HTML Reader");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 2));

        ta = new JTextArea("Links From URL:");
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta.setFont(new Font("Optima", Font.PLAIN, 14));
        ta2 = new JTextArea("Input Link:");
        ta2.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta2.setFont(new Font("Academy Engraved LET", Font.PLAIN, 14));
        ta3 = new JTextArea("Input Search Term:");
        ta3.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        ta3.setFont(new Font("skia", Font.PLAIN, 14));
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1,3));
        opPanel = new JPanel();
        opPanel.setLayout(new GridLayout(2,2));
        rePanel = new JPanel();
        rePanel.setLayout(new GridLayout(3,4));
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
        JButton ResetButton = new JButton("Reset");
        ResetButton.setActionCommand("Reset");
        ResetButton.addActionListener(new ButtonClickListener());
    mainFrame.add(controlPanel);
    opPanel.add(StartButton);
    opPanel.add(ResetButton);
    opPanel.add(ta2);
    rePanel.add(ta3);
        JScrollPane pane = new JScrollPane(ta);
        controlPanel.add(pane);

        mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Start")) {

                try {
                    System.out.println();
                    System.out.print("hello \n");
                    int pole = ta2.getText().indexOf("https");
                    String loop = ta2.getText().substring(pole);
                    URL url = new URL(loop);
                    String lip = ta3.getText().substring(18);
                    System.out.println(lip);


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


                            //System.out.println(link);
                           // System.out.println(line.substring(start, start+end));
                            if (line.substring(start, start+end).contains(lip)){
                                System.out.print(line.substring(start, start+end)+ "\n");
                                ta.append((line.substring(start, start+end))+"\n");



                            }
                            //System.out.println(start+ "," + end);




                        }


                    }
                    reader.close();
                } catch(Exception ex) {
                    System.out.println(ex);
                    System.out.println("Whoops! Inputed Link is not valid. Input Valid Link Please.");
                    ta2.append("\n");
                    ta2.append("Whoops! Inputed Link is not valid. Input Valid Link Please.");
                }


            }
            else if (command.equals("Reset")) {
                ta.setText("Links From URL:");
                ta2.setText("Input Link:");
                ta3.setText("Input Search Term:");
            }

        }
    }
    public HtmlRead() {
        prepareGUI();

    }
    public void actionPerformed(ActionEvent e) {

    }

}
