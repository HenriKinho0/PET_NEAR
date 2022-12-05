package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.Font;

public class CadastroView {

	private JFrame frame;
	private JTextField textField_NomeCompleto;
	private JTextField textField_Email;
	private JTextField textField_Telefone;
	private JPasswordField passwordField_Senha;
	private JPasswordField passwordField_Confirmar_Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView window = new CadastroView();
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
	public CadastroView() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(224, 244, 56, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_NomeCompleto = new JTextField();
		textField_NomeCompleto.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField_NomeCompleto.setBounds(175, 86, 163, 20);
		frame.getContentPane().add(textField_NomeCompleto);
		textField_NomeCompleto.setColumns(10);
		
		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField_Email.setBounds(175, 119, 163, 20);
		frame.getContentPane().add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_Telefone = new JTextField();
		textField_Telefone.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textField_Telefone.setBounds(175, 153, 163, 20);
		frame.getContentPane().add(textField_Telefone);
		textField_Telefone.setColumns(10);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		passwordField_Senha.setBounds(175, 186, 163, 20);
		frame.getContentPane().add(passwordField_Senha);
		
		passwordField_Confirmar_Senha = new JPasswordField();
		passwordField_Confirmar_Senha.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		passwordField_Confirmar_Senha.setBounds(175, 220, 163, 20);
		frame.getContentPane().add(passwordField_Confirmar_Senha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 496, 315);
		lblNewLabel.setIcon(new ImageIcon(CadastroView.class.getResource("/resources/CADASTRO1.png")));
		frame.getContentPane().add(lblNewLabel);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
