import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Pony implements ActionListener{
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;
    private JScrollPane pane;

    public Pony() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Pony pony = new Pony();
        pony.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Avatar Last Airbender Index");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));


        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);




        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);

        mainFrame.add(ta);//add typing area
        mainFrame.setJMenuBar(mb); //set menu bar
        JScrollPane pane = new JScrollPane(ta);
        mainFrame.add(pane);
        //statusLabel = new JLabel("Label", JLabel.CENTER);
        //statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(5,4)); //set the layout of the pannel

        mainFrame.add(controlPanel);
        //mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton ChongButton = new JButton("Character 1");
        JButton ArnookButton = new JButton("Character 2");
        JButton AppaButton = new JButton("Character 3");
        JButton AirAcolytewomanButton = new JButton("Character 4");
        JButton AangpilotButton = new JButton("Character 5");
        JButton CabbagemerchantButton = new JButton("Character 6");
        JButton BumiKingofOmashuButton = new JButton("Character 7");
        JButton BullyguardButton = new JButton("Character 8");
        JButton ChungButton = new JButton("Character 9");
        JButton FongButton = new JButton("Character 10");
        JButton GanJintribesmanButton = new JButton("Character 11");
        JButton CorncobguyButton = new JButton("Character 12");
        JButton GunButton = new JButton("Character 13");
        JButton GuardcaptainButton = new JButton("Character 14");
        JButton KoriMorishitaButton = new JButton("Character 15");
        JButton HuanButton = new JButton("Character 16");
        JButton JangHuiboyButton = new JButton("Character 17");
        JButton KannaButton = new JButton("Character 18");
        JButton JinoraButton = new JButton("Character 19");
        JButton HiryuButton = new JButton("Character 20");


        ChongButton.setActionCommand("Character 1");
        ArnookButton.setActionCommand("Character 2");
        AppaButton.setActionCommand("Character 3");
        AirAcolytewomanButton.setActionCommand("Character 4");
        AangpilotButton.setActionCommand("Character 5");
        CabbagemerchantButton.setActionCommand("Character 6");
        BumiKingofOmashuButton.setActionCommand("Character 7");
        BullyguardButton.setActionCommand("Character 8");
        ChungButton.setActionCommand("Character 9");
        FongButton.setActionCommand("Character 10");
        GanJintribesmanButton.setActionCommand("Character 11");
        CorncobguyButton.setActionCommand("Character 12");
        GunButton.setActionCommand("Character 13");
        GuardcaptainButton.setActionCommand("Character 14");
        KoriMorishitaButton.setActionCommand("Character 15");
        HuanButton.setActionCommand("Character 16");
        JangHuiboyButton.setActionCommand("Character 17");
        KannaButton.setActionCommand("Character 18");
        JinoraButton.setActionCommand("Character 19");
        HiryuButton.setActionCommand("Character 20");


        ChongButton.addActionListener(new ButtonClickListener());
        ArnookButton.addActionListener(new ButtonClickListener());
        AppaButton.addActionListener(new ButtonClickListener());
        AirAcolytewomanButton.addActionListener(new ButtonClickListener());
        AangpilotButton.addActionListener(new ButtonClickListener());
        CabbagemerchantButton.addActionListener(new ButtonClickListener());
        BumiKingofOmashuButton.addActionListener(new ButtonClickListener());
        BullyguardButton.addActionListener(new ButtonClickListener());
        ChungButton.addActionListener(new ButtonClickListener());
        FongButton.addActionListener(new ButtonClickListener());
        GanJintribesmanButton.addActionListener(new ButtonClickListener());
        CorncobguyButton.addActionListener(new ButtonClickListener());
        GunButton.addActionListener(new ButtonClickListener());
        GuardcaptainButton.addActionListener(new ButtonClickListener());
        KoriMorishitaButton.addActionListener(new ButtonClickListener());
        HuanButton.addActionListener(new ButtonClickListener());
        JangHuiboyButton.addActionListener(new ButtonClickListener());
        KannaButton.addActionListener(new ButtonClickListener());
        JinoraButton.addActionListener(new ButtonClickListener());
        HiryuButton.addActionListener(new ButtonClickListener());

        controlPanel.add(ChongButton);
        controlPanel.add(ArnookButton);
        controlPanel.add(AppaButton);
        controlPanel.add(AirAcolytewomanButton);
        controlPanel.add(AangpilotButton);
        controlPanel.add(CabbagemerchantButton);
        controlPanel.add(BumiKingofOmashuButton);
        controlPanel.add(BullyguardButton);
        controlPanel.add(ChungButton);
        controlPanel.add(FongButton);
        controlPanel.add(GanJintribesmanButton);
        controlPanel.add(CorncobguyButton);
        controlPanel.add(GunButton);
        controlPanel.add(GuardcaptainButton);
        controlPanel.add(KoriMorishitaButton);
        controlPanel.add(HuanButton);
        controlPanel.add(JangHuiboyButton);
        controlPanel.add(KannaButton);
        controlPanel.add(JinoraButton);
        controlPanel.add(HiryuButton);


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
if(command.equals("Character 1")){
    System.out.println();
    try {
        pull(0);
    } catch (ParseException ex) {
        throw new RuntimeException(ex);

    }

}
            if(command.equals("Character 2")){
                System.out.println();
                try {
                    pull(1);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 3")){
                System.out.println();
                try {
                    pull(2);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 4")){
                System.out.println();
                try {
                    pull(3);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 5")){
                System.out.println();
                try {
                    pull(4);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 6")){
                System.out.println();
                try {
                    pull(5);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 7")){
                System.out.println();
                try {
                    pull(6);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 8")){
                System.out.println();
                try {
                    pull(7);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 9")){
                System.out.println();
                try {
                    pull(8);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 10")){
                System.out.println();
                try {
                    pull(9);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 11")){
                System.out.println();
                try {
                    pull(10);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 12")){
                System.out.println();
                try {
                    pull(11);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 13")){
                System.out.println();
                try {
                    pull(12);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 14")){
                System.out.println();
                try {
                    pull(13);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 15")){
                System.out.println();
                try {
                    pull(14);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 16")){
                System.out.println();
                try {
                    pull(15);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 17")){
                System.out.println();
                try {
                    pull(16);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 18")){
                System.out.println();
                try {
                    pull(17);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 19")){
                System.out.println();
                try {
                    pull(18);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(command.equals("Character 20")){
                System.out.println();
                try {
                    pull(19);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }
    }
    public  void pull(int charNum) throws ParseException {
        String output = "abc";
        String totlaJson="";
        try {

            URL url = new URL("https://last-airbender-api.fly.dev/api/v1/characters");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {

                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                totlaJson+=output;
            }

            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONParser parser = new JSONParser();
        //System.out.println(str);
        org.json.simple.JSONArray jsonArray = (org.json.simple.JSONArray) parser.parse(totlaJson);

        System.out.println(jsonArray);

        try {
            int h= jsonArray.size();
            //for (int e = 0; e < h; ++e) {
                JSONObject Lilly = (JSONObject) jsonArray.get(charNum);
                String name = (String) Lilly.get("name");


                org.json.simple.JSONArray msg = (org.json.simple.JSONArray) Lilly.get("allies");
                int n = msg.size(); //(msg).length();
                for (int i = 0; i < n; ++i) {
                    String test = (String) msg.get(i);
                    System.out.println(test);
                    ta.append("allies: "+test+"\n");
                    // System.out.println(person.getInt("key"));
                }
                org.json.simple.JSONArray tsg = (org.json.simple.JSONArray) Lilly.get("enemies");
                int l = tsg.size(); //(msg).length();

                for (int t = 0; t < l; ++t) {
                    String test = (String) tsg.get(t);
                    System.out.println(test);
                    ta.append("enemies: "+test+"\n");
                    // System.out.println(person.getInt("key"));
                }
                // String weapon= (String)Lilly.get("weapon");
                System.out.println("name:"+name);
                ta.append("name: "+name+"\n"+"\n");

          //  }
        }

        //

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
