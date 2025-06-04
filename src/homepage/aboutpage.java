package homepage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutpage extends JFrame {
    JButton jbtn_log,ad,doc,pat,phar;
    ImageIcon ilogo,iadmin,idoctor,ipatient,iphar,iph,imail;
    Container co;
    JLabel hos,logo,admin,doctor,patient,pharmacy,head,founder,mail,ph,tmail,tph; 
    JPanel p1,p2;
    JPanel pl1,pl2;
    JSplitPane jsp;
    aboutpage(){
 
        co=getContentPane();
        p1=new JPanel(null);
        p2=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
        
        pl1=new JPanel(null);
        pl1.setBounds(0,0,820,100);
        pl1.setBackground(Color.white);

        

       
        pl1.setBackground(new java.awt.Color(204, 204, 204));
        p2.add(pl1);
         
           
    JButton home = new JButton("Home");  
    home.setBackground(Color.decode("#29aae1")); 
    home.setForeground(Color.white);
    home.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    home.setBounds(0, 380, 400, 50);  
   
    JButton about = new JButton("About");  
    about.setBackground(Color.decode("#29aae1"));  
    about.setForeground(Color.white);
    about.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    about.setBounds(0, 430, 400, 50);  
    
    
    JButton contact = new JButton("Contact us");  
    contact.setBackground(Color.decode("#29aae1"));  
    contact.setForeground(Color.white);
    contact.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    contact.setBounds(0, 480, 400, 50);  
    JLayeredPane pane = getLayeredPane();  
      
    pane.add(contact);  
    pane.add(home);  
    pane.add(about);  

         head=new JLabel("About Us");
         head.setFont(new java.awt.Font("Tahoma", 1, 40));
       
         head.setBounds(300,30, 200, 35);// NOI18N
         head.setForeground(Color.decode("#29aae1"));
         p2.add(head);
         
        String text = "<html><p> A user-friendly desktop application designed to streamline hospital operations, including patient registration, doctor management, and appointment scheduling. Built with Java Swing and MySQL, this system ensures efficient data handling with a clean, intuitive interface.  \n" +
"The application features comprehensive medical record-keeping capabilities, allowing healthcare providers to track patient histories, symptoms, and treatments. With its validation system and error-handling mechanisms, the software maintains data accuracy while preventing common input mistakes. \n" +
"As an open-source project, this system offers flexibility for customization to meet specific institutional needs. Its cross-platform compatibility ensures smooth operation across Windows, Linux, and macOS environments, making it an accessible solution for healthcare facilities of various sizes. \n" +
"This project reflects a commitment to improving healthcare administration through technology, combining practical functionality with clean, maintainable code architecture for future development and scalability.</p></html>";
    
         JLabel para=new JLabel(text);
         para.setForeground(Color.black);
         para.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
         para.setBounds(0,150,820,500);
         p2.add(para);
        
         ilogo=new ImageIcon("img/admin/logo.png");
         logo=new JLabel(ilogo);
         logo.setBackground(Color.decode("#91eae4"));
         logo.setBounds(0,10,400,152);
         p1.add(logo);
       
         hos=new JLabel("Hospital Management System");
         hos.setForeground(Color.white);
         hos.setFont(new Font("Arial Black",Font.BOLD,22));
         hos.setBounds(24,163,350,50);
         p1.add(hos);
     
         admin=new JLabel("ADMIN");
         admin.setForeground(Color.black);
         admin.setFont(new Font(Font.SERIF,Font.BOLD,20));
         admin.setBounds(180,0,250,100);
        
         doctor=new JLabel("DOCTOR");
         doctor.setForeground(Color.black);
         doctor.setFont(new Font(Font.SERIF,Font.BOLD,20));
         doctor.setBounds(520,0,250,100);
        
         patient=new JLabel("PATIENT");
         patient.setForeground(Color.black);
         patient.setFont(new Font(Font.SERIF,Font.BOLD,20));
         patient.setBounds(170,360,200,100);
         
         pharmacy=new JLabel("PHARMACY");
         pharmacy.setForeground(Color.black);
         pharmacy.setFont(new Font(Font.SERIF,Font.BOLD,20));
         pharmacy.setBounds(510,360,130,100);
        
        founder=new JLabel("BATU, HELMY");
        iph=new ImageIcon("img/option/ph.png");
        imail=new ImageIcon("img/option/mail.png");
        ph=new JLabel(iph);
        mail=new JLabel(imail);
        tph=new JLabel("+20 1095798212");
        tmail=new JLabel("yuossefhilmy@gmail.com");
        
        hos.setForeground(Color.white);
        hos.setFont(new Font("Arial Black",Font.BOLD,22));
        
        founder.setFont(new Font("Calibri Light (Headings)",Font.BOLD,15));
        founder.setForeground(Color.white);
        
        tph.setFont(new Font("Calibri Light (Headings)",Font.BOLD,15));
        tph.setForeground(Color.white);
        
        tmail.setFont(new Font("Calibri Light (Headings)",Font.BOLD,15));
        tmail.setForeground(Color.white);
        
        hos.setBounds(28,163,350,50);
        founder.setBounds(150,195,350,50);
        ph.setBounds(80,275,20,20);
        tph.setBounds(120,275,180,20);
        mail.setBounds(80,310,20,20);
        tmail.setBounds(120,310,180,20);
        
        p1.add(hos);
        p1.add(founder);
        p1.add(ph);
        p1.add(tph);
        p1.add(mail);
        p1.add(tmail);
  
          home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
              new homepage();
                setVisible(false);
            }
        });   
    
         contact.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new contactpage();
                        setVisible(false);
                       
                }
                });

        p1.setBackground( Color.decode("#29aae1"));
        p2.setBackground(Color.decode("#ffdde1"));
        jsp.setTopComponent(p1);
        jsp.setBottomComponent(p2);
        p2.add(pl1);
        setBounds(100,100,1250, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new aboutpage();
    }
    
}
