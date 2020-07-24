package com.cinema.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import com.cinema.controller.LoginFrameController;
import com.cinema.model.login.Admin;
import com.cinema.model.login.User;
import com.cinema.service.ServiceContex;

public class LoginListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = getName();
		String password = getPassword();

		if (name.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(null, "User Name Or Password Must Not Be Empty");
		} else if (name.equals("admin")) {
			List<Admin> admins = ServiceContex.getAdminService().getAll();
			for (Admin admin : admins) {
				String adminPassword = admin.getAdminpassword();
				if (password.equals(adminPassword)) {
					JOptionPane.showMessageDialog(null, "Welcom to Admin");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Your Admin Password Is Incorred");
					break;
				}
			}
		} else {
			List<User> users = ServiceContex.getUserService().getAll();
			for (User user : users) {
				if (user.getUserName().equals(name) && user.getUserPassword().equals(password)) {
					JOptionPane.showMessageDialog(null, "Welcom To " + user.getDescription());
					return;
				}
				else {
					JOptionPane.showMessageDialog(null, "Your User Name or Password Is Incorret");
				}				
			}
		}
	}

	public String getName() {
		return LoginFrameController.getLoginFrame().getUserNameTextField().trim();
	}

	public String getPassword() {
		return LoginFrameController.getLoginFrame().getPasswordTextField().trim();
	}
}
