package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import login.Loginview;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField campoSenha;


	public static void main(String[] args) {
//ESSE AQUI É PRA DEIXAR A TELA MAIS "BONITA" E NÃO TODA QUADRADA		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            System.err.println(ex);
	        } catch (InstantiationException ex) {
	        	System.err.println(ex);
	        } catch (IllegalAccessException ex) {
	        	System.err.println(ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PrimeiraTela() {
		initialize();
		
	}


	//AQUI TEM OS NOMES DAS VARIAVEIS DA TELA, TEM O LABEL, O BOTÃO ETC
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 828, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(255, 255, 255));
		txtUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txtUsuario.setBounds(303, 210, 220, 29);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(303, 272, 220, 29);
		frame.getContentPane().add(campoSenha);
		
		JButton botaoCadastrar = new JButton("");
		botaoCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro cadastrotela = new TelaCadastro();
				cadastrotela.setVisible(true);
			}
		});
		botaoCadastrar.setContentAreaFilled(false);
		botaoCadastrar.setBorderPainted(false);
		botaoCadastrar.setBounds(360, 441, 109, 29);
		frame.getContentPane().add(botaoCadastrar);
		
		JButton botaoEntrar = new JButton("");
		botaoEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botaoEntrar.setContentAreaFilled(false);
		botaoEntrar.setBorderPainted(false);
		botaoEntrar.setBounds(369, 382, 89, 23);
		frame.getContentPane().add(botaoEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 812, 587);
		lblNewLabel.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/resources/LOGINLG.png")));
		frame.getContentPane().add(lblNewLabel);
	}
	//ISSO É UM EXEMPLO DE UMA "CONTA", POR ENQUANTO NÃO TEM NADA LIGADO AO BANCO DE DADOS
	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("12345");
	//O USUARIO É USUARIO E A SENHA É 12345
	}
}