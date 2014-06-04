package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class PanelNewGame extends JPanel {

	private BufferedImage background;
	private JButton btnNewButton, btnNewButton_1;
	private JComboBox comboBox, comboBox_1;
	private JSeparator separator;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtName;

	public PanelNewGame(){
		setBackground(new Color(240, 240, 240));
		try {
			background = ImageIO.read(new File("src/images/Monopoly.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setBounds(100, 100, 850, 700);
		this.setBackground(new Color(255, 255, 255));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		this.setVisible(true);
		this.setEnabled(true);
		
		ButtonsAndOtherElements();
		
	}

	/** * Print images */
	protected void paintComponent(Graphics g){
		requestFocus(true);
		setFocusable(true);
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), Color.WHITE, null);
	}
	
	public void ButtonsAndOtherElements(){
		btnNewButton = new JButton("Menu");
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setBounds(710, 616, 106, 37);
		add(btnNewButton);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(211, 167, 86, 20);
		add(txtName);
		txtName.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dog", "Ship", "Hat", "Car"}));
		comboBox.setBounds(211, 210, 86, 20);
		add(comboBox);
		
		separator = new JSeparator();
		separator.setBounds(164, 272, 196, 2);
		add(separator);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Against PC", "Pass'n'Play", "Network Mode"}));
		comboBox_1.setBounds(211, 307, 86, 20);
		add(comboBox_1);
		
		btnNewButton_1 = new JButton("PLAY !\r\n");
		btnNewButton_1.setBackground(new Color(255, 51, 51));
		btnNewButton_1.setBounds(206, 424, 106, 62);
		add(btnNewButton_1);
	}
}
