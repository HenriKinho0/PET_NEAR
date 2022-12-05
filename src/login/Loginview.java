package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.TextField;
import java.awt.Window;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginview {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginview window = new Loginview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loginview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		textField.setBounds(175, 91, 158, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 144, 158, 25);
		frame.getContentPane().add(passwordField);
		
		JButton btnEntrar = new JButton("");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEntrar.setBorderPainted(false);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBounds(236, 208, 33, 18);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnCadastro = new JButton("");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroView telacadastro = new CadastroView();
				telacadastro.setVisible(true);
				
			}
		});
		btnCadastro.setBorderPainted(false);
		btnCadastro.setBackground(new Color(0, 0, 0));
		btnCadastro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastro.setContentAreaFilled(false);
		btnCadastro.setBounds(220, 246, 54, 23);
		frame.getContentPane().add(btnCadastro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 496, 315);
		lblNewLabel.setIcon(new ImageIcon(Loginview.class.getResource("/resources/LOGIN.png")));
		frame.getContentPane().add(lblNewLabel);
	}
}
