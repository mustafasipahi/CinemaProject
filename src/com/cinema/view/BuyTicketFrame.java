package com.cinema.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import com.cinema.controller.BuyTicketFrameController;
import com.cinema.model.Seance;

public class BuyTicketFrame extends JDialog{

	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JPanel seatPanel;
	private JComboBox<Seance> seanceComboBox;	
	private JButton buyButton;
	
	public BuyTicketFrame() {		
		createMainBuyTicketFrame();
		this.setLayout(new BorderLayout());
		this.add(initMainPanel(),BorderLayout.CENTER);
	}
	
	public void createMainBuyTicketFrame() {		
		this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		this.setTitle("Buy Ticket");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public JPanel initMainPanel() {
		mainPanel = new JPanel(new BorderLayout());
		seanceComboBox = initSeanceComboBox();
		seatPanel = initSeatPanel();
		buyButton = new JButton("BUY");
				
		
		mainPanel.add(seanceComboBox,BorderLayout.NORTH);
		mainPanel.add(seatPanel,BorderLayout.CENTER);
		mainPanel.add(buyButton,BorderLayout.SOUTH);
		return mainPanel;
	}
	
	public JComboBox<Seance> initSeanceComboBox(){	
		return new JComboBox(BuyTicketFrameController.getSeances().toArray());
	}
	
	
	public JPanel initSeatPanel() {
		JPanel initseatPanel = new JPanel(new FlowLayout());
		int capacity = BuyTicketFrameController.getCapacity();
		for (int i = 1; i <= capacity; i++) {
			String text = String.valueOf(i);
			JToggleButton seatButton = new JToggleButton(text);
			initseatPanel.add(seatButton);
		}
		return initseatPanel;
	}
}
