package com.cinema.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.cinema.controller.RegisterFrameController;
import com.cinema.model.login.User;
import com.cinema.service.ServiceContex;

public class RegisterListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String userName = RegisterFrameController.getRegisterFrame().getUserNameTextField();
		String password = RegisterFrameController.getRegisterFrame().getPasswordTextField();
		
		if (userName.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Your User Name Cannot Start With Admin");
			return;
		}
		
		if (userName.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(null, "Your User Name and Password Cannot Be Empty");
			return;
		}
		
		int id = (ServiceContex.getUserService().findCount()) + 1;
		
		User user = new User();
		user.setId(id);
		user.setDescription("user " + id);
		user.setUserName(userName);
		user.setUserPassword(password);
		user.setRole("USER");
		
		ServiceContex.getUserService().save(user);
		JOptionPane.showMessageDialog(null, "Registration Completed Successfully");
		RegisterFrameController.getRegisterFrame().setVisible(false);
	}
}
