package com.cinema.view.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cinema.controller.listener.RegisterListener;

public class RegisterFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel InfoLabel;
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JTextField userNameTextField;
	private JTextField passwordTextField;
	private JButton registerButton;
	private JButton cancelButton;

	public RegisterFrame() {
		initComponents();
		creatRegisterFrame();
	}

	private void creatRegisterFrame() {

		this.setTitle("PLEASE ENTER THE YOUR REGISTER INFORMATION");
		pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
	}

	private void initComponents() {

		InfoLabel = new JLabel();
		userNameLabel = new JLabel();
		userNameTextField = new JTextField();
		passwordLabel = new JLabel();
		passwordTextField = new JTextField();
		registerButton = new JButton();
		cancelButton = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		InfoLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
		InfoLabel.setText("Register For This Cinema Project");

		userNameLabel.setText("Enter New User Name :");

		passwordLabel.setText("Enter New Password :");

		registerButton.setText("Register");
		registerButton.addActionListener(new RegisterListener());

		cancelButton.setText("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
												userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(124, 124, 124).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(registerButton)))
										.addGroup(layout.createSequentialGroup().addGap(39, 39, 39)
												.addComponent(InfoLabel))))
						.addContainerGap(40, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(userNameLabel).addGap(13, 13, 13)
						.addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(passwordLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(registerButton).addGap(18, 18, 18).addComponent(cancelButton)
						.addContainerGap(51, Short.MAX_VALUE)));
	}

	public String getUserNameTextField() {
		return userNameTextField.getText();
	}

	public String getPasswordTextField() {
		return passwordTextField.getText();
	}
}
