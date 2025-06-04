package admin;

import com.toedter.calendar.JDateChooser;
import database.DatabaseOperation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;

public class Regd extends JFrame {
    private JLabel doc_id, doc_name, doc_gender, doc_mail, doc_phnno;
    private JLabel doc_address, doc_qualification, doc_bloodgroup, doc_dateofjoin;
    private JLabel npass, cpass, title;
    private JTextField tdoc_id, tdoc_name, tdoc_mail, tdoc_phno;
    private JTextField tdoc_address, tdoc_qualification;
    private JPasswordField tdoc_npass, tdoc_cpass;
    private JRadioButton male, female;
    private ButtonGroup gender;
    private JComboBox<String> bloodgroup;
    private JDateChooser apt_date;
    private ImageIcon iback;
    private JButton back, submit, exit;
    private String strGen;

    public Regd() {
        setTitle("Doctor Registration");
        setSize(1250, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#29aae1"));
        setLayout(null);
        setLocationRelativeTo(null);


        try{
            iback=new ImageIcon("img/diagnosis/back.png");
            Image originalImage = iback.getImage();
            Image resizedImage = originalImage.getScaledInstance(75,75,Image.SCALE_SMOOTH);
            ImageIcon backIcon = new ImageIcon(resizedImage);

            back = new JButton(backIcon);

            back.setBounds(10,10,75,75);
            back.setBackground(new Color(0,0,0,0));
            back.setBorderPainted(false);
            back.setFocusPainted(false);
            back.setContentAreaFilled(false);

            back.addActionListener(e ->{
                new adminpage().setVisible(true);
                dispose();
            });

            add(back);

        } catch(Exception e){
            back = new JButton("Back");
            back.setBounds(20,50,75,75);
            back.setBackground(Color.decode( "#29aae1"));
            add(back);
            System.out.println("Failed To Load Back Image!"+e.getMessage());
        }

        initComponents();
        setupLayout();
        setupEventHandlers();

        setVisible(true);
    }

    private void initComponents() {
        title = new JLabel("Doctor Registration Form");
        doc_id = new JLabel("ID");
        doc_name = new JLabel("Name");
        doc_gender = new JLabel("Gender");
        doc_qualification = new JLabel("Qualification");
        doc_dateofjoin = new JLabel("Date of joining");
        doc_mail = new JLabel("E-mail");
        doc_phnno = new JLabel("Mobile number");
        doc_bloodgroup = new JLabel("Blood Group");
        doc_address = new JLabel("Address");
        npass = new JLabel("Set new password");
        cpass = new JLabel("Confirm password");

        tdoc_id = new JTextField();
        tdoc_name = new JTextField();
        tdoc_qualification = new JTextField();
        tdoc_mail = new JTextField();
        tdoc_phno = new JTextField();
        tdoc_address = new JTextField();
        tdoc_npass = new JPasswordField();
        tdoc_cpass = new JPasswordField();

        gender = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        gender.add(male);
        gender.add(female);

        String[] bloodGroups = {"---Select---", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"};
        bloodgroup = new JComboBox<>(bloodGroups);

        apt_date = new JDateChooser();
        apt_date.setLocale(Locale.UK);
        apt_date.setDateFormatString("dd/MM/yyyy");

        submit = new JButton("Register");
        exit = new JButton("Cancel");
    }

    private void setupLayout() {
        title.setFont(new Font("SERIF", Font.BOLD, 23));
        title.setForeground(Color.WHITE);
        title.setBounds(480, 50, 360, 70);
        add(title);

        setupLabel(doc_id, 450, 130);
        setupLabel(doc_name, 450, 180);
        setupLabel(doc_gender, 450, 230);
        setupLabel(doc_mail, 450, 280);
        setupLabel(doc_phnno, 450, 320);
        setupLabel(doc_bloodgroup, 450, 360);
        setupLabel(doc_qualification, 450, 400);
        setupLabel(doc_address, 450, 440);
        setupLabel(doc_dateofjoin, 450, 480);
        setupLabel(npass, 450, 520);
        setupLabel(cpass, 450, 560);


        setupTextField(tdoc_id, 650, 140);
        setupTextField(tdoc_name, 650, 190);

        male.setBounds(650, 235, 80, 30);
        female.setBounds(750, 235, 80, 30);
        male.setForeground(Color.BLACK);
        female.setForeground(Color.BLACK);
        add(male);
        add(female);

        setupTextField(tdoc_mail, 650, 290);
        setupTextField(tdoc_phno, 650, 330);

        bloodgroup.setBounds(650, 370, 225, 25);
        add(bloodgroup);

        setupTextField(tdoc_qualification, 650, 410);
        setupTextField(tdoc_address, 650, 450);

        apt_date.setBounds(650, 490, 225, 25);
        add(apt_date);

        tdoc_npass.setBounds(650, 530, 225, 25);
        add(tdoc_npass);
        tdoc_cpass.setBounds(650, 570, 225, 25);
        add(tdoc_cpass);

        submit.setBounds(500, 630, 100, 25);
        exit.setBounds(690, 630, 80, 25);
        styleButton(submit);
        styleButton(exit);
        add(submit);
        add(exit);
    }

    private void setupLabel(JLabel label, int x, int y) {
        label.setFont(new Font("DIALOG", Font.BOLD, 15));
        label.setForeground(Color.WHITE);
        label.setBounds(x, y, 150, 30);
        add(label);
    }

    private void setupTextField(JTextField field, int x, int y) {
        field.setFont(new Font("SERIF", Font.PLAIN, 15));
        field.setBounds(x, y, 225, 25);
        add(field);
    }

    private void styleButton(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.setFont(new Font("DIALOG", Font.ITALIC, 15));
    }

    private void setupEventHandlers() {
        male.addActionListener(e -> strGen = "Male");
        female.addActionListener(e -> strGen = "Female");

        submit.addActionListener(e -> registerDoctor());
        exit.addActionListener(e -> {
            new adminpage().setVisible(true);
            dispose();
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    private boolean validateInputs() {
        if (tdoc_id.getText().trim().isEmpty()) {
            showError("Please enter doctor ID");
            return false;
        }

        if (tdoc_name.getText().trim().isEmpty()) {
            showError("Please enter doctor name");
            return false;
        }

        if (strGen == null) {
            showError("Please select gender");
            return false;
        }

        if (bloodgroup.getSelectedItem().equals("---Select---")) {
            showError("Please select blood group");
            return false;
        }

        if (apt_date.getDate() == null) {
            showError("Please select date of joining");
            return false;
        }

        String password = new String(tdoc_npass.getPassword());
        String confirmPassword = new String(tdoc_cpass.getPassword());

        if (!password.equals(confirmPassword)) {
            showError("Passwords do not match");
            return false;
        }

        return true;
    }

    private void registerDoctor() {
        if (!validateInputs()) {
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DatabaseOperation.getConnection();
            String sql = "INSERT INTO doctor_details VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, tdoc_id.getText().trim());
            pstmt.setString(2, tdoc_name.getText().trim());
            pstmt.setString(3, tdoc_mail.getText().trim());
            pstmt.setString(4, new String(tdoc_npass.getPassword()));
            pstmt.setString(5, tdoc_phno.getText().trim());
            pstmt.setString(6, tdoc_address.getText().trim());
            pstmt.setString(7, tdoc_qualification.getText().trim());
            pstmt.setString(8, strGen);
            pstmt.setString(9, (String) bloodgroup.getSelectedItem());
            pstmt.setString(10, new java.sql.Date(apt_date.getDate().getTime()).toString());

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Doctor registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to register doctor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000")) {
                JOptionPane.showMessageDialog(this, "Doctor ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }

    private void resetForm() {
        tdoc_id.setText("");
        tdoc_name.setText("");
        tdoc_mail.setText("");
        tdoc_phno.setText("");
        tdoc_address.setText("");
        tdoc_qualification.setText("");
        tdoc_npass.setText("");
        tdoc_cpass.setText("");
        gender.clearSelection();
        bloodgroup.setSelectedIndex(0);
        apt_date.setDate(null);
        strGen = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Regd::new);
    }
}