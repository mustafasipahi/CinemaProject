package com.cinema.view.login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cinema.controller.listener.LoginListener;
import com.cinema.controller.listener.RegisterListener;

public class LoginFrame extends javax.swing.JFrame {

	private JLabel titleLabel;
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JTextField userNameTextField;
	private JTextField passwordTextField;
	private JButton loginButton;
	private JButton registerButton;

	public LoginFrame() {
		initComponents();
		creatLoginFrame();
	}

	private void creatLoginFrame() {

		this.setTitle("PLEASE ENTER THE YOUR LOGIN INFORMATION");
		pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initComponents() {

		userNameLabel = new javax.swing.JLabel();
		passwordLabel = new javax.swing.JLabel();
		userNameTextField = new javax.swing.JTextField();
		passwordTextField = new javax.swing.JTextField();
		titleLabel = new javax.swing.JLabel();
		loginButton = new javax.swing.JButton();
		registerButton = new javax.swing.JButton();

		userNameLabel.setText("User Name : ");
		passwordLabel.setText("Password : ");

		titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
		titleLabel.setText("WELCOM TO CINEMA PROJECT");
		titleLabel.setToolTipText("");

		loginButton.setText("LOGIN");
		loginButton.addActionListener(new LoginListener());


		registerButton.setText("REGISTER");
		registerButton.addActionListener(new RegisterListener());

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(64, 64, 64)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 264,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(userNameLabel).addComponent(passwordLabel))
										.addGap(44, 44, 44)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(userNameTextField).addComponent(passwordTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE, 158,
														javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGroup(layout.createSequentialGroup().addGap(102, 102, 102).addComponent(registerButton)
								.addGap(30, 30, 30).addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE,
										85, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(72, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(19, 19, 19)
						.addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(userNameLabel)
								.addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(26, 26, 26)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(passwordLabel)
								.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(registerButton).addComponent(loginButton))
						.addContainerGap(45, Short.MAX_VALUE)));
	}

	public String getUserNameTextField() {
		return userNameTextField.getText();
	}

	public String getPasswordTextField() {
		return passwordTextField.getText();
	}

	public void setUserNameTextField(String	text) {
		this.userNameTextField.setText(text);
	}

	public void setPasswordTextField(String	text) {
		this.passwordTextField.setText(text);
	}

}