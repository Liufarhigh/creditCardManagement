package creditCardManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class log_win {

	private JFrame frame;
	private JTextField usernameText;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_win window = new log_win();
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
	public log_win() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel usernameLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		
		JLabel passwordLabel = new JLabel("\u5BC6\u7801\uFF1A");
		
		usernameText = new JTextField();
		usernameText.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton logIn = new JButton("\u767B\u5F55");
		logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_win main= new main_win();
				frame.dispose();
			}
		});
		
		JButton rigister = new JButton("\u6CE8\u518C");
		rigister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register_win register=new register_win();
				frame.dispose();
			}
		});
		
		JButton quit = new JButton("\u9000\u51FA");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(71)
					.addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(usernameText, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
					.addGap(95))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(83)
					.addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
					.addGap(95))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(132)
					.addComponent(logIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rigister, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(quit, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
					.addGap(95))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(usernameLabel))
						.addComponent(usernameText))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(passwordLabel))
						.addComponent(passwordField))
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(logIn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rigister, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(quit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(53))
		);
		panel.setLayout(gl_panel);
	}
}
