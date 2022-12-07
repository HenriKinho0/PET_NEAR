package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaAlterar_Dados extends JFrame{
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JPasswordField FieldSenha;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterar_Dados window = new TelaAlterar_Dados();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAlterar_Dados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 828, 626);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.setBorderPainted(false);
		btnAlterar.setBounds(413, 478, 114, 35);
		getContentPane().add(btnAlterar);
		
		textNome = new JTextField();
		textNome.setBounds(321, 105, 381, 35);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(321, 176, 381, 35);
		getContentPane().add(textEmail);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(321, 248, 381, 35);
		getContentPane().add(textTelefone);
		
		FieldSenha = new JPasswordField();
		FieldSenha.setBounds(321, 319, 381, 35);
		getContentPane().add(FieldSenha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaAlterar_Dados.class.getResource("/resources/ALTERAR DADOS.png")));
		lblNewLabel.setBounds(0, 0, 812, 587);
		getContentPane().add(lblNewLabel);
	}
}
