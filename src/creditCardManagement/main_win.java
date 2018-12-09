package creditCardManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_win {

	private JFrame frame;
	private JTextField deposit_money;
	private JTextField withdraw_money;
	private JTextField transfer_money;
	private JTextField transfer_destinationAccount;
	private JTextField release_ID;
	private JTextField change_oldPassword;
	private JPasswordField change_newPassword;
	private JPasswordField change_confirm_newPassword;
	private JTextField change_tel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_win window = new main_win();
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
	public main_win() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 444, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel head = new JPanel();
		panel.add(head, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u5F53\u524D\u5361\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JSpinner spinner = new JSpinner();
		
		JButton button = new JButton("\u5F00\u6237");
		
		JButton button_1 = new JButton("\u66F4\u6539\u4FE1\u606F");
		
		GroupLayout gl_head = new GroupLayout(head);
		gl_head.setHorizontalGroup(
			gl_head.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_head.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_1)
					.addContainerGap())
		);
		gl_head.setVerticalGroup(
			gl_head.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_head.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_head.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_head.createParallelGroup(Alignment.BASELINE)
					.addComponent(button_1)
					.addComponent(button))
		);
		head.setLayout(gl_head);
		JPanel panel_2 = new JPanel();
		
		panel.add(panel_2, BorderLayout.CENTER);
		CardLayout card;
		card=new CardLayout(0,0);
		panel_2.setLayout(card);
	    ////////////定义！！！！！！！！！！！！！！！///////////////
			
			JPanel mainInterface = new JPanel();
			panel_2.add(mainInterface, "main");
			JPanel depositInterface = new JPanel();
			panel_2.add(depositInterface, "deposit");
			JPanel withdrawInterface = new JPanel();
			panel_2.add(withdrawInterface, "withdraw");
			JPanel transferInterface = new JPanel();
			panel_2.add(transferInterface, "transfer");
			JPanel releaseInterface = new JPanel();
			panel_2.add(releaseInterface, "release");
			JPanel changeInterface = new JPanel();
			panel_2.add(changeInterface, "change");
			JPanel inquiryInterface = new JPanel();
			panel_2.add(inquiryInterface, "inquiry");
			
		/////////////////////////
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(panel_2, "change");
				}
			});

		JButton depositButton = new JButton("\u5B58\u6B3E");
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(panel_2, "deposit");
			}
		});
		
		JButton lossButton = new JButton("\u6302\u5931");
		lossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton withdrawButton = new JButton("\u53D6\u6B3E");
		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "withdraw");
			}
		});
		
		JButton releaseLossButton = new JButton("\u89E3\u9664\u6302\u5931");
		releaseLossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "release");
			}
		});
		
		JButton transferButton = new JButton("\u8F6C\u8D26");
		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "transfer");
			}
		});
		
		JButton accountCancellationButton = new JButton("\u9500\u6237");
		
		JButton inquiryButton = new JButton("\u67E5\u8BE2\u6D41\u6C34");
		inquiryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "inquiry");
			}
		});
		
		JButton quitButton = new JButton("\u9000\u51FA");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GroupLayout gl_mainInterface = new GroupLayout(mainInterface);
		gl_mainInterface.setHorizontalGroup(
			gl_mainInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_mainInterface.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(depositButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(withdrawButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(transferButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(inquiryButton))
					.addGap(215)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(quitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(accountCancellationButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lossButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(releaseLossButton))
					.addGap(27))
		);
		gl_mainInterface.setVerticalGroup(
			gl_mainInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainInterface.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(depositButton)
						.addComponent(lossButton))
					.addGap(35)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(releaseLossButton)
						.addComponent(withdrawButton))
					.addGap(35)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(transferButton)
						.addComponent(accountCancellationButton))
					.addGap(35)
					.addGroup(gl_mainInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(quitButton)
						.addComponent(inquiryButton))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		mainInterface.setLayout(gl_mainInterface);
		
		
		
		JLabel label_1 = new JLabel("\u5B58\u6B3E\u91D1\u989D\uFF1A\u00A5");
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		
		deposit_money = new JTextField();
		deposit_money.setFont(new Font("宋体", Font.PLAIN, 14));
		deposit_money.setColumns(10);
		
		JButton deposit_yes_button = new JButton("\u5B58\u5165");
		
		JButton deposit_no_button = new JButton("\u53D6\u6D88");
		deposit_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		GroupLayout gl_depositInterface = new GroupLayout(depositInterface);
		gl_depositInterface.setHorizontalGroup(
			gl_depositInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_depositInterface.createSequentialGroup()
					.addGap(90)
					.addGroup(gl_depositInterface.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(deposit_yes_button, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addGroup(gl_depositInterface.createParallelGroup(Alignment.TRAILING)
						.addComponent(deposit_money, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addComponent(deposit_no_button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
					.addGap(105))
		);
		gl_depositInterface.setVerticalGroup(
			gl_depositInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_depositInterface.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_depositInterface.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(deposit_money, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_depositInterface.createParallelGroup(Alignment.BASELINE)
						.addComponent(deposit_yes_button)
						.addComponent(deposit_no_button))
					.addContainerGap(93, Short.MAX_VALUE))
		);
		depositInterface.setLayout(gl_depositInterface);
		
		
		
		JLabel label_2 = new JLabel("\u53D6\u6B3E\u91D1\u989D\uFF1A\u00A5");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		
		withdraw_money = new JTextField();
		withdraw_money.setFont(new Font("宋体", Font.PLAIN, 14));
		withdraw_money.setColumns(10);
		
		JButton withdraw_yes_button = new JButton("\u53D6\u51FA");
		
		JButton withdraw_no_button = new JButton("\u53D6\u6D88");
		withdraw_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		
		JLabel label_3 = new JLabel("\u8D26\u6237\u4F59\u989D\uFF1A\u00A5");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel withdraw_balance = new JLabel("\u4F59\u989Dtemp");
		withdraw_balance.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_withdrawInterface = new GroupLayout(withdrawInterface);
		gl_withdrawInterface.setHorizontalGroup(
			gl_withdrawInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_withdrawInterface.createSequentialGroup()
					.addGap(98)
					.addGroup(gl_withdrawInterface.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_withdrawInterface.createSequentialGroup()
							.addComponent(label_3)
							.addGap(18)
							.addComponent(withdraw_balance))
						.addGroup(gl_withdrawInterface.createSequentialGroup()
							.addComponent(label_2)
							.addGap(10)
							.addComponent(withdraw_money, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_withdrawInterface.createSequentialGroup()
							.addComponent(withdraw_yes_button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(87)
							.addComponent(withdraw_no_button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_withdrawInterface.setVerticalGroup(
			gl_withdrawInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_withdrawInterface.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_withdrawInterface.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(withdraw_balance))
					.addGap(18)
					.addGroup(gl_withdrawInterface.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_withdrawInterface.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(withdraw_money, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_withdrawInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(withdraw_yes_button)
						.addComponent(withdraw_no_button))
					.addContainerGap(81, Short.MAX_VALUE))
		);
		withdrawInterface.setLayout(gl_withdrawInterface);
		
		
		
		JLabel label_4 = new JLabel("\u8F6C\u8D26\u91D1\u989D\uFF1A\u00A5");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		
		transfer_money = new JTextField();
		transfer_money.setFont(new Font("宋体", Font.PLAIN, 14));
		transfer_money.setColumns(10);
		
		JButton transfer_yes_button = new JButton("\u8F6C\u51FA");
		
		JButton transfer_no_button = new JButton("\u53D6\u6D88");
		transfer_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		
		JLabel label_5 = new JLabel("\u76EE\u6807\u8D26\u6237\uFF1A");
		label_5.setFont(new Font("宋体", Font.PLAIN, 14));
		
		transfer_destinationAccount = new JTextField();
		transfer_destinationAccount.setFont(new Font("宋体", Font.PLAIN, 14));
		transfer_destinationAccount.setColumns(10);
		GroupLayout gl_transferInterface = new GroupLayout(transferInterface);
		gl_transferInterface.setHorizontalGroup(
			gl_transferInterface.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_transferInterface.createSequentialGroup()
					.addGap(112)
					.addGroup(gl_transferInterface.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_transferInterface.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(transfer_destinationAccount, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addGroup(gl_transferInterface.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(transfer_money, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
						.addGroup(gl_transferInterface.createSequentialGroup()
							.addComponent(transfer_yes_button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(87)
							.addComponent(transfer_no_button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addGap(93))
		);
		gl_transferInterface.setVerticalGroup(
			gl_transferInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_transferInterface.createSequentialGroup()
					.addGap(69)
					.addGroup(gl_transferInterface.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(transfer_destinationAccount))
					.addGap(18)
					.addGroup(gl_transferInterface.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_transferInterface.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(transfer_money, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_transferInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(transfer_yes_button)
						.addComponent(transfer_no_button))
					.addGap(98))
		);
		transferInterface.setLayout(gl_transferInterface);
		
		
		
		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u8EAB\u4EFD\u8BC1\u53F7\u7801\uFF1A");
		label_6.setFont(new Font("宋体", Font.PLAIN, 14));
		
		release_ID = new JTextField();
		release_ID.setFont(new Font("宋体", Font.PLAIN, 14));
		release_ID.setColumns(10);
		
		JButton release_yes_button = new JButton("\u89E3\u9664");
		
		JButton release_no_button = new JButton("\u53D6\u6D88");
		release_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		GroupLayout gl_releaseInterface = new GroupLayout(releaseInterface);
		gl_releaseInterface.setHorizontalGroup(
			gl_releaseInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_releaseInterface.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addGroup(gl_releaseInterface.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_releaseInterface.createSequentialGroup()
							.addComponent(label_6)
							.addGap(10)
							.addComponent(release_ID, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_releaseInterface.createSequentialGroup()
							.addComponent(release_yes_button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(release_no_button, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addGap(65))
		);
		gl_releaseInterface.setVerticalGroup(
			gl_releaseInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_releaseInterface.createSequentialGroup()
					.addContainerGap(91, Short.MAX_VALUE)
					.addGroup(gl_releaseInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(release_ID, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_releaseInterface.createSequentialGroup()
							.addGap(3)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_releaseInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(release_yes_button)
						.addComponent(release_no_button))
					.addGap(85))
		);
		releaseInterface.setLayout(gl_releaseInterface);
		
		
		
		JLabel label_7 = new JLabel("\u65E7\u5BC6\u7801\uFF1A");
		label_7.setBounds(131, 13, 56, 20);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_8 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		label_8.setBounds(132, 57, 56, 20);
		label_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_9 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_9.setBounds(103, 101, 84, 20);
		label_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel label_10 = new JLabel("\u7535\u8BDD\u53F7\u7801\uFF1A");
		label_10.setBounds(117, 145, 70, 20);
		label_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		change_oldPassword = new JTextField();
		change_oldPassword.setBounds(192, 10, 134, 26);
		change_oldPassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		change_oldPassword.setColumns(10);
		
		change_newPassword = new JPasswordField();
		change_newPassword.setBounds(192, 54, 134, 26);
		change_newPassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		change_confirm_newPassword = new JPasswordField();
		change_confirm_newPassword.setBounds(192, 98, 134, 26);
		change_confirm_newPassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		change_tel = new JTextField();
		change_tel.setBounds(192, 142, 134, 26);
		change_tel.setFont(new Font("Dialog", Font.PLAIN, 14));
		change_tel.setColumns(10);
		
		JButton change_yes_button = new JButton("\u66F4\u6539");
		change_yes_button.setBounds(104, 186, 83, 29);
		change_yes_button.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JButton change_no_button = new JButton("\u53D6\u6D88");
		change_no_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		change_no_button.setBounds(244, 186, 82, 29);
		change_no_button.setFont(new Font("Dialog", Font.PLAIN, 14));
		changeInterface.setLayout(null);
		changeInterface.add(label_9);
		changeInterface.add(label_7);
		changeInterface.add(change_oldPassword);
		changeInterface.add(label_10);
		changeInterface.add(change_tel);
		changeInterface.add(change_yes_button);
		changeInterface.add(change_no_button);
		changeInterface.add(label_8);
		changeInterface.add(change_newPassword);
		changeInterface.add(change_confirm_newPassword);
		
		
		inquiryInterface.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		inquiryInterface.add(panel_1, BorderLayout.NORTH);
		
		JLabel label_11 = new JLabel("\u4F59\u989D\uFF1A");
		label_11.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel inquiry_balance = new JLabel("\u4F59\u989Dtemp");
		
		JLabel label_12 = new JLabel("\u8D26\u53F7\u72B6\u6001\uFF1A");
		label_12.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JLabel inquiry_status = new JLabel("\u72B6\u6001temp");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(label_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inquiry_balance)
					.addGap(18)
					.addComponent(label_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inquiry_status)
					.addContainerGap(190, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(inquiry_balance)
						.addComponent(label_12)
						.addComponent(inquiry_status))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("宋体", Font.PLAIN, 14));
		inquiryInterface.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setName("\u8D26\u6237,\u4EA4\u6613\u65F6\u95F4,\u4EA4\u6613\u91D1\u989D,\u4EA4\u6613\u7C7B\u578B");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u8D26\u6237", "\u4EA4\u6613\u65F6\u95F4", "\u4EA4\u6613\u91D1\u989D", "\u4EA4\u6613\u7C7B\u578B"
			}
		));
		table.setFont(new Font("宋体", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton backButton = new JButton("\u8FD4\u56DE");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_2, "main");
			}
		});
		inquiryInterface.add(backButton, BorderLayout.SOUTH);
	}
}
