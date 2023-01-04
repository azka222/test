// import library that need
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class mainPageApp extends JFrame implements ActionListener {
    // FRAME declare
    JFrame mainPageApp = new JFrame();
    // PANEL declare
    JPanel titlePanel = new JPanel();
    JPanel job1Panel = new JPanel();
    JPanel job2Panel = new JPanel();
    JPanel job3Panel = new JPanel();
    JPanel job4Panel = new JPanel();
    JPanel job5Panel = new JPanel();
    JPanel prevNexButtonPanel = new JPanel();
    JPanel butjob1Panel = new JPanel();
    JPanel butjob2Panel = new JPanel();
    JPanel butjob3Panel = new JPanel();
    JPanel butjob4Panel = new JPanel();
    JPanel butjob5Panel = new JPanel();
    // PANEL dummy hehe
    JPanel sisa1 = new JPanel();
    JPanel sisa2 = new JPanel();
    JPanel dummy1 = new JPanel();
    JPanel dummy2 = new JPanel();
    JPanel dummy3 = new JPanel();
    JPanel dummy4 = new JPanel();
    JPanel dummy5 = new JPanel();
    // LABEL declare
    JLabel titleLabel = new JLabel();
    JLabel job1Label = new JLabel();
    JLabel job2Label = new JLabel();
    JLabel job3Label = new JLabel();
    JLabel job4Label = new JLabel();
    JLabel job5Label = new JLabel();
    // BUTTON declare
    JButton job1Button = new JButton("Open");
    JButton job2Button = new JButton("Open");
    JButton job3Button = new JButton("Open");
    JButton job4Button = new JButton("Open");
    JButton job5Button = new JButton("Open");
    JButton nextButton = new JButton("Prev");
    JButton prevButton = new JButton("Next");
    
    

    mainPageApp() {
        // PANEL title
        titlePanel.setBounds(0,0,700,100);
        titlePanel.setBackground(new Color(98, 189, 238));
        titlePanel.setVisible(true);
        titlePanel.add(titleLabel);

        // PANEL job 1
        job1Panel.setBounds(150,100,400,30);
        job1Panel.setBackground(new Color(225,75,49,255));
        job1Panel.setVisible(true);
        job1Panel.add(job1Label);


        // PANEL job 2
        job2Panel.setBounds(150,200,400,30);
        job2Panel.setBackground(new Color(225,75,49,255));
        job2Panel.setVisible(true);
        job2Panel.add(job2Label);


        // PANEL job 3
        job3Panel.setBounds(150,300,400,30);
        job3Panel.setBackground(new Color(225,75,49,255));
        job3Panel.setVisible(true);
        job3Panel.add(job3Label);


        // PANEL job 4
        job4Panel.setBounds(150,400,400,30);
        job4Panel.setBackground(new Color(225,75,49,255));
        job4Panel.setVisible(true);
        job4Panel.add(job4Label);


        // PANEL job 5
        job5Panel.setBounds(150,500,400,30);
        job5Panel.setBackground(new Color(225,75,49,255));
        job5Panel.setVisible(true);
        job5Panel.add(job5Label);
      

        // PANEL button job 1
        butjob1Panel.setBounds(150,130,400,40);
        butjob1Panel.setBackground(new Color(220,110,85,255));
        butjob1Panel.setVisible(true);
        butjob1Panel.add(job1Button);

        // PANEL button job 2
        butjob2Panel.setBounds(150,230,400,40);
        butjob2Panel.setBackground(new Color(220,110,85,255));
        butjob2Panel.setVisible(true);
        butjob2Panel.add(job2Button);


        // PANEL button job 3
        butjob3Panel.setBounds(150,330,400,40);
        butjob3Panel.setBackground(new Color(220,110,85,255));
        butjob3Panel.setVisible(true);
        butjob3Panel.add(job3Button);


        // PANEL button job 4
        butjob4Panel.setBounds(150,430,400,40);
        butjob4Panel.setBackground(new Color(220,110,85,255));
        butjob4Panel.setVisible(true);
        butjob4Panel.add(job4Button);


        // PANEL button job 5
        butjob5Panel.setBounds(150,530,400,40);
        butjob5Panel.setBackground(new Color(220,110,85,255));
        butjob5Panel.setVisible(true);
        butjob5Panel.add(job5Button);

        // PANEL DUMMY sisa 1
        sisa1.setBounds(0,100,150,500);
        sisa1.setBackground(new Color(98, 189, 238));
        sisa1.setVisible(true);

        // PANEL DUMMY sisa 2
        sisa2.setBounds(550,100,150,500);
        sisa2.setBackground(new Color(98, 189, 238));
        sisa2.setVisible(true);

        // PANEL DUMMY 1
        dummy1.setBounds(150,170,400,30);
        dummy1.setBackground(new Color(98, 189, 238));
        dummy1.setVisible(true);

        // PANEL DUMMY 2
        dummy2.setBounds(150,270,400,30);
        dummy2.setBackground(new Color(98, 189, 238));
        dummy2.setVisible(true);

        // PANEL DUMMY 3
        dummy3.setBounds(150,370,400,30);
        dummy3.setBackground(new Color(98, 189, 238));
        dummy3.setVisible(true);


        // PANEL DUMMY 4
        dummy4.setBounds(150,470,400,30);
        dummy4.setBackground(new Color(98, 189, 238));
        dummy4.setVisible(true);

        // PANEL DUMMY 5
        dummy5.setBounds(150,570,400,30);
        dummy5.setBackground(new Color(98, 189, 238));
        dummy5.setVisible(true);

        // PANEL next previous button
        prevNexButtonPanel.setBounds(0,600,700,100);
        prevNexButtonPanel.setBackground(new Color(98, 189, 238));
        prevNexButtonPanel.add(nextButton);
        prevNexButtonPanel.add(prevButton);

        // LABEL title
        titleLabel.setText("Main Page");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);

        // LABEL job 1
        job1Label.setText("Amazon");
        job1Label.setFont(new Font("Roboto", Font.BOLD, 20));
        job1Label.setForeground(Color.WHITE);

        // LABEL job 2
        job2Label.setText("Gojek");
        job2Label.setFont(new Font("Roboto", Font.BOLD, 20));
        job2Label.setForeground(Color.WHITE);

        // LABEL job 3
        job3Label.setText("Tokopedia");
        job3Label.setFont(new Font("Roboto", Font.BOLD, 20));
        job3Label.setForeground(Color.WHITE);

        // LABEL job 4
        job4Label.setText("Grab");
        job4Label.setFont(new Font("Roboto", Font.BOLD, 20));
        job4Label.setForeground(Color.WHITE);

        // LABEL job 5
        job5Label.setText("Shopee");
        job5Label.setFont(new Font("Roboto", Font.BOLD, 20));
        job5Label.setForeground(Color.WHITE);

        // FRAME main
        mainPageApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPageApp.setVisible(true);
        mainPageApp.setSize(700,700);
        mainPageApp.setLayout(null);
        mainPageApp.add(titlePanel);
        mainPageApp.add(job1Panel);
        mainPageApp.add(job2Panel);
        mainPageApp.add(job3Panel);
        mainPageApp.add(job4Panel);
        mainPageApp.add(job5Panel);
        mainPageApp.add(prevNexButtonPanel);
        mainPageApp.add(sisa1);
        mainPageApp.add(sisa2);
        mainPageApp.add(butjob1Panel);
        mainPageApp.add(butjob2Panel);
        mainPageApp.add(butjob3Panel);
        mainPageApp.add(butjob4Panel);
        mainPageApp.add(butjob5Panel);
        mainPageApp.add(dummy1);
        mainPageApp.add(dummy2);
        mainPageApp.add(dummy3);
        mainPageApp.add(dummy4);
        mainPageApp.add(dummy5);

        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
