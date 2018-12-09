package creditCardManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class register_win {

	private JFrame frame;
	private JTextField register_username;
	private JPasswordField register_password;
	private JPasswordField register_confirmPsd;
	private JTextField register_ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register_win window = new register_win();
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
	public register_win() {
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
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_3 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\u7801\uFF1A");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		register_username = new JTextField();
		register_username.setFont(new Font("Dialog", Font.PLAIN, 14));
		register_username.setColumns(10);
		
		register_password = new JPasswordField();
		register_password.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		register_confirmPsd = new JPasswordField();
		register_confirmPsd.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		register_ID = new JTextField();
		register_ID.setFont(new Font("Dialog", Font.PLAIN, 14));
		register_ID.setColumns(10);
		
		JButton register_yes_button = new JButton("\u786E\u5B9A");
		register_yes_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log_win login=new log_win();
				frame.dispose();
			}
		});
		register_yes_button.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JButton register_no_button = new JButton("\u53D6\u6D88");
		register_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log_win login=new log_win();
				frame.dispose();
			}
		});
		register_no_button.setFont(new Font("Dialog", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(112, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(label)
						.addComponent(label_2)
						.addComponent(label_1)
						.addComponent(label_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addComponent(register_yes_button, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(register_ID)
								.addComponent(register_confirmPsd)
								.addComponent(register_username)
								.addComponent(register_password, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(52)
							.addComponent(register_no_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(110))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(register_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(register_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(register_confirmPsd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(register_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(register_yes_button)
						.addComponent(register_no_button))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
