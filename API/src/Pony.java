import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

        JButton ChongButton = new JButton("Chong");
        JButton ArnookButton = new JButton("Arnook");
        JButton AppaButton = new JButton("Appa's Mother");
        JButton AirAcolytewomanButton = new JButton("Air Acolyte woman");
        JButton AangpilotButton = new JButton("Aang (pilot)");
        JButton CabbagemerchantButton = new JButton("Cabbage merchant");
        JButton BumiKingofOmashuButton = new JButton("Bumi (King of Omashu)");
        JButton BullyguardButton = new JButton("Bully guard");
        JButton ChungButton = new JButton("Chung");
        JButton FongButton = new JButton("Fong");
        JButton GanJintribesmanButton = new JButton("Gan Jin tribesman");
        JButton CorncobguyButton = new JButton("Corncob guy");
        JButton GunButton = new JButton("Gun");
        JButton GuardcaptainButton = new JButton("Guard captain");
        JButton KoriMorishitaButton = new JButton("Kori Morishita");
        JButton HuanButton = new JButton("Huan");
        JButton JangHuiboyButton = new JButton("Jang Hui boy");
        JButton KannaButton = new JButton("Kanna");
        JButton JinoraButton = new JButton("Jinora");
        JButton HiryuButton = new JButton("Hiryu");


        ChongButton.setActionCommand("OK");
       // submitButton.setActionCommand("Submit");
        // cancelButton.setActionCommand("Cancel");

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


        }
    }
}
