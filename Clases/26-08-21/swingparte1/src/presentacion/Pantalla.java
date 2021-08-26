package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Manejador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import java.awt.CardLayout;

public class Pantalla extends JFrame {

	private JPanel contentPane;
	private String htmlOpen = "<html><body>";
	private String htmlClose = "</body><html>";
	private String htmlBr = "<br>";
	private JTextField tfUser;
	private Manejador man;
	private JLabel lblNewLabel;
	private JLabel lblPass;
	private JPasswordField pwdField;
	private JPanel panel_2;

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
		setTitle("Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 694, 466);
		contentPane.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		changePanelTo("panel");
		
		JPanel panel = new JPanel();
		panel_2.add(panel, "panel");
		panel.setLayout(null);
		
		JLabel lblPrincipal = new JLabel("Soy una interfaz Swing");
		lblPrincipal.setBounds(64, 78, 407, 54);
		panel.add(lblPrincipal);
		lblPrincipal.setForeground(Color.RED);
		lblPrincipal.setFont(new Font("Comic Sans MS", Font.PLAIN, 38));
		
		JButton btnClickAqui = new JButton("Login");
		btnClickAqui.setBounds(528, 388, 109, 38);
		panel.add(btnClickAqui);
		
		btnClickAqui.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		
		tfUser = new JTextField();
		tfUser.setBounds(277, 164, 360, 55);
		panel.add(tfUser);
		tfUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String input = tfUser.getText();
				
				lblPrincipal.setText(input);
			}
		});
		tfUser.setFont(new Font("Lucida Grande", Font.PLAIN, 38));
		tfUser.setColumns(10);
		
		lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(115, 168, 85, 47);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
		
		lblPass = new JLabel("Pass");
		lblPass.setBounds(115, 235, 84, 47);
		panel.add(lblPass);
		lblPass.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
		
		pwdField = new JPasswordField();
		pwdField.setBounds(277, 231, 360, 55);
		panel.add(pwdField);
		pwdField.setFont(new Font("Lucida Grande", Font.PLAIN, 38));
		
		

		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1, "panel1");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Soy el panel 2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		lblNewLabel_1.setBounds(230, 65, 238, 69);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Logut");
		
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNewButton.setBounds(445, 329, 122, 38);
		panel_1.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfUser.setText("");
				pwdField.setText("");
				changePanelTo("panel");
				
			}
		});
		
		btnClickAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Codigo que ejecuta cuando le hacemos click...
				
//				String input = tfUser.getText();
//				lblPrincipal.setText(input);
				String user = tfUser.getText();
				char[] passEnChars = pwdField.getPassword();
				String pass = String.valueOf(passEnChars);
				
				
				man = new Manejador();
				boolean isLogged = man.login(user, pass);
				
				if(isLogged) {
					lblPrincipal.setText("Correcto");
					lblPrincipal.setForeground(Color.GREEN);
					changePanelTo("panel1");
				}else {
					lblPrincipal.setText("Incorrecto");
					lblPrincipal.setForeground(Color.RED);
				}
			}
		});
	}
	
	private void changePanelTo(String panelCode) {
		CardLayout cl = (CardLayout)this.panel_2.getLayout();
		cl.show(this.panel_2, panelCode);
	}
}
