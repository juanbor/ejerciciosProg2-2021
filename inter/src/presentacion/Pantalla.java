package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -13, 440, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(105, 61, 70, 15);
		panel.add(lblUser);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(105, 106, 70, 15);
		panel.add(lblPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(239, 194, 117, 25);
		panel.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(203, 61, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(79, 194, 117, 25);
		panel.add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 104, 114, 19);
		panel.add(passwordField);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = textField.getText();
				String pass = new String(passwordField.getPassword());
				checkPassword(user, pass);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Chau...");
			}
		});
	}
	
	public void checkPassword(String user, String pass) {
		if(user.equals("juan") && pass.equals("juan")) {
			JOptionPane.showMessageDialog(null, "Correcto!");
		}else {
			JOptionPane.showMessageDialog(null, "Mallllll");
		}
	}
}
